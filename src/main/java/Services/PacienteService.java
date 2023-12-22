package Services;

import Entities.Paciente;
import Repositories.PacienteRepository;
import Repositories.UsuarioRepository;

public class PacienteService {

    private UsuarioRepository usRep;
    private PacienteRepository pacRep;

    public PacienteService(){
        this.usRep = new UsuarioRepository();
        this.pacRep = new PacienteRepository();
    }

    public void insertarPaciente(Paciente pac) {

        usRep.insertarUsuario(pac);
        pacRep.insertarPaciente(pac);
    }
}
