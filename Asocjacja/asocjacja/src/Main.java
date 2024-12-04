public class Main {
    public static void main(String[] args) {
        Dom dom1 = new Dom(2, 1, 1, 1, 4);
        dom1.przypiszDrzwi();

        System.out.println();
        System.out.println();

        Dom dom2 = new Dom(15, 1, 1, 1, 20);
        dom2.przypiszDrzwi();

        // Wyświetlanie informacji o domach
//        System.out.println("Informacje o domie 1:");
//        for (Pomieszczenie pokoj : dom1.pokoje) {
//            pokoj.wyswietlInformacje();
//        }
//        for (Pomieszczenie kuchnia : dom1.kuchnie) {
//            kuchnia.wyswietlInformacje();
//        }
//        for (Pomieszczenie lazienka : dom1.lazienki) {
//            lazienka.wyswietlInformacje();
//        }

        System.out.println();
//        System.out.println("Informacje o domie 2:");
//        for (Pomieszczenie pokoj : dom2.pokoje) {
//            pokoj.wyswietlInformacje();
//        }
//        for (Pomieszczenie kuchnia : dom2.kuchnie) {
//            kuchnia.wyswietlInformacje();
//        }
//        for (Pomieszczenie lazienka : dom2.lazienki) {
//            lazienka.wyswietlInformacje();
//        }

        dom1.kuchnie[0].drzwi[0].otworzDrzwi();
        dom1.kuchnie[0].drzwi[0].przejdzDoPomieszczenia(dom1.pokoje[0]);

        dom1.kuchnie[0].drzwi[0].otworzDrzwi();
        dom1.kuchnie[0].drzwi[0].przejdzDoPomieszczenia(dom1.pokoje[0]);

        dom1.pokoje[0].drzwi[0].otworzDrzwi();
        dom1.pokoje[0].drzwi[0].przejdzDoPomieszczenia(dom1.pokoje[0]);

        dom1.lazienki[0].drzwi[0].otworzDrzwi();
        dom1.lazienki[0].drzwi[0].przejdzDoPomieszczenia(dom1.lazienki[0]);

    }
}
