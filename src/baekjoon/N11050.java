package baekjoon;

import java.util.Scanner;

/*
문제
자연수 (N)과 정수 (K)가 주어졌을 때 이항 계수
(N
 K)
를 구하는 프로그램을 작성하시오.

입력
첫째 줄에 (N)과 (K)가 주어진다. (1 ≤ (N) ≤ 10, 0 ≤ (K) ≤ (N))

출력
(N
 K)
를 출력한다.
 */
public class N11050 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        System.out.println(factorial(n) / (factorial(k) * factorial(n - k)));
    }

    public static int factorial(int x){
        if (x == 0) {
            return 1;
        } else {
            return x * factorial(x - 1);
        }
    }
}
