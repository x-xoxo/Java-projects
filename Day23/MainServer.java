package Day23;

import java.io.*;
import java.net.*;
import java.util.*;

public class MainServer {
    int port = 7777;
    ServerSocket server = null;
    Socket client = null;
    HashMap<String, BufferedWriter> hm;
    public MainServer() {
        ChatServerThread sr;
        Thread th;
        try {
            server = new ServerSocket(port);
            System.out.println("==========================");
            System.out.println("=     Chatting Server    =");
            System.out.println("==========================");
            System.out.println("클라이언트의 접속을 기다립니다.");
            hm = new HashMap<String, BufferedWriter>();
            while (true) {
                client = server.accept();
                if (client != null) {
                    sr = new ChatServerThread(client, hm);
                    th = new Thread(sr);
                    th.start();
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void main(String[] args) {
        new MainServer();
    }
}

class ChatServerThread implements Runnable
{
    Socket client;
    BufferedReader bufr;
    BufferedWriter bufw;

    String user_id;
    HashMap<String, BufferedWriter> hm;
    InetAddress ip;
    String msg;

    public ChatServerThread(Socket client, HashMap<String, BufferedWriter> hm)
    {
        this.client = client;
        this.hm = hm;
        try {
            bufr = new BufferedReader(new InputStreamReader(client.getInputStream()));
            bufw = new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));

            user_id = bufr.readLine();
            ip = client.getInetAddress();
            System.out.println(ip+"로부터 "+user_id+"님이 접속하였습니다.");
            broadcast(user_id + "님이 접속하셨습니다.");
            synchronized(hm) {
                hm.put(user_id, bufw);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    public void run()
    {
        String receiveData;
        try {
            while ((receiveData = bufr.readLine()) != null) {
                if(receiveData.equals("/quit")) {
                    synchronized (hm) {
                        hm.remove(user_id);
                    }
                    break;
                }
                else if (receiveData.indexOf("/to") >= 0) {
                    sendDM(receiveData);
                }
                else {
                    System.out.println(user_id + " >> "+receiveData);
                    broadcast(user_id+" >> "+receiveData);
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            synchronized(hm) {
                hm.remove(user_id);
            }
            broadcast(user_id + "님이 퇴장했습니다.");
            System.out.println(user_id +"님이 퇴장했습니다.");
            try {
                if(client != null) {
                    bufr.close();
                    bufw.close();
                    client.close();
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }
    public void broadcast(String msg)
    {
        synchronized(hm) {
            try {
                for(BufferedWriter bufw : hm.values()) {
                    bufw.write(msg);
                    bufw.flush();
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }
    public void sendDM(String msg)
    {
        int begin = msg.indexOf(" ")+1;
        int end = msg.indexOf(" ", begin);

        if (end != -1) {
            String id = msg.substring(begin, end);
            String message = msg.substring(end+1);
            BufferedWriter bufw = hm.get(id);
            try {
                if(bufw != null) {
                    bufw.write(user_id+"님의 DM : "+message);
                    bufw.flush();
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}