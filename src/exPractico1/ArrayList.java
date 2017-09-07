package exPractico1;


import java.util.NoSuchElementException;

public class ArrayList<E> implements List<E> {
	public Object[] top;
	private int size;
	private int initialCapacity = 5;
	private int extraCapacity = 5;
	public Object[] listaini;
	/**
	 * Creates a new ArrayList instance with the default initial capacity.
	 */
	public ArrayList() {
		top = new Object[initialCapacity];
		size = 0;
	}
	
	/**
	 * Increases the capacity of this ArrayList instance so that it 
	 * can hold at least extraCapacity elements more.
	 * This method allocates a new array with greater capacity than the
	 * current one (top.length + extraCapacity) and copies all elements
	 * from top to the newly allocated array. The reference top is then
	 * updated to point to the new array. 
	 * @param extraCapacity increase the capacity of this ArrayList by this amount
	 */
	private void reserveExtraCapacity(int extraCapacity) {
            
            initialCapacity+=extraCapacity;
            listaini = new Object[initialCapacity];
            listaini = top;
            top = listaini;
            
	}
	
	/**
	 * Increases the capacity of this list if its size equals the length of the array
	 * where the data is stored. This method calls reserveExtraCapacity when (size() >= top.length).
	 * reserveExtraCapacity is called using the instance variable extraCapacity.
	 */
	private void ensureCapacity() {
            
            if(size() >= top.length)
                reserveExtraCapacity(extraCapacity);
            
	}
	
	/**
	 * Shifts elements in the array (top) to the right, starting at the given position.
	 * @param index the position in which the shift will begin
	 * @throws IndexOutOfBoundsException if the index is out of range (index < 0 || index > size())
	 */
	private void shiftContentsRight(int index) {
            
            if(index < 0 || index >= size()) 
			throw new IndexOutOfBoundsException();
            
            int indecs=index;
            int x;
            for(x=0;x<index;x++)
                top[x]=top[x];
            
            for(x=index+1;x<=top.length;x++){
                top[x]=top[index];
                index++;
            }
            
            top[indecs]=null;
            
            
	}
	
	@Override
	public void addFirst(E e) {
            
            //if(size+1 < 0 || size+1 >= size()) 
		//	throw new IndexOutOfBoundsException();
            
            Node<E> newElement = new Node<E>(e);
            
            for(int x=1;x>top.length;x++)
                top[x]=top[x--];
            
            top[0]=newElement;
	}

	@Override
	public void addLast(E e) {
            
            //if(size+1 < 0 || size+1 >= size()) 
		//	throw new IndexOutOfBoundsException();
            
            Node<E> newElement = new Node<E>(e);
            
            int x=size;
            top[x]=newElement;
	}

	@Override
	public void add(int index, E element) {
            
            if(index < 0 || index >= size()) 
			throw new IndexOutOfBoundsException();
            
            Node<E> newElement = new Node<E>(element);
            
            int indecs=index;
            for(int x=index+1;x<=top.length;x++){
                top[x]=top[index];
                index++;
            }
            
            top[indecs]=newElement;
            
	}

	@Override
	public E getFirst() {
		return null;
	}

	
	@Override
	public E getLast() {
		return null;
	}

	
	@Override
	public E get(int index) {
		return null;
	}

	@Override
	public E set(int index, E element) {
		return null;
	}

	@Override
	public void clear() {
            
            size=0;
            
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public boolean isEmpty() {
		return size() == 0;
	}

	@Override
	public String toString() {
            
            if(size == 0) {
 			return "[]";
 		}
 		
 		Object actual = top[0];
                
                int x=1;
 		String str = "[" + actual;
 		while(x <=size) {
                    actual = top[x];
                    str += ", " + actual;
                    x++;
 		}
 		str += "]";
 		
 		return str;
}
}
