package Controllers;

import Entities.Usuario;
import Services.UsuarioService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

@WebServlet(name = "/AltaUsuarioServlet")

public class AltaUsuarioServlet extends HttpServlet {

    public UsuarioService usServ;


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        UsuarioService usServ = new UsuarioService();
        Usuario us = new Usuario();
        /*req.getParameter("tipoDoc")*/
        us.setDni(Integer.parseInt(req.getParameter("dni")));
        us.setNombre(req.getParameter("nombre"));
        us.setApellido(req.getParameter("apellido"));
        us.setEmail(req.getParameter("email"));

        String fecha_nac = req.getParameter("fechaNac");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");

        us.setFecha_nacimiento(sdf.parse(fecha_nac));
        us.setTelefono(req.getParameter("telefono"));
        us.setClave(req.getParameter("clave"));
        us.setGenero(req.getParameter("genero"));
        us.setClave(req.getParameter("clave"));
        us.setGenero(req.getParameter("genero"));


     /*
        req.getParameter("obraSocial");
        req.getParameter("nroAfiliado");*/

        usServ.crearUsuario(us, req.getParameter("tipoUsuario"));


    }





}