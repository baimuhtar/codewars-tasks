public class Kyu8 {
    public static void main(String[] args) {
        System.out.println(solution("world"));
    }

    /* Complete the solution so that it reverses the string passed into it.
             'world'  =>  'dlrow'
             'word'   =>  'drow'                                         */
    public static String solution(String str) {
        String reverseWord = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverseWord += str.charAt(i);
        }
        return reverseWord;
    }
}