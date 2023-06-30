package poo.composicao.compras;
public class CompraApp {
    public static void main(String[] args) {
        Compra compra1 = new Compra();
        compra1.cliente = "Joao Pedro";
        compra1.adicionarItem("Canetas", 20, 7.45);
        compra1.adicionarItem(new Item("Borracha", 12, 3.89));
        compra1.adicionarItem(new Item("Caderno", 3, 18.79));

        System.out.println(compra1.itens.size()); // 3 --> tamanho da lista, quantos itens contém na lista
        System.out.println(compra1.obterValorTotal()); // 252.05

        // Só para mostrar a relação bidirecional
        double total = compra1.itens.get(0).compra.itens.get(1).compra.obterValorTotal();
        System.out.println("O total e " + total);

    }
}
