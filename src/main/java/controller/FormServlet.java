package controller;

import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.sql.Connection;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.crypto.Data;

import util.DataBase;

/**
 * Servlet implementation class FormServlet
 */
public class FormServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FormServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		String[] parameterName = request.getParameterValues("parameterName");
		String[] type = request.getParameterValues("type");
		String[] length = request.getParameterValues("length");
		String[] primaryKey = request.getParameterValues("pk");
		String[] foreignKey = request.getParameterValues("fk");
		if(parameterName != null)
		{
			for(String pname : parameterName)
			{
				System.out.println(pname);
			}
		}
		if(type != null)
		{
			for(String t : type)
			{
				System.out.println(t);
			}
		}
		if(length != null)
		{
			for(String len:length)
			{
				System.out.println(len);
			}
		}
		if(primaryKey != null)
		{
			for(String pk :primaryKey)
			{
				System.out.println(pk);
			}
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
