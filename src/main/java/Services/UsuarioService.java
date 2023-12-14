package Services;

import Entities.Usuario;
import Repositories.UsuarioRepository;

public class UsuarioService {

    private final UsuarioRepository usRep;

    public UsuarioService(){

        this.usRep=new UsuarioRepository();


    }


    public Usuario buscarUsuario(String mail, String pass) {

        return usRep.buscarUsuario(mail,pass);


    }
}
