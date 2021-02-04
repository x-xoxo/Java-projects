package Day23;

import java.io.*;
import java.net.*;
import java.util.*;

public class CalcClientEx {
    public static void main(String[] args) {
        BufferedReader in = null;
        BufferedWriter out = null;
        Socket client = null;
        Scanner sc = new Scanner(System.in);
        try {
            client = new Socket("localhost", 9998);
            in = new BufferedReader(new InputStreamReader(client.getInputStream()));
            out = new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));

            while(true)
            {
                System.out.print("계산식(빈칸으로 띄어 입력, 예:24 + 42) >> ");
                String outputMsg = sc.nextLine();
                if(outputMsg.equalsIgnoreCase("bye")) {
                    out.write(outputMsg+"\n");
                    out.flush();
                    break;
                }
                out.write(outputMsg+"\n");
                out.flush();
                String inputMsg = in.readLine();
                System.out.println("계산 결과: "+inputMsg);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                sc.close();
                if(client != null) client.close();
            } catch (IOException e) {
                System.out.println("서버와 채팅 중 오류가 발생했습니다.");
            }
        }
    }
}
