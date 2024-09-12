package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> listaItem;

    public CarrinhoDeCompras() {
        this.listaItem = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        listaItem.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome) {
        List<Item> itensRepetidos = new ArrayList<>();

        for (Item i : listaItem) {
            if (i.getNome().equalsIgnoreCase(nome)) {
                itensRepetidos.add(i);
            }
        }

        listaItem.removeAll(itensRepetidos);
    }

    public double calcularValorTotal() {
        double total = 0.0;

        if(listaItem.isEmpty()) {
            System.out.println("Sem itens no carrinho de compras.");
        } else {
            for(Item item : listaItem) {
                total += item.getPreco() * item.getQuantidade();
            }

        }
        return total;
    }

    public void exibirItens() {
        if (listaItem.isEmpty()) {
            System.out.println("Sem itens no carrinho de compras.");
        } else {
            for (Item item : listaItem) {
                System.out.println("Item: " + item.getNome() + ", Preço: " + item.getPreco() + ", Quantidade: "
                        + item.getQuantidade());
            }
        }
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        carrinho.adicionarItem("Feijão", 3.00, 2);
        carrinho.exibirItens();
        carrinho.calcularValorTotal();
        carrinho.adicionarItem("Arroz", 3.00, 2);
        carrinho.exibirItens();
        System.out.println(carrinho.calcularValorTotal());
        // carrinho.exibirItens();
    }
}
