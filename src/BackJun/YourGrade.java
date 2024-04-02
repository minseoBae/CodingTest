package BackJun;

import java.util.Scanner;

public class YourGrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double result = 0, totalCredits = 0;
        char c;

        for (int i = 0; i < 20; i++) {
            double credit = 0;
            double grade = 0;

            String str_arr[] = scanner.nextLine().split(" ");
            credit += Double.parseDouble(str_arr[1]);
            c = str_arr[2].charAt(0);
            switch(c) {
                case 'A':
                    if(str_arr[2].charAt(1) == '+') grade += 4.5;
                    else grade += 4.0;
                    break;
                case 'B':
                    if(str_arr[2].charAt(1) == '+') grade += 3.5;
                    else grade += 3.0;
                    break;
                case 'C':
                    if(str_arr[2].charAt(1) == '+') grade += 2.5;
                    else grade += 2.0;
                    break;
                case 'D':
                    if(str_arr[2].charAt(1) == '+') grade += 1.5;
                    else grade += 1.0;
                    break;
                case 'F':
                    grade += 0;
                    break;
                case 'P':
                    grade += 0;
                    credit = 0;
                    break;
            }
            totalCredits += credit;
            result += credit*grade;
        }

        // 전공 평점 계산 및 출력
        System.out.println(result/totalCredits);
    }
}
