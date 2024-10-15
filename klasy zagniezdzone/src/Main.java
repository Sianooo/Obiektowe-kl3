//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        Pacjent pacjent= new Pacjent("Igor","Nerka");
//        pacjent.nerka=pacjent.new nerka(35,"fasola","brazowa");
//        pacjent.watroba=pacjent.new watroba(100,"cukinia","ciemny brazowy");
//
//        System.out.println("----------");
//        Duck duck = new Duck("Kaczucha");
//        Duck duck2 = new Duck("Kaczucha2");
//        Duck duck3 = new Duck("Kaczucha3");
//        Duck duck4= new Duck(){
//
//            public void howIFly(){
//                System.out.println("Iam flying like a duck");
//            }
//        };
//        duck.howIFly();
//        duck2.howIFly();
//        duck3.howIFly();
//        duck4.howIFly();

        Pocisk pocisk= new Pocisk(1);
        System.out.println();
        Pocisk pocisk2= new Pocisk(2);
        System.out.println();
        Pocisk pocisk3= new Pocisk(3);
        System.out.println();
        Pocisk pocisk4= new Pocisk(4);
        System.out.println();
        Pocisk pocisk5= new Pocisk(5);

        pocisk.generujOdlamki(1);
        System.out.println();
        pocisk2.generujOdlamki(2);
        System.out.println();
        pocisk3.generujOdlamki(3);
        System.out.println();
        pocisk4.generujOdlamki(1);
        System.out.println();
        pocisk5.generujOdlamki(2);




    }
}