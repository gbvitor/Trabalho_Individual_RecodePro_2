package controller;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = { "/home", "/contatos", "/destinos/", "/promoções" })
public class navController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public navController() {
		super();

	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());

		String action = request.getServletPath();
		switch (action) {
		case "/home":
			pageHome(request, response);
			break;

		case "/contatos":
			pageContatos(request, response);
			break;

		case "/promoções":
			pagePromoções(request, response);
			break;

		case "/":
			pageDestinos(request, response);
			break;
		}
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

	protected void pageHome(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.sendRedirect("./views/index.jsp");
	}

	protected void pageContatos(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.sendRedirect("./views/contatos.jsp");
	}

	protected void pagePromoções(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.sendRedirect("./views/promoções.jsp");
	}

	protected void pageDestinos(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.sendRedirect("./views/destinos.jsp");
	}
}
