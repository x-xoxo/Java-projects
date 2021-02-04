package Day23;

import java.io.*;
import java.net.*;
import java.util.*;

public class ServerEx {
    public static void main(String[] args) {
        BufferedReader in = null;
        BufferedWriter out = null;
        ServerSocket listener = null;
        Socket socket = null;
        Scanner sc = new Scanner(System.in);
        try {
            listener = new ServerSocket(9999); // Create Server Socket
            System.out.println("연결을 기다리고 있습니다.....");
            socket = listener.accept(); // waiting client connection
            System.out.println("연결되었습니다.");
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            while(true)
            {
                String inputMsg = in.readLine();
                if(inputMsg.equalsIgnoreCase("bye"))
                {
                    System.out.println("클라이언트에서 "+inputMsg+"로 연결을 종료하였음");
                    break;
                }
                System.out.println("Client : "+inputMsg);
                System.out.print("보내기 >> ");
                String outputMsg = sc.nextLine();
                if(outputMsg.equalsIgnoreCase("bye")) {
                    out.write(outputMsg+"\n");
                    out.flush();
                    break;
                }
                out.write(outputMsg+"\n");
                out.flush();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                sc.close();
                socket.close();
                listener.close();
            } catch (IOException e) {
                System.out.println("클라이언트와 채팅 중 오류가 발생했습니다.");
            }
        }
    }
}
