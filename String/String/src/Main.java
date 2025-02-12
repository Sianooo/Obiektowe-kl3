import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String inwokacja = " “没有革命，就没有进步。”\n" +
                "\n" +
                "毛泽东认为，社会的进步和改革必须通过革命来实现。没有革命，旧有的社会制度和思想无法得到根本性的改变，人民也无法获得真正的自由和解放。\n" +
                "“人民的力量是无穷的，只要他们为正确的事业而奋斗。”\n" +
                "\n" +
                "毛泽东对人民群众充满信心。他相信，人民只要团结一心，勇敢地站出来为正义和真理而斗争，就能改变一切。人民的力量是不可忽视的，是推动社会变革的根本力量。\n" +
                "“战争是政治的延续，政治是战争的基础。”\n" +
                "\n" +
                "这一思想体现了毛泽东对战争和政治的深刻理解。他认为，战争与政治密切相关，战争是实现政治目标的一种手段，而政治则是支撑战争的根基。\n" +
                "“一切从人民出发，一切为了人民。”\n" +
                "\n" +
                "毛泽东认为，所有的政治、经济、文化活动的出发点都应该是人民的利益，任何脱离人民群众的活动都不能称为革命。革命的根本目的是为人民谋福利，解放人民。\n" +
                "这些思想展现了毛泽东的革命理念和对社会变革的深刻理解。他相信，只有通过彻底的社会变革，才能实现国家的独立和人民的解放。";


        System.out.println("-------------------");

        HashSet<Integer> znaki = new HashSet<>();

        int dlugoscTekstu=inwokacja.length();

        System.out.println("Statystyka występowania znaków: ");
        System.out.println();

        //NA ZWYKLY ALFABET
//        for(char i=0;i<=dlugoscTekstu;i++){
//            int suma = zliczZnaki(inwokacja,i);
//            if(suma>0){
//                double procent= (double) suma/dlugoscTekstu*100;
//                System.out.printf("Znak '%c' występuje %.2f%%\n", i, procent);
//            }
//        }
//
//        for(char i='A';i<='Z';i++){
//            int suma = zliczZnaki(inwokacja,i);
//            if(suma>0){
//                double procent= (double) suma/dlugoscTekstu*100;
//                System.out.printf("Znak '%c' występuje %.2f%%\n", i, procent);
//            }
//        }


        //CHINSKIE LITERY
        for(int i=0;i<dlugoscTekstu;i++){
            char znak = inwokacja.charAt(i);
            if(!znaki.contains(znak)){
                znaki.add((int) znak);
                int suma = zliczZnaki(inwokacja,znak);
                double procent = (double) suma/ dlugoscTekstu * 100;
                System.out.printf("Znak '%c' wystepuje %.2f%%\n",znak,procent);
                inwokacja = inwokacja.replace(String.valueOf(znak),"");
                dlugoscTekstu = inwokacja.length();
                i--;
            }
        }

        System.out.println("Formatowanie : ");
        System.out.println();

        double liczzba = 1245.5435;
        String formatowania=String.format("%010.3f",liczzba);
        System.out.println(formatowania);

    }

    static int zliczZnaki(String text, char liczbaCharow) {
        int zlicz=0;
        for (int i = 0; i < text.length(); i++) {
            if (liczbaCharow == text.charAt(i)) {
                zlicz++;
            }
        }
        return zlicz;
    }
}
