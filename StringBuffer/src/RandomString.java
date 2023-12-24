import java.util.Random;

public class RandomString {
    public static void main(String[] args) {
            int n = 20;
            String name = RandomString.generate(n);
            System.out.println(name);
        }
    static String generate(int size) {
        StringBuffer sb = new StringBuffer(size);

        Random random = new Random(); // Create a Random object for generating random characters

        for (int i = 0; i < size; i++) {
            int randomChar = 97 + random.nextInt(26); // Generate a random number between 97 and 122
            // (inclusive) which corresponds 'a' to 'z' in ASCII
            sb.append((char) randomChar); // Append the generated character to the StringBuffer
        }
        return sb.toString(); // Convert the StringBuffer to a String and return it
    }
}


