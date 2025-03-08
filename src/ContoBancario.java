/*Crea una classe ContoBancario con attributi per numero di conto e saldo. Implementa un 
costruttore che accetta il numero di conto e inizializza il saldo a zero. Aggiungi metodi 
pubblici per depositare denaro sul conto, prelevare denaro dal conto e ottenere il saldo
corrente. */

public class ContoBancario {

    private int numeroDiConto;
    private double saldo;

    public ContoBancario (int numeroDiConto, double saldo) {
        this.numeroDiConto = numeroDiConto;
        this.saldo = 0.0;
    }

    // Metodo per depositare denaro
    public void deposito(double importo) {
        if (importo > 0) {
            saldo += importo;
            System.out.println("Deposito di " + importo + " effettuato. Saldo attuale: " + saldo);
        } else {
            System.out.println("L'importo del deposito deve essere positivo.");
        }
    }

    // Metodo per prelevare denaro
    public void prelievo(double importo) {
        if (importo > 0 && importo <= saldo) {
            saldo -= importo;
            System.out.println("Prelievo di " + importo + " effettuato. Saldo attuale: " + saldo);
        } else {
            System.out.println("Importo non valido o saldo insufficiente.");
        }
    }

    // Metodo per ottenere il saldo corrente
    public double getSaldo() {
        return saldo;
    }
}
