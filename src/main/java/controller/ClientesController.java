package controller;

import model.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import service.ClientesService;

@RestController
public class ClientesController {
    @Autowired
    ClientesService clientesService;
    @GetMapping(value="autenticar", produces = MediaType.APPLICATION_JSON_VALUE)
    public Cliente autenticar(String usuario, String password){
        return clientesService.autenticarCliente(usuario, password);
    }
}
