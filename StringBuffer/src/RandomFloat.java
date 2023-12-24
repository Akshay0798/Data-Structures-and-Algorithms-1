import java.util.Random;

public class RandomFloat {
    public static void main(String[] args) {
        Random random = new Random();

        // Generate and print a random floating-point number
        float randomFloat = random.nextFloat();
        System.out.println("Random Float: " + randomFloat);

        // Convert ASCII value to a character and print it
        int asciiValue = 97; // ASCII value of 'a'
        char character = (char) asciiValue;
        System.out.println("Character: " + character);
    }
}
