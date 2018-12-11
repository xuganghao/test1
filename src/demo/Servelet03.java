package demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servelet03
 */
@WebServlet("/Servelet03")
public class Servelet03 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servelet03() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.println("getMethod:"+request.getMethod()+"<br />");
		out.println("getRequestURI:"+request.getRequestURI()+"<br />");
		out.println("getQueryString:"+request.getQueryString()+"<br />");
		out.println("getProtocol:"+request.getProtocol()+"<br />");
		out.println("getContextPath:"+request.getContextPath()+"<br />");
		out.println("getPathInfo:"+request.getPathInfo()+"<br />");
		out.println("getPathTranslated:"+request.getPathTranslated()+"<br />");
		out.println("getServletPath:"+request.getServletPath()+"<br />");
		out.println("getRemoteAddr:"+request.getRemoteAddr()+"<br />");
		out.println("getRemoteHost:"+request.getRemoteHost()+"<br />");
		out.println("getRemotePort:"+request.getRemotePort()+"<br />");
		out.println("getLocalAddr:"+request.getLocalAddr()+"<br />");
		out.println("getLocalName:"+request.getLocalName()+"<br />");
		out.println("getLocalPort:"+request.getLocalPort()+"<br />");
		out.println("getServerPort:"+request.getServerPort()+"<br />");

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
