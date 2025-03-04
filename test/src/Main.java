public class Main {
    public static void main(String[] args) {

        Wierzowiec wierzowiec= new Wierzowiec(3,5);
        for(Pietro pietro: wierzowiec.getPietra()){
            System.out.println("Wierzowiec");
            for(Okna okna:pietro.getOkno()){
                okna.otworzOkna();
            }
        }
    }
}