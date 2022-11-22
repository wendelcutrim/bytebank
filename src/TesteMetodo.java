
public class TesteMetodo {
	public static void main(String[] args) {
		Conta contaDoWendel = new Conta();
		contaDoWendel.saldo = 100;
		contaDoWendel.titular = "Wendel Cutrim";
		double valor = 50;
		contaDoWendel.deposita(valor);
		
		System.out.println("Conta do: " + contaDoWendel.titular + ", saldo: R$ " + contaDoWendel.saldo);
		
		boolean conseguiuSacar = contaDoWendel.saca(20);
		System.out.println(conseguiuSacar);
		
		Conta contaDoPaulo = new Conta();
		
		contaDoPaulo.deposita(1000);
		contaDoPaulo.titular = "Paulo Silveira";
		System.out.println("Conta do " + contaDoPaulo.titular + " : " + contaDoPaulo.saldo);
		
		boolean resultadoTransferencia = contaDoPaulo.transfere(200, contaDoWendel);
		System.out.println("Transferindo de Paulo para Wendel");
		if(resultadoTransferencia) {
			System.out.println("Transferência realizada com sucesso. \nSaldo atual: " + contaDoPaulo.saldo);
			System.out.println("Titular da conta de destino " + contaDoWendel.titular +  " Saldo da conta de destino: " + contaDoWendel.saldo);
		} else {
			System.out.println("Não foi possível realizar a transferência");
		}
	}
}
