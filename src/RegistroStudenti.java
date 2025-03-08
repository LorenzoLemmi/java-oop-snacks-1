/*Crea una classe RegistroStudenti che rappresenti un registro di studenti. Utilizza un array 
privato per memorizzare oggetti Studente. Implementa un costruttore senza parametri per
inizializzare il registro vuoto e un metodo pubblico per aggiungere studenti al registro. 
Aggiungi un metodo che stampi la lista degli studenti. */

public class RegistroStudenti {

    private Studente [] studenti;
    private int numStudenti;

    public RegistroStudenti() {
        studenti = new Studente[25];
        numStudenti = 0;
    }

    public void aggiungiStudente(Studente studente) {
        if (studente == null) {
            System.out.println("Errore: studente non valido.");
        } else if (numStudenti < 25) {
            studenti[numStudenti] = studente;
            numStudenti++;
            System.out.println("Studente aggiunto: " + studente);
        } else {
            System.out.println("Registro pieno, non posso aggiungere altri studenti.");
        }
    }

    public void stampaListaStudenti() {
        if (numStudenti == 0) {
            System.out.println("Il registro è vuoto.");
            return;
        }
        System.out.println("Lista studenti:");
        for (int i = 0; i < numStudenti; i++) {
            System.out.println (studenti[i]);
        }
    }
}
