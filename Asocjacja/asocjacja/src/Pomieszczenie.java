public class Pomieszczenie {


    public Drzwi[] drzwi;
    public TypPomieszczenia typ;

    public Pomieszczenie()
    {

    }

    public void tworzenieDrzwi(int iloscDrzwi){
        drzwi= new Drzwi[iloscDrzwi];
        for(int i=0;i<iloscDrzwi;i++){
            drzwi[i]=new Drzwi();
        }
    }
}
