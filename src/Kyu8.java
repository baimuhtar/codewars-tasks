public class Kyu8 {
    public static void main(String[] args) {
        System.out.println(solution("world"));
        System.out.println(oppositeNumber(5));
        System.out.println(dnaToRna("GCAT"));
        System.out.println(zeroFuel(100, 25,4));
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
    public static boolean zeroFuel(double distanceToPump, double mpg, double fuelLeft) {
        return mpg * fuelLeft >= distanceToPump;
    }

   /* Create a function that gives a personalized greeting. This function takes two parameters: name and owner. */
   static String greet(String name, String owner) {
       if (name.equals(owner)) return "Hello boss";
       else return "Hello guest";
   }

}