package view;

import javax.swing.*;

public class opcaoView {

    public static opcao select (){

        opcao ret = (opcao) JOptionPane.showInputDialog(
                null,
                "selecione uma opção",
                "menu",
                JOptionPane.QUESTION_MESSAGE,
                null,
                opcao.values(),
                opcao.CADASTRAR_PRODUTO);

        return ret !=  null ? ret : opcao.ENCERRAR_SISTEMA;


    }
}
