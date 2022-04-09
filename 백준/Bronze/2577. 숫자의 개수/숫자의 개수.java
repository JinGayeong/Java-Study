import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int result = a * b * c;

        String str = Integer.toString(result);  //int -> string변환
        sc.close();

        for(int i=0; i < 10; i++){  //0~9까지 반복
            int count = 0;
            for(int j=0; j < str.length(); j++){  //str 길이만큼 반복
                if((str.charAt(j) - '0') == i){  //인덱스의 문자와 i가 같으면 count 1증가
                    count++;
                }
            }
            System.out.println(count);  //count를 출력
        } //for
        
    } //main
    
} //class