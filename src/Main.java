public class Main {
    public static void main(String[] args) {
        Konto konto = new Konto(1);
        System.out.println("Kontonummer: " + konto.getKontoNr());
        System.out.println("Kontostand: " + konto.einzahlen(5));
        System.out.println("Kontostand: " + konto.auszahlen(2));

        GiroKonto giroKonto = new GiroKonto(5);
        giroKonto.setKontoNr(2);
        System.out.println("GiroKonto: " + giroKonto.getKontoNr());
        System.out.println("GiroKonto: " + giroKonto.einzahlen(5));
        System.out.println("GiroKonto: " + giroKonto.auszahlen(10));
        System.out.println("GiroKonto: " + giroKonto.auszahlen(1)); //gibt auch -5 wieder da das Dispo nur bis 5 geht
    }
}