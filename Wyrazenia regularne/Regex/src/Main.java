import java.util.regex.Pattern;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

            System.out.println(Pattern.matches("[a-zA-Z_0-9]{6}", "123abc"));
            System.out.println(Pattern.matches("^[789]\\d{9}", "7876543210"));

            String regex = "^(?!.*(.).*\1)[sanowski195]{9}$";
            String test = "sanowski1";
            System.out.println(Pattern.matches(regex, test));

            Scanner scanner = new Scanner(System.in);
            System.out.println("Podaj haslo: ");
            String haslo= scanner.nextLine();

            if(haslo.matches("^(?!.*(.).*)[sanowski195]{9}$")){
                    System.out.println("Haslo jest poprawne");
            }else{
                    System.out.println("Haslo jest niepoprawne");
            }
            scanner.close();
            }
    }
