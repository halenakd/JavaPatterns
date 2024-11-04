import java.util.Random;

public class ComCredito implements State {
	Random vencedorAleatorio = new Random(System.currentTimeMillis());
	MaquinaBolinhas maquinaBolinhas;
	
	public ComCredito(MaquinaBolinhas maquinaBolinhas) {
		this.maquinaBolinhas = maquinaBolinhas;
	}
	
	public void inserirMoeda() {
		System.out.println("Já há uma moeda dentro da máquina");
	}
	
	public void ejetarMoeda() {
		System.out.println("Sua moeda foi ejetada");
		maquinaBolinhas.setState(maquinaBolinhas.getSemCredito());
	}
	
	public void virarManivela() {
		System.out.println("Você virou a manivela e comprou uma bolinha");
		int vencedor = vencedorAleatorio.nextInt(10);
		if((vencedor == 0) && (this.maquinaBolinhas.getContagem() > 1)) {
			maquinaBolinhas.setState(maquinaBolinhas.getVencedor());
		} else {
		maquinaBolinhas.setState(maquinaBolinhas.getVendido());
		}
	}
	
	public void entregar() {
		System.out.println("Você precisa virar a manivela primeiro");
	}
}
