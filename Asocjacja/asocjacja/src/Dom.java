public class Dom {

    public Drzwi[] drzwi;
    public Okno[] okna;
    public Pomieszczenie[] pokoje;
    public Pomieszczenie[] kuchnie;
    public Pomieszczenie[] lazienki;

    public Dom(int iloscPokoi, int iloscKuchni, int iloscLazienek, int iloscDrzwi, int iloscOkien) {
        tworzeniePokoi(iloscPokoi);
        tworzenieKuchni(iloscKuchni);
        tworzenieLazienki(iloscLazienek);
        tworzenieDrzwi(iloscDrzwi);
        tworzenieOkien(iloscOkien);
    }

    public void tworzenieDrzwi(int iloscDrzwi) {
        drzwi = new Drzwi[iloscDrzwi];
        for (int i = 0; i < iloscDrzwi; i++) {
            drzwi[i] = new Drzwi();
        }
    }

    public void tworzenieOkien(int iloscOkien) {
        okna = new Okno[iloscOkien];
        for (int i = 0; i < iloscOkien; i++) {
            okna[i] = new Okno();
        }
    }

    public void tworzeniePokoi(int iloscPokoi) {
        pokoje = new Pomieszczenie[iloscPokoi];
        for (int i = 0; i < iloscPokoi; i++) {
            pokoje[i] = new Pokoj("Pokój " + (i + 1));
        }
    }

    public void tworzenieKuchni(int iloscKuchni) {
        kuchnie = new Pomieszczenie[iloscKuchni];
        for (int i = 0; i < iloscKuchni; i++) {
            kuchnie[i] = new Kuchnia("Kuchnia " + (i + 1));
        }
    }

    public void tworzenieLazienki(int iloscLazienek) {
        lazienki = new Pomieszczenie[iloscLazienek];
        for (int i = 0; i < iloscLazienek; i++) {
            lazienki[i] = new Lazienka("Łazienka " + (i + 1));
        }
    }

    public void przypiszDrzwi() {
        if (lazienki.length > 0 && pokoje.length > 0) {
            lazienki[0].tworzenieDrzwi(1, new Pomieszczenie[]{pokoje[0]});
        }
        if (kuchnie.length > 0 && lazienki.length > 0) {
            kuchnie[0].tworzenieDrzwi(1, new Pomieszczenie[]{lazienki[0]});
        }
        if (pokoje.length > 1) {
            pokoje[0].tworzenieDrzwi(1, new Pomieszczenie[]{pokoje[1]});
        }
        if (lazienki.length > 0 && kuchnie.length > 0) {
            lazienki[0].tworzenieDrzwi(1, new Pomieszczenie[]{kuchnie[0]});
        }
    }
}
