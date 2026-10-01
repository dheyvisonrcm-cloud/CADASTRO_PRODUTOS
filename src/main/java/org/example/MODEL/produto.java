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


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    public LocalDateTime getDataDeCadastro() {
        return dataDeCadastro;
    }

    public void setDataDeCadastro(LocalDateTime dataDeCadastro) {
        this.dataDeCadastro = dataDeCadastro;
    }

    public categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(categoria categoria) {
        this.categoria = categoria;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        produto produto = (produto) o;
        return id == produto.id && Objects.equals(nome, produto.nome) && Objects.equals(descricao, produto.descricao) && Objects.equals(preco, produto.preco) && Objects.equals(dataDeCadastro, produto.dataDeCadastro) && Objects.equals(categoria, produto.categoria);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {

        return nome.toUpperCase();
    }
}
