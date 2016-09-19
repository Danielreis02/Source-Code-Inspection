package br.calebe.ticketmachine.core;

/**
 *
 * @author Calebe de Paula Bianchini
 */
public class PapelMoeda {

    protected int valor;
    protected int quantidade;
    
  //Tipo de Defeito: Comissão
  //Descrição: No diagrama de classes os atributos estão privados  
    public PapelMoeda(int valor, int quantidade) {
        this.valor = valor;
        this.quantidade = quantidade;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getQuantidade() {
        return quantidade;
    }
}
