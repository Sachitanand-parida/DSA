package DSAquestions.Pattern;

public class PatternQuestions {
    public static void main(String[] args) {
        //pattern1();
        //pattern2();
        pattern6();
    }

    private static void pattern6() {
        for (int i = 1; i <= 5; i++) {
            for (int q = 0; q < i-1; q++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 10-i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    /*
            *
           ***
          *****
         *******
        *********
     */
    private static void pattern5() {
        for (int i = 1; i <= 5; i++) {
            for (int q = 0; q < 5-i; q++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2*i-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /*
    12345
    1234
    123
    12
    1
     */
    private static void pattern4() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5-i+1; j++) {
                //System.out.print("*");
                System.out.print(j);
            }
            System.out.println();
        }
    }

    /*
    *
    * *
    * **
    * ***
     */
    private static void pattern1() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /*
    1
    12
    123
    1234
    12345
     */
    private static void pattern2() {
        for (int i = 0; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    /*
    1
    22
    333
    4444
    55555
     */
    private static void pattern3() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
