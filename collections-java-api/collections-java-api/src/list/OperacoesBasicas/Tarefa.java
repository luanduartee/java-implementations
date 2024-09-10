package list.OperacoesBasicas;

public class Tarefa {
    private String descricao;

    public Tarefa (String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    //Quando for imprimir vai ser retornado o seguinte:
    @Override
    public String toString() {
        return "Tarefa [descricao=" + descricao + "]";
    }
}
