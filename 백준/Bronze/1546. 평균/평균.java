import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  //과목의 개수 n을 입력받는다
        int max = 0;
        int sum = 0;
        double avg = 0.0;
        
        int[] grade = new int[n]; //grade배열 길이를 n으로 지정
        for(int i = 0; i < grade.length; i++) { 
            grade[i] = sc.nextInt(); //반복문 사용하여 입력받은 값을 배열의 저장
            if (grade[i] > max) {
                max = grade[i]; // 값들을 비교하여 최대값을 max에 저장
            }
            sum += grade[i]; //모든과목을 다 더한다
        }
        avg = 100.0 * sum / max /n; //주어진방법대로 식을 만들어 avg에 저장 후 출력
        System.out.println(avg);
    }
}