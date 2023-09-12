package contaBancoPoo;

public class Metodos {

	public static void main(String[] args) {
		Conta contaBenjamin = new Conta();
		contaBenjamin.saldo = 100;
		contaBenjamin.deposita(50);
		System.out.println(" Valor da conta atualizada: " + contaBenjamin.saldo);

		boolean conseguiuRetirar = contaBenjamin.saca(20);
		System.out.println("O valor atualizado é de: " + contaBenjamin.saldo);
		System.out.println(conseguiuRetirar);

		Conta contaDaMarcela = new Conta();
		contaDaMarcela.deposita(1000);

		if(contaDaMarcela.transfere(1300, contaBenjamin)) {
			System.out.println("Transferencia realizada com suceso! ");
		}else {
			System.out.println("Saldo insuficiente!");
		}
		System.out.println("Conta da Marcela foi atualizada para: " + contaDaMarcela.saldo);
		System.out.println("Conta do Benjamin foi atualizada: " + contaBenjamin.saldo);

	}

}
 // atalho segura a tecla "CTRL" passa o mouse em cima dos atributos e eles ficam como se fossem links
// ao clicar, a tela muda para onde eles estão.