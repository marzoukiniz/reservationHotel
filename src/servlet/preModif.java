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
 * Servlet implementation class preModif
 */
public class preModif extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public preModif() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
     String nom=request.getParameter("id");
		System.out.println("this is id:"+nom);
		HotelServ hs = new HotelServImp();
		Hotel l;
		
		l=hs.premodif(nom);
			
		
		//l=hs.Affichage();
		request.setAttribute("l",l);
		this.getServletContext().getRequestDispatcher("/PreModifHotel.jsp").forward(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
