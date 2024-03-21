package JavaBackendSchool.Practice;

public class Practice01 {
    public static void main(String[] args) {
        //아래 배열에서 최대값과 최소값을 찾아서 출력하세요.
        double[] doubles = {1.5, 3.7, 9.5, 3.1};
        double min = doubles[0], max = 0;
        for(double num: doubles) {
            if(min >= num) min = num; if(max <= num) max = num;
        }
        System.out.println("최소값 : " + min + "최대값: "+max);
    }
}