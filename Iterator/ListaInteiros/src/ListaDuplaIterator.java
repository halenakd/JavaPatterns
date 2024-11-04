public class ListaDuplaIterator implements Iterator<Integer> {
	private NoListaDupla current;
    private int index;
    private ListaDuplaInteiros lista;
	
    public ListaDuplaIterator(ListaDuplaInteiros lista) {
        this.lista = lista;
        first();
    }
    
	public void first() {
		current = lista.head;
        index = 0;
	}
	
	public void last() {
		current = lista.tail;
        index = lista.size() - 1;
	}
	
	public boolean hasNext() {
		return current != null;
	}
	
	public boolean hasPrevious() {
		return current != null;
	}
	
	public Integer next() {
		if (!hasNext()) {
			System.out.println("Não existe um próximo elemento");
        }
        int info = current.getInfo();
        current = current.getProx();
        index++;
        return info;
	}
	
	public int nextIndex() {
		if (!hasNext()) {
            return lista.size();
        }
        return index + 1;
	}
	
	public Integer previous() {
		if (!hasPrevious()) {
			System.out.println("Não existe um elemento anterior");
        }
        int info = current.getInfo();
        current = current.getAnterior();
        index--;
        return info;
	}
	
	public int previousIndex() {
		if (!hasPrevious()) {
            return -1;
        }
        return index - 1;
	}

}
