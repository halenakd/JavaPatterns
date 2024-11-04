
public class NoListaDupla {
	private Integer info;
    private NoListaDupla ant;
    private NoListaDupla prox;
	
	public NoListaDupla(Integer info) {
        this.info = info;
        this.ant = null;
        this.prox = null;
    }
	
	public void setInfo(Integer info) {
		this.info = info;
	}
	
	public Integer getInfo() {
		return this.info;
	}
	
	public void setProx(NoListaDupla prox) {
		this.prox = prox;
	}
	
	public NoListaDupla getProx() {
		return this.prox;
	}
	
	public void setAnterior(NoListaDupla ant) {
		this.ant = ant;
	}
	
	public NoListaDupla getAnterior() {
		return this.ant;
	}
}
