package 課題.reivews.reivews3;

public class Main2 {
    public static void main(String[] args) {
        KeyInput KeyInput = new KeyInput();
        System.out.print("宛先を入力>");
        String to = KeyInput.readString();
        System.out.print("件名を入力>");
        String subject = KeyInput.readString();
        System.out.print("本文を入力>");
        String body  = KeyInput.readString();
        System.out.println(to + "に以下のメールを送信しました。");
        System.out.println("件名:" + subject);
        System.out.println("本文:" + body);
    }
}
