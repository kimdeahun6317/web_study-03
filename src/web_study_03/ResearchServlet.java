package web_study_03;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;


@WebServlet("/ResearchServlet")
public class ResearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}


	private void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name").trim();
		String gender = request.getParameter("gender").trim();
		String season[] = request.getParameterValues("season");
		
		if(gender.equals("male")) {
			gender="남성";
		}else {
			gender="여성";
		}
		

		String seasons = "";
	for(String s : season) {
		if(s.equals("1")) {
			seasons+="봄"+" ";
			}else if(s.equals("2")) {
			seasons+="여름"+" ";
			}else if(s.equals("3")) {
			seasons+="가을"+" ";
			}else if(s.equals("4")) {
				seasons+="겨울"+" ";
			}
		}
		
		
		
//		for(int i=0; i<season.length; i++) {
//			if(i==0) {
//				if(season[i].equals("1")) {
//					seasons+=" 봄";
//				}else if(season[i].equals("2")) {
//					seasons+=" 여름";
//				}else if(season[i].equals("3")) {
//					seasons+=" 가을";
//				}else if(season[i].equals("4")) {
//					seasons+=" 겨울";
//				}
//			}else {
//				if(season[i].equals("1")) {
//					seasons+=",봄";
//				}else if(season[i].equals("2")) {
//					seasons+=",여름";
//				}else if(season[i].equals("3")) {
//					seasons+=",가을";
//				}else if(season[i].equals("4")) {
//					seasons+=",겨울";
//				}
//			}	
//		}
		
		request.setAttribute("name", name);
		request.setAttribute("gender", gender);
		request.setAttribute("season", seasons);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("researchResult.jsp");
		dispatcher.forward(request, response);
		//response.sendRedirect("researchResult.jsp?name="+name+"&gender="+gender+"&season"+seasons);
		
	}

}
