import java.util.*;
import java.util.stream.*;

public class EvenNumbersDoubled {
    public static void main(String[] args) {
        Random random = new Random();

        // Generowanie strumienia liczb parzystych w zakresie od 2 do 1000
        List<Integer> doubledEvenNumbers = random.ints(1000, 1, 1000)  // Losowanie 500 liczb z zakresu 1-500
                .map(n -> n * 2)  // Podwajamy każdą liczbę, aby była parzysta
                .boxed()  // Zamieniamy IntStream na Stream<Integer>
                .collect(Collectors.toList());  // Zbieramy wyniki do listy

        // Wyświetlanie wszystkich liczb (parzystych i podwojonych)
        doubledEvenNumbers.forEach(System.out::println);  // Wypisujemy każdą liczbę
    }
}

