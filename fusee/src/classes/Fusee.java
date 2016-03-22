package classes;

import java.util.ArrayList;

public class Fusee
{
    // instance variables - replace the example below with your own
    private int x;
    private String nom;
    private int poids;
    private ArrayList<Astronaute> listAstronaute;

    /**
     * Constructor for objects of class Fusée
     */
    public Fusee()
    {
        // initialise instance variables
        x = 0;
    }
    
    public void setNom(String n){
        this.nom = n;
    }
    
    public void setPoids(int p){
        this.poids = p;
    }
    
    public String getNom(){
        return this.nom;
    }
    
    public int getPoids(){
        return this.poids;
    }
    
    public int chargerFusee(int charge){
    	
    	if(charge >= 0){
            this.poids+=charge;
            System.out.println("Chargement de "+this.nom+" réussi, nouveau poids :"+this.poids);
            
    	}else {
    		System.out.println("Pas de changement de poids car le poids est négatif.");
    	}
    	
    	return this.poids;
    }
    
    
    public void setAstronaute(Astronaute astro){
        this.listAstronaute.add(astro);
    }

    
    
}
