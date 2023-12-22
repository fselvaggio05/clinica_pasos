package Repositories;

import ConexionDB.FactoryConnection;
import Entities.Practica;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PracticaRepository {

    ResultSet rs = null;
    PreparedStatement stmt = null;


    public List<Practica> getAll() {

        List<Practica> practicas = new ArrayList<Practica>();

        try{
            stmt = FactoryConnection.getInstancia().getConn().prepareStatement("select * from practica");
            rs = stmt.executeQuery();

            if(rs!=null && rs.next()){
                Practica pr = new Practica();
                pr.setId_practica(rs.getInt("id_practica"));
                pr.setDescripcion(rs.getString("descripcion"));
                pr.setId_equipo(rs.getInt("id_equipo"));
                practicas.add(pr);


            }

        }

        catch (SQLException e) {
            throw new RuntimeException(e);
        }

        finally{
            try {
                //se cierran conexiones abiertas en el orden inverso en que fueron abiertas
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();


            } catch (Exception e) {
                e.printStackTrace();
            }

            FactoryConnection.getInstancia().releaseConn();

        }

        return practicas;


    }
}
