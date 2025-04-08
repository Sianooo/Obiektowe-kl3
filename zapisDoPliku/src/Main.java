import java.nio.file.*;
import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            List<String> lines = Files.readAllLines(Paths.get("egz.txt"));
            lines.forEach(System.out::println);
        } catch (IOException e) {
            System.out.println("Nie udało się odczytać pliku: " + e.getMessage());
        }
    }
}
// stworz obiekty do tego tak zeby dalo sie odwolac