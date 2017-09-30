
import Grafo.Aresta;
import Grafo.KeyNotFound;
import Grafo.MetodosGrafo;
import Grafo.Vertice;
import java.util.List;
import org.apache.thrift.TException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author davyjones
 */
public class ClienteHandler implements MetodosGrafo.Iface {

    public boolean addVertice(int nome, int cor, String descricao, double peso) throws TException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Vertice readVertice(int nome) throws TException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean updateVertice(Vertice v, int cor) throws KeyNotFound, TException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean deleteVertice(Vertice v) throws KeyNotFound, TException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List<Vertice> readAllVertice() throws TException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List<Vertice> readVerticeNeighboors(Vertice v) throws TException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean addAresta(Vertice v1, Vertice v2, double peso, boolean direct, String descricao) throws TException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List<Aresta> readAllAresta() throws TException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List<Aresta> readAllArestaOfVertice(Vertice v) throws TException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean updateAresta(Aresta a, double peso) throws KeyNotFound, TException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean deleteAresta(Aresta a) throws KeyNotFound, TException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
