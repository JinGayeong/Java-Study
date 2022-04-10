import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        
        for (int i = 0; i < 10; i++) {
            int num = sc.nextInt() % 42;
            hs.add(num); //중복된 수를 거른다.
        }
        System.out.println(hs.size()); // 총 개수를 반환함.
    }
}