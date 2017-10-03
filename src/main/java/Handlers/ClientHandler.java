package Handlers;

import Grafo.MetodosGrafo;
import Grafo.Vertice;
import java.util.Scanner;
import org.apache.thrift.TException;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;

public class ClientHandler {

    private static String args1[] = {"localhost", "4242"};

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        connection(args1);
    }

    public static void connection(String[] args) {
        int opcao, nome, cor;;
        String descricao;
        double peso;
        Vertice v = new Vertice();

        try {

            System.out.println("\n ===== CONEXÃO CLIENTE/SERVIDOR ===== \n");
            System.out.print("Conectando no servidor: " + args1[0]);
            System.out.print("\nPorta: " + args1[1]);

            if (args.length > 0) {

                // Recebe o endereço do servidor e porta para tentar conexão
                TTransport transport = new TSocket(args1[0], Integer.parseInt(args1[1]));
                transport.open();
                // Chama o protocolo de comunicação entre S/C
                TProtocol protocol = new TBinaryProtocol(transport);
                MetodosGrafo.Client client = new MetodosGrafo.Client(protocol);

                do {

                    System.out.println("\n =====> MENU PRINCIPAL: GRAFO <===== \n");
                    System.out.println("1  - Adicionar vertice");
                    System.out.println("3  - Atualizar vertice");
                    System.out.println("4  - Deletar vertice");
                    System.out.println("5  - Ler unico vertice");
                    System.out.println("6  - Ler todos os vertices do grafo");
                    System.out.println("7  - Ler os vizinhos de um vertice");
                    System.out.println("8  - Adicionar aresta");
                    System.out.println("9  - Atualizar aresta ");
                    System.out.println("10 - Deletar aresta ");
                    System.out.println("11 - Ler todas as arestas do grafo");
                    System.out.println("12 - Ler todas as arestas de o vertice");
                    System.out.println("13 - Finalizar conexão");
                    System.out.print("Opcao-> ");
                    opcao = sc.nextInt();

                    switch (opcao) {
                        case 1:
                            System.out.println("\n@@@@@ ADICIONAR VERTICE @@@@@ \n");
                            System.out.print("Nome do vertice-> ");
                            nome = sc.nextInt();
                            System.out.print("Cor do vertice-> ");
                            cor = sc.nextInt();
                            sc.nextLine();
                            System.out.print("Descricao do vertice-> ");
                            descricao = sc.nextLine();
                            System.out.print("Peso do vertice-> ");
                            peso = sc.nextDouble();

                            v.setNome(nome);
                            v.setCor(cor);
                            v.setDescricao(descricao);
                            v.setPeso(peso);

                            if (client.addVertice(v)) {
                                System.out.println("# Vertice adicionado!");
                            } else {
                                System.out.println("# Problema na insercao do vertice. Repita a operacao.");
                            }
                            break;
                        case 2:
                            break;
                        case 3:
                            break;
                        case 4:
                            break;
                        case 5:
                            System.out.println("\n@@@@@ LER UNICO VERTICE @@@@@ \n");
                            System.out.print("Nome do vertice-> ");
                            nome = sc.nextInt();
                            
                            v = client.readVertice(nome);
                            System.out.println("Nome: " + v.getNome());
                            System.out.println("Cor: " + v.getCor());
                            System.out.println("Descricao: " + v.getDescricao());
                            System.out.println("Peso: " + v.getPeso());
                            break;
                        case 6:
                            break;
                        case 7:
                            break;
                        case 8:
                            break;
                        case 9:
                            break;
                        case 10:
                            break;
                        case 11:
                            break;
                        case 12:
                            break;
                        case 13:
                            // Finaliza a conexão com o servidor
                            System.exit(0);
                            System.out.println("\n==> Conexão finalizada!");
                        default:
                            System.out.println("\n==> ERROR! Opção inválida. Selecione uma opção válida do menu.");
                    }

                    transport.close();
                } while (1 != 0);
            }
        } catch (TException x) {
            x.printStackTrace();
        }
    }
}
