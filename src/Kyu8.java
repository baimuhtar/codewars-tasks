import java.util.Arrays;

public class Kyu8 {
    public static void main(String[] args) {
        System.out.println(solution("world"));
        System.out.println(oppositeNumber(5));
        System.out.println(dnaToRna("GCAT"));
        System.out.println(zeroFuel(100, 25, 4));
        System.out.println(greet("Mike", "Jhon"));
        System.out.println(smash("1", "4", "5"));
        System.out.println(sum(new double[]{1, 2, 3}));
        System.out.println(even_or_odd(4));
        System.out.println(updateLight("green"));
    }

    /* 1. Complete the solution so that it reverses the string passed into it.
             'world' => 'dlrow'           'word' => 'drow'          */
    public static String solution(String str) {
        String reverseWord = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverseWord += str.charAt(i);
        }
        return reverseWord;
    }

    /* 2. Very simple, given an integer or a floating-point number, find its opposite.
            1: -1       14: -14        -34: 34                                   */
    public static int oppositeNumber(int number) {
        return number * -1;
    }

    /* 3. Deoxyribonucleic acid, DNA is the primary information storage molecule in biological systems.
      It is composed of four nucleic acid bases Guanine ('G'), Cytosine ('C'), Adenine ('A'), and Thymine ('T').
      Ribonucleic acid, RNA, is the primary messenger molecule in cells.
      RNA differs slightly from DNA its chemical structure and contains no Thymine. In RNA Thymine is replaced by another nucleic acid Uracil ('U').
      Create a function which translates a given DNA string into RNA.
      "GCAT"  =>  "GCAU" */
    public static String dnaToRna(String dna) {
        return dna.replace('U', 'T');
    }

    /* 4. You were camping with your friends far away from home, but when it's time to go back, you realize that your fuel is running out and the nearest pump is 50 miles away!
      You know that on average, your car runs on about 25 miles per gallon. There are 2 gallons left.
      Considering these factors, write a function that tells you if it is possible to get to the pump or not.
      Function should return true if it is possible and false if not                                       */
    public static boolean zeroFuel(double distanceToPump, double mpg, double fuelLeft) {
        return mpg * fuelLeft >= distanceToPump;
    }

    /* 5. Create a function that gives a personalized greeting. This function takes two parameters: name and owner. */
    static String greet(String name, String owner) {
        if (name.equals(owner)) return "Hello boss";
        else return "Hello guest";
    }

    /*  6. Write a function that takes an array of words and smashes them together into a sentence and returns the sentence.*/
    public static String smash(String... words) {
        String eachWord = "";
        for (String s : words) {
            eachWord += s + " ";
        }
        eachWord = eachWord.trim();
        return eachWord;
    }

    /* 7. Write a function that takes an array of numbers and returns the sum of the numbers.
    The numbers can be negative or non-integer. If the array does not contain any numbers then you should return 0. */
    public static double sum(double[] numbers) {
        double sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return sum;
    }

    /* 8. Create a function that takes an integer as an argument and returns "Even" for even numbers or "Odd" for odd numbers. */
    public static String even_or_odd(int number) {
        if (number % 2 == 0) return "Even";
        else return "Odd";
    }

    /* 9. You're writing code to control your town's traffic lights. You need a function to handle each change from green,
    to yellow, to red, and then to green again. Complete the function that takes a string as an argument representing
    the current state of the light and returns a string representing the state the light should change to. */
    public static String updateLight(String current) {
        if (current.equals("green")) return "yellow";
        else if (current.equals("yellow")) return "red";
        else if (current.equals("red")) return "green";
        return current;
    }
}