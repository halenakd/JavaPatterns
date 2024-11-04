
interface Iterator<T> {
	void first();
	void last();
	boolean hasNext();
	boolean hasPrevious();
	T next();
	int nextIndex();
	T previous();
	int previousIndex();
}
