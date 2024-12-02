public class Main {
    public static void main(String[] args) {
        Frazione f1 = new Frazione(1, 2);
        Frazione f2 = new Frazione(2, 3);

        Frazione somma = f1.sommaFrazioni(f2);
        System.out.print("Somma delle frazioni: ");
        somma.visualizzaRisultato();

        double sommaDecimale = f1.sommaFrazioni2(f2);
        System.out.println("Somma delle frazioni (decimale): " + sommaDecimale);
    }

}