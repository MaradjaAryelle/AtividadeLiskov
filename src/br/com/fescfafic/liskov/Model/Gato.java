package br.com.fescfafic.liskov.Model;

public class Gato extends Animal{
    public Gato(String nome, int idade, String sexo) {
        super(nome, idade, sexo);
    }

    @Override
    public void emitirSom() {
        System.out.println("Miau");
    }
}