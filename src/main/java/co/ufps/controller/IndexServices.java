package co.ufps.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import co.edu.ufps.beans.Candidato;
import co.edu.ufps.beans.Eleccion;
import co.edu.ufps.beans.Estamento;
import co.edu.ufps.entities.VotanteEntity;
import co.ufps.dao.connectionTokenDao;
import co.ufps.dao.reporteDao;
import co.ufps.dao.rolDao;
import co.ufps.dao.seguimientoDao;
import co.ufps.dao.typeDao;
import co.ufps.dao.usuarioDao;
import co.ufps.entity.Rol;
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
	usuarioDao usuariodao;
	seguimientoDao seguimientodao;
	reporteDao reportedao;
	typeDao typedbdao;
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
		
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getServletPath();
		try {
			switch(action){
			case "/inscripcionCandidato":
				showInscripcionCandidato(request,response);
				break;
			case "/insertarCandidato":
				insertarCandidato(request,response);
				break;
			case "/inscripcionVotante":
				showInscripcionVotante(request,response);
				break;
			case "/insertarVotante":
				insertarVotante(request,response);
				break;
			case "/formularioValidacion":
				showValidarVotante(request,response);
				break;
			case "/validarVotante":
				validarVotante(request,response);
				break;
			case "/registrarVoto":
				registrarVoto(request,response);
				break;
			default:
				showInscripcionCandidato(request,response);
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
		List<Rol> roles = rolDao.selectAll();
		request.setAttribute("roles", roles);
		RequestDispatcher dispatcher = request.getRequestDispatcher("JSP/sesion.jsp");
		dispatcher.forward(request, response); 
	}
	
	private void validarUsuario(HttpServletRequest request, HttpServletResponse response)throws ServletException, SQLException, IOException {
		
		Integer id = (request.getParameter("email"));
		String documento = request.getParameter("documento");
		Integer tipoDocumento = Integer.parseInt(request.getParameter("documentoId"));
		Usuario v = this.usuarioDao.selectByEmail(id);
		
		Integer estamentoId = Integer.parseInt(request.getParameter("estamentoId"));
		String estamentoDescripcion = request.getParameter("estamentoDescripcion");
		Rol est = new Estamento(estamentoId, estamentoDescripcion);
		

		
		List<Candidato> candidatos = this.candidatoDao.selectAll();
		response.sendRedirect("formulario");
	}
}
