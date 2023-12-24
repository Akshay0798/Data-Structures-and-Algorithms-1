public class main {
    public static void main(String[] args) {
        Circuler list = new Circuler();
        list.insertLast(20);
        list.insertLast(30);
        list.insertLast(40);
        list.Display(); // Corrected method name

        list.insertFirst(99);
        list.Display(); // Corrected method name

        list.insertLast(88);
        list.Display(); // Corrected method name

        list.delete(10);
        list.Display(); // Corrected method name

        list.delete(30);
        list.Display(); // Corrected method name
    }
}
