import java.lang.reflect.Array;
import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ArrayList<String> wyrazy = new ArrayList<>();
        wyrazy.add("wyraz");
        wyrazy.add("wyraz1");
        wyrazy.add("wyraz2");
        wyrazy.add("wyraz3");
        wyrazy.add("wyraz4");

        for(String wyr : wyrazy)
        {
            System.out.println(wyr);
            if(wyr.endsWith("2"))
            {
                //wyrazy.remove(wyr);
            }
        }

        System.out.println("-----------");

        Iterator<String> iterator= wyrazy.iterator();
        while(iterator.hasNext()){
            String i=iterator.next();
            if(i.equals("wyraz"))
            {
                iterator.remove();
                System.out.println("Usunieto");
            }
        }
        System.out.println(wyrazy);

        System.out.println("-----------");

        List<String> koledzy = new ArrayList<>();
        koledzy.add("Machnik");
        koledzy.add("Owsinski");
        koledzy.add("Sikora");
        koledzy.add("Slawek");
        koledzy.add("Suchan");
        koledzy.add("Rosiek");
        koledzy.add("Bulanda");
        koledzy.add("Sulweski");
        koledzy.add("Sanka");
        koledzy.add("Mastaj");
        koledzy.add("Mirecki");
        koledzy.add("Lesniak");
        koledzy.add("Machinko");
        koledzy.add("Pielak");
        koledzy.add("Sanowski");

        Collections.sort(koledzy);
        for(String kol:koledzy)
        {
            System.out.println(kol);
        }

        ArrayList<Integer> randomNumber =new ArrayList<>();
        ArrayList<Integer> randomNumber2 =new ArrayList<>();
        Random rand= new Random();
        for(int i=0;i<5;i++)
        {
            randomNumber.add(rand.nextInt(10));
            randomNumber2.add(rand.nextInt(10));
        }
        randomNumber.retainAll(randomNumber2);
        System.out.println(randomNumber);
        System.out.println(randomNumber2);
        for(Integer i : randomNumber)
        {
            System.out.print(i);
        }
    }
}
