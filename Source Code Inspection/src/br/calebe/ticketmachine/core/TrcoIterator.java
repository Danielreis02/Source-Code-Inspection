package br.calebe.ticketmachine.core;
import java.util.Iterator;

/**
 *
 * @author Daniel Reis
 */
class TrocoIterator implements Iterator<PapelMoeda> {
    

        private Troco troco;
        private PapelMoeda current;
        private int indexCurrent;

        public TrocoIterator(Troco troco) {
            this.troco = troco;
            indexCurrent = 0;
            current = troco.getPapeisMoeda().get(0);
        }

        public void first(){
            indexCurrent = 0;
            current = troco.getPapeisMoeda().get(0);           
        }
        
        @Override
        public boolean hasNext() {
            return troco.getPapeisMoeda().get(indexCurrent+1)!=null;
        }

        @Override
        public PapelMoeda next() {
            indexCurrent++;
            current = troco.getPapeisMoeda().get(indexCurrent);
            return current;
        }

        @Override
        public void remove() {
            troco.getPapeisMoeda().remove(current);
            if(indexCurrent==troco.getPapeisMoeda().size()){
                indexCurrent = indexCurrent-1;
                current = troco.getPapeisMoeda().get(indexCurrent);
            }else{
                current = troco.getPapeisMoeda().get(indexCurrent);
            }
        }
    }
