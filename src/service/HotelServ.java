package service;

import java.util.List;

import beans.Hotel;

public interface HotelServ {
public List<Hotel> Affichage();
public List<Hotel> suppression(String nom);
public void ajout(Hotel h);
public Hotel premodif(String id);
public void Modif (String nom,  int grade ,String ville , int nbrChambres);
}
