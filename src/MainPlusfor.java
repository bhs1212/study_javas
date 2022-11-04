import java.util.Scanner;

// 문제 파악
// 두 정수 A와 B를 입력받은 다음, A+B를 출력
// (0 < A, B < 10)

// 유추 파악
// 첫째 줄에 테스트 케이스의 개수 T 입력
// 각 테스트 케이스마다 A+B를 출력

// 주요 단어 영문 이름 선정
// 입력(input), 정수(decimal), 출력(output), 합(plus)

public class MainPlusfor {
    // 두 정수의 합 함수
    public int plus(int input_first, int input_second) {
        int output = input_first + input_second;
        return output;
    }
    public static void main(String[] args) {
        // 테스트 케이스
        // 5
        // 1 + 1 = 2
        // 2 + 3 = 5
        // 3 + 4 = 7
        // 9 + 8 = 17
        // 5 + 2 = 7
        
        // 프로그래밍 순서
        // 입력
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i = 0; i < T; i++){
            int input_first = sc.nextInt();
            int input_second = sc.nextInt();
            // 처리
            MainPlusfor main = new MainPlusfor();
            int output = main.plus(input_first, input_second);
            // 출력
            System.out.println(output);
        }

        
    }
}
