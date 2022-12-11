package baekjoon;

import java.util.Scanner;

/*
문제
다장조는 c d e f g a b C, 총 8개 음으로 이루어져있다. 이 문제에서 8개 음은 다음과 같이 숫자로 바꾸어 표현한다. c는 1로, d는 2로, ..., C를 8로 바꾼다.
1부터 8까지 차례대로 연주한다면 ascending, 8부터 1까지 차례대로 연주한다면 descending, 둘 다 아니라면 mixed 이다.
연주한 순서가 주어졌을 때, 이것이 ascending인지, descending인지, 아니면 mixed인지 판별하는 프로그램을 작성하시오.

입력
첫째 줄에 8개 숫자가 주어진다. 이 숫자는 문제 설명에서 설명한 음이며, 1부터 8까지 숫자가 한 번씩 등장한다.

출력
첫째 줄에 ascending, descending, mixed 중 하나를 출력한다.
 */

public class N2920 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // 배열 받기
        int[] arr = new int[8];
        for (int i = 0; i < 8; i++) {
            arr[i] = sc.nextInt();
        }

        int i = 0;
        for (; i < 7; i++){
            // 숫자 간의 차이가 1이 아니라면
            if (Math.abs(arr[i] - arr[i + 1]) != 1) {
                break;
            }
        }

        // break 된 경우
        if (i < 7) {
            System.out.print("mixed");
        }
        // break가 되지 않고, 맨 앞이 8인 경우 = 8부터 차례대로 연주됨
        else if (arr[0] == 8){
            System.out.print("descending");
        }
        // break가 되지 않고, 맨 앞이 1인 경우 = 1부터 차례대로 연주됨
        else {
            System.out.print("ascending");
        }
    }
}
