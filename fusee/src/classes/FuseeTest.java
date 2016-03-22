package classes;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class FuseeTest
{
    /**
     * Default constructor for test class FuséeTest
     */
    public FuseeTest()
    {
    }

    @Test
    public void TestChargerFusée()
    {
        Fusee fusee1 = new Fusee();
        fusee1.setNom("Ariane");
        fusee1.setPoids(40);
        
        
        assertEquals(80, fusee1.chargerFusee(40));
    }

    @Test
    public void TestAstronauteChargerFusee()
    { 
        Fusee fusee1 = new Fusee();
        Astronaute astronau1 = new Astronaute();
        
        fusee1.setNom("Apollo");
        fusee1.setPoids(50);
        fusee1.setAstronaute(astronau1);
        
        astronau1.setNom("Ford");
        astronau1.setFusee(fusee1);
    
        assertEquals(100, astronau1.chargerFuseeAstronaute(50));
    }
    
    
    @Test
    public void TesterPoidsNegatifChargement(){
        Fusee fusee1 = new Fusee();
        fusee1.setNom("Ariane");
        fusee1.setPoids(40);
        
        
        assertEquals(40, fusee1.chargerFusee(-40));
    }
    
    @Test
    public void TesterPoidsNegatifAstronauteChargement(){
        Fusee fusee1 = new Fusee();
        Astronaute astronau1 = new Astronaute();
        
        fusee1.setNom("Apollo");
        fusee1.setPoids(50);
        fusee1.setAstronaute(astronau1);
        
        astronau1.setNom("Ford");
        astronau1.setFusee(fusee1);
    
        assertEquals(50, astronau1.chargerFuseeAstronaute(-50));
    }
    



}