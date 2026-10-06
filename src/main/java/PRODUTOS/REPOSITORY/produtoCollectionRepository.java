package PRODUTOS.REPOSITORY;

import org.example.MODEL.Produto;
import org.example.MODEL.categoria;

import javax.swing.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Vector;

public class produtoCollectionRepository {


    public static List<Produto> Produtos;

    static {

        Produtos = new Vector<>();

        Produto celular = new Produto();

        celular.setNome("iphone  14")
                .setDescricao("um celular")
                .setCategoria(categoriaCollectionRepository.findById(2L))
                .setPreco(BigDecimal.valueOf(14000))
                .setDataDeCadastro(LocalDateTime.now());

    }

    public static Produto save(Produto produto) {

        if(!Produtos.contains(produto)) {
            Produtos.add(produto);
            produto.setId(Produtos.size()+ 1);

            return produto;

        } else {
            JOptionPane.showMessageDialog(null, "Esse produto já existe");
            return null;
        }
    }

    public static List<Produto> findAll() {
        return Produtos;


    }


    public static List<Produto> findByCategoria(categoria categoria) {
        return Produtos.stream().filter(p -> p.getCategoria().equals(categoria)).toList();
    }

    public static Produto findById(int id) {
        for (Produto p : findAll()) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
}}
