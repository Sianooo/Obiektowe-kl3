//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        double x = 3;

        double wynik = oblicz(x);
        System.out.println(wynik);
    }
        public static double oblicz(double x){
        return Math.ceil(Math.sin(x) + Math.cos(x) * Math.pow(x, 20));
        }
}