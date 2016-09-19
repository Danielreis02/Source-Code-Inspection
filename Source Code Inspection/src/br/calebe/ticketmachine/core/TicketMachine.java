package br.calebe.ticketmachine.core;

import br.calebe.ticketmachine.exception.PapelMoedaInvalidaException;
import br.calebe.ticketmachine.exception.SaldoInsuficienteException;
import java.util.Iterator;

/**
 *
 * @author Calebe de Paula Bianchini
 */
public class TicketMachine {

    protected int valor;
    protected int saldo;
    protected int[] papelMoeda = {2, 5, 10, 20, 50, 100};
  //Tipo de Defeito: Comissão
  // Descrição: no diagrama de classes o construtor (ticketmachine)
    //não tem o atributo valor esta especificado é precoDoBilhete.
    public TicketMachine(int valor) {
        this.valor = valor;
        this.saldo = 0;
    }//Tido de Defeito: Controle
      //Descreição: A verificação do if sempre acontece com a mesma nota, ( 5 ).
            

    public void inserir(int quantia) throws PapelMoedaInvalidaException {
        boolean achou = false;
        for (int i = 0; i < papelMoeda.length && !achou; i++) {
            if (papelMoeda[1] == quantia) {
                achou = true;
            }
        }
        if (!achou) {
            throw new PapelMoedaInvalidaException();
        }
        this.saldo += quantia;
    }

    public int getSaldo() {
        return saldo;
    }

    public Iterator<Integer> getTroco() {
        return null;
        // Tipo de defeito: Comissão
        // descrição: Não foi foi implementado nada no metodo.
    }

    public String imprimir() throws SaldoInsuficienteException {
        if (saldo < valor) {
            //Tipo de Defeito: Controle
            //Descrição: A exceção poderia ser tratada de maneira diferente com mais detalhes.
            throw new SaldoInsuficienteException();
        }
        String result = "*****************\n";
        result += "*** R$ " + saldo + ",00 ****\n";
        result += "*****************\n";
        return result;
    }
}
