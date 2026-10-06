package PRODUTOS.REPOSITORY;

import org.example.MODEL.Produto;
import org.example.MODEL.categoria;

import javax.swing.*;
import java.util.List;
import java.util.Vector;

public class categoriaCollectionRepository {

   private static List<categoria> categorias;

   static {

       categorias = new Vector<>();

       categoria eletronicos = new categoria(1L, "eletronicos");
       categoria celulares = new categoria(2L, "celulares");
       categoria livros = new categoria(3L, "livros");

       categorias.add(eletronicos);
       categorias.add(celulares);
       categorias.add(livros);

   }
    public static  List<categoria> findAll() {
       return categorias;
   }

    public static categoria findById(long id) {

       return categorias.stream().filter(c -> c.getId().equals(id))
               .findFirst()
               .orElse(null);
    }
    public static List<categoria> findByNome(String nome) {

       return categorias.stream()
               .filter(c-> c.getNome()
               .equalsIgnoreCase(nome))
               .toList();


    }

    public  static categoria save(categoria categoria) {

       if(!categorias.contains(categoria)) {
           categorias.add(categoria);
           categoria.setId((long) (categorias.size() +1));
           return categoria;
       } else {
           JOptionPane.showMessageDialog(null,"Já existe essa categoria");
           return  null;
       }


    }



}
