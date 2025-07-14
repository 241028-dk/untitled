package 課題.reivews.reivews3;

import java.io.*;
public class Main1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("宛先を入力>");
        String to = br.readLine();
        System.out.print("件名を入力>");
        String subject = br.readLine();
        System.out.print("本文を入力>");
        String body  = br.readLine();
        Email mail = new Email();
        if(subject.equals("")) {
            mail.send(to,body);
        } else {
            mail.send(to,subject,body);
        }
    }
}
