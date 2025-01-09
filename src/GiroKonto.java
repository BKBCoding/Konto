public class GiroKonto extends Konto  {
    public double dispo = 0;

    public GiroKonto() {
        super();
    }

    public GiroKonto(double dispo) {
        super();
        this.dispo = dispo;
    }

    public GiroKonto(double dispo, int kontoNr) {
        super(kontoNr);
        this.dispo = dispo;
    }

    public GiroKonto(double dispo, int kontoNr, double saldo) {
        super(kontoNr, saldo);
        this.dispo = dispo;
    }

    @Override
    public double auszahlen(double amount) {
        if(amount > 0 && getSaldo() + this.dispo >= amount) {
            setSaldo(getSaldo() - amount);
        }

        return getSaldo();
    }

    public void setDispo(double dispo) {
        this.dispo = dispo;
    }

    public double getDispo() {
        return dispo;
    }
}
