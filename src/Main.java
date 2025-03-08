public class Main {
    public static void main(String[] args) {
        Studente studente = new Studente("Luca", "Rossi", 20);
        System.out.println(studente.datiConcatenati());

        ContoBancario contoBancario = new ContoBancario (1234);
        contoBancario.deposito(700.0);
        contoBancario.prelievo(300.0);
        System.out.println("Saldo attuale: " + contoBancario.getSaldo());

        RegistroStudenti registroStudenti = new RegistroStudenti();
        registroStudenti.aggiungiStudente(studente);
        registroStudenti.stampaListaStudenti();
    }
}