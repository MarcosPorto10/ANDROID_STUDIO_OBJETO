package com.example.objetointent;

import android.content.Intent;
import android.os.Bundle;

import java.io.Serializable;

public class Pessoa implements Serializable {
    //Atributos (variaveis)
    private String nome;  // encapsulamento = Private (caixa preta)
    private String sobrenome;

    public Pessoa(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    //metodo construtor vazio
    public Pessoa (){



    }


    //metodos acessores

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }



}
