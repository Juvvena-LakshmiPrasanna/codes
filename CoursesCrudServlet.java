package com.del.second;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.del.second.dao.CoursesDAO;
import com.del.second.entity.Courses;
@WebServlet("/CoursesCrudServlet")
public class CoursesCrudServlet extends HttpServlet
{
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String submit = request.getParameter("sub");
		CoursesDAO cdao = new CoursesDAO();
		Courses cs = new Courses();
		String message="Successfully ";
		cs.setCourse_id(Integer.parseInt(request.getParameter("id")));
		RequestDispatcher rd = request.getRequestDispatcher("CoursesCrud.jsp");
		if(submit.equals("Add_Course") || submit.equals("Modify_Course"))
		{
			cs.setCourse_name(request.getParameter("name"));
			cs.setCourse_duration(Integer.parseInt(request.getParameter("duration")));
			cs.setCourse_fee(Double.parseDouble(request.getParameter("fee")));
			if(submit.equals("Add_Course"))
			{
				cdao.insertCourses(cs);
				message=message+"Inserted Record";
			}
			else
			{
				cdao.modifyCourses(cs);
				message=message+"Modified Record";
			}
		}
		else if(submit.equals("Delete_Course"))
		{
			if(cdao.removeCourses(cs.getCourse_id()))
				message=message+"Record Deleted";
			else
				message="Deletion Failed";
		}
		else if(submit.equals("Show_Course"))
		{
			cs = cdao.getCourses(cs.getCourse_id());
			request.setAttribute("cs", cs);
			
		}
		out.print("<h1><center>"+message+"</center></h1>");
		rd.include(request,response);
				
	}
}
