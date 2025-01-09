public class Konto {

    private int kontoNr;
    private double saldo;

    public Konto() {
        this.saldo = 0;
    }

    public Konto(int kontoNr) {
        this.kontoNr = kontoNr;
        this.saldo = 0;
    }

    public Konto(int kontoNr, double saldo) {
        this.kontoNr = kontoNr;
        this.saldo = saldo;
    }

    private void setKontoNr(int kontoNr) {
        this.kontoNr = kontoNr;
    }

    public int getKontoNr() {
        return kontoNr;
    }

    private void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public double einzahlen(double amount){
        if(amount > 0){
            this.saldo += amount;
        }

        return this.saldo;
    }

    public double auszahlen(double amount){
        if(this.saldo >= amount){
            this.saldo -= amount;
        }

        return this.saldo;
    }
}
