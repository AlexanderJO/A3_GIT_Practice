package no.ntnu.datakomm.a3;

/**
 * Implement the "features", place your code where the TODO tags are. 
 * Read description of assignment A3 to understand the details.
 */
public class MyClass {

    private static void feature1() {
        // TODO - print "Feature #1"
        int A = 5;
        int B = A * 10;
        int C = A + B;
        System.out.println("The answer to life is: " + C);
    }

    private static void feature2() {
        // TODO - print "Feature #2"
        int x = 20;
        int y = 20/2;
        int z = x * y;
        System.out.println("The answer is" + z);
    }

    private static void feature3() {
        // TODO - print "Feature #3"
        System.out.println("Very good feature yes.");
    }

    private static void feature4() {
        // TODO - print "Feature #4"
    }

    private static void feature5() {
        System.out.println("Feature #5");
    }

    public static void main(String[] args) {
        System.out.println("The following features are implemented:");
        feature1();
        feature2();
        feature3();
        feature4();
        feature5();
    }
}
