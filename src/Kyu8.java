public class Kyu8 {
    public static void main(String[] args) {
        System.out.println(solution("world"));
        System.out.println(oppositeNumber(5));
    }

    /* Complete the solution so that it reverses the string passed into it.
             'world'  =>  'dlrow'           'word'   =>  'drow'          */
    public static String solution(String str) {
        String reverseWord = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverseWord += str.charAt(i);
        }
        return reverseWord;
    }

    /* Very simple, given an integer or a floating-point number, find its opposite.
            1: -1       14: -14        -34: 34                                   */
    public static int oppositeNumber(int number) {
        return number * -1;
    }

}