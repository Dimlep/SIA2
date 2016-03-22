package classes;

public class Astronaute
{
    // instance variables - replace the example below with your own
    private int x;
    private String nom;
    private Fusee fu;


    public Astronaute()
    {
    }

    
    public int  chargerFuseeAstronaute(int p){
    	if(p >= 0){
            fu.chargerFusee(p);
            System.out.println("Votre fusée est a nouveau chargée");
    	}else{
    		System.out.println("Votre fusée n'a pas été chargé à cause du poids inférieur à 0");
    	}
    	
    	return fu.getPoids();
    }
    
    public void setFusee(Fusee f){
        this.fu = f;
    }
    
    public Fusee getFusee(){
        return fu;
    }


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}
    
    
}
