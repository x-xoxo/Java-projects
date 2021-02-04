package Day23;

import java.io.*;
import java.net.*;
import java.util.*;

public class MainClient {
    String ipAddress;
    static final int port=7777;
    Socket client = null;
    BufferedReader in;
    BufferedReader sc;
    BufferedWriter out;
    String sendData;
    String receiveData;
    String user_id;
    ReceiveDataThread rt;
    boolean endflag = false;

    public MainClient(String id, String ip) {
        user_id = id;
        ipAddress = ip;
        try {
            System.out.println("====클라이언트====");
            client = new Socket(ipAddress,port);
            sc = new BufferedReader(new InputStreamReader(System.in));
            in = new BufferedReader(new InputStreamReader(client.getInputStream()));
            out = new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));

            out.write(user_id);
            out.flush();

            rt = new ReceiveDataThread(client, in);
            Thread t = new Thread(rt);
            t.start();
            while (true) {
                sendData = sc.readLine();
                out.write(sendData);
                out.flush();
                if(sendData.equals("/quit")) {
                    endflag = true;
                    break;
                }
            }
            System.out.println("클라이언트의 접속을 종료합니다.");
            System.exit(0);
        } catch (Exception e) {
            if (!endflag) {
                System.out.println(e.getMessage());
            }
        } finally {
            try {
                in.close();
                out.close();
                client.close();
                System.exit(0);
            } catch (IOException e2) {
                System.out.println(e2.getMessage());
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("아이디를 입력하세요 : ");
        String id = sc.next();
        new MainClient(id, "localhost");
        sc.close();
    }
}
class ReceiveDataThread implements Runnable {
    Socket client;
    BufferedReader bufr;
    String receiveData;
    public ReceiveDataThread(Socket client, BufferedReader bufr) {
        this.client = client;
        this.bufr = bufr;
    }
    public void run() {
        try {
            while((receiveData = bufr.readLine())!=null)
                System.out.println(receiveData);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                bufr.close();
                client.close();
            } catch (IOException e2) {
                System.out.println(e2.getMessage());
            }
        }
    }
}