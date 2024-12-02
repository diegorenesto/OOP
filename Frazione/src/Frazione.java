public class Frazione {
    private int numeratore;
    private int denominatore;

    public Frazione(int numeratore, int denominatore) {
        this.numeratore = numeratore;
        this.denominatore = denominatore;
        semplifica();  // riduce ai minimi termini
    }

    private static int mcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return Math.abs(a);
    }

    private void semplifica() {
        int mcd = mcd(numeratore, denominatore);
        numeratore /= mcd;
        denominatore /= mcd;
    }

    public Frazione sommaFrazioni(Frazione f2) {  // frazione
        int mcm = (this.denominatore * f2.denominatore) / mcd(this.denominatore, f2.denominatore);
        int nuovoNumeratore1 = this.numeratore * (mcm / this.denominatore);
        int nuovoNumeratore2 = f2.numeratore * (mcm / f2.denominatore);
        int risultatoNumeratore = nuovoNumeratore1 + nuovoNumeratore2;

        return new Frazione(risultatoNumeratore, mcm);
    }

    public double sommaFrazioni2(Frazione f2) {  // decimale
        Frazione somma = this.sommaFrazioni(f2);
        return (double) somma.numeratore / somma.denominatore;
    }

    public void visualizzaRisultato() {
        System.out.println("Risultato: " + numeratore + "/" + denominatore);
    }

    @Override
    public String toString() {
        return numeratore + "/" + denominatore;
    }

}