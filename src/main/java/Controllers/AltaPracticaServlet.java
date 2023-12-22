package Controllers;

import Entities.Practica;
import Services.PracticaService;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;


@WebServlet("/altaPracticaServlet")
public class AltaPracticaServlet extends HttpServlet {
    protected PracticaService prServ;
    protected Practica practicas;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Practica> practicas = prServ.getAll();
        req.setAttribute("practicas", practicas);
        req.getRequestDispatcher("/altaPractica.jsp").forward(req,resp);


    }
}
