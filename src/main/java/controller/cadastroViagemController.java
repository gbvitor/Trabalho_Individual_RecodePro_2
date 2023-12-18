package controller;

import java.io.IOException;
import java.util.List;

import DAO.cadastroViagemDAO;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.cadastroViagem;

@WebServlet(urlPatterns = { "/cadastroViagem", "/cadastroViagem-create", "/cadastroViagem-delete", "/cadastroViagem-update" })
public class cadastroViagemController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	cadastroViagemDAO cvDAO = new cadastroViagemDAO();
	cadastroViagem cadastroViagem = new cadastroViagem();

	public cadastroViagemController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String action = request.getServletPath();

		switch (action) {
		case "/cadastroViagem":
			listaCadastroViagem(request, response);
			break;
		case "/cadastroViagem-delete":
			deleteCadastroViagem(request, response, 0);
			break;
		case "/home":
			response.sendRedirect("views/talento/index.jsp");
			break;

		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String action = request.getServletPath();

		switch (action) {
		case "/cadastroViagem-create":
			createCadastroViagem(request, response);
			break;
		case "/cadastroViagem-update":
			updateCadastroViagem(request, response);
			break;
		}
	}

	protected void listaCadastroViagem(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		List<cadastroViagem> lista = cvDAO.getCadastroViagem();

		request.setAttribute("listaTalentos", lista);
		RequestDispatcher rd = request.getRequestDispatcher("./views/talento/listatalento.jsp");
		rd.forward(request, response);

	}

	protected void deleteCadastroViagem(HttpServletRequest request, HttpServletResponse response, int id)
			throws ServletException, IOException {
		cvDAO.removeById(id);
		response.sendRedirect("/home");
	}

	protected void createCadastroViagem(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		cadastroViagem.setNome(request.getParameter("Nome"));
		cadastroViagem.setEmail(request.getParameter("Email"));
		cadastroViagem.setCEPDestino(request.getParameter("CEPDestino"));
		cadastroViagem.setCEPOrigem(request.getParameter("CEPOrigem"));
		
		cvDAO.save(cadastroViagem);
		response.sendRedirect("/home");
	}

	protected void updateCadastroViagem(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		

	
		cadastroViagem.setNome(request.getParameter("Nome"));
		cadastroViagem.setEmail(request.getParameter("Email"));
		cadastroViagem.setCEPOrigem(request.getParameter("CEPOrigem"));
		cadastroViagem.setCEPDestino(request.getParameter("CEPDestino"));
		
		cvDAO.update(cadastroViagem);
		response.sendRedirect("/home");
	}
}