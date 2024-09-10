package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    private List<Tarefa> tarefaList;

    /** Sempre é preciso criar um construtor para o atributo para garantir
    que o objeto seja iniciado corretamente, caso contrário seria null **/
    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    //É preciso fazer uma instância de Tarefa
    public void adicionarTarefa(String descricao) {
        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        //Criação de uma lista vazia para colocar as descrições do parâmetro
        List<Tarefa> tarefasParaRemover = new ArrayList<>();

        //Pegando cada tarefa da tarefaList para verificar se tem tarefas iguais
        for (Tarefa t : tarefaList) {
            //Se descrição da Tarefa = a descrição passada por parâmetro do equalsIgnoreCase
            if(t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefasParaRemover.add(t);
            }
        }
        tarefaList.removeAll(tarefasParaRemover);
    }

    public int obterNumeroTotalTarefas() {
        return tarefaList.size();
    }

    public void obterDescricoesTarefas() {
        System.out.println(tarefaList);
    }

    // Psvm para testar
    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();

        System.out.println("O número total de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefas());
        
        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 2");

        System.out.println("O número total de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefas());
        
        listaTarefa.removerTarefa("Tarefa 2");
        System.out.println("O número total de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.obterDescricoesTarefas();
    }
}
