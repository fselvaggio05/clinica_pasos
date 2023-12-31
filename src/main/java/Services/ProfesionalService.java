package Services;

import Entities.Profesional;
import Repositories.ProfesionalRepository;
import Repositories.UsuarioRepository;

public class ProfesionalService {

    private UsuarioRepository usRep;
    private ProfesionalRepository profRep;


    //refactor de esto, para pasarle las variables por parametro
    public ProfesionalService(){
        this.usRep = new UsuarioRepository();
        this.profRep= new ProfesionalRepository();
    }

    public void insertarProfesional(Profesional prof) {
        usRep.insertarUsuario(prof);
        profRep.insertarProfesional(prof);
    }
}
