import java.io.*;
import java.util.*;

public class LocationDistanceCalculator {
    public static void main(String[] args) {
        // Lista do przechowywania liczb
        List<int[]> dataList = new ArrayList<>();

        // Odczyt danych z pliku
        try (BufferedReader reader = new BufferedReader(new FileReader("input.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] numbers = line.trim().split("\\s+");
                if (numbers.length == 2) {
                    int left = Integer.parseInt(numbers[0]);
                    int right = Integer.parseInt(numbers[1]);
                    dataList.add(new int[]{left, right});
                }
            }
        } catch (IOException e) {
            System.out.println("Błąd podczas odczytu pliku: " + e.getMessage());
            return;
        }

        // Modyfikacja danych
        for (int[] data : dataList) {
            data[0] += 1;  // Zwiększamy pierwszy element o 1
            data[1] += 2;  // Zwiększamy drugi element o 2
        }

        // Zapisanie zmienionych danych do pliku
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"))) {
            for (int[] data : dataList) {
                writer.write(data[0] + " " + data[1]);
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Błąd podczas zapisu do pliku: " + e.getMessage());
            return;
        }

        // Wyświetlenie wyniku na konsoli
        System.out.println("Zmodyfikowane liczby zapisane do pliku output.txt.");
    }
}
