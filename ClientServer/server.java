package ClientServer;
import java.io.*;
import java.net.*;

public class server {
    public static void main(String[] args) {
        try {
            ServerSocket server_socket = new ServerSocket(1234);
            Socket s = server_socket.accept();

            
            DataInputStream d_input = new DataInputStream(s.getInputStream());

            String str = (String) d_input.readUTF();
            System.out.println("Message Received from Client : " + str);

            server_socket.close();
        } 
        catch (Exception e) {
            System.out.println(e);
        }
    }
}
