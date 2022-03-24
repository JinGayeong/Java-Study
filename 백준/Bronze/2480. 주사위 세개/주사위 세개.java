import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int prize = 0;
        
        if (a==b && a==c && b==c) {
            prize = 10000 + a * 1000;
        }else if (a==b || a==c) {
            prize = 1000 + a * 100;
        }else if (b==c) {
            prize = 1000 + b * 100;
        }else {
            prize = Math.max(a, Math.max(b, c));
            prize *= 100;
        }
        System.out.println(prize);
    }
}