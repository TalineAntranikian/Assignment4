//Assignment 4
//Taline Antranikian
//300230175
//ITI1121

public class Main{
 public static void main(String[] args) {
       Polynomial polynomial = new Polynomial();
     // Example 1
        String p1 = "5x^6;-7x^2;3x^0";
        String p2 = "-4x^4;3x^3;-2x^2;0x^0";
        String answer1 = polynomial.addpoly(p1, p2);
        System.out.println("The answer for E1: " + answer1);
        // Example 2
        String p3 = "3x^9;-9x^1";
        String p4 = "8x^2;1x^1";
        String answer2 = polynomial.addpoly(p3, p4);
        System.out.println("The answer for E2: " + answer2);
        // Example 3
        String p5 = "3x^4;-5x^3;2x^2;4x^1";
        String p6 = "-2x^3;3x^3;2x^2;4x^2";
        String answer3 = polynomial.addpoly(p5, p6);
        System.out.println("The answer for E3: " + answer3);  
        // Example 4
        String p7 = "3x^3;-5x^3;9x^2;4x^1";
        String p8 = "2x^3;-3x^2";
        String answer4 = polynomial.addpoly(p7, p8);
        System.out.println("The answer for E4: " + answer4);  
        // Example 5
        String p9 =  "6x^8";
        String p10 =  "-6x^8";
        String answer5 = polynomial.addpoly(p9, p10);
        System.out.println("The answer for E5: " + answer5);  
    }
}