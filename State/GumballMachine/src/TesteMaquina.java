
public class TesteMaquina {

	public static void main(String[] args) {
		
		MaquinaBolinhas maquina = new MaquinaBolinhas(5);

		maquina.inserirMoeda();
		
		maquina.virarManivela();
		
		maquina.inserirMoeda();
		
		maquina.ejetarMoeda();
		
		maquina.inserirMoeda();
		
		maquina.virarManivela();
		
		System.out.println("Bolas restantes: " + maquina.contagem);
	}

}
