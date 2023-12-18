package Controllers;

import Entities.Usuario;
import Repositories.UsuarioRepository;
import Services.UsuarioService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet("/LoginServlet")

public class LoginServlet extends HttpServlet {

    private UsuarioService usServ;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        UsuarioService usServ = new UsuarioService();
        Usuario us = usServ.buscarUsuario(req.getParameter("mail"),req.getParameter("pass"));

        if(us.getDni()==0)
        {
            req.setAttribute("error", "Email o password incorrectos");
            req.getRequestDispatcher("/index.jsp").forward(req,resp);
        }

        else
        {

            HttpSession session = req.getSession();
            session.setAttribute("usuario", us);
            resp.sendRedirect(req.getContextPath() + "/menu_final.jsp");
        }
    }



}

