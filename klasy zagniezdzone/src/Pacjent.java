public class Pacjent {
    public String imie;
    public String nazwisko;

    public Pacjent(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }
    public nerka nerka;
    public watroba watroba;


    public class nerka{
        public int waga;
        public String ksztalt;
        public String kolor;

        public nerka(int waga, String ksztalt, String kolor) {
            this.waga = waga;
            this.ksztalt = ksztalt;
            this.kolor = kolor;
        }
    }

    public class watroba{
        public int waga;
        public String ksztalt;
        public String kolor;

        public watroba(int waga, String ksztalt, String kolor) {
            this.waga = waga;
            this.ksztalt = ksztalt;
            this.kolor = kolor;
        }
    }

}
