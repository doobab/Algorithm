package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
문제
정수를 저장하는 큐를 구현한 다음, 입력으로 주어지는 명령을 처리하는 프로그램을 작성하시오.
명령은 총 여섯 가지이다.
push X: 정수 X를 큐에 넣는 연산이다.
pop: 큐에서 가장 앞에 있는 정수를 빼고, 그 수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
size: 큐에 들어있는 정수의 개수를 출력한다.
empty: 큐가 비어있으면 1, 아니면 0을 출력한다.
front: 큐의 가장 앞에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
back: 큐의 가장 뒤에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.

입력
첫째 줄에 주어지는 명령의 수 N (1 ≤ N ≤ 10,000)이 주어진다. 둘째 줄부터 N개의 줄에는 명령이 하나씩 주어진다. 주어지는 정수는 1보다 크거나 같고, 100,000보다 작거나 같다. 문제에 나와있지 않은 명령이 주어지는 경우는 없다.

출력
출력해야하는 명령이 주어질 때마다, 한 줄에 하나씩 출력한다.
 */
public class N10845 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Que que = new Que();
        for (int i = 0; i < n; i++){
            String str = br.readLine();
            if (str.contains("push")){
                int x = Integer.parseInt(str.substring(str.lastIndexOf(" ")+1));
                que.push(x);
            } else {
                switch (str) {
                    case "pop":
                        que.pop();
                        break;
                    case "size":
                        que.size();
                        break;
                    case "empty":
                        que.empty();
                        break;
                    case "front":
                        que.front();
                        break;
                    case "back":
                        que.back();
                }
            }
        }
    }

    public static class Que {
        int[] que;
        int front;
        int back;

        public Que() {
            this.que = new int[10000];
            this.front = 0;
            this.back = 0;
        }

        public void push(int x) {
            que[back++] = x;
        }

        public void pop() {
            System.out.println(front == back ? -1 : que[front++]);
        }

        public void size() {
            System.out.println(back - front);
        }

        public void empty() {
            System.out.println(front == back ? 1 : 0);
        }

        public void front() {
            System.out.println(front == back ? -1 : que[front]);
        }

        public void back() {
            System.out.println(front == back ? -1 : que[back - 1]);
        }
    }
}
