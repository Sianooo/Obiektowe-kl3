public class Lazienka extends Pomieszczenie {

    public Prysznic[] prysznice;
    public Wanna[] wanny;
    public Umywalka[] umywalek;
    public Pralka[] pralek;
    public Szafka[] szafek;

    public Lazienka() {
        System.out.println("--------Tworzenie lazienki----------");
    }

    public class Prysznic {
        public Prysznic() {
        }
    }

    public class Wanna {
        public Wanna() {

        }
    }

    public class Umywalka {
        public Umywalka() {

        }
    }

    public class Pralka {
        public Pralka() {

        }
    }

    public class Szafka {
        public Szafka() {

        }
    }
    public void tworzeniePralki(int iloscPralek) {
        pralek = new Pralka[iloscPralek];
        for (int i = 0; i < iloscPralek; i++) {
            pralek[i] = new Pralka();
        }
    }

    public void tworzenieWanny(int iloscWanien) {
        wanny = new Wanna[iloscWanien];
        for (int i = 0; i < iloscWanien; i++) {
            wanny[i] = new Wanna();
        }
    }

    public void tworzenieUmywalka(int iloscUmywalek) {
        umywalek = new Umywalka[iloscUmywalek];
        for (int i = 0; i < iloscUmywalek; i++) {
            umywalek[i] = new Umywalka();
        }
    }


    public void tworzeniePrysznica(int iloscPrysznicy) {
        prysznice = new Prysznic[iloscPrysznicy];
        for (int i = 0; i < iloscPrysznicy; i++) {
            prysznice[i] = new Prysznic();
        }
    }

    public void tworzenieSzafek(int iloscSzafek) {
        szafek = new Szafka[iloscSzafek];
        for (int i = 0; i < iloscSzafek; i++) {
            szafek[i] = new Szafka();

        }
    }
}