package com.example.demo3;
import java.util.*;

import javax.security.enterprise.credential.Credential;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.Buffer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;


@WebServlet(name = "Login", value = "/login")
public class LoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        BufferedReader creadentialReader = Files.newBufferedReader(Paths.get("C:\\Users\\rg928\\IdeaProjects\\demo3\\Data\\credentials.csv"));
        String line;
        List<Credential> credentialList = new ArrayList<>();
        while(line = creadentialReader.readLine()!=null){
            String[] credentialData = line.split(",");
            credentialList.add(new Credential(credentialData[0],credentialData[1]));
        }
        Optional

        PrintWriter writer = response.getWriter();

        if(username.equals("rahul")){
            if(password.equals("gupta")){
                writer.println("<html><body><h1>Welcome "+
                        username);
            }else{
                writer.println("Wrong Password");
            }
        }
    }
    public void destroy() {
    }
}
