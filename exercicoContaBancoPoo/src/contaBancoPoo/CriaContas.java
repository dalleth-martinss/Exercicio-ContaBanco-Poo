package contaBancoPoo;

public class CriaContas {

	public static void main(String[] args) {
		Conta primeiraConta = new Conta(); // cria uma nova instância - e é criado um novo objeto com especificações de uma classe;
		primeiraConta.saldo = 200;								
		System.out.println("Saldo disponivel " + primeiraConta.saldo);
		primeiraConta.saldo += 100;
		System.out.println("Agora eu tenho: " + primeiraConta.saldo);

		Conta segundaConta = new Conta();
		segundaConta.saldo = 50;
		System.out.println("Primeira conta tem: " + primeiraConta.saldo);
		System.out.println("Segunda conta tem: " + segundaConta.saldo);

	}
}
/* 1 - "Conta" é uma classe, as classe são modelo ou "Blueprints" que definem como os objetos devem ser construídos.
 */


/* 2 - "new conta()" está criando uma nova instância da classe conta, um objeto real está sendo criado com base nas especificações 
 * definidas na classe  "conta".
 */


 /* 3 - "primeiraConta" é o nome da variavel que está sendo usada para referenciar esse objeto  recém-criado.
  * ele é como um identificador que  permite que eu acesse e manipule as propriedades  e metodos  do objeto "Conta"..
  */
