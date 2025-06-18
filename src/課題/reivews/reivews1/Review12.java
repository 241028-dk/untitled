package 課題.reivews.reivews1;

public class Review12 {
    public static void main(String[] args) {
        int age = 19;
        if (age <= 17) {//0^17
            System.out.println("未成年");
        } else if (age >= 18 && age <=64) {//18^64
            System.out.println("成人");
        } else if (age >= 65){//65^
            System.out.println("高年齢");
        } else {
            System.out.println("無効な年齢です。");
        }
    }
}