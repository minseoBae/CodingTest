package JavaBackendSchool.Practice;

import java.util.Arrays;

public class Practice06 {
    //int 타입의 두 배열 array1과 array2가 주어졌을 때, 두 배열의 합집합을 구하여 새 배열에 저장하고, 결과 배열을 출력하는 코드를 작성하세요. 합집합 배열에는 중복된 요소가 없어야 합니다.
    //int[] array1 = {1, 3, 5, 7, 9};
    //int[] array2 = {0, 2, 4, 6, 8, 10, 3, 5};

    public static void main(String[] args) {
        int[] array1 = {1, 3, 5, 7, 9};
        int[] array2 = {0, 2, 4, 6, 8, 10, 3, 5};
        int same = 0;
        int idx = 0;
        boolean have = false;
        for(int ary2: array2) {
            for(int ary: array1) {
                if(ary == ary2) same+=1;
                if(ary == 0 || ary2 == 0) { have = true; }
            }
        }
        int[] array3 = new int[array1.length+array2.length-same];
        for(int i = 0; i < array2.length; i++) {
            if(!contain(array3, array2[i])) {
                array3[idx++] = array2[i];
            }
        }
        for(int i = 0; i < array1.length; i++) {
            if(!contain(array3, array1[i])) {
                array3[idx++] = array1[i];
            }
        }
        if(have) array3[idx++] = 0;
        Arrays.sort(array3);
        System.out.print("합집합: {");
        for (int i = 0; i < idx; i++) {
            System.out.print(array3[i] + " ");
        }
        System.out.println("}");
    }
    private static boolean contain(int[] arr, int value) {
        for(int a: arr) { if(a == value) return true; }
        return false;
    }
}
