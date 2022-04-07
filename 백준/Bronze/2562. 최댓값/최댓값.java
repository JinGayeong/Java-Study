import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] array = new int[9]; // 길이가 9인 array 배열을 정의
        
        int max = 0;  //최대값을 저장할 변수
        int index = 0; //인덱스값을 저장할 변수
        
        for(int i=0; i < array.length; i++) {
            array[i] = scanner.nextInt(); //입력받은값들을 배열에 초기화
            if (array[i] > max) {  // for문을 반복하는동안 array배열의 최대값을 비교하여 max의 저장
                max = array[i];
                index = i;  //가장 큰값인 array[i]의 인덱스값을 저장
            }//if
        } //for
        
        System.out.println(max); 
        System.out.println(index + 1); //인덱스번호가 0부터 시작해서 +1을 해준다.
    } //main
    
} //class