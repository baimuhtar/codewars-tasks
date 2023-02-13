import java.util.Arrays;

public class Kyu8 {
    public static void main(String[] args) {
        System.out.println(solution("world"));
        System.out.println(oppositeNumber(5));
        System.out.println(dnaToRna("GCAT"));
        System.out.println(zeroFuel(100, 25, 4));
        System.out.println(greet("Mike", "Jhon"));
        System.out.println(smash("1", "4", "5"));
    }

    /* Complete the solution so that it reverses the string passed into it.
             'world' => 'dlrow'           'word' => 'drow'          */
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

    /* Deoxyribonucleic acid, DNA is the primary information storage molecule in biological systems.
      It is composed of four nucleic acid bases Guanine ('G'), Cytosine ('C'), Adenine ('A'), and Thymine ('T').
      Ribonucleic acid, RNA, is the primary messenger molecule in cells.
      RNA differs slightly from DNA its chemical structure and contains no Thymine. In RNA Thymine is replaced by another nucleic acid Uracil ('U').
      Create a function which translates a given DNA string into RNA.
      "GCAT"  =>  "GCAU" */
    public static String dnaToRna(String dna) {
        return dna.replace('U', 'T');
    }

    /* You were camping with your friends far away from home, but when it's time to go back, you realize that your fuel is running out and the nearest pump is 50 miles away!
      You know that on average, your car runs on about 25 miles per gallon. There are 2 gallons left.
      Considering these factors, write a function that tells you if it is possible to get to the pump or not.
      Function should return true if it is possible and false if not                                       */
    public static boolean zeroFuel(double distanceToPump, double mpg, double fuelLeft) {
        return mpg * fuelLeft >= distanceToPump;
    }

    /* Create a function that gives a personalized greeting. This function takes two parameters: name and owner. */
    static String greet(String name, String owner) {
        if (name.equals(owner)) return "Hello boss";
        else return "Hello guest";
    }

    /*  Write a function that takes an array of words and smashes them together into a sentence and returns the sentence.*/
    public static String smash(String... words) {
        String eachWord = "";
        for (String s : words) {
            eachWord += s + " ";
        }
        eachWord = eachWord.trim();
        return eachWord;
    }
}