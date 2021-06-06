package ClientServer;
import java.io.*;
import java.net.*;

public class client {
    public static void main(String[] args) {
        try {

            Socket s = new Socket("localhost", 1234);
            DataOutputStream d_output = new DataOutputStream(s.getOutputStream());
            d_output.writeUTF("Hello Server... This is client");
            System.out.println("Message Sent to server");
            d_output.flush();
            d_output.close();
            s.close();
        } 
        catch (Exception e) {
            System.out.println(e);
        }
    }
}