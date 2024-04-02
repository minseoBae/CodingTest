package BackJun;

import java.util.Arrays;
import java.util.Scanner;

public class InvertArray {
    static void swap(int[] a, int idx1,int idx2) {
        int temp = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = temp;
    }

    //--- 배열 a의 요소를 역순으로 정렬 ---//
    static void reverse(int[] a) {
        for(int i = 0; i < a.length / 2; i++)
            swap(a, i, a.length - i - 1);
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("점수의 개수: ");
        int num = stdIn.nextInt(); // 점수의 개수를 입력받음

        int[] scores = new int[num];

        for(int i = 0; i < num; i++) {
            System.out.println("scores[" + i + "] : ");
            scores[i] = stdIn.nextInt(); // 점수 입력
        }

        reverse(scores);

        System.out.println("점수를 역순으로 정렬했습니다.");
        System.out.println("scores = " + Arrays.toString(scores));
    }
}
