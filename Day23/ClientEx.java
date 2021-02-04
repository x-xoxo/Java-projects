package Day23;

import java.io.*;
import java.net.*;
import java.util.*;

public class ClientEx {
    public static void main(String[] args) {
        BufferedReader in = null;
        BufferedWriter out = null;
        Socket socket = null;
        Scanner sc = new Scanner(System.in);
        try {
            socket = new Socket("localhost",9999); // Create Client Socket
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            while(true)
            {
                System.out.print("보내기 >> ");
                String outputMsg = sc.nextLine();
                if(outputMsg.equalsIgnoreCase("bye")) {
                    out.write(outputMsg+"\n");
                    out.flush();
                    break;
                }
                out.write(outputMsg+"\n");
                out.flush();
                String inputMsg = in.readLine();
                if(inputMsg.equalsIgnoreCase("bye"))
                {
                    System.out.println("Server에서 "+inputMsg+"로 연결을 종료하였음");
                    break;
                }
                System.out.println("Server : "+inputMsg);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                sc.close();
                if(socket != null) socket.close();
            } catch (IOException e) {
                System.out.println("서버와의 채팅 중 오류가 발생했습니다.");
            }
        }
    }
}
