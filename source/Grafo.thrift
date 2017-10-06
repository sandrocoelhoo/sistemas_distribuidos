namespace java Grafo

struct Aresta {
	1:i32 v1,
	2:i32 v2,
	3:double peso,
	4:bool direct,
	5:string descricao
}

struct Vertice {
	1:i32 nome,
	2:i32 cor,
	3:string descricao,
	4:double peso,
	5:map<i32,Aresta> HashAresta
}

exception KeyNotFound {
}

service MetodosGrafo {
	bool addVertice(1:Vertice v),
	Vertice readVertice(1:i32 nome),
	bool updateVertice(1:Vertice v) throws (1:KeyNotFound knf),
	bool deleteVertice(1:Vertice v) throws (1:KeyNotFound knf),
	list<Vertice> readAllVertice(),
	list<Vertice> readVerticeNeighboors(1:Vertice v),

	bool addAresta(1:Aresta a),
	Aresta readAresta(1:i32 nomeV1, 2:i32 nomeV2),
	list<Aresta> readAllAresta(),
	list<Aresta> readAllArestaOfVertice(1:Vertice v),
	bool updateAresta(1:Aresta a) throws (1:KeyNotFound knf),
	bool deleteAresta(1:Aresta a) throws (1:KeyNotFound knf)
}
