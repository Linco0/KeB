package com.dev.keb;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import javax.ejb.Singleton;
import javax.faces.bean.ManagedBean;

@Singleton
@ManagedBean
public class ListaClientes implements Serializable {

    public String nome;
    public List<String> clientes;
    
    public class Cliente {
        private String nome;
        private Integer idade;
        
        public Cliente(){}
        
        public Cliente(String nome, Integer idade){
            super();
            this.nome = nome;
            this.idade = idade;
        }
        
        public String getNome(){
            return nome;
        }
        
        
        public void setNome(String nome){
            this.nome = nome;
        }
        
        public Integer getIdade(){
            return idade;
        }
        public void setIdade(Integer idade){
            this.idade = idade;
        }
    }

    public ListaClientes() {
        this.clientes = new ArrayList<>();
        this.clientes.add("Karen Robaino Ferreira da Silva");
        this.clientes.add("Madalena Robaino Ferreira da Silva");
        this.clientes.add("Marli Lopes Robaino");
        this.clientes.add("Ana Paula Azevedo da Silva");
        this.clientes.add("Bianca Lemos de Carvalho");
    }

    public String getNome() {
        return nome;
    }

    public void getNome(String nome) {
        this.nome = nome;
    }

    public List<String> getClientes() {
        return clientes;
    }
}
