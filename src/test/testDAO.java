package test;

import dao.HotelDao;
import dao.HotelDaoImp;

public class testDAO {

	public static void main(String[] args) {
		HotelDaoImp hoteldao = new HotelDaoImp() ;
		 hoteldao.remove("Belar");
		

	}

}
