package br.com.fescfafic.liskov.Model;

public class Animal {
    public String nome;
    public int idade;
    public String sexo;

    public Animal (String nome, int idade, String sexo){
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }

    public void emitirSom(){
        System.out.printf("!!!");
    }




}
