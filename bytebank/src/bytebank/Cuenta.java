package bytebank;


class Cuenta {

	double saldo;
	private int agencia;
	private int numero;
	Cliente titular = new Cliente();
	
	private static int total= 0;

	public static int getTotal() {
		return total;
	}

	public static void setTotal(int total) {
		Cuenta.total = total;
	}

	public Cuenta(int agencia) {
		this.agencia = agencia;
		System.out.println(" Estoy Creando una Cuenta " + this.numero);

		Cuenta.total++;

	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public void depositar(double valor) {
		this.saldo += valor;
	}

	public boolean retirar(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		}
		return false;

	}

	public boolean transferir(double valor, Cuenta cuenta) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			cuenta.depositar(valor);
			return true;
		} else {
			return false;
		}
	}

	public double getSaldo() {
		return this.saldo;
	}

	public void setAgencia(int agencia) {
		if (agencia > 0) {
			this.agencia = agencia;

		} else {
			System.out.println("No estan permitidos numeros negativos");
		}
	}

	public int getAgencia() {
		return agencia;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public Cliente getTitular() {
		return titular;
	}

	public static void main(String[] args) {
		System.out.println("Ejecutando test de gerente");
	}
}