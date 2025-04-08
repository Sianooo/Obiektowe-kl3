import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

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

 class Album {
    private String title;
    private String author;

    // Konstruktor
    public Album(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Gettery
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "Album: " + title + ", Author: " + author;
    }
}


public class FileReader {
    public static void main(String[] args) {
        try {
            List<NumberPair> numberPairs = new ArrayList<>();

            Files.lines(Paths.get("odczyt.txt"))
                    .map(line -> line.trim().split("\\s+"))
                    .forEach(numbers -> numberPairs.add(
                            new NumberPair(
                                    Integer.parseInt(numbers[0]),
                                    Integer.parseInt(numbers[1])
                            )
                    ));

            numberPairs.forEach(System.out::println);

        } catch (Exception e) {
            System.out.println("Wystąpił błąd: " + e.getMessage());
        }

        System.out.println();
        System.out.println();

        try {
            // Wczytanie wszystkich linii z pliku
            List<String> lines = Files.readAllLines(Paths.get("egz.txt"));

            // Przetwarzanie każdej linii, zakładając, że w pliku są dane w formacie "tytuł;autor"
            for (String line : lines) {
                String[] data = line.split(";");
                if (data.length == 2) {
                    String title = data[0].trim();
                    String author = data[1].trim();

                    // Tworzenie obiektu Album
                    Album album = new Album(title, author);

                    // Wypisanie obiektu Album
                    System.out.println(album);
                } else {
                    System.out.println("Niepoprawny format linii: " + line);
                }
            }
        } catch (Exception e) {
            System.out.println("Błąd: " + e.getMessage());
        }
    }
}