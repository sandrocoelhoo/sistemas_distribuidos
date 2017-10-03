package Handlers;

import Grafo.MetodosGrafo;
import java.util.logging.Handler;

import org.apache.thrift.transport.TTransport;
import org.apache.thrift.TException;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.server.TServer;
import org.apache.thrift.server.TThreadPoolServer;
import org.apache.thrift.transport.TServerSocket;
import org.apache.thrift.transport.TServerTransport;

public class ServerHandler {

    public static GrafoHandler handler;
    public static Grafo.MetodosGrafo.Processor processor;

    static String args1[] = {"4242"};

    public static void main(String[] args) {
        try {

            handler = new GrafoHandler();
            processor = new Grafo.MetodosGrafo.Processor(handler);

            TServerTransport servertransport = new TServerSocket(4242);

            TServer server = new TThreadPoolServer(new TThreadPoolServer.Args(servertransport).processor(processor));

            System.out.println("Starting the server...");
            server.serve();

        } catch (TException x) {
            x.printStackTrace();
        }
    }
}
