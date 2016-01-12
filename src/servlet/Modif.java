package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.HotelServ;
import service.HotelServImp;
import beans.Hotel;

/**
 * Servlet implementation class Modif
 */
public class Modif extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Modif() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	String nom=request.getParameter("nom");
		String ville=request.getParameter("ville");
		int grade=Integer.parseInt(request.getParameter("grade"));
		int nbrChambres=Integer.parseInt(request.getParameter("nbrChambres"));
		
		HotelServ hs = new HotelServImp();
		hs.Modif(nom, grade ,ville, nbrChambres );
		this.getServletContext().getRequestDispatcher("/ServletAffich").forward(request,response);


		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
