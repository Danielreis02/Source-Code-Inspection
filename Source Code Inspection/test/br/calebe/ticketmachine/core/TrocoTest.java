package br.calebe.ticketmachine.core;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import br.calebe.ticketmachine.core.PapelMoeda;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import br.calebe.ticketmachine.core.Troco;
import java.util.ArrayList;

/**
 *
 * @author Daniel Reis 
 */
public class TrocoTest {
    
    
    @Test
    public void ConstrutorArrayTrocoTest() {
    Troco troco = new Troco(155);  
    
        for (int i = 0; i < troco.getPapeisMoeda().size(); i++) {
            System.out.println(troco.getPapeisMoeda().get(i));
        }
    
    assertEquals(0,troco.getPapeisMoeda().get(0));
    assertEquals(1,troco.getPapeisMoeda().get(1));
    assertEquals(0,troco.getPapeisMoeda().get(2));
    assertEquals(0,troco.getPapeisMoeda().get(3));
    assertEquals(1,troco.getPapeisMoeda().get(4));
    assertEquals(1,troco.getPapeisMoeda().get(5));
    
    
      
    }
    

}
