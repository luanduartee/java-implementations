package list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {
    private List<Pessoa> listaPessoa;

    public OrdenacaoPessoa() {
        this.listaPessoa = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura) {
        listaPessoa.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade() {
        //Para ordenar, precisamos criar um array list com a lista de pessoas
        List<Pessoa> pessoaPorIdade = new ArrayList<>(listaPessoa);
        //O sort entende que ele vai ter que ordenar a lista, por meio do comparable
        Collections.sort(pessoaPorIdade);
        return pessoaPorIdade;
    }

    public List<Pessoa> ordenarPorAltura() {
        //Para ordenar, precisamos criar um array list com a lista de pessoas
        List<Pessoa> pessoaPorAltura = new ArrayList<>(listaPessoa);
        //O sort entende que ele vai ter que ordenar a lista, por meio do comparator
        Collections.sort(pessoaPorAltura, new ComparatorPorAltura());
        return pessoaPorAltura;
    }

}

