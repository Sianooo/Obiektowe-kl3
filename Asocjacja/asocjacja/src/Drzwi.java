public class Drzwi {

    public boolean otwarteDrzwi= false;
    public Pomieszczenie doPomieszczenia;

//    public Pomieszczenie prowadzaDo;
//    public void funkcjonkaDoDrzwi(Pomieszczenie prowadzaDo)
//    {
//        this.prowadzaDo=prowadzaDo;
//        System.out.println("Te drzwi prowadza do: "+prowadzaDo.typ);
//    }

    public Drzwi() {
        this.otwarteDrzwi = false;
    }
    public void przejdzDoPomieszczenia() {
        System.out.println("Przechodzisz do: " + doPomieszczenia.typ+" z ");
    }

    public void czyOtwarte() {
        if(otwarteDrzwi){
            otwarteDrzwi=true;
            System.out.println("Drzwi prowadzace zostaly otwarte");
        }else{
            System.out.println("Drzwi prowadzace sa juz zamkniete");
        }
    }
    public void stworzPowiazanie(Pomieszczenie pomieszczenie){
        this.doPomieszczenia=pomieszczenie;
    }

}
