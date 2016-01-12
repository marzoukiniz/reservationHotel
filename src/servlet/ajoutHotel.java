package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.Hotel;
import service.HotelServ;
import service.HotelServImp;

/**
 * Servlet implementation class ajoutHotel
 */
public class ajoutHotel extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ajoutHotel() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String nom=request.getParameter("nom");
		String ville=request.getParameter("ville");
		int grade=Integer.parseInt(request.getParameter("grade"));	
		int nb=Integer.parseInt(request.getParameter("nbrch"));
		
		HotelServ hs = new HotelServImp();
		Hotel h=new Hotel();
		h.setNbrChambres(nb);
		h.setNom(nom);
		h.setVille(ville);
		h.setGrade(grade);
		hs.ajout(h);
		//request.setAttribute("l",l);
		this.getServletContext().getRequestDispatcher("/ServletAffich").forward(request,response);

		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
