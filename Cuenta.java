package es.studium.TestBanco;

public class Cuenta {
	private int idCuenta;
	private int saldo;
	private Cliente Cliente;
	
public Cuenta()
{
	idCuenta = 0;
	saldo = 100;
	Cliente = new Cliente();
}

public Cuenta (int id, int i, Cliente n)
{
	idCuenta = id;
	saldo = i;
	Cliente = n;
}

public int getIdCuenta() {
	return idCuenta;
}

public void setIdCuenta(int idCuenta) {
	this.idCuenta = idCuenta;
}

public int getSaldo() {
	return saldo;
}

public void setSaldo(int saldo) {
	this.saldo = saldo;
}

public Cliente getCliente() {
	return Cliente;
}

public void setCliente(Cliente Cliente) {
	this.Cliente = Cliente;
}
}