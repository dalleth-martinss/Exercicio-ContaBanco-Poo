package contaBancoPoo;

public class Referenciando {

	public static void main(String[] args) {
		
		Cliente benjamin = new Cliente();
		benjamin.nome ="Benjamin Leal";
		benjamin.cpf ="444.444.444-44";
		benjamin.profissao = "Programador";

	Conta contaDoBenjamin = new Conta();
	contaDoBenjamin.deposita(100);

	contaDoBenjamin.titular = benjamin;
	System.out.println(contaDoBenjamin.titular.nome);

	}
}


/* variavel de referencia  serve como um identificador, é por meio dele que iremos acessar os atributos da classe;
 * se tivermos somente um objeto, com mais de 1 referencia, se mudarmos o valor da 2º, o da 1º tmbm muda. pq as 2
 * apontam pro mesmo objeto. Por isso o valor da 1º e da 2º são iguais "50" no final de todo o codigo.
 * 
 */
