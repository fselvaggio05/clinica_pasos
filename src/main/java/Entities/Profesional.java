package Entities;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Profesional extends Usuario {

    private Integer matricula;

    public Profesional(Integer dni, String nombre, String apellido, String email, String fechaNac, String telefono, String clave, String genero, String matricula) throws ParseException {

        this.setDni(dni);
        this.setNombre(nombre);
        this.setApellido(apellido);
        this.setEmail(email);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
        Date fechaNacimiento = sdf.parse(fechaNac);
        this.setFecha_nacimiento(fechaNacimiento);
        this.setTelefono(telefono);
        this.setClave(clave);
        this.setGenero(genero);
        this.matricula=Integer.parseInt(matricula);


    }


    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }
}
