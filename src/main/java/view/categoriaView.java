package view;

import PRODUTOS.REPOSITORY.categoriaCollectionRepository;
import org.example.MODEL.categoria;

import javax.swing.*;

public class categoriaView {

    static categoriaCollectionRepository repository;

    public static categoria select (categoria categoria) {

        categoria ret = (categoria) JOptionPane.showInputDialog(
                null,
                "selecione uma opção",
                "menu",
                JOptionPane.QUESTION_MESSAGE,
                null,
                repository.findAll().toArray(),
                categoria == null ? 1: categoria);

            return ret;


    }

    public void sucesso() {

        JOptionPane.showMessageDialog(null, "a categoria foi salva com sucesso");



    }
    public void sucesso (categoria  categoria) {

        JOptionPane.showMessageDialog(null, "a categoria " +categoria.getNome() +" foi salva com sucesso");

    }
    public static categoria form (categoria categoria) {

        String nome = JOptionPane.showInputDialog(null, "informe o nome da nova categoria",
                categoria != null?  categoria.getNome() : "");
        return new categoria(nome);



    }

}
