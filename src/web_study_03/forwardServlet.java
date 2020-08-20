package web_study_03;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/forwardServlet")
public class forwardServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}


	private void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int age = Integer.parseInt(request.getParameter("age"));
		
		if(age<=19) {
			response.setContentType("text/html; charset=UTF-8");
			response.getWriter()
			.append("<html><head>")
			.append("<script type=\"text/javascript\">")
			.append("alert(\"19세 미만이므로 입장 불가능\");")
			.append("history.go(-1)")
			.append("</script></head>")
			.append("</html>");
			
			
	         
	         
		}else {
			request.setAttribute("name", "성윤정");
			RequestDispatcher dispatcher = request.getRequestDispatcher("05_forwardResult.jsp");
			dispatcher.forward(request, response);
		}
		
	}

}
