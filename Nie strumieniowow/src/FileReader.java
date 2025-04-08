import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class NumberPair {
    private int firstNumber;
    private int secondNumber;

    public NumberPair(int firstNumber, int secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    @Override
    public String toString() {
        return "NumberPair{firstNumber=" + firstNumber + ", secondNumber=" + secondNumber + "}";
    }
}

public class FileReader {
    public static void main(String[] args) {
        try {
            List<NumberPair> numberPairs = new ArrayList<>();

            // Wczytywanie odczyt.txt
            Scanner scanner1 = new Scanner(Paths.get("odczyt.txt"));
            while (scanner1.hasNextLine()) {
                String line = scanner1.nextLine();
                String[] numbers = line.trim().split("\\s+");
                numberPairs.add(
                        new NumberPair(
                                Integer.parseInt(numbers[0]),
                                Integer.parseInt(numbers[1])
                        )
                );
            }
            scanner1.close();

            // Wyświetlanie numberPairs
            for (NumberPair pair : numberPairs) {
                System.out.println(pair);
            }

            System.out.println();
            System.out.println();

            // Wczytywanie egz.txt
            Scanner scanner2 = new Scanner(Paths.get("egz.txt"));
            while (scanner2.hasNextLine()) {
                String line = scanner2.nextLine();
                System.out.println(line);
            }
            scanner2.close();

        } catch (Exception e) {
            System.out.println("Wystąpił błąd: " + e.getMessage());
        }
    }
}