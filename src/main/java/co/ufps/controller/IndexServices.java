package co.ufps.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import co.ufps.dao.UsuarioDao;
import co.ufps.dao.connectionTokenDao;
import co.ufps.dao.reporteDao;
import co.ufps.dao.rolDao;
import co.ufps.dao.seguimientoDao;
import co.ufps.dao.typeDao;

import co.ufps.entity.Rol;
import co.ufps.entity.Usuario;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class IndexServices
 */
@WebServlet("/")
public class IndexServices extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	rolDao roldao;
	UsuarioDao usuariodao;
	seguimientoDao seguimientodao;
	reporteDao reportedao;
	typeDao typedao;
	connectionTokenDao connectiontokendao;
    /**
     * Default constructor. 
     */
    public IndexServices() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		this.usuariodao = new UsuarioDao();
		this.roldao = new rolDao();
		this.seguimientodao = new seguimientoDao();
		this.typedao = new typeDao();
		this.reportedao = new reporteDao();
		this.roldao = new rolDao();
	
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getServletPath();
		try {
			switch(action){
			case "/registro":
				validarUsuario(request,response);
				break;
			case "/sesion":
				showSesion(request,response);
				break;
			case "/insertarUsuario":
				insertarUsuario(request,response);
				break;

			default:
				ShowinsertarUsuario(request,response);
				break;
			}
		}catch(SQLException e)
		{
			throw new ServletException(e);
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	private void showSesion(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		List<Rol> roles = roldao.list();
		request.setAttribute("roles", roles);
		RequestDispatcher dispatcher = request.getRequestDispatcher("JSP/sesion.jsp");
		dispatcher.forward(request, response); 
	}
	
	private void validarUsuario(HttpServletRequest request, HttpServletResponse response)throws ServletException, SQLException, IOException {
		/*
		String email = (request.getParameter("email"));
		String password = (request.getParameter("password"));
		Usuario v = this.UsuarioDao.selectByEmail(email);
		
		if(v.getPass()==password)
			response.sendRedirect("formulario");
		else
			response.sendRedirect("error");*/
	}
	private void ShowinsertarUsuario(HttpServletRequest request, HttpServletResponse response)throws ServletException, SQLException, IOException {
		List<Rol> roles = roldao.list();
		request.setAttribute("roles", roles);
		RequestDispatcher dispatcher = request.getRequestDispatcher("JSP/registro.jsp");
		dispatcher.forward(request, response); 
	}
	private void insertarUsuario(HttpServletRequest request, HttpServletResponse response)throws ServletException, SQLException, IOException {
		String usuario=  request.getParameter("usuario");
		String email=  request.getParameter("email");
		String pass=  request.getParameter("pass");
		short state=  Short.parseShort(request.getParameter("state"));
		Usuario v = new Usuario(email,pass,state,usuario);
		usuariodao.insert(v);
	}
}
