//Marco Antonio Rios Gutierrez A01378840
//Alan Sevilla Martinez A01378571

package Practica6;

public class Queue<E> implements IQueue<E> {
	private LinkedList<E> queue;
	
	public Queue() {
		queue = new LinkedList<E>();
	}

	@Override
	public void offer(E e) {
		// TODO Auto-generated method stub
		
                queue.addFirst(e);
                
	}

	@Override
	public E remove() {
		// TODO Auto-generated method stub
                
                
		return queue.removeLast();
	}

	@Override
	public E element() {
		// TODO Auto-generated method stub
                
		return queue.getLast();
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return size() == 0;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		queue.clear();
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return queue.size();
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return queue.toArray();
	}

}
