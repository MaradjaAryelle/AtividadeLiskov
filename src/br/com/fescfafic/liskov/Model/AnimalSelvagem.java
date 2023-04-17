package br.com.fescfafic.liskov.Model;

public class AnimalSelvagem extends Animal{
    public AnimalSelvagem(String nome, int idade, String sexo) {
        super(nome, idade, sexo);
    }

    @Override
    public void emitirSom() {
        System.out.println("Roar!");
    }
}
