public class MainApp {
    public static void main(String[] args) {

        // String Function
        String originalName = "Akshay";
        changeName(originalName);
        System.out.println(originalName);
    }

    private static void changeName(String name) {
        name = "Suppu"; // Creating a new object
        // You cannot modify a string
    }
}
