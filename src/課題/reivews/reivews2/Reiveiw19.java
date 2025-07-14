package 課題.reivews.reivews2;

public class Reiveiw19 {
    public static void main(String[] args) {
        int num = 10;
        int i = 1;
        int factorial = 1;
        while (i <= num) {
            factorial *= i;
            i++;
        }
        System.out.println("結果" + factorial);
    }
}
