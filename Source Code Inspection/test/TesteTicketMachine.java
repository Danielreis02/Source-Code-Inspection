/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import br.calebe.ticketmachine.core.TicketMachine;
import br.calebe.ticketmachine.exception.PapelMoedaInvalidaException;
import java.util.logging.Level;
import java.util.logging.Logger;
import junit.framework.Assert;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 31355587
 */
public class TesteTicketMachine {
    
    public TesteTicketMachine() {
        
       
    }
     

   
     @Test
     public void hello() {
     TicketMachine ticketMachine = new TicketMachine();
        
        try {
            ticketMachine.inserir(10);
     Assert.assertEquals(10, ticketMachine.getSaldo());
        } catch (PapelMoedaInvalidaException ex) {
            Logger.getLogger(TesteTicketMachine.class.getName()).log(Level.SEVERE, null, ex);
        }
     
        
     
     
     }
}
