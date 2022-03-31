

import java.io.*;
import java.util.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
/**
 * Servlet implementation class Details
 */
@WebServlet("/Details")
public class Details extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Details() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		try
		{  
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/wt","root","root");   
			Statement stmt=con.createStatement();  
			ResultSet rs=stmt.executeQuery("select * from employee");  
			out.println("<body style=\"background-color:#e6b93e;\"><h1 style=\"text-align:center;\">Employee Details</h1>");
			out.println("<div style=\"margin-left:30%; font-size:30px;\"><table border=\"1\" style=\"width:50%;\"><tr style=\"background-color:#180b38; color:#fff;\"><td><strong>ID</strong></td><td><strong>Name</strong></td><td><strong>Role</strong></td><td><strong>Salary</strong></td></tr>");
			while(rs.next()) 
				out.println("<tr><td>"+rs.getInt(1)+"</td><td>"+rs.getString(2)+"</td><td>"+rs.getString(3)+"</td><td>"+rs.getString(4)+"</td></tr>");  
			out.println("</table></body>");
			con.close();  
		}
		catch(Exception e)
		{ 
			out.println(e);
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
