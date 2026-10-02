package org.example.MODEL;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Objects;


 /// O QUE FIZ?
 /// basicamente,  CRIEI OS ATRIBUTOS
 /// ALT  + INSERT PRA GERAR TRÊS CONSTRUTORES, UM VAZIO, OUTRO CHEIO,E OUTRO  SEM ID
 /// DEPOIS, GEREI TO STRING PARA RETORNAR SOMENTE O NOME
 /// DEPOIS, GEREI A COMPARAÇÃO + GETTERS AND SETTERS
/// shift duas vezes para encapsular

public class produto {

    private long id;

    private String nome;

    private String descricao;

    private BigDecimal preco;

    private LocalDateTime dataDeCadastro;

    private categoria categoria;

    public produto() {
    }

    public produto(long id, String nome, String descricao, BigDecimal preco, LocalDateTime dataDeCadastro, categoria categoria) {
        this.setNome(nome);
        this.setDescricao(descricao);
        this.setPreco(preco);
        this.setDataDeCadastro(dataDeCadastro);
        this.setCategoria(categoria);
    }


     public categoria getCategoria(categoria categoria) {
         return this.categoria;
     }

     public produto setCategoria(categoria categoria) {
         this.categoria = categoria;
         return this;
     }

     public LocalDateTime getDataDeCadastro() {
         return dataDeCadastro;
     }

     public produto setDataDeCadastro(LocalDateTime dataDeCadastro) {
         this.dataDeCadastro = dataDeCadastro;
         return this;
     }

     public BigDecimal getPreco() {
         return preco;
     }

     public produto setPreco(BigDecimal preco) {
         this.preco = preco;
         return this;
     }

     public String getDescricao() {
         return descricao;
     }

     public produto setDescricao(String descricao) {
         this.descricao = descricao;
         return this;
     }

     public String getNome() {
         return nome;
     }

     public produto setNome(String nome) {
         this.nome = nome;
         return this;
     }

     public long getId() {
         return id;
     }

     public produto setId(long id) {
         this.id = id;
         return this;
     }

     @Override
     public boolean equals(Object o) {
         if (o == null || getClass() != o.getClass()) return false;
         produto produto = (produto) o;
         return Objects.equals(nome, produto.nome);
     }

     @Override
     public int hashCode() {
         return Objects.hashCode(nome);
     }

     @Override
    public String toString() {

        return nome.toUpperCase();
    }
}
