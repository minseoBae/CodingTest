package JavaBackendSchool.Practice;

public class Practice05 {
    //String 타입의 배열 words가 있을 때, 모든 요소를 한 칸씩 오른쪽으로 이동시키는 코드를 작성하세요. 마지막 요소는 배열의 첫 번째 요소로 이동해야 합니다.
    //String[] words = {"Java", "Python", "C", "JavaScript"};
    //출력 예시: {"JavaScript", "Java", "Python", "C"}

    public static void main(String[] args) {
        String[] words = {"Java", "Python", "C", "JavaScript"};
        String word = words[0];
        words[0] = words[words.length-1];
        for(int i = words.length-2; i >= 0; i--) {
            words[i+1] = words[i];
        }
        words[1] = word;
        for(String wd: words) {
            System.out.println(wd);
        }
    }
}