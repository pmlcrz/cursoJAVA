package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Advogado;
import model.AdvogadoDao;

@WebServlet({"/AdvogadoController","/novoadvogado","/buscaadvogado"}) 

public class AdvogadoController extends HttpServlet {
	
	Advogado adv=new Advogado(0, null, null, null);
	AdvogadoDao daoadv = new AdvogadoDao();
	
	private static final long serialVersionUID = 1L;
	
	public AdvogadoController() {
		super();
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {	

		String acao = request.getServletPath();
		if(acao.equals("/novoadvogado")) {
			
			EnviarDados(request,response);
		}
		else if(acao.equals("/buscaadvogado")) {
			BuscaDados(request,response);
		}
	
	
	}
	
	protected void EnviarDados(HttpServletRequest request, HttpServletResponse response) {
		
		adv.setOab(request.getParameter("oab"));
		adv.setNome(request.getParameter("nome"));
		adv.setTelefone(request.getParameter("telefone"));
		adv.setTipocausas(request.getParameter("tipocausas"));
	
		daoadv.Salvar(adv);
	
	}

	
	protected void BuscaDados(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ArrayList<Advogado> lista = daoadv.Listar();
		request.setAttribute("advogado", lista);
		RequestDispatcher rd = request.getRequestDispatcher("RelAdvogado.jsp");
		rd.forward(request, response);
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

