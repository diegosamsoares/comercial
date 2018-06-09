package view;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import dao.ClienteDao;
import modelo.Cliente;

@ViewScoped
@ManagedBean
public class ClienteBean {

	private Cliente cliente;
	private List<Cliente> clientes ;
	ClienteDao dao = new ClienteDao();
	
	public ClienteBean() {
		System.out.println("passou");
		this.cliente= new Cliente();
	}
	@PostConstruct
	private void init() {
		this.clientes = dao.listaTodos();
	}
	
	public void salvar() {
		dao.salva(cliente);
		cliente=new Cliente();
		this.clientes = dao.listaTodos();
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
