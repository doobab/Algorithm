package baekjoon;

import java.util.Scanner;

/*
문제
두 개의 자연수를 입력받아 최대 공약수와 최소 공배수를 출력하는 프로그램을 작성하시오.

입력
첫째 줄에는 두 개의 자연수가 주어진다. 이 둘은 10,000이하의 자연수이며 사이에 한 칸의 공백이 주어진다.

출력
첫째 줄에는 입력으로 주어진 두 수의 최대공약수를, 둘째 줄에는 입력으로 주어진 두 수의 최소 공배수를 출력한다.
 */
public class N2609 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        // 둘 중에 더 큰 수가 a
        if (a < b){
            int tmp = a;
            a = b;
            b = tmp;
        }

        // 최대공약수
        int tmp = a;
        int gcd = b;
        while (gcd > 0) {
            if (tmp % gcd == 0)
                break;
            int tmp_gcd = gcd;
            gcd = tmp % gcd;
            tmp = tmp_gcd;
        }

        // 최소공배수
        int lcm = (a / gcd) * (b / gcd) * gcd;

        System.out.printf("%d\n%d", gcd, lcm);
    }
}
