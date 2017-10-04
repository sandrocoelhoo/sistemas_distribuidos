package Handlers;

import Grafo.Aresta;
import Grafo.KeyNotFound;
import Grafo.MetodosGrafo;
import Grafo.Vertice;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.apache.thrift.TException;

public class GrafoHandler implements MetodosGrafo.Iface {

    private ConcurrentHashMap<Integer, Vertice> HashVertice;

    public GrafoHandler() {
        this.HashVertice = new ConcurrentHashMap<Integer, Vertice>();
    }

    @Override
    public boolean addVertice(Vertice v) throws TException {
        if (this.HashVertice.putIfAbsent(v.nome, v) == null) {
            return true;
        }

        return false;
    }

    @Override
    public Vertice readVertice(int nome) throws TException, KeyNotFound {
        Vertice v = HashVertice.get(nome);
        //comput if abscent ou object o e dar synchronized
        if (v != null) {
            return v;
        }

        throw new KeyNotFound();
    }

    @Override
    public boolean updateVertice(Vertice v, int cor) throws KeyNotFound, TException {
        try {
            // mandar o vértice com os dados novos mas alterar o vértice todo
            Vertice v1 = readVertice(v.getNome());

            v1.setCor(cor);
            return true;
        } catch (KeyNotFound e) {
            return false;
        }
    }

    @Override
    public boolean deleteVertice(Vertice v) throws KeyNotFound, TException {
        Vertice vertice;
        for (Integer key : v.HashAresta.keySet()) {
            vertice = HashVertice.get(v.HashAresta.get(key).nomeVertice1);
            vertice.HashAresta.remove(key);
        }
        HashVertice.remove(v.nome);

        return true;
    }

    @Override
    public List<Vertice> readAllVertice() throws TException {
        ArrayList<Vertice> Vertices = new ArrayList<>();

        for (Integer key : HashVertice.keySet()) {
            Vertices.add(HashVertice.get(key));
        }

        return Vertices;
    }

    @Override
    public List<Vertice> readVerticeNeighboors(Vertice v) throws TException {
        ArrayList<Vertice> Vertices = new ArrayList<>();

        //hashvertice.values(); retorna uma lista. Cast de arraylist.
        for (Integer key : HashVertice.keySet()) {
            Vertices.add(HashVertice.get(key));
        }

        return Vertices;
    }

    @Override
    public boolean addAresta(Aresta a, Vertice v) throws TException {
        if (HashVertice.get(v.nome).HashAresta.put(v.nome, a) == null) {
            return true;
        }
        
        return false;
    }

    @Override
    public List<Aresta> readAllAresta() throws TException {
        ArrayList<Aresta> Arestas = new ArrayList<>();

        for (Integer keyVertice : HashVertice.keySet()) {
            for (Integer keyAresta : HashVertice.get(keyVertice).HashAresta.keySet()) {
                Arestas.add(HashVertice.get(keyVertice).HashAresta.get(keyAresta));
            }
        }
        return Arestas;
    }

    @Override
    public List<Aresta> readAllArestaOfVertice(Vertice v) throws TException {
        ArrayList<Aresta> Arestas = new ArrayList<>();

        for (Integer key : v.HashAresta.keySet()) {
            Arestas.add(v.HashAresta.get(key));
        }

        return Arestas;
    }

    @Override
    public boolean updateAresta(Aresta a, double peso) throws KeyNotFound, TException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean deleteAresta(Aresta a) throws KeyNotFound, TException {
        Vertice v1 = HashVertice.get(a.nomeVertice1);
        Vertice v2 = HashVertice.get(v1.HashAresta.get(a.nomeVertice1));

        v1.HashAresta.remove(a);
        v2.HashAresta.remove(a);

        return true;
    }
}
