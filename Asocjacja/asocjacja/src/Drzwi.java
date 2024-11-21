public class Drzwi {
    ;
    public boolean otwarteDrzwi= false;

    public Drzwi(){
        this.otwarteDrzwi = false;
    }

    public Pomieszczenie prowadzaDo;
    public void funkcjonkaDoDrzwi(Pomieszczenie prowadzaDo)
    {
        this.prowadzaDo=prowadzaDo;
        System.out.println("Te drzwi prowadza do: "+prowadzaDo.typ);
    }
//
//    public void otworz(){
//        if(!otwarteDrzwi){
//            otwarteDrzwi=true;
//            System.out.println("Drzwi prowadzace do "+prowadzaDo+"zostaly otwarte");
//        }else{
//            System.out.println("Drzwi prowadzace do "+prowadzaDo+"sa juz otwarte");
//        }
//    }
//
//    public void zamknij(){
//        if(otwarteDrzwi){
//            otwarteDrzwi=false;
//            System.out.println("Drzwi prowadzace do "+prowadzaDo+"zostaly zamkniete");
//        }else{
//            System.out.println("Drzwi prowadzace do "+prowadzaDo+"sa juz zamkniete");
//        }
//    }
//    public void przypisanieDrzwi(Drzwi drzwi){
//        System.out.println("Przypisano drzwi do pokoju");
//
//    }

    public void czyOtwarte() {
        if(otwarteDrzwi){
            otwarteDrzwi=false;
            System.out.println("Drzwi prowadzace zostaly zamkniete");
        }else{
            System.out.println("Drzwi prowadzace sa juz otwarte");
        }
    }
}
