public class Pokoj extends Pomieszczenie{
    public Pokoj(){
        System.out.println("--------Tworzenie pokoju----------");
    }


    public void tworzenieDrzwi(int iloscDrzwi){
        drzwi= new Drzwi[iloscDrzwi];
        for(int i=0;i<iloscDrzwi;i++){
            drzwi[i]=new Drzwi();
        }
    }

}
