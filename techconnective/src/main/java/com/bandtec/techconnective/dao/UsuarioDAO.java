package com.bandtec.techconnective.dao;

import java.util.ArrayList;
import java.util.List;

import static com.mongodb.client.model.Filters.eq;

import org.bson.Document;
import org.springframework.stereotype.Repository;

import com.bandtec.techconnective.common.Constantes;
import com.bandtec.techconnective.model.Usuario;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;

@Repository
public class UsuarioDAO implements MongoDAO{
	 
	 MongoClient conexao;
	 MongoDatabase dataBase;
	 MongoCollection<Document> collectionPessoas;
	
	 public UsuarioDAO() {
		   conexao = new MongoClient();
		   dataBase = conexao.getDatabase(Constantes.BANCO_NOME);
		   collectionPessoas = dataBase.getCollection(Constantes.COLLECTION_NOME);
		 }
	 
	 @Override
	 public void inserir(Usuario usuario) {
	  List<Document> perfil = new ArrayList<>();
	   perfil.add(new Document(Constantes.NOME,usuario.getPerfil()));
	     collectionPessoas.insertOne(
	     new Document(Constantes.NOME,usuario.getNome())
	        .append(Constantes.CPF, usuario.getCpf())
	        .append(Constantes.CNPJ, usuario.getCnpj())
	        .append(Constantes.ENDERECO,
	    new Document(Constantes.CEP, usuario.getEndereco().getCep())
	    	.append(Constantes.CIDADE,usuario.getEndereco().getCidade())
	        .append(Constantes.BAIRRO, usuario.getEndereco().getBairro())
	        .append(Constantes.ESTADO, usuario.getEndereco().getEstado())   
	   )
	        .append(Constantes.NASCIMENTO, usuario.getDataNascimento().getTime())
	        .append(Constantes.PERFIL,perfil)
	   );
	 }
	 
	 @Override
	 public void atualizar(Usuario usuario) {
	   collectionPessoas.updateOne(eq(Constantes.NOME,usuario.getNome()),
	    new Document("$set",
	       new Document(Constantes.CEP, usuario.getEndereco().getCep())
	       .append(Constantes.ENDERECO,
	     new Document(Constantes.CIDADE,usuario.getEndereco().getCidade())
	       .append(Constantes.BAIRRO, usuario.getEndereco().getBairro())
	       .append(Constantes.ESTADO, usuario.getEndereco().getEstado())
	     )
	   )
	  );
	 }
	 
	 @Override
	 public void excluir(Object _id) {
	   collectionPessoas.deleteOne(porId(_id));
	 }
	 
	 @Override
	 public Document porId(Object _id) {
	   return collectionPessoas.find(eq("_id",_id)).first();
	 }
	  
	@Override
	 public MongoCursor<Document> mostraTodos() {
	   return collectionPessoas.find().iterator();
	 }
	
}
