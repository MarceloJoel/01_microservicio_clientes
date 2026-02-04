package service;

import model.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.ClientesRepository;

@Service
public class ClientesServiceImpl implements ClientesService{

    @Autowired
    ClientesRepository clientesRepository;

    public Cliente autenticarCliente(String usuario, String password){
        return clientesRepository.findByUsuarioAndPassword(usuario, password);
    }

    public boolean registrarCliente (Cliente cliente){
        if(clientesRepository.findById(cliente.getUsuario())!=null){
            return false;
        }
        clientesRepository.save(cliente);
        return true;
    }
}
