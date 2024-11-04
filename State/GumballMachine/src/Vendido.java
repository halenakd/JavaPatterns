
public class Vendido implements State {
	MaquinaBolinhas maquinaBolinhas;
	
	public Vendido(MaquinaBolinhas maquinaBolinhas) {
		this.maquinaBolinhas = maquinaBolinhas;
	}
	
	public void inserirMoeda() {
		System.out.println("Você já comprou uma bolinha e ela já está sendo liberada");
	}
	
	public void ejetarMoeda() {
		System.out.println("Você já virou a manivela e não pode mais ejetar sua moeda");
	}
	
	public void virarManivela() {
		System.out.println("Você já virou a manivela e sua bolinha já está vindo");
	}
	
	public void entregar() {
		this.maquinaBolinhas.liberarBolinha();
		if (maquinaBolinhas.getContagem() > 0) {
			 this.maquinaBolinhas.setState(maquinaBolinhas.getSemCredito());
		 } else {
		 System.out.println("Ops, bolinhas esgotadas!");
		 this.maquinaBolinhas.setState(maquinaBolinhas.getEsgotado());
		 }
	}
}
