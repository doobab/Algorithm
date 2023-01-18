package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/*
문제
2차원 평면 위의 점 N개가 주어진다. 좌표를 x좌표가 증가하는 순으로, x좌표가 같으면 y좌표가 증가하는 순서로 정렬한 다음 출력하는 프로그램을 작성하시오.

입력
첫째 줄에 점의 개수 N (1 ≤ N ≤ 100,000)이 주어진다. 둘째 줄부터 N개의 줄에는 i번점의 위치 xi와 yi가 주어진다.
(-100,000 ≤ xi, yi ≤ 100,000) 좌표는 항상 정수이고, 위치가 같은 두 점은 없다.

출력
첫째 줄부터 N개의 줄에 점을 정렬한 결과를 출력한다.
 */
public class N11650 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        // 좌표 입력 받기
        ArrayList<Integer[]> list = new ArrayList<>();
        for (int i = 0; i < n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            Integer[] tmp = new Integer[2];
            tmp[0] = Integer.parseInt(st.nextToken());
            tmp[1] = Integer.parseInt(st.nextToken());
            list.add(tmp);
        }

        Collections.sort(list, new Comparator<Integer[]>() {
            @Override
            public int compare(Integer[] o1, Integer[] o2) {
                if (Objects.equals(o1[0], o2[0])) {
                    return o1[1] - o2[1];
                }
                return o1[0] - o2[0];
            }
        });

        for (int i = 0; i < n; i++){
            System.out.println(list.get(i)[0] + " " + list.get(i)[1]);
        }
    }
}
