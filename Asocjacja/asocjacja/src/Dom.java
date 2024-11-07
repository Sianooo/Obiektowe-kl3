public class Dom {

    public Drzwi[] drzwi;
    public Okno[] okna;
    public Pokoj[] pokoje;
    public Kuchnia[] kuchni;
    public Lazienka[] lazienki;

//    public Dom(){
//        System.out.println("--------Tworzenie domu----------");
//    }

    public void tworzenieDrzwi(int iloscDrzwi){
        drzwi= new Drzwi[iloscDrzwi];
        for(int i=0;i<iloscDrzwi;i++){
            drzwi[i]=new Drzwi();
        }
    }

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