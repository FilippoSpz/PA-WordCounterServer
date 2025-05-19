# PA-WordCounterServer

## Description
**PA-WordCounterServer** is a Java-based server application that counts the number of words in a string received from a client. The server uses sockets for communication and supports handling multiple client connections.

---

## Features
- Accepts connections from clients via socket.
- Reads messages sent by clients.
- Counts the number of words in each received message.
- Responds to the client with the word count.
- Terminates the connection when the client sends the message `bye`.

---

## Project Structure
- **`Main.java`**: Contains the main server that handles client connections and word counting.
- **`WordCounter.java`**: Utility class for counting words in a string.

---

## Usage Example
1. Start the server:
   ```bash
   java Main 10000
   ```
2. onnect to the server using a client like telnet: `telnet localhost 10000`

3. Send a message to the server, for example: `Hello world!`

4. The server will respond: `Word count: 2`

5. To terminate the connection, send the message: `bye`

6. The server will respond with: `bye` and close the connection.

## License

This project is intended for educational purposes only and is not meant for commercial use.

---

## Author

- **Name**: [Filippo Spazzali]
- **School**: [Università degli Studi di Trieste]
- **Course**: [Computer Science]
