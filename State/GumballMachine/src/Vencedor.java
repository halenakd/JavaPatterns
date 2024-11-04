
public class Vencedor implements State {
	MaquinaBolinhas maquinaBolinhas;
	
	public Vencedor(MaquinaBolinhas maquinaBolinhas) {
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
		 System.out.println("Você é um dos vencedores!!! Você ganhou duas bolinhas pelo preço de uma");
		 this.maquinaBolinhas.liberarBolinha();
		 if (this.maquinaBolinhas.getContagem() == 0) {
			 this.maquinaBolinhas.setState(this.maquinaBolinhas.getEsgotado());
		 } else {
			 this.maquinaBolinhas.liberarBolinha();
			 if (this.maquinaBolinhas.getContagem() > 0) {
				 this.maquinaBolinhas.setState(this.maquinaBolinhas.getSemCredito());
			 } else {
				 System.out.println("Ops, bolinhas esgotadas!");
				 this.maquinaBolinhas.setState(this.maquinaBolinhas.getEsgotado());
			 }
		 }
	}
}
