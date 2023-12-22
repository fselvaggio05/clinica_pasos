package Services;

import Entities.Practica;
import Repositories.PracticaRepository;

import java.util.List;

public class PracticaService {

    protected PracticaRepository prRep;

    public PracticaService()
    {
        this.prRep=new PracticaRepository();
    }
    public List<Practica> getAll() {

        List<Practica> practicas = prRep.getAll();
        return practicas;

    }
}
