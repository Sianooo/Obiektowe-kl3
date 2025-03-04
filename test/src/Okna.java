public class Okna {
    public Okna(String name) {
        this.name = name;
    }

    public String name;

    public void otworzOkna(){
        System.out.println("Otworzyles "+name);
    }
    public String getName(){
        return name;
    }
}
