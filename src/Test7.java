public class Test7 {

    // Valid java main method signatures

    /*public static void main(String[] args) {
        System.out.println("Hello");
    }*/

    /*public static void main(String []args) {
        System.out.println("Hello");
    }*/

    /*public static void main(String args[]) {
        System.out.println("Hello");
    }*/

    /*public static void main(String... args) {
        System.out.println("Hello");
    }*/

    /*static public void main(String args[]) {
        System.out.println("Hello");
    }*/

    /*public static final void main(String args[]) {
        System.out.println("Hello Final");
    }*/

    /*final public static void main(String args[]) {
        System.out.println("Hello Final");
    }*/

    /*final strictfp public static void main(String args[]) {
        System.out.println("Hello Final StrictFP");
    }*/

    // Invalid java main method signatures

    /*public void main(String args[]) { // Error: Main method is not static
        System.out.println("Hello");
    }*/

    /*static void main(String args[]) { // Error: Main method not found
        System.out.println("Hello");
    }*/

    /*public void static main(String args[]) {
        System.out.println("Hello");
    }*/

    /*abstract public static void main(String args[]) {
        System.out.println("Hello World");
    }*/
}
