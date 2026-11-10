package com.example.createweb.servlet;

import java.io.*;

import com.example.createweb.business.Survey;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

import com.example.createweb.business.User;

import java.time.LocalDate;

import jakarta.servlet.annotation.WebServlet;

@WebServlet("/emailList")

public class SurveyServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {

        String url = "/index.html";

        // get current action
        String action = request.getParameter("action");
        if (action == null) {
            action = "join"; // default action
        }

        // perform action and set URL to appropriate page
        if (action.equals("join")) {
            url = "/index.html"; // the "join" page
        } else if (action.equals("add")) {

            String firstName = request.getParameter("firstName");
            String lastName = request.getParameter("lastName");
            String email = request.getParameter("email");
            String dateOfBirthStr = request.getParameter("dateOfBirth");
            LocalDate dateOfBirth = LocalDate.parse(dateOfBirthStr);

            User user = new User(firstName, lastName, email, dateOfBirth);

            String hearSource = request.getParameter("whereHear");
            boolean receiveAnnouncements = request.getParameter("yes1") != null;
            boolean receiveSpecialOffers = request.getParameter("yes2") != null;

            String contactMethod = request.getParameter("contact");

            Survey survey = new Survey(user, hearSource, receiveAnnouncements, receiveSpecialOffers, contactMethod);

            request.setAttribute("survey", survey);
            url = "/thanks.jsp";
        }

        // forward request and response objects to specified URL
        getServletContext()
                .getRequestDispatcher(url)
                .forward(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }
}
