public class App {
    public static void main(String[] args) throws Exception {

        /*
        COSTRUTTORE
        In Java, il metodo costruttore è un blocco di codice speciale che viene chiamato automaticamente 
        quando crei un nuovo oggetto di una classe. 
        Il suo scopo principale è inizializzare lo stato dell'oggetto (dare un valore iniziale alle variabili).

        REGOLE FONDAMENTALI
        Per essere considerato un costruttore, il metodo deve seguire due regole ferree:
        - Deve avere lo stesso identico nome della classe.
        - Non ha un tipo di ritorno (nemmeno void).
        TIPI DI COSTRUTTORE
        - Costruttore di Default: Se non scrivi alcun costruttore, Java ne crea uno "invisibile" 
        senza parametri che non fa nulla. Se però ne scrivi uno tu, quello di default sparisce.
        - Costruttore Parametrizzato: Come quello nell'esempio sopra, serve a passare dati specifici 
        all'oggetto durante la creazione.

        Nell'esempio viene creata una classe Persona con due costruttori (uno vuoto e l'altro con
        tutti i parametri).
         */

        //oggetto Luca Melcarne
        Persona p1 = new Persona(); // viene creato un oggetto di nome p1
        p1.cognome="Melcarne"; //all'oggetto p1 viene dato il cognome "Melcarne"
        p1.nome="Luca"; //all'oggetto p1 viene assegnato il nome "Luca"
        
        //oggetto Andrea Turco
        Persona p2= new Persona();
        p2.cognome="Turco";
        p2.nome="Andrea";

        //oggetto Francesco Pepe
        Persona p3=new Persona("Francesco", "Pepe");
        //oggetto Mirko Schirinzi
        Persona p4=new Persona("Mirko", "Schirinzi");


        //stampa oggetti p1 e p2
        System.out.println("cognome: " + p1.cognome +" nome: "+p1.nome);
        System.out.println("cognome: " + p2.cognome +" nome: "+p2.nome);
        
    }
}
