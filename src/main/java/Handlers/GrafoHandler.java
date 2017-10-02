/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Handlers;

import Grafo.Aresta;
import Grafo.KeyNotFound;
import Grafo.MetodosGrafo;
import Grafo.Vertice;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.apache.thrift.TException;

/**
 *
 * @author matheus
 */
public class GrafoHandler implements MetodosGrafo.Iface{
    private ConcurrentHashMap<Integer,Vertice> HashVertice;

    public GrafoHandler() {
        this.HashVertice = new ConcurrentHashMap<Integer,Vertice>();
    }

    @Override
    public boolean addVertice(Vertice v) throws TException {      
        this.HashVertice.putIfAbsent(v.nome, v);
        return true;
    }

    @Override
    public Vertice readVertice(int nome) throws TException {
        Vertice v = HashVertice.get(nome);
        return v;
    }

    @Override
    public boolean updateVertice(Vertice v, int cor) throws KeyNotFound, TException {
        return true;
    }

    @Override
    public boolean deleteVertice(Vertice v) throws KeyNotFound, TException {
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
        
        for (Integer key : v.HashAresta.keySet()) {
            Vertices.add(HashVertice.get(v.HashAresta.get(key).nomeVertice));
        }
        
        return Vertices;
    }

    @Override
    public boolean addAresta(Aresta a, Vertice v) throws TException {
        HashVertice.get(v.nome).HashAresta.put(v.nome, a);
        
        
        return true;
    }

    @Override
    public List<Aresta> readAllAresta() throws TException {
        
    }

    @Override
    public List<Aresta> readAllArestaOfVertice(Vertice v) throws TException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean updateAresta(Aresta a, double peso) throws KeyNotFound, TException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean deleteAresta(Aresta a) throws KeyNotFound, TException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean addAresta(Aresta a, Vertice v) throws TException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
