package view;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

import modelo.Cliente;

@ManagedBean
public class ClienteBean {

	private Cliente cliente= new Cliente();
	private List<Cliente> clientes = new ArrayList<>();
	
	
	@PostConstruct
	private void init() {
		Cliente cli = new Cliente();
		cli.setNome("Diego");
		cli.setTelefone(8484848);
		this.clientes.add(cli);
		
	}
	
	public void salvar() {
		System.out.println(cliente.getNome()+"-"+cliente.getTelefone());
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
