
public class SemCredito implements State {
	MaquinaBolinhas maquinaBolinhas;
	
	public SemCredito(MaquinaBolinhas maquinaBolinhas) {
		this.maquinaBolinhas = maquinaBolinhas;
	}
	
	public void inserirMoeda() {
		System.out.println("Você inseriu uma moeda");
		maquinaBolinhas.setState(maquinaBolinhas.getComCredito());
	}
	
	public void ejetarMoeda() {
		System.out.println("Você ainda não inseriu uma moeda");
	}
	
	public void virarManivela() {
		System.out.println("Você virou, mas não há nenhuma moeda");
	}
	
	public void entregar() {
		System.out.println("Você precisa pagar primeiro");
	}
}
