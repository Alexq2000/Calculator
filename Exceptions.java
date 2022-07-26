public class Exceptions extends Calculator{
    public static void main(String[] args) {
        isException();
    }

    public static void isException() {
        try {
            compute();
        } catch (Exception e) {
            System.out.println("INCORRECT INPUT DATA");
        }
    }
}
