public class EH2 {

    // Method that may throw an exception
    public void ageCheck(int age) throws ArithmeticException {

        if (age < 18) {
            // Manually throwing an exception
            throw new ArithmeticException("You are not eligible");
        } else {
            System.out.println("You are eligible!");
        }
    }

    public static void main(String[] args) {

        EH2 e = new EH2();
        int age = 16;   // Change value to test

        try {
            // Risky method call
            e.ageCheck(age);
        }
        catch (ArithmeticException ex) {
            // Handling the exception
            System.out.println("Exception Handled: " + ex.getMessage());
        }
        finally {
            // Runs ALWAYS
            System.out.println("Thank you for using the application.");
        }

        System.out.println("Program continues normally...");
    }
}
