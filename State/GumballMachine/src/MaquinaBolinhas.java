
public class MaquinaBolinhas {
	State esgotado;
	State semCredito;
	State comCredito;
	State vendido;
	State vencedor;
	
	State state;
	int contagem = 0;
	
	public MaquinaBolinhas(int numeroBolinhas) {
		esgotado = new Esgotado(this);
		semCredito = new SemCredito(this);
		comCredito = new ComCredito(this);
		vendido = new Vendido(this);
		vencedor = new Vencedor(this);
		
		this.contagem = numeroBolinhas;
		
		if(numeroBolinhas > 0) {
			state = semCredito;
		} else {
			state = esgotado;
		}
	}
	
	public void setState(State state) {
		this.state = state;
	}
	
	public State getEsgotado() {
		return this.esgotado;
	}
	
	public State getSemCredito() {
		return this.semCredito;
	}
	
	public State getComCredito() {
		return this.comCredito;
	}
	
	public State getVendido() {
		return this.vendido;
	}
	
	public State getVencedor() {
		return this.vencedor;
	}
	
	public int getContagem() {
		return this.contagem;
	}
	
	public void inserirMoeda() {
		state.inserirMoeda();
	}
	
	public void ejetarMoeda() {
		state.ejetarMoeda();
	}
	
	public void virarManivela() {
		state.virarManivela();
		state.entregar();
	}
	
	public void liberarBolinha() {
		System.out.println("Lá vem " + 1 + " bolinha!");
		contagem = contagem - 1;
		if(contagem != 0) {
			this.setState(this.getSemCredito());
		} else {
			this.setState(this.getEsgotado());
		}
	}
}
