package view;

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


       opcao opcao = null;

       do  {
        opcao = opcaoView.select();

                switch(opcao) {
                    case CADASTRA_CATEGORIA -> cadastrarCategoria();
                    case CADASTRAR_PRODUTO ->  cadastrarProduto();
                    case CONSULTAR_PRODUTO_POR_ID -> consultarProdutoPorId();
                    case CONSULTAR_PRODUTO_POR_CATEGORIA -> consularProdutoPorCategoria();
                    case ALTERAR_PRODUTO -> alterarprodutos();
                    case ENCERRAR_SISTEMA -> encerrarSistema();
                }


       } while (opcao != opcao.ENCERRAR_SISTEMA);

    }

    private static void encerrarSistema() {
       System.exit(0);
    }

    private static void alterarprodutos() {

    }

    private static void consularProdutoPorCategoria() {
    }

    private static void consultarProdutoPorId() {
    }

    private static void cadastrarProduto() {
    }

    private static void cadastrarCategoria() {
       categoriaView view  = new categoriaView();
       categoria categoria = view.form();
       categoriaCollectionRepository.save(categoria);
       view.sucesso(categoria);
    }
}
