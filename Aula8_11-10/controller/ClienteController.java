package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Cliente;
import model.ClienteDao;

/**
 * Servlet implementation class ClienteController
 */
@WebServlet({"/ClienteController", "/novocliente"}) //ROTA PARA CHAMAR OS ARQUIVOS
//USAR {} PARA COLCOAR MAIS DE UMA ROTA

public class ClienteController extends HttpServlet {
	
	Cliente cli=new Cliente();
	ClienteDao daocli = new ClienteDao();
	
	
	
	
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ClienteController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	
		String acao = request.getServletPath();
		if(acao.equals("/novocliente")) {
			
			EnviaDados(request,response);
			
		}
	
	
	}
	
	
	// tudo que for digitado virá pra essa classe
	protected void EnviaDados(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//cli.setIdcliente(Integer.parseInt(request.getParameter("idcliente")));
		
		cli.setNome(request.getParameter("nome"));
		
		cli.setTelefone(request.getParameter("telefone"));
		
		
		daocli.Salvar(cli);
		
		
		PrintWriter pw = response.getWriter();
		
		//pw.println(cli.getIdcliente());
		pw.println(cli.getNome());
		pw.println(cli.getTelefone());
		
	}


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
