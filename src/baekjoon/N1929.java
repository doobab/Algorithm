package baekjoon;

import java.util.Scanner;

/*
문제
M이상 N이하의 소수를 모두 출력하는 프로그램을 작성하시오.

입력
첫째 줄에 자연수 M과 N이 빈 칸을 사이에 두고 주어진다. (1 ≤ M ≤ N ≤ 1,000,000) M이상 N이하의 소수가 하나 이상 있는 입력만 주어진다.

출력
한 줄에 하나씩, 증가하는 순서대로 소수를 출력한다.
 */
public class N1929 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        // 소수 배열
        boolean[] primeList = new boolean[n + 1];
        // 에스토스테네스의 체
        for (int i = 2; i <= n; i++){
            primeList[i] = true;
        }
        // 2부터 시작해서 i의 배수에 해당하는 숫자를 false로 바꿈
        for (int i = 2; i * i <= n; i++){
            for (int j = i * i; j <= n; j += i)
                primeList[j] = false;
        }
        // 출력
        for (int i = m; i <= n; i++){
            if (primeList[i])
                System.out.println(i);
        }
    }
}
