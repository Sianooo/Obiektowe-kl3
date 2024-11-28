public class Main {
    public static void main(String[] args) {

        Dom dom1 = new Dom();
        dom1.tworzenieDrzwi(1);
        dom1.tworzenieokna(4);
        dom1.tworzeniePokoi(2);
        dom1.tworzenieKuchni(1);
        dom1.tworzenieLazienki(1);

        System.out.println();
        System.out.println();

        Dom dom2 = new Dom();
        dom2.tworzenieDrzwi(1);
        dom2.tworzenieokna(20);
        dom2.tworzeniePokoi(15);
        dom2.tworzenieKuchni(1);
        dom2.tworzenieLazienki(1);

        System.out.println();
        System.out.println();

        dom1.lazienki[0].tworzenieDrzwi(1);
        for (int i = 0; i < dom1.lazienki.length; i++) {
            for (int j = 0; j < dom1.lazienki[i].drzwi.length; j++) {
                dom1.lazienki[i].drzwi[j].czyOtwarte();
            }
        }
        dom1.kuchni[0].tworzenieDrzwi(1);
        for (int i = 0; i < dom1.kuchni.length; i++) {
            for (int j = 0; j < dom1.kuchni[i].drzwi.length; j++) {
                dom1.kuchni[i].drzwi[j].czyOtwarte();
            }
        }
        for (int i = 0; i < dom1.pokoje.length; i++) {
            dom1.pokoje[i].tworzenieDrzwi(1);
            for (int j = 0; j < dom1.pokoje[i].drzwi.length; j++) {
                dom1.pokoje[i].drzwi[j].czyOtwarte();
            }
        }

        dom2.lazienki[0].tworzenieDrzwi(1);
        for (int i = 0; i < dom2.lazienki.length; i++) {
            for (int j = 0; j < dom2.lazienki[i].drzwi.length; j++) {
                dom2.lazienki[i].drzwi[j].czyOtwarte();
            }
        }

        dom2.kuchni[0].tworzenieDrzwi(1);
        for (int i = 0; i < dom2.kuchni.length; i++) {
            for (int j = 0; j < dom2.kuchni[i].drzwi.length; j++) {
                dom2.kuchni[i].drzwi[j].czyOtwarte();
            }
        }

        for (int i = 0; i < dom2.pokoje.length; i++) {
            dom2.pokoje[i].tworzenieDrzwi(1);
            for (int j = 0; j < dom2.pokoje[i].drzwi.length; j++) {
                dom2.pokoje[i].drzwi[j].czyOtwarte();
            }
        }

        System.out.println();
        System.out.println();
        System.out.println();

//        Dom domeczek= new Dom();
//
//        domeczek.tworzenieKuchni(1);
//        domeczek.tworzenieLazienki(1);
//        domeczek.tworzeniePokoi(1);

        dom1.pokoje[0].drzwi[0].przejdzDoPomieszczenia(dom1.pokoje[0]);
        dom1.pokoje[0].drzwi[0].przejdzDoPomieszczenia(dom1.lazienki[0]);
        dom1.pokoje[0].drzwi[0].przejdzDoPomieszczenia(dom1.kuchni[0]);

//        dom1.pokoje[0].drzwi[0].przejdzDoPomieszczenia();
//        dom1.lazienki[0].drzwi[0].przejdzDoPomieszczenia();
//        dom1.kuchni[0].drzwi[0].przejdzDoPomieszczenia();

    }
}
