public class Pokoj extends Pomieszczenie{
    public Pokoj(String nazwa){
        super.nazwa=nazwa;
        super.typ=TypPomieszczenia.POKOJ;
        System.out.println("--------Tworzenie pokoju----------");
    }


    public void tworzenieDrzwi(int iloscDrzwi){
        drzwi= new Drzwi[iloscDrzwi];
        for(int i=0;i<iloscDrzwi;i++){
            drzwi[i]=new Drzwi();
        }
    }

}
