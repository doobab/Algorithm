package baekjoon;

import java.util.Scanner;

/*
문제
주어진 수 N개 중에서 소수가 몇 개인지 찾아서 출력하는 프로그램을 작성하시오.

입력
첫 줄에 수의 개수 N이 주어진다. N은 100이하이다. 다음으로 N개의 수가 주어지는데 수는 1,000 이하의 자연수이다.

출력
주어진 수들 중 소수의 개수를 출력한다.
 */
public class N1978 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // 주어진 수 배열
        int[] arr = new int[n];
        // 주어진 수 중 최댓값 (최댓값까지 소수를 구하기 위해)
        int max = 0;
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
            if (max < arr[i])
                max = arr[i];
        }
        // 에스토스테네스의 체
        boolean[] chk = new boolean[max + 1];
        for (int i = 2; i < max + 1; i++)
            chk[i] = true;
        for (int i = 2; i * i <= max; i++){
            for (int j = i * i; j <= max; j += i)
                chk[j] = false;
        }
        // 결과
        int count = 0;
        for (int i = 0; i < n; i++){
            if (chk[arr[i]]) {
                count++;
            }
        }
        System.out.print(count);
    }
}
