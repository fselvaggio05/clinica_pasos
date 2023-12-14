package Repositories;

import ConexionDB.FactoryConnection;
import Entities.Usuario;

import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class UsuarioRepository {

//esta clase se encargara de realizar las consultas a la DB,
// haciendo select, update, insert y delete

   public Usuario buscarUsuario(String mail, String pass) {

       ResultSet rs = null;
       PreparedStatement stmt = null;
       Usuario us = new Usuario();

       try {

           stmt = FactoryConnection.getInstancia().getConn().prepareStatement("select * from usuario where email=? and clave=?");
           stmt.setString(1, mail);
           stmt.setString(2, pass);
           rs = stmt.executeQuery();

           if (rs != null && rs.next()) {
               us.setApellido(rs.getString("apellido"));
               us.setNombre(rs.getString("nombre"));
           }


       } catch (Exception e) {
           e.printStackTrace();
       }


       //una vez ejecutado to,do, cierro la conexion de la base de datos
       finally {

           try {
               //se cierran conexiones abiertas en el orden inverso en que fueron abiertas
               if (rs != null) rs.close();
               if (stmt != null) stmt.close();


           } catch (Exception e) {
               e.printStackTrace();
           }

           FactoryConnection.getInstancia().releaseConn(); //reveer esto, no me convene


       }

       return us;
   }

}
