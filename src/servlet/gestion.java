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
 * Servlet implementation class gestion
 */
public class gestion extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public gestion() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		if(request.getParameter("id")!=null){
			HotelServ hs = new HotelServImp();
			List<Hotel> l;
			
			l=hs.suppression(request.getParameter("id"));
				
			
			//l=hs.Affichage();
			request.setAttribute("l",l);
			this.getServletContext().getRequestDispatcher("/HotelLis.jsp").forward(request,response);
			
		}
		else if (  (request.getParameter("id")!=null) && (request.getAttribute("sup")!=null)  ){
			
			
			String nom=request.getParameter("id");
			System.out.println("this is id:"+nom);
			HotelServ hs = new HotelServImp();
			Hotel l;
			
			l=hs.premodif(nom);
				
			
			//l=hs.Affichage();
			request.setAttribute("l",l);
			this.getServletContext().getRequestDispatcher("/PreModifHotel.jsp").forward(request,response);
			
		}
		
		else if((request.getAttribute("sup")=="valider") ){
			
			String nom=request.getParameter("nom");
			String ville=request.getParameter("ville");
			int grade=Integer.parseInt(request.getParameter("grade"));
			int nbrChambres=Integer.parseInt(request.getParameter("nbrChambres"));
			
			HotelServ hs = new HotelServImp();
			hs.Modif(nom, grade ,ville, nbrChambres );
			//List<Hotel> l;
			//l=hs.Affichage();
			//request.setAttribute("l",l);
			//this.getServletContext().getRequestDispatcher("/HotelLis.jsp").forward(request,response);

		}
		
		
		
		HotelServ hs = new HotelServImp();
		List<Hotel> l;
		l=hs.Affichage();
		request.setAttribute("l",l);
		this.getServletContext().getRequestDispatcher("/HotelLis.jsp").forward(request,response);	
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
	
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
		//this.getServletContext().getRequestDispatcher("/HotelLis.jsp").forward(request,response);
	}

}
