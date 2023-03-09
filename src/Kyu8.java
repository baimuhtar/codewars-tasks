import java.awt.image.AreaAveragingScaleFilter;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.stream.Stream;

public class Kyu8 {
    public static void main(String[] args) {

        System.out.println(solution("world")); // 1
        System.out.println(oppositeNumber(5)); // 2
        System.out.println(dnaToRna("GCAT")); // 3
        System.out.println(zeroFuel(100, 25, 4)); // 4
        System.out.println(greet("Mike", "Jhon")); // 5
        System.out.println(smash("1", "4", "5")); // 6
        System.out.println(sum(new double[]{1, 2, 3})); // 7
        System.out.println(even_or_odd(4)); // 8
        System.out.println(updateLight("green")); // 9
        System.out.println(convert(true)); // 10
        System.out.println(numberToString(56)); // 11
        System.out.println(paperWork(5, 6)); // 12
        System.out.println(remove("astana")); // 13
        System.out.println(getVolumeOfCuboid(3, 2, 1)); // 14
        System.out.println(Arrays.toString(stringToArray("Manager Driver"))); // 15
        System.out.println(opposite(-3)); // 16
        System.out.println(fakeBin("1234567")); // 17
        System.out.println(isEven(5.0)); // 18
        System.out.println(shortcut("hello")); // 19
        System.out.println(quarterOf(13)); // 20
        System.out.println(repeatStr(3, "Hello")); // 21
        System.out.println(countSheeps(new Boolean[]{true,  true,  true,  false,
                true,  true,  true,  true ,
                true,  false, true,  false,
                true,  false, false, true ,
                true,  true,  true,  true ,
                false, false, true,  true}));
    }

    /* 1. Complete the solution so that it reverses the string passed into it.
             'world' => 'dlrow'           'word' => 'drow'        */
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

    /* 10. Implement a function which convert the given boolean value into its string representation. */
    public static String convert(boolean b) {
        if (b) return "true";
        else return "false";
    }

    /* 11. Convert a Number to a String!*/
    public static String numberToString(int num) {
        return Integer.toString(num);
    }

    /* 12. Your classmates asked you to copy some paperwork for them. You know that there are 'n' classmates and the paperwork has 'm' pages.
     Your task is to calculate how many blank pages do you need. If n < 0 or m < 0 return 0. */
    public static int paperWork(int n, int m) {
        if (n >= 0 && m >= 0) {
            return n * m;
        } else return 0;
    }

    /* 13. It's pretty straightforward. Your goal is to create a function that removes the first and last characters of a string.
    You're given one parameter, the original string. You don't have to worry with strings with less than two characters.*/
    public static String remove(String str) {
        return str.substring(1, str.length() - 1);
    }

    /* 14. Bob needs a fast way to calculate the volume of a cuboid with three values: the length, width and height of the cuboid.
    Write a function to help Bob with this calculation.*/
    public static double getVolumeOfCuboid(final double length, final double width, final double height) {
        return length * width * height;
    }

    /* 15. Write a function to split a string and convert it into an array of words.*/
    public static String[] stringToArray(String s) {
        return s.split(" ");

    }

    /* 16. Very simple, given an integer or a floating-point number, find its opposite.*/
    public static int opposite(int number) {
        return -number;
    }

    /* 17. Given a string of digits, you should replace any digit below 5 with '0'
     and any digit 5 and above with '1'. Return the resulting string.*/
    public static String fakeBin(String numberString) {
        return numberString.replaceAll("[0-4], 0", "[5-9], 1");
    }

    /* 18. Your code will determine if the number passed is even (or not).
     The function needs to return either a true or false.
     Numbers may be positive or negative, integers or floats.*/
    public static boolean isEven(double n) {
        return n % 2 == 0;
    }

    /* 19. Create a function called shortcut to remove the lowercase vowels (a, e, i, o, u ) in a given string.*/
    public static String shortcut(String input) {
        String[] wordsToRemove = new String[]{"a", "e", "i", "o", "u"};
        for (int j = 0; j < wordsToRemove.length; j++) {
            if (input.contains(wordsToRemove[j])) {
                input = input.replace(wordsToRemove[j], "");
            }
        }
        return input;
    }

    /* 20. Given a month as an integer from 1 to 12, return to which quarter of the year it belongs as an integer number.
    For example: month 2 (February), is part of the first quarter; month 6 (June), is part of the second quarter;
    and month 11 (November), is part of the fourth quarter.*/
    public static int quarterOf(int month) {
        return (month + 2) / 3;
    }

    /* 21. Write a function that accepts an integer n and a string s as parameters,
    and returns a string of s repeated exactly n times.*/
    public static String repeatStr(final int repeat, final String string) {
        String word = "";
        for (int i = 0; i < repeat; i++) {
            word += string;
        }
        return word;
    }
    /* 22. Consider an array/list of sheep where some sheep may be missing from their place. We need a function
    that counts the number of sheep present in the array (true means present).*/
    public static int countSheeps(Boolean[] arrayOfSheeps) {
        int count = 0;
        for (int i = 0; i < arrayOfSheeps.length; i++) {
            if (arrayOfSheeps[i] != null && arrayOfSheeps[i]) {
                count++;
            }
        }
        return count;
    }
}