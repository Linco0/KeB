package com.dev.keb.entidade;

import com.dev.keb.Cliente;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped

public class ClienteBean {
    
    private Cliente cliente = new Cliente();
    private List<Cliente> clientes = new ArrayList<>();
    
    public void registrarCliente(){
        clientes.add(cliente);
        cliente = new Cliente();
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }
}
