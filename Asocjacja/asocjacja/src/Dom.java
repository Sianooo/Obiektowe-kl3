public class Dom {

    public Drzwi[] drzwi;
    public Okno[] okna;
    public Pomieszczenie[] pokoje;
    public Pomieszczenie[] kuchni;
    public Pomieszczenie[] lazienki;


//    public Dom()
//    {
//        pokoje = new Pomieszczenie[1];
//        lazienki = new Pomieszczenie[1];
//        kuchni = new Pomieszczenie[1];
//
//        pokoje[0] = new Pomieszczenie(TypPomieszczenia.Pokoj, 1);
//        lazienki[0] = new Pomieszczenie(TypPomieszczenia.Lazienka, 1);
//        kuchni[0] = new Pomieszczenie(TypPomieszczenia.Kuchnia, 1);
//
////        drzwiDoPomieszczenia(pokoje[0], lazienki[0]);
////        drzwiDoPomieszczenia(pokoje[0], kuchni[0]);
//    }
//
//
//    public void tworzenieDrzwi(int iloscDrzwi){
//        drzwi= new Drzwi[iloscDrzwi];
//        for(int i=0;i<iloscDrzwi;i++){
//            drzwi[i]=new Drzwi();
//        }
//    }

    public void tworzenieokna(int iloscOkien){
        okna= new Okno[iloscOkien];
        for(int i=0;i<iloscOkien;i++){
            okna[i]=new Okno();
        }
    }

    public void tworzeniePokoi(int iloscPokoi){
        pokoje= new Pokoj[iloscPokoi];
        for(int i=0;i<iloscPokoi;i++){
            pokoje[i]=new Pokoj();
        }
    }

    public void tworzenieKuchni(int iloscKuchni){
        kuchni= new Kuchnia[iloscKuchni];
        for(int i=0;i<iloscKuchni;i++){
            kuchni[i]=new Kuchnia();
        }
    }

    public void tworzenieLazienki(int iloscLazienek){
        lazienki= new Lazienka[iloscLazienek];
        for(int i=0;i<iloscLazienek;i++){
            lazienki[i]=new Lazienka();
        }
    }

}