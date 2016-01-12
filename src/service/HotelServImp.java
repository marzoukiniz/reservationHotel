package service;

import java.util.List;



import beans.*;
import dao.*;
public class HotelServImp implements HotelServ {
	List<Hotel> h;
HotelDao hotelDaoimp= new HotelDaoImp();
	@Override
	
	public List<Hotel> Affichage() {
		h=hotelDaoimp.findAll();
		return h;
		}
	@Override
	public List<Hotel> suppression(String nom) {
		
		h=hotelDaoimp.remove(nom);
		System.out.println("hotel supprimé");
		return h;
		
	}
	@Override
	public void ajout(Hotel h) {
		hotelDaoimp.create(h);
		}
	public Hotel premodif(String id){
		return  hotelDaoimp.IDhotel(id);
	}
	@Override
	public void Modif(String nom,  int grade ,String ville , int nbrChambres) {
		hotelDaoimp.update(nom, grade, ville,nbrChambres);
		
	}
	
}
