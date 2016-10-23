package Negocio;
 
import java.io.IOException;
import java.util.List;

import Persistencia.*;

public interface iCadastroContrinuinte {
    void save(Contribuinte c) throws CpfDuplicadoException;
    void update(Contribuinte c) throws CpfInexistenteExcpetion;
    boolean exists(String cpf);
    Contribuinte load(String cpf);
    void close() throws IOException;
    List<Contribuinte> getIdosos();
    List<Contribuinte> getAll();

}
