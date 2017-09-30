namespace java Grafo

struct Vertice {
	1:i32 nome,
	2:i32 cor,
	3:string descricao,
	4:double peso
}

struct Aresta {
	1:Vertice v1,
	2:Vertice v2,
	3:double peso,
	4:bool direct,
	5:string descricao
}

struct VaV {
	1:Vertice v1,
	2:Vertice v2
}

exception KeyNotFound {
}

service MetodosGrafo {
	bool addVertice(1:Vertice v),
	Vertice readVertice(1:i32 nome),
	bool updateVertice(1:Vertice v, 2:i32 cor) throws (1:KeyNotFound knf),
	bool deleteVertice(1:Vertice v) throws (1:KeyNotFound knf),
	list<Vertice> readAllVertice(),
	list<Vertice> readVerticeNeighboors(1:Vertice v),

	bool addAresta(1:Aresta a),
	list<Aresta> readAllAresta(),
	list<Aresta> readAllArestaOfVertice(1:Vertice v),
	bool updateAresta(1:Aresta a, 2:double peso) throws (1:KeyNotFound knf),
	bool deleteAresta(1:Aresta a) throws (1:KeyNotFound knf)
}
