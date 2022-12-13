package baekjoon;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/*
문제
알파벳 소문자로 이루어진 N개의 단어가 들어오면 아래와 같은 조건에 따라 정렬하는 프로그램을 작성하시오.
1. 길이가 짧은 것부터
2. 길이가 같으면 사전 순으로

입력
첫째 줄에 단어의 개수 N이 주어진다. (1 ≤ N ≤ 20,000) 둘째 줄부터 N개의 줄에 걸쳐 알파벳 소문자로 이루어진 단어가 한 줄에 하나씩 주어진다. 주어지는 문자열의 길이는 50을 넘지 않는다.

출력
조건에 따라 정렬하여 단어들을 출력한다. 단, 같은 단어가 여러 번 입력된 경우에는 한 번씩만 출력한다.
 */
public class N1181 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // 단어 개수
        int n = sc.nextInt();
        String[] arr = new String[n];
        for (int i = 0; i < n; i++){
            arr[i] = sc.next();
        }

        // 정렬
        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                // 길이가 같을 때
                if (s1.length() == s2.length()){
                    if(s1.compareTo(s2) > 0) {
                        return 1;
                    } else if(s1.compareTo(s2) < 0) {
                        return -1;
                    }
                }
                return s1.length() - s2.length();
            }
        });

        // 출력
        for (int i = 0; i < n; i++){
            if (i > 0 && arr[i].equals(arr[i - 1]))
                continue;
            System.out.println(arr[i]);
        }
    }
}
