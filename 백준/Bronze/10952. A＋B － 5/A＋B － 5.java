import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        
        while(true) {
            if (a == 0 && b == 0) {
                break;
            }else {
                System.out.println(a + b);
                a = scanner.nextInt();
                b = scanner.nextInt();
            }
        }
    }
}