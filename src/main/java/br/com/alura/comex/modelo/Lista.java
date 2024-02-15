package br.com.alura.comex.modelo;

import java.util.ArrayList;
import java.util.Comparator;

public class Lista {
    private ArrayList<Pedido> listaPedido = new ArrayList<>();

    public void adicionarPedido(Pedido pedido) {
        this.listaPedido.add(pedido);
    }

    public ArrayList<Pedido> retornarLista() {
        return listaPedido;
    }
    public ArrayList<Pedido> retonarListaOrdenada() {
        this.listaPedido.sort(Comparator.comparing(Pedido::getValorTotal));
        return listaPedido;
    }

    public ArrayList<Pedido> retornarListaOrnadaReversa() {
        this.listaPedido.sort(Comparator.comparing(Pedido::getValorTotal).reversed());
        return listaPedido;
    }
}
