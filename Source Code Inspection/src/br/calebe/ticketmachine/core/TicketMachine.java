package br.calebe.ticketmachine.core;

import br.calebe.ticketmachine.exception.PapelMoedaInvalidaException;
import br.calebe.ticketmachine.exception.SaldoInsuficienteException;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Daniel Reis 
 */
public class TicketMachine {

    private int precoDoBilhete;
    private int saldo;
    private ArrayList<Integer> papelMoeda;

    public TicketMachine(int precoDoBilhete) {
        this.precoDoBilhete = precoDoBilhete;
        this.saldo = 0;
        this.papelMoeda = new ArrayList();
        this.papelMoeda.add(2);
        this.papelMoeda.add(5);
        this.papelMoeda.add(10);
        this.papelMoeda.add(20);
        this.papelMoeda.add(50);
        this.papelMoeda.add(100);        
    }

    public void inserir(int quantia) throws PapelMoedaInvalidaException {
        boolean achou = false;
        for (int i = 0; i < papelMoeda.size() && !achou; i++) {
            if (papelMoeda.get(i) == quantia) {
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

    public Iterator<PapelMoeda> getTroco() {
        return (new Troco(saldo)).getIterator();
    }

    private void isSaldoEnough() throws SaldoInsuficienteException {
        if (saldo < precoDoBilhete) 
            throw new SaldoInsuficienteException();
    }

    public int getPrecoDoBilhete() {
        return precoDoBilhete;
    }

    public void setPrecoDoBilhete(int precoDoBilhete) {
        this.precoDoBilhete = precoDoBilhete;
    }

    public ArrayList<Integer> getPapelMoeda() {
        return papelMoeda;
    }

    public void setPapelMoeda(ArrayList<Integer> papelMoeda) {
        this.papelMoeda = papelMoeda;
    }
    

    public String imprimir() {
        try {
            isSaldoEnough();
        } catch (SaldoInsuficienteException e) {
            System.err.print(e);
        } finally {
            String result = "*****************\n";
            result += "*** R$ " + saldo + ",00 ****\n";
            result += "*****************\n";
            return result;
        }
    }
}
