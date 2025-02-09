import java.lang.reflect.Array;
import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String inwokacja = "Litwo! Ojczyzno moja! ty jesteś jak zdrowie.\n" +
                "\n" +
                "Ile cię trzeba cenić, ten tylko się dowie,\n" +
                "\n" +
                "Kto cię stracił. Dziś piękność twą w całej ozdobie\n" +
                "\n" +
                "Widzę i opisuję, bo tęsknię po tobie.\n" +
                "\n" +
                " \n" +
                "\n" +
                "Panno Święta, co Jasnej bronisz Częstochowy\n" +
                "\n" +
                "I w Ostrej świecisz Bramie! Ty, co gród zamkowy\n" +
                "\n" +
                "Nowogródzki ochraniasz z jego wiernym ludem!\n" +
                "\n" +
                "Jak mnie dziecko do zdrowia powróciłaś cudem\n" +
                "\n" +
                "(Gdy od płaczącej matki pod Twoję opiekę\n" +
                "\n" +
                "Ofiarowany, martwą podniosłem powiekę\n" +
                "\n" +
                "I zaraz mogłem pieszo do Twych świątyń progu\n" +
                "\n" +
                "Iść za wrócone życie podziękować Bogu),\n" +
                "\n" +
                "Tak nas powrócisz cudem na Ojczyzny łono.\n" +
                "\n" +
                "Tymczasem przenoś moję duszę utęsknioną\n" +
                "\n" +
                "Do tych pagórków leśnych, do tych łąk zielonych,\n" +
                "\n" +
                "Szeroko nad błękitnym Niemnem rozciągnionych;\n" +
                "\n" +
                "Do tych pól malowanych zbożem rozmaitem,\n" +
                "\n" +
                "Wyzłacanych pszenicą, posrebrzanych żytem;\n" +
                "\n" +
                "Gdzie bursztynowy świerzop, gryka jak śnieg biała,\n" +
                "\n" +
                "Gdzie panieńskim rumieńcem dzięcielina pała,\n" +
                "\n" +
                "A wszystko przepasane, jakby wstęgą, miedzą\n" +
                "\n" +
                "Zieloną, na niej z rzadka ciche grusze siedzą.";


//        System.out.println("Liczba o wystąpiła " + sum + " razy");

        System.out.println("-------------------");

        int dlugoscTekstu=inwokacja.length();

        System.out.println("Statystyka występowania znaków: ");

        for(char i=0;i<=dlugoscTekstu;i++){
            int suma = zliczZnaki(inwokacja,i);
            if(suma>0){
                double procent= (double) suma/dlugoscTekstu*100;
                System.out.printf("Znak '%c' występuje %.2f%%\n", i, procent);
            }
        }

        for(char i='A';i<='Z';i++){
            int suma = zliczZnaki(inwokacja,i);
            if(suma>0){
                double procent= (double) suma/dlugoscTekstu*100;
                System.out.printf("Znak '%c' występuje %.2f%%\n", i, procent);
            }
        }


//        for (int i = 0; i < dlugoscTekstu; i++) {
//            char znak = inwokacja.charAt(i);
//            int suma = zliczZnaki(inwokacja, znak);
//            if (suma > 0) {
//                double procent = (double) suma / dlugoscTekstu * 100;
//                System.out.printf("Znak '%c' występuje %.2f%%\n", znak, procent);
//                inwokacja = inwokacja.replace(znak + "", "");
//            }
//        }

    }

    static int zliczZnaki(String text, char liczbaCharow) {
        int zlicz=0;
        for (int i = 0; i < text.length(); i++) {
            if (liczbaCharow == text.charAt(i)) {
                zlicz++;
            }
        }
        return zlicz;
    }
}
