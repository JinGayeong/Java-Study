import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt(); //정수 n개를 입력받는다.
        int[] array = new int[n]; // array 배열을 정의
        
        for(int i=0; i < n; i++) {
            array[i] = scanner.nextInt();
        } //for
        
        scanner.close();
        Arrays.sort(array); // Arrays.sort를 사용하여 정렬
        System.out.print(array[0] + " " + array[n-1]); // 정렬한 순서에서 첫번째와 마지막을 출력

    } //main

} //class