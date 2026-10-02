package view;

public enum opcao {

    CADASTRA_CATEGORIA(1, "cadastrar categoria"),

    CADASTRAR_PRODUTO(2, "cadastrar produto"),
    ALTERAR_PRODUTO(3, "alterar produto"),
    CONSULTAR_PRODUTO_POR_ID(4, "consultar produto por ID"),
    CONSULTAR_PRODUTO_POR_CATEGORIA(5, "consultar produto por categoria"),
    ENCERRAR_SISTEMA (6, "encerrar sistema");

    int id;
    String nome;

    opcao(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public opcao setId(int id) {
        this.id = id;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public opcao setNome(String nome) {
        this.nome = nome;
        return this;
    }

    @Override
    public String toString() {
        return nome.toUpperCase();

    }
}
