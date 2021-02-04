package Day23;

import java.io.*;
import java.net.*;
import java.util.*;


public class CalcServerEx {
    public static String calc(String exp)
    {
        StringTokenizer st = new StringTokenizer(exp, " ");
        if(st.countTokens()!=3) return "error";

        String res="";
        int num1 = Integer.parseInt(st.nextToken());
        String op = st.nextToken();
        int num2 = Integer.parseInt(st.nextToken());
        switch (op) {
            case "+":
                res = Integer.toString(num1+num2);
                break;
            case "-":
                res = Integer.toString(num1-num2);
                break;
            case "*":
                res = Integer.toString(num1*num2);
                break;
            case "/":
                res = Integer.toString(num1/num2);
            default:
                res = "Error";
        }
        return res;
    }
    public static void main(String[] args) {
        BufferedReader in = null;
        BufferedWriter out = null;
        ServerSocket server = null;
        Socket client = null;
        try {
            server = new ServerSocket(9998);
            System.out.println("연결을 기다리고 있습니다....");
            client = server.accept();
            System.out.println("연결 되었습니다.");
            in = new BufferedReader(new InputStreamReader(client.getInputStream()));
            out = new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));

            while (true)
            {
                String inputMsg = in.readLine();
                if(inputMsg.equalsIgnoreCase("bye")) {
                    System.out.println("클라이언트에서 연결을 종료하였음");
                    break;
                }
                System.out.println(inputMsg);
                String res = calc(inputMsg);
                out.write(res+"\n");
                out.flush();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if(client != null) client.close();
                if(server != null) server.close();
            } catch (IOException e) {
                System.out.println("클라이언트와 채팅 중 오류가 발생했습니다.");
            }
        }
    }
}
