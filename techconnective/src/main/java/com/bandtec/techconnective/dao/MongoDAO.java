package com.bandtec.techconnective.dao;

import org.bson.Document;

import com.bandtec.techconnective.model.Usuario;
import com.mongodb.client.MongoCursor;

public interface MongoDAO {
	 void inserir(Usuario usuario);
	 void atualizar(Usuario usuario);
	 void excluir(Object _id);
	 Document porId(Object _id);
	 
	 MongoCursor<Document>mostraTodos();
}
