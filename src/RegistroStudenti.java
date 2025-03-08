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
        if (numStudenti < studenti.length) {
            studenti[numStudenti] = studente;
            numStudenti++;
        } else {
            System.out.println("Registro pieno, non posso aggiungere altri studenti.");
        }
    }

    public void stampaListaStudenti() {
        for (int i = 0; i < numStudenti; i++) {
            System.out.println(studenti[i].toString());
        }
    }
}
