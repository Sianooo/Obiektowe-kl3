public class Pomieszczenie {
    public Drzwi[] drzwi;
    public TypPomieszczenia typ;
    public String nazwa;

    public Pomieszczenie(){}

    public Pomieszczenie(String nazwa) {
        this.nazwa = nazwa;
    }

    public void tworzenieDrzwi(int iloscDrzwi, Pomieszczenie[] cele) {
        drzwi = new Drzwi[iloscDrzwi];
        for (int i = 0; i < iloscDrzwi; i++) {
            drzwi[i] = new Drzwi(cele[i]);
        }
    }
}
