package JavaBackendSchool.Practice;

public class Practice07 {
    //int 타입의 이차원 배열 matrix가 주어졌을 때, 두 대각선의 요소 합계를 구하는 코드를 작성하세요. 배열은 정사각형 배열이라고 가정합니다.
    //int[][] matrix = {
    //    {1,  2,  3,  4},
    //    {5,  6,  7,  8},
    //    {9,  10, 11, 12}
    //    {13, 14, 15, 16}
    //};
    //대각선 요소의 합계를 각각 구하고, 그 결과를 출력하세요.
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        int sum1 = 0, sum2 = 0;
        // 첫 번째 대각선 요소 합계 구하기
        for (int i = 0; i < matrix.length; i++) {
            sum1 += matrix[i][i];
        }

        // 두 번째 대각선 요소 합계 구하기
        for (int i = 0; i < matrix.length; i++) {
            sum2 += matrix[i][matrix.length - i - 1];
        }
        System.out.println(sum1+sum2);
    }
}
