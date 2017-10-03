package Handlers;

import Grafo.MetodosGrafo;
import java.util.Scanner;
import org.apache.thrift.TException;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;

public class ClientHandler {

    private static String args1[] = {"localhost","4242"};

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        connection(args);   
    }

    public static void menuPrincipal() {
        int aux;
        do {
            
        System.out.println("\n =====> MENU PRINCIPAL: GRAFO <===== \n");
        System.out.println("1  - Adicionar vertice");
        System.out.println("3  - Atualizar vertice");
        System.out.println("4  - Deletar vertice");
        System.out.println("5  - Ler unico vertice");
        System.out.println("6  - Ler todos os vertices do grafo");
        System.out.println("7  - Ler os vizinhos de um vertice");
        System.out.println("\t <-------> ");
        System.out.println("8  - Adicionar aresta");
        System.out.println("9  - Atualizar aresta ");
        System.out.println("10 - Deletar aresta ");
        System.out.println("11 - Ler todas as arestas do grafo");
        System.out.println("12 - Ler todas as arestas de o vertice");
        System.out.println("13 - Finalizar conexão");
        aux = sc.nextInt();
        
        }while(aux > 13 || aux <= 0);
    }

    public static void connection(String[] args) {
        try {
            
            System.out.println("\n ===== CONEXÃO CLIENTE/SERVIDOR ===== \n");
            System.out.print("Conectando no servidor: " + args[0]);
            System.out.print("\nPorta: " + args[1]);

            if (args.length > 0) {
            
            // Recebe o endereço do servidor e porta para tentar conexão
            TTransport transport = new TSocket(args[0], Integer.parseInt(args[1]));
            transport.open();
            // Chama o protocolo de comunicação entre S/C
            TProtocol protocol = new TBinaryProtocol(transport);
            MetodosGrafo.Client client = new MetodosGrafo.Client(protocol);
            
            menuPrincipal();
            
            // Finaliza a conexão com o servidor
            transport.close();
            }
        } catch (TException x) {
            x.printStackTrace();
        }
    }
}
