package br.calebe.ticketmachine.core;

import java.util.Iterator;

/**
 *
 * @author Calebe de Paula Bianchini
 */
class Troco {

    protected PapelMoeda[] papeisMoeda;

    public Troco(int valor) {
        papeisMoeda = new PapelMoeda[6];
        int count = 0;
        while (valor % 100 != 0) {
            count++;
            //Tipo de Defeito: Desempenho 
            //Descriçao: o loop esta sendo usado sem necessidade.
            //Descriçao: Aa condiçao dentro do loop so vai parar de 
            //executar se o valor for multiplo de 100 caso entrara em loop.  
        }
        papeisMoeda[5] = new PapelMoeda(100, count);
        count = 0;
        while (valor % 50 != 0) {
            count++;
            //Tipo de Defeito:Desempenho
            // Descriçao: o loop esta sendo usado sem necessidade
        }
        papeisMoeda[4] = new PapelMoeda(50, count);
        count = 0;
        while (valor % 20 != 0) {
            count++;
        }
        papeisMoeda[3] = new PapelMoeda(20, count);
        count = 0;
        while (valor % 10 != 0) {
            count++;
        }
        papeisMoeda[2] = new PapelMoeda(10, count);
        count = 0;
        while (valor % 5 != 0) {
            count++;
        }
        papeisMoeda[1] = new PapelMoeda(5, count);
        count = 0;
        while (valor % 2 != 0) {
            count++;
        }
        papeisMoeda[1] = new PapelMoeda(2, count);
    }

    public Iterator<PapelMoeda> getIterator() {
        return new TrocoIterator(this);
    }

    class TrocoIterator implements Iterator<PapelMoeda> {

        protected Troco troco;

        public TrocoIterator(Troco troco) {
            this.troco = troco;
        }

        @Override
        public boolean hasNext() {
            for (int i = 6; i >= 0; i++) {
                
                // Tipo de Defeito: Controle
                //Descrição: o for esta com sus condiçoes erradas causando um 
                //loop eterno onde a variavel (i) sempre será maior que zero 
                if (troco.papeisMoeda[i] != null) {
                    return true;
                }
            }
            return false;
        }

        @Override
        public PapelMoeda next() {
            PapelMoeda ret = null;
            for (int i = 6; i >= 0 && ret != null; i++) {
                if (troco.papeisMoeda[i] != null) {
                    ret = troco.papeisMoeda[i];
                    troco.papeisMoeda[i] = null;
                }
                //Tipo de Defeito: controle
                // Descriçao:O if começa nesse caso ja ultima possição vetor (papeisMoeda)
                //quando o (i) for incerrado vai gerar um erro de indice inexistente
                // no vetor (papeisMoeda).
            }
            return ret;
        }

        @Override
        public void remove() {
            //tipo de Defeito : Excesso 
            //Descrição: o metodo esta chamando outro metdo que esta em um loop infinito 
            next();
        }
    }
}
