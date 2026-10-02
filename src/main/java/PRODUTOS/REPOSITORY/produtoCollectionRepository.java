package PRODUTOS.REPOSITORY;

import org.example.MODEL.produto;

import javax.swing.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Vector;

public class produtoCollectionRepository {


    private static List<produto> produtos;

    static {

        produtos = new Vector<>();

        produto celular = new produto();

        celular.setNome("iphone  14")
                .setDescricao("um celular")
                .setCategoria(categoriaCollectionRepository.findById(2L))
                .setPreco(BigDecimal.valueOf(14000))
                .setDataDeCadastro(LocalDateTime.now());

    }

    public static produto save(produto produto) {

        if(!produtos.contains(produto)) {
            produtos.add(produto);
            produto.setId(produtos.size()+ 1);

            return produto;

        } else {
            JOptionPane.showMessageDialog(null, "Esse produto já existe");
            return null;
        }
    }


}
