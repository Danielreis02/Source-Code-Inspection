/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import br.calebe.ticketmachine.core.TicketMachine;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Daniel Reis
 */
public class TicketMachineTest {
   
    @Test
    public void PrecoBilheteTest(){
        TicketMachine a = new TicketMachine(3);
        assertEquals(3, a.getPrecoDoBilhete());
    }
    
}