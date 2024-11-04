import java.util.Iterator;

public class ListaDuplaInteiros implements Iterable<Integer> {
	NoListaDupla head;
    NoListaDupla tail;
	
	public ListaDuplaInteiros() {
        head = null;
        tail = null;
    }
	
	public void inserirInicio(int valor) {
		NoListaDupla novoNo = new NoListaDupla(valor);
        if (isEmpty()) {
            head = novoNo;
            tail = novoNo;
        } else {
            novoNo.setProx(head);
            head.setAnterior(novoNo);
            head = novoNo;
        }
	}
	
	public void inserirFim(int valor) {
		NoListaDupla novoNo = new NoListaDupla(valor);
        if (isEmpty()) {
            head = novoNo;
            tail = novoNo;
        } else {
            novoNo.setAnterior(tail);
            tail.setProx(novoNo);
            tail = novoNo;
        }
	}
	
	public boolean isEmpty() {
		return head == null;
	}
	
	public void clear() {
		head = null;
        tail = null;
	}
	
	public int size() {
		int count = 0;
        NoListaDupla current = head;
        while (current != null) {
            count++;
            current = current.getProx();
        }
        return count;
	}
	
	public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            private NoListaDupla current = head;

            @Override
            public boolean hasNext() {
                return current != null;
            }

            @Override
            public Integer next() {
                if (!hasNext()) {
                	System.out.println("Não existe um elemento anterior");
                }
                int info = current.getInfo();
                current = current.getProx();
                return info;
            }
        };
    }
	
	public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        NoListaDupla current = head;
        while (current != null) {
            sb.append(current.getInfo());
            if (current.getProx() != null) {
                sb.append(", ");
            }
            current = current.getProx();
        }
        sb.append("]");
        return sb.toString();
    }
}
