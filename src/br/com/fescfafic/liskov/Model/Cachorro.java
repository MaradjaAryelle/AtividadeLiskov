package br.com.fescfafic.liskov.Model;

public class Cachorro extends Animal{
    public Cachorro(String nome, int idade, String sexo) {
        super(nome, idade, sexo);
    }

    @Override
    public void emitirSom() {
        System.out.println("Au au");
    }
}
