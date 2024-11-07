//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    Dom dom1= new Dom();
    dom1.tworzenieDrzwi(1);
    dom1.tworzenieokna(4);
    dom1.tworzeniePokoi(2);
    dom1.tworzenieKuchni(1);
    dom1.tworzenieLazienki(1);

    System.out.println();
    System.out.println();

    Dom dom2= new Dom();
    dom2.tworzenieDrzwi(1);
    dom2.tworzenieokna(20);
    dom2.tworzeniePokoi(15);
    dom2.tworzenieKuchni(1);
    dom2.tworzenieLazienki(2);



    }
}