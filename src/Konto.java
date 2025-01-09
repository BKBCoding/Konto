public class Konto {

    private int kontoNr;
    private double saldo = 0;

    public Konto() {}

    public Konto(int kontoNr) {
        this.kontoNr = kontoNr;
    }

    public Konto(int kontoNr, double saldo) {
        this.kontoNr = kontoNr;
        this.saldo = saldo;
    }

    public void setKontoNr(int kontoNr) {
        this.kontoNr = kontoNr;
    }

    public int getKontoNr() {
        return kontoNr;
    }

    public void setSaldo(double saldo) {
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
        if(this.saldo >= amount  && amount > 0){
            this.saldo -= amount;
        }

        return this.saldo;
    }
}
