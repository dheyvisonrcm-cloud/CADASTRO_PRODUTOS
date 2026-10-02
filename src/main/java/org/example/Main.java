package org.example;

import PRODUTOS.REPOSITORY.categoriaCollectionRepository;
import PRODUTOS.REPOSITORY.produtoCollectionRepository;
import org.example.MODEL.categoria;
import org.example.MODEL.produto;

import java.math.BigDecimal;
import java.time.LocalDateTime;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
   public static void main(String[] args) {


       produto Produto = new produto();
        Produto.setNome("kindle").setDescricao("livro digital")
                .setDataDeCadastro(LocalDateTime.now())
                .setPreco(BigDecimal.valueOf(10000))
                .setCategoria(categoriaCollectionRepository.findByNome("eletronicos").get(0));

       produto Produto1 = produtoCollectionRepository.save(Produto);

       System.out.println("ID: " + Produto.getId() + " nome do produto: " + Produto1.getNome());





    }
}
