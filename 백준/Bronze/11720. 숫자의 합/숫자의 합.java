import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
      
        int n = sc.nextInt();
        String n2 = sc.next();
        
        for(int i = 0; i < n; i++) {
            sum += n2.charAt(i)-'0';
        }
        System.out.println(sum);
    }
}