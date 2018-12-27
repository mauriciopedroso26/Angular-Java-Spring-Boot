package br.com.sistemajavaangular.endpoint;

import br.com.sistemajavaangular.entity.Cliente;
import br.com.sistemajavaangular.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController()
@RequestMapping("/clienteEndPoint")
public class ClienteEndpoint {

    private final ClienteService clienteService;

    @Autowired
    public ClienteEndpoint(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @PostMapping
    public Cliente save(@RequestBody Cliente cliente){
        return clienteService.save(cliente);
    }

    @GetMapping
    public List<Cliente> findAll(){
        return clienteService.findAll();
    }
}
