package view;

import PRODUTOS.REPOSITORY.categoriaCollectionRepository;
import PRODUTOS.REPOSITORY.produtoCollectionRepository;
import org.example.MODEL.categoria;
import org.example.MODEL.Produto;

import javax.swing.*;
import java.util.List;

import static PRODUTOS.REPOSITORY.produtoCollectionRepository.Produtos;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
   public static void main(String[] args) {


       opcao opcao = null;

       do  {
        opcao = opcaoView.select();

                switch(opcao) {
                    case CADASTRA_CATEGORIA -> cadastrarCategoria();
                    case CADASTRAR_PRODUTO ->  cadastrarProduto();
                    case CONSULTAR_PRODUTO_POR_ID -> consultarProdutoPorId();
                    case CONSULTAR_PRODUTO_POR_CATEGORIA -> consultarProdutoPorCategoria();
                    case ALTERAR_PRODUTO -> alterarprodutos();
                    case ENCERRAR_SISTEMA -> encerrarSistema();
                }


       } while (opcao != opcao.ENCERRAR_SISTEMA);

    }

    private static void encerrarSistema() {
       System.exit(0);
    }

    private static void alterarprodutos() {
       Produto produto = produtoView.select(null);
       produtoView.update(produto);


    }

    private static void consultarProdutoPorCategoria() {

       categoria categoria = categoriaView.select(null);
       List<Produto> produtos = produtoCollectionRepository.findByCategoria (categoria);

       if(produtos.isEmpty()) {
           JOptionPane.showMessageDialog(null, "não encontramos produtos com a categoria "
           + categoria.getNome());

       } else {
           produtos.forEach(produtoView::show);
           produtos.forEach(System.out::println);


       }
    }

    private static void consultarProdutoPorId() {
        int id = Integer.parseInt(JOptionPane.showInputDialog("Digite o ID do produto:"));
        Produto produto = produtoCollectionRepository.findById(id);
        if (produto == null) {
            JOptionPane.showMessageDialog(null, "Produto não encontrado.");
        } else {
            JOptionPane.showMessageDialog(null, produto);
        }


    }

    private static void cadastrarProduto() {
       produtoView view = new produtoView();
       Produto produto = view.form(new Produto());
       produtoCollectionRepository.save(produto);
       view.sucesso(produto);
    }

    private static void cadastrarCategoria() {
       categoriaView view  = new categoriaView();
       categoria categoria = view.form(new categoria());
       categoriaCollectionRepository.save(categoria);
       view.sucesso(categoria);
    }
}
