package view;

import PRODUTOS.REPOSITORY.produtoCollectionRepository;
import org.example.MODEL.categoria;
import org.example.MODEL.Produto;

import javax.swing.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

public class produtoView {

    public static Produto form(Produto produto) {


        categoria categoria = null;

        do {
            categoria = categoriaView.select(produto.getCategoria());

        }while (categoria==null);


        String nome = "";

        do {nome = JOptionPane.showInputDialog(null, "informe o nome do produto", produto.getNome());

        }while(nome.equals(""));

        String descricao = "";
        do { descricao = JOptionPane.showInputDialog(null, "digite a descrição do produto", produto.getDescricao());

        }while(descricao.equals(""));

        Double preco = 0.0;

        do{
            try {
                    preco = Double.parseDouble(JOptionPane.showInputDialog(null, "digite o preço do produto",produto.getPreco()));
            } catch (Exception e) {
                preco = 0.0;
            }
        }while(preco <0.0);

        Produto ret = produto;

        ret.setCategoria(categoria)
                .setNome(nome)
                .setDescricao(descricao)
                .setDataDeCadastro(LocalDateTime.now())
                .setPreco(BigDecimal.valueOf(preco));
        return ret;

    }

    public static void sucesso() {

        JOptionPane.showMessageDialog(null, "produto foi salvo com sucesso");



    }
    public static void sucesso(Produto produto) {

        JOptionPane.showMessageDialog(null, "o produto " + produto.getNome() + " foi salvo com sucesso");
    }

        public static Produto select (Produto produto) {

                Produto ret = (Produto) JOptionPane.showInputDialog(
                null,
                "selecione uma opção",
                "menu",
                JOptionPane.QUESTION_MESSAGE,
                null,
                produtoCollectionRepository.findAll().toArray(),
                produto == null ? 1 : produto);
                return ret;
        }




    public static void update (Produto produto){
        form(produto);
        sucesso(produto);
        show(produto);
    }

    static void show(Produto produto) {

        System.out.println(produto);
        String textoFormatado = "NOME PRODUTO: " + produto.getNome() + System.lineSeparator() +
                "DESCRIÇÃO: " + produto.getDescricao() + System.lineSeparator() +
                "CATEGORIA: " + produto.getCategoria().toString() + System.lineSeparator() +
                "PREÇO: " + String.format("%.2f", produto.getPreco());
        JOptionPane.showMessageDialog(null, textoFormatado);
    }
    public void consultarPorId(produtoCollectionRepository repository) {
        int id = Integer.parseInt(JOptionPane.showInputDialog("Digite o ID do produto:"));
        Produto produto = repository.findById(id);
        if (produto == null) {
            JOptionPane.showMessageDialog(null, "Produto não encontrado.");
        } else {
            show(produto);
        }
    }}