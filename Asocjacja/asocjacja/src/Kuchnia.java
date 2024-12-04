public class Kuchnia extends Pomieszczenie{
    public Kuchnia(String nazwa){
        super.nazwa=nazwa;
        super.typ=TypPomieszczenia.KUCHNIA;
        System.out.println("--------Tworzenie kuchni----------");
    }
}