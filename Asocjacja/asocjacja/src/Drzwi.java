public class Drzwi {
    public boolean otwarte;
    public Pomieszczenie docelowe;

    public Drzwi(Pomieszczenie docelowe) {
        this.otwarte = false; // Domyślnie drzwi są zamknięte
        this.docelowe = docelowe;
    }

    public Drzwi() {
        this.otwarte = false; // Domyślnie drzwi są zamknięte
        this.docelowe = null; // Brak docelowego pomieszczenia
    }

    public void otworzDrzwi() {
        this.otwarte = true;
        System.out.println("Drzwi zostały otwarte.");
    }

    public void przejdzDoPomieszczenia(Pomieszczenie zPomieszczenia) {
        if (this.otwarte && this.docelowe != null) {
            System.out.println("Przechodzenie do: " + docelowe.nazwa + " z " + zPomieszczenia.nazwa);
        } else if (!this.otwarte) {
            System.out.println("Drzwi są zamknięte. Otwórz drzwi, aby przejść.");
        } else {
            System.out.println("Brak docelowego pomieszczenia.");
        }
    }
}
