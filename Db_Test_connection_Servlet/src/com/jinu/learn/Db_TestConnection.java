package com.jinu.learn;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Db_TestConnection
 */
@WebServlet("/Db_TestConnection")
public class Db_TestConnection extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Db_TestConnection() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Set up connection variable
		String username="springstudent";
		String password="springstudent";
		String driver="com.mysql.jdbc.Driver";
		String jdbcurl="jdbc:mysql://localhost:3306/web_customer_tracker?useSSL=false";
		//get connection to the database
		try{
			PrintWriter out=response.getWriter();
			out.println("Connection to database"+jdbcurl);
			Class.forName(driver);
			Connection mycon=DriverManager.getConnection(jdbcurl,username,password);
			out.println("Connection Success....!");
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
