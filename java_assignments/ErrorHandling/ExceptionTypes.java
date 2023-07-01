package ErrorHandling;

public class ExceptionTypes {
    public static void main(String[] args) {
        try {
            int[] numbers = { 1, 2, 3 };

            // ArrayIndexOutOfBoundsException
            System.out.println(numbers[4]);

            // ArithmeticException
            int result = 10 / 0;

            // NumberFormatException
            int value = Integer.parseInt("abc");

            // NullPointerException
            String text = null;
            System.out.println(text.length());

            // IllegalArgumentException
            int age = -5;
            if (age < 0) {
                throw new IllegalArgumentException("Age cannot be negative");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException occurred");
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException occurred");
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException occurred");
        } catch (NullPointerException e) {
            System.out.println("NullPointerException occurred");
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException occurred: " + e.getMessage());
        }
    }
}
