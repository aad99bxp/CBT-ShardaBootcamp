package com.example.demo3;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "SecondServlet", value = "/second-servlet")
public class SecondServlet extends HttpServlet {

    @Override
    public void init() throws ServletException {
        super.init();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      int num1 = Integer.parseInt(request.getParameter("num1"));
      int num2 = Integer.parseInt(request.getParameter("num2"));

      int sum = num1+num2;
      PrintWriter writer = response.getWriter();
      writer.println("<html><body><h1> the numbers you entered"+"were "+num1+"and"+num2+"and their sum is"+sum+"</h1></body></html>");
      writer.flush();
    }

        public void destroy() {
        }

    }
