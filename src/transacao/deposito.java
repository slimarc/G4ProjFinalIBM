public class deposito {
	
	private int numConta;
	private String Pessoa;
	private double saldo = 0.0;
	

	
	public deposito(int numConta, String pessoa, double saldo) {
		super();
		this.numConta = numConta;
		Pessoa = pessoa;
		this.saldo = saldo;
	}
	
	public int getNumConta() {
		return numConta;
	}
	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}
	public String getPessoa() {
		return Pessoa;
	}
	public void setPessoa(String pessoa) {
		Pessoa = pessoa;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public String toString() {
		return "\nConta: "+ this.getNumConta() + 
				"\nPessoa:" + this.getPessoa() +
				"\nSaldo: "+ this.getSaldo();
	}
	
	public void depositar(double valor) {
		if(valor > 0) {
			setSaldo(getSaldo() + valor);
			System.out.println("Depósito realizado com sucesso!");
		}else {
			System.out.println("Não foi possível realizar o seu depósito!");
		}
	}
}


