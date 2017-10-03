package Handlers;

import Grafo.Aresta;
import Grafo.MetodosGrafo;
import Grafo.Vertice;
import static Handlers.ClientHandler.args1;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ConcurrentHashMap;
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

            //if (args.length > 0) {
            TTransport transport = new TSocket("localhost", 4242);
            transport.open();
            System.out.println("2");

            TProtocol protocol = new TBinaryProtocol(transport);
            MetodosGrafo.Client client = new MetodosGrafo.Client(protocol);

            
            ConcurrentHashMap<Integer, Aresta> HashVertice = new ConcurrentHashMap();
            
            Vertice v = new Vertice(1, 1, "t", 1, HashVertice);

            if(client.addVertice(v)){
                System.out.println("Deu bão");
                
            };
            
            List<Vertice> Vertices = new ArrayList<>();
            Vertices = client.readAllVertice();
            
            System.out.println("matheus viado: " + Vertices.get(0).nome);

            transport.close();

            //}
        } catch (TException x) {
            x.printStackTrace();
        }
    }
}
