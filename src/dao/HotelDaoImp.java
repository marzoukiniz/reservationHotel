package dao;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import beans.*;


public class HotelDaoImp implements HotelDao {
	static ArrayList<Hotel> hotels= new ArrayList<>();
	
	public HotelDaoImp(){
		if (hotels.size()==0){
			
			hotels.add(new Hotel("Moradi", 225, "tunis",4));
			
			hotels.add(new Hotel("Belar", 300, "hammamet",4));
			
			hotels.add(new Hotel("novotel", 280, "tunis",5));
			
		}
	}
	
	
	@Override
	public List<Hotel>findAll() {
	
			
			return hotels;
	}


	@Override
	public List<Hotel> remove(String nom) {
		synchronized (hotels) {
			
		
		 
	            Iterator<Hotel> it = hotels.iterator();
	            while (it.hasNext()) {
	                Hotel h = it.next();
	                if (h.getNom().equals(""+nom)){
	                    it.remove();
	                    
	                    System.out.println("supprimé");
	                    break;
	                }
	           
	            

	            }
	            return hotels;
	        }
	       
	    
		
	}


	@Override
	public void create(Hotel h) {
		hotels.add(h);
		
	}
	
	

	public Hotel IDhotel(String nom){
		 Iterator<Hotel> it = hotels.iterator();
		 Hotel h2 = null;
       while (it.hasNext()) {
             Hotel h = it.next();
           if (h.getNom().equals(""+nom)){
          	 
               h2= h;
               
               System.out.println("hotel trouvé");
              
           }
           
	}
		return h2;
	}
	
	//modification
	public  List<Hotel> ModifHotel(String nom ,String ville ,int grade , int nbrChambres){
		synchronized (hotels) {
			
		}
		 Iterator<Hotel> it = hotels.iterator();
		int i=0;
        while (it.hasNext()) {
        	i=i+1;
              Hotel h = it.next();
            if (h.getNom().equals(nom)){
          
           	 h.setGrade(grade);
           	 h.setVille(ville);
           	 h.setNbrChambres(nbrChambres);
                hotels.set(0, h);
                
               System.out.println("hotel modifié");
               break;
            }
           break;
	}
		
        return hotels;
}
	
	
	
	
	// aprés maj



	@Override
	public void update(String nom,  int grade ,String ville, int nbrChambres){
		 Iterator<Hotel> it = hotels.iterator();
		 
       while (it.hasNext()) {
             Hotel h = it.next();
           if (h.getNom().equals(""+nom)){
          	 
               h.setGrade(grade);
               h.setNbrChambres(nbrChambres);
               h.setVille(ville);
               
             System.out.println("hotel modifié");
             
              
           }
           
         
          
	}
       

       for(int i=0;hotels.size()>i;i++){
			System.out.println("hotel modifié"+"  "+hotels.get(i).getNom()+"  "+hotels.get(i).getGrade()+" "+hotels.get(i).getNbrChambres());
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
