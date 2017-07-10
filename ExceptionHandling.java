public class ExceptionHandling {
    public static void main(String args[]) {
        try {
            int arr[] = {5,10, 6, 9, 11};
            System.out.println("Sixth element :" + arr[6]);
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception thrown  :" + e);
        } finally {
            System.out.println("Program in finally block");
        }

        System.out.println("Program Terminating");
    }
}
