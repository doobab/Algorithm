package baekjoon;

import java.sql.ResultSet;
import java.util.Scanner;

/*
문제
스택 (stack)은 기본적인 자료구조 중 하나로, 컴퓨터 프로그램을 작성할 때 자주 이용되는 개념이다.
스택은 자료를 넣는 (push) 입구와 자료를 뽑는 (pop) 입구가 같아 제일 나중에 들어간 자료가 제일 먼저 나오는 (LIFO, Last in First out) 특성을 가지고 있다.
1부터 n까지의 수를 스택에 넣었다가 뽑아 늘어놓음으로써, 하나의 수열을 만들 수 있다. 이때, 스택에 push하는 순서는 반드시 오름차순을 지키도록 한다고 하자.
임의의 수열이 주어졌을 때 스택을 이용해 그 수열을 만들 수 있는지 없는지, 있다면 어떤 순서로 push와 pop 연산을 수행해야 하는지를 알아낼 수 있다. 이를 계산하는 프로그램을 작성하라.

입력
첫 줄에 n (1 ≤ n ≤ 100,000)이 주어진다. 둘째 줄부터 n개의 줄에는 수열을 이루는 1이상 n이하의 정수가 하나씩 순서대로 주어진다. 물론 같은 정수가 두 번 나오는 일은 없다.

출력
입력된 수열을 만들기 위해 필요한 연산을 한 줄에 한 개씩 출력한다. push연산은 +로, pop 연산은 -로 표현하도록 한다. 불가능한 경우 NO를 출력한다.
 */
public class N1874 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // 배열에 들어갔던 수 중 가장 큰 수
        int max = 0;
        // 스택 포인터
        int ptr = -1;
        // 스택 배열
        int[] stk = new int[n];
        // 결과 포인터
        int r_ptr = 0;
        // 결과
        char[] result = new char[2 * n];
        // 불가능한 경우 체크
        boolean chk = true;
        for (int i = 0; i < n; i++){
            int tmp = sc.nextInt();
            // +
            if (max < tmp) {
                for (int j = max + 1; j <= tmp; j++){
                    result[r_ptr++] = '+';
                    stk[++ptr] = j;
                }
                ptr--;
                result[r_ptr++] = '-';
                max = tmp;
            }
            // -
            else if (max > tmp) {
                if (stk[ptr] == tmp) {
                    result[r_ptr++] = '-';
                    ptr--;
                }
                // stk[ptr]과 tmp가 다르면 잘못된 것!
                else {
                    chk = false;
                    break;
                }
            }
        }
        // 출력
        if (!chk)
            System.out.print("NO");
        else
            for (int i = 0; i < 2 * n; i++){
                System.out.println(result[i]);
            }
    }
}
