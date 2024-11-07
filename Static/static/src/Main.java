//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Child child= new Child();
        Child child2= new Child();
        Child child3= new Child();

        child.mama=new Mother();

        child.mama.motherName="KarolinaMachowska";
        System.out.println(child.mama.getMotherName());
        System.out.println(child2.mama.getMotherName());
        System.out.println(child3.mama.getMotherName());

        }
    }
