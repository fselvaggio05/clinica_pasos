package Repositories;

import ConexionDB.FactoryConnection;
import Entities.Usuario;

import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class UsuarioRepository {

    //esta clase se encargara de realizar las consultas a la DB,
// haciendo select, update, insert y delete
    ResultSet rs = null;
    PreparedStatement stmt = null;
    Usuario us = new Usuario();

    public Usuario buscarUsuario(String mail, String pass) {


        try {

            stmt = FactoryConnection.getInstancia().getConn().prepareStatement("select * from usuario where email=? and clave=?");
            stmt.setString(1, mail);
            stmt.setString(2, pass);
            rs = stmt.executeQuery();

            if (rs != null && rs.next()) {
                us.setApellido(rs.getString("apellido"));
                us.setNombre(rs.getString("nombre"));
                us.setDni(rs.getInt("dni"));

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



    public void guardarUsuario(Usuario us){

        try {
            stmt = FactoryConnection.getInstancia().getConn().prepareStatement("INSERT INTO usuario (dni,apellido, nombre, telefono, clave, fecha_nacimiento, genero, email) VALUES (?,?,?,?,?,?,?,?)");
            stmt.setString(1, dni);
            stmt.setString(2, apellido);
            stmt.setString(3, nombre);
            stmt.setString(4, telefono);
            stmt.setString(5,clave);
            stmt.setString(6, fechaNac);
            stmt.setString(7,genero);
            stmt.setString(8,email);
            rs = stmt.executeQuery();

        }

        catch (Exception e) {
            throw new RuntimeException(e);
        }

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
    }

}
