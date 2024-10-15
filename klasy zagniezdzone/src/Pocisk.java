import java.util.Random;

public class Pocisk {

    int id;
    Random rand = new Random();

    public Pocisk(int id) {
        this.id = id;
    }

    void generujOdlamki(int liczbaOdlamkow) {
        class Odlamek {
            int idOdlamka;

            public Odlamek(int idOdlamka) {
                this.idOdlamka = idOdlamka;
                System.out.println("Pocisk " + id + " - wygenerowano odłamek: " + idOdlamka);
            }

            void generujOdlamkiOdlamka(int liczbaOdlamkowOdlamka) {
                for (int i = 0; i < liczbaOdlamkowOdlamka; i++) {
                    int x = rand.nextInt(21) - 10;
                    int y = rand.nextInt(21) - 10;
                    int z = rand.nextInt(21) - 10;
                    System.out.println("Odłamek " + idOdlamka + " - wygenerowano odłamek odłamka: " + (i + 1));
                    System.out.println("X leci w kierunku: " + x + ", Y leci w kierunku: " + y + ", Z leci w kierunku: " + z);
                }
            }
        }

        for (int i = 0; i < liczbaOdlamkow; i++) {
            int x = rand.nextInt(21) - 10;
            int y = rand.nextInt(21) - 10;
            int z = rand.nextInt(21) - 10;
            Odlamek odlameczek = new Odlamek(i + 1);
            odlameczek.generujOdlamkiOdlamka(3);
            System.out.println("X leci w kierunku: " + x + ", Y leci w kierunku: " + y + ", Z leci w kierunku: " + z);
        }
    }
}