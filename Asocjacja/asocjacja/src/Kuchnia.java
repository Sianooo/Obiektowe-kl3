public class Kuchnia {
    public Kuchnia(){
        System.out.println("--------Tworzenie kuchni----------");
    }

    public Drzwi[] drzwi;


    public void tworzenieDrzwi(int iloscDrzwi){
        drzwi= new Drzwi[iloscDrzwi];
        for(int i=0;i<iloscDrzwi;i++){
            drzwi[i]=new Drzwi();
        }
    }
}
