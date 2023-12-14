package Controllers;

import Entities.Usuario;
import Repositories.UsuarioRepository;
import Services.UsuarioService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/LoginServlet")

public class LoginServlet extends HttpServlet {

    private UsuarioService usServ;



    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

       Usuario us = usServ.buscarUsuario(req.getParameter("mail"),req.getParameter("pass"));

        if(us==null)
        {
            req.setAttribute("mensaje", "Email o password incorrectos");
            req.getRequestDispatcher("index.jsp").forward(req,resp);
        }

        else
        {
            resp.sendRedirect("/menu_final.html");
        }
    }



}

