# PA-WordCounterServer

## Descrizione
**PA-WordCounterServer** è un'applicazione server scritta in Java che conta il numero di parole in una stringa ricevuta da un client. Il server utilizza socket per la comunicazione e supporta la gestione di più connessioni client.

---

## Funzionalità
- Accetta connessioni da client tramite socket.
- Legge messaggi inviati dai client.
- Conta il numero di parole in ogni messaggio ricevuto.
- Risponde al client con il conteggio delle parole.
- Termina la connessione quando il client invia il messaggio `bye`.

---

## Struttura del Progetto
- **`Main.java`**: Contiene il server principale che gestisce le connessioni client e il conteggio delle parole.
- **`WordCounter.java`**: Classe di utilità per il conteggio delle parole in una stringa.

---

## Esempio di Utilizzo
1. Avvia il server:
   ```bash
   java Main 10000
   ```

2. Connettiti al server utilizzando un client come telnet:
   `telnet localhost 10000`

3. Invia un messaggio al server, ad esempio:
   `Hello world!`

4. Il server risponderà:
   `Word count: 2`

5. Per terminare la connessione, invia il messaggio:
   `bye`

6. Il server risponderà con:
   `bye` e chiuderà la connessione.

## License

This project is intended for educational purposes only and is not meant for commercial use.

---

## Author

- **Name**: [Filippo Spazzali]
- **School**: [Università degli Studi di Trieste]
- **Course**: [Computer Science]
