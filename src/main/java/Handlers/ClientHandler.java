package Handlers;

import Grafo.MetodosGrafo;
import static Handlers.ClientHandler.args1;
import java.util.Scanner;
import org.apache.thrift.TException;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;

public class ClientHandler {

    static String args1[] = {"4242"};

    public static void main(String[] args) {
    try {
      Scanner sc = new Scanner(System.in);
      
      
        
      TTransport transport = new TSocket(args[0], Integer.parseInt(args[1]));
      transport.open();

      TProtocol protocol = new  TBinaryProtocol(transport);
      MetodosGrafo.Client client = new MetodosGrafo.Client(protocol);

      

      transport.close();
    } catch (TException x) {
      x.printStackTrace();
    } 
    }
}
