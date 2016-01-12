package servlet;

import java.util.HashMap;
import java.util.Map;

import beans.Hotel;

public class Validateur {

	private Map<String, String> erreurs = new HashMap<String, String>();
	public Map<String, String> getErreurs() {
	return erreurs;
	}
	public Hotel validerHotel(String nom, String ville , String nbrChamres){
	Hotel hl=new Hotel();
	 if(nom.compareTo("")==0){
	erreurs.put("nom","Le nom ne doit pas être vide");
	}
	hl.setNom(nom);
	 if(ville.compareTo("")==0){
			erreurs.put("ville","la ville ne doit pas être vide");
			}
			hl.setVille(ville);
	if(nbrChamres.compareTo("")==0){


		erreurs.put("nbr des chambres","le nbr des chambres ne doit pas être vide");
		}
		 hl.setNbrChambres(Integer.parseInt(nbrChamres));
		 return hl;
		}
		
}
