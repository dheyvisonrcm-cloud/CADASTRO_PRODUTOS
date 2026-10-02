package org.example.MODEL;

import java.util.Locale;

public class categoria {

    private Long  Id;

    private String nome;

    public categoria() {
    }

    public categoria(Long id, String nome) {
        setId(id);
        this.setNome(nome);
    }

    public categoria(String nome) {
        this.setNome(nome);
    }


    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return nome.toUpperCase();
    }
}
