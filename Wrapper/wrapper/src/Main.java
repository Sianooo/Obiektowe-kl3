//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Object[] object= new Object[8];

        object[0]=3;
        object[1]="H";
        object[2]=20d;
        object[3]=5f;
        object[4]=false;
        object[5]="h";
        object[6]=(short)20;
        object[7]=(long)60;

        for (Object obj : object) {
            System.out.println(obj);
        }

        System.out.println("---------");
        System.out.println("Mile: "+calculateSpeed(20,10));

        System.out.println("---------");
        System.out.println(farenheitToKelvin(5));

    }
    static double calculateSpeed(double distanceInMiles, double timeInMinute){
        double kmNaMile=1.609344;
        return calculateSpeed2(distanceInMiles * kmNaMile,timeInMinute )/kmNaMile;
    }

    static double calculateSpeed2(double distanceInKm, double timeInMinute){
        return distanceInKm/(timeInMinute/60);//+ "km/h";
        //Zad2. Napisz wrapper (funkcję opakowującą) umożliwiającą podawanie przebytego dystansu w milach amerykańskich.
        //      Nie możesz edytować metody calculateSpeed - wysłać dzieciom.
    }

    public static double farenheitToKelvin(double fahrenheit){
        return celsiusToKelvin((5.0 / 9.0) * (fahrenheit - 32));
    }

    public static double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }
}