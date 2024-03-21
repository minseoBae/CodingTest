package JavaBackendSchool.Practice;

public class Practice03 {
    //double 타입의 배열 doubles에서 최대값과 최소값을 찾아 출력하는 코드를 작성하세요.
    //double[] doubles = {1.5, 3.7, 2.4, 9.8, 7.6, 3.4};

    public static void main(String[] args) {
        double[] doubles = {1.5, 3.7, 2.4, 9.8, 7.6, 3.4};

        double min = doubles[0], max = 0;
        for(double num: doubles) {
            if(min >= num) min = num; if(max <= num) max = num;
        }
        System.out.println("최소값 : " + min + "최대값: "+max);
    }
}
