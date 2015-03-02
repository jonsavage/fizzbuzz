package interviewQuestions.fizzbuzz;
/*
 * // -------------------------------------------------------------------------
/**
 *  Print numbers from 1 to 100 replacing numbers divisible by 3 with "fizz",
 *  numbers divisible by 5 with "buzz" and numbers divisible by both 3 and 5 with
 *  fizzbuzz"
 *
 *  Some Solutions.
 *
 *  @author Author: Jonathan Savage
 *  @version Feb 27, 2015
 */
public class fizzbuzz
{

    public static void main(String[] args)
    {
        simple();
        simpleNested();
        ternary();


    }

    /*
     * // ----------------------------------------------------------
    /**
     * Super simple solution, Probable what interviewers expect.
     * Inefficient because in double-checks i % 3 unnecessarily.
     */
    public static void simple() {
        System.out.println("\nSimple\n");

        for(int i = 1; i<=100; i++) {

            if(i % 3 == 0 && i % 5 == 0) { System.out.println("fizzbuzz"); }
            else if (i % 3 == 0) { System.out.println("fizz"); }
            else if (i % 5 == 0) { System.out.println("buzz"); }
            else { System.out.println(i); }
        }
    }

    /*
     * // ----------------------------------------------------------
    /**
     * Nested Version. UGGLLYY.
     */
    public static void simpleNested() {
        System.out.println("\nSimple Nested\n");

        for (int i = 1; i <=100; i++) {
            if(i % 5 == 0) {

                if(i % 3 == 0)
                    System.out.println("fizzbuzz");

                else
                    System.out.println("buzz");

            }
            else if (i % 3 == 0)
                System.out.println("fizz");

            else
                System.out.println(i);
        }
    }



    // ----------------------------------------------------------
    /**
     * Ternary with a string object. My favorite. Probably the most efficient
     * although those +='s could be improved upon.
     */
    public static void ternary() {
        System.out.println("\nTernary\n");

        //Declare it outside so we don't lose the reference each iteration.
        String out = "";

        for(int i = 1; i<=100; i++) {
            out = "";
            out += i % 3 == 0 ? "fizz" : "";
            out += i % 5 == 0 ? "buzz" : "";
            System.out.println(out.isEmpty() ? i : out);
        }
    }


}
