

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Patient_Appointment")
public class PatientAppointment extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public PatientAppointment() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		out.print("<h2 align='left'>Book New Appointment</h2><br>");
		out.print("<form action='Appoint_backend' method='post'>");
		out.print("Select Category : <br>");
		out.print("<select name='cat'>");
		out.print("<option>Orthopedic(Bone)</option>>");
		out.print("<option>Dentist</option>");
		out.print("<option>Child Specialist</option>");
		out.print("<option>Oncologist(Cancer)</option>");
		out.print("<option>Neonatalogist(Born Baby)</option>");
		out.print("<option>Gynecologist</option>");
		out.print("<option>Physician(Normal)</option>");
		out.print("</select><br><br>");
		
		out.print("Select Date : <br>");
		out.print("<input type='date' name='date'><br><br>");
		
		out.print("Select Timing : <br>");
		out.print("<select name='time'>");
		out.print("<option>09:00AM</option>>");
		out.print("<option>10:00AM</option>");
		out.print("<option>11:00AM</option>");
		out.print("<option>12:00PM</option>");
		out.print("<option>04:00PM</option>");
		out.print("<option>05:00PM</option>");
		out.print("<option>06:00PM</option>");
		out.print("<option>07:00PM</option>");
		out.print("<option>08:00PM</option>");
		out.print("</select><br><br>");
		
		out.print("<input type='submit' value='Check'>");
	}
}
		
		
