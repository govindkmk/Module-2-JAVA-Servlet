package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class StudentServlet
 */
@WebServlet("/StudentServlet")
public class StudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter printWriter = response.getWriter();
		
		
		String rollNumber = request.getParameter("rollNumber");
		String name = request.getParameter("name");
		String fatherName = request.getParameter("fatherName");
		String age = request.getParameter("age");
		String gender = request.getParameter("gender");
		String email = request.getParameter("email");
		String department = request.getParameter("department");
		String dateOfBirth = request.getParameter("dateOfBirth");
		
		printWriter.write("<!DOCTYPE html>\r\n"
				+ "<html>\r\n"
				+ "  <head>\r\n"
				+ "    <title>Student Form</title>\r\n"
				+ "    <style>\r\n"
				+ "\r\n"
				+ "      body{\r\n"
				+ "        font-size: 24px;\r\n"
				+ "        background-image: linear-gradient(30deg, red,rgb(21, 0, 104),blue,rgb(9, 147, 221),violet);\r\n"
				+ "        background-attachment: fixed;\r\n"
				+ "        \r\n"
				+ "      }\r\n"
				+ "      .section{\r\n"
				+ "        border: 5px;\r\n"
				+ "        margin: auto;\r\n"
				+ "        width: 50%;\r\n"
				+ "        padding: 10px;\r\n"
				+ "        text-align: center;\r\n"
				+ "        margin-top: 50px;\r\n"
				+ "        border-radius: 15px;\r\n"
				+ "        color: rgb(255, 255, 255);\r\n"
				+ "        background: hsla(120, 1%, 34%, 0.5);\r\n"
				+ "      \r\n"
				+ "      }\r\n"
				+ "      h3{\r\n"
				+ "        text-align: left;\r\n"
				+ "        margin-left: 50px;\r\n"
				+ "      }\r\n"
				+ "\r\n"
				+ "    </style>\r\n"
				+ "  </head>\r\n"
				+ "  <body>\r\n"
				+ "    \r\n"
				+ "    \r\n"
				+ "    <div class=\"section\">\r\n"
				+ "        <h1>Data Successfully Submitted</h1>\r\n"
				+ "        <h3>Name: "+name+"</h3>\r\n"
				+ "        <h3>Roll Number: "+rollNumber+"</h3>\r\n"
				+ "        <h3>Father Name: "+fatherName+"</h3>\r\n"
				+ "        <h3>Age: "+age+"</h3>\r\n"
				+ "        <h3>Gender: "+gender+"</h3>\r\n"
				+ "        <h3>Department: "+department+"</h3>\r\n"
				+ "        <h3>Email: "+email+"</h3>\r\n"
				+ "        <h3>Date of Birth: "+dateOfBirth+"</h3>\r\n"
				+ "    </div>\r\n"
				+ "  </body>\r\n"
				+ "</html>");
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
