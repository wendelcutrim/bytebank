
public class TesteReferencia {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 300;
		
		System.out.println("Saldo da primeira conta: " + primeiraConta.saldo);
		
		//Criando a variável segundaConta e apontando para a primeiraConta, nesse caso estamos fazendo um clone e a segunda conta esta apontando para a primeiraConta ou seja, se ocorrer alteração em alguma das variaveis, automaticamente irá refletir na outra.
		Conta segundaConta = primeiraConta;
		System.out.println("Saldo da segunda conta: " + segundaConta.saldo);
		segundaConta.saldo += 100;
		System.out.println("Saldo da primeira conta: " + primeiraConta.saldo);
		System.out.println("Saldo da segunda conta: " + segundaConta.saldo);
		
		if(primeiraConta == segundaConta) {
			System.out.println("São iguais");
		} else {
			 System.out.println("Não são iguais!");
		}
		
		int[] numbers = {0, 1, 2};
		
		System.out.println(numbers.length);

	}
}
