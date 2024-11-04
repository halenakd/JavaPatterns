
public class Esgotado implements State {
	MaquinaBolinhas maquinaBolinhas;
	
	public Esgotado(MaquinaBolinhas maquinaBolinhas) {
		this.maquinaBolinhas = maquinaBolinhas;
	}
	
	public void inserirMoeda() {
		System.out.println("Não há bolinhas disponíveis para compra");
	}
	
	public void ejetarMoeda() {
		System.out.println("Você ainda não inseriu uma moeda");
	}
	
	public void virarManivela() {
		System.out.println("Você virou, mas não há nenhuma moeda");
	}
	
	public void entregar() {
		System.out.println("Você precisa pagar primeiro, mas a compra não está disponível");
	}
	
	public void reabastescer(int numeroBolinhasNovas) {
		System.out.println("A máquina foi reabastescida e está pronta para vender mais bolinhas");
		maquinaBolinhas.contagem = numeroBolinhasNovas;
		maquinaBolinhas.setState(maquinaBolinhas.getSemCredito());
	}
}
