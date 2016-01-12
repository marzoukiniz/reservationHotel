package dao;
 import beans.Hotel;

import java.util.List;
public interface HotelDao {
	
	
	public List <Hotel> findAll();
	public List <Hotel> remove(String nom);
	public void create(Hotel h);
	public Hotel IDhotel(String nom);
	public List <Hotel>ModifHotel(String nom ,String ville ,int grade , int nbrChambres);
	public void update(String nom, int grade , String ville ,int nbrChambres);

}
