package Practica2;


import java.util.NoSuchElementException;


public class SLinkedList<E> implements List<E> {
	private SNode<E> top;
	private int size;
	
	public SLinkedList() {
		top = new SNode<E>();
		size = 0;
	}

	public void addFirst(E e) {
		// TODO Auto-generated method stub
                SNode<E> nn = new SNode<E>(e);
                nn.next = top.next;
                top.next = nn;
                size++;
		
	}

	public void addLast(E e) {
		// TODO Auto-generated method stub
		SNode<E> nn = new SNode<E>(e);
                SNode<E> actual = top;
                while(actual.next != null)
                    actual = actual.next;       
                actual.next = nn;
                size++;
                
	}

	public void add(int index, E element) {
		// TODO Auto-generated method stub
		SNode<E> nn = new SNode<E>(element);
                SNode<E> actual = top;
                for(int i=0; i<index; i++){
                    actual = actual.next;
                }
                actual.next = nn;
                size++;                                
        }
                
	

	public E removeFirst() {
		// TODO Auto-generated method stub
                if (top.next == null)
                    throw new NoSuchElementException();
        
                SNode<E> nodeToRemove = top.next;
                top.next = nodeToRemove.next;
                nodeToRemove.next = null;
                size--;
                return nodeToRemove.value;
		
	}

	public E removeLast() {
		// TODO Auto-generated method stub
		if (top.next == null)
                    throw new NoSuchElementException();
        
                SNode<E> actual = top;
                while(actual.next.next != null)
                    actual=actual.next;
        
                SNode<E> nodeToRemove = actual.next;
                actual.next = null;
        
                size--;
                return nodeToRemove.value;
	}

	public E remove(int index) {
		// TODO Auto-generated method stub
                if (top.next == null)
                    throw new NoSuchElementException();
                if (index<size || index>size)
                    throw new IndexOutOfBoundsException();
                            
                SNode<E> actual = top;
                for(int i=0; i<index; i++){
                    actual = actual.next;
                }
                SNode<E> ntr = actual.next;
                actual.next = null;
                size--;
		return ntr.value;
	}

	public boolean remove(Object o) {
		// TODO Auto-generated method stub
                if (top.next == null)
                    throw new NoSuchElementException();
                
                int index = 0;
                if(o==null){
                    for(SNode<E> x = top.next; x!= null; x =  x.next){
                        if(x.value == null){
                            top.next = null;
                            return true;
                        }
                        index++;
                    }
                } else{
                    for(SNode<E> x = top.next; x != null; x = x.next){
                        if (o.equals(x.value)){
                            top.next = null;
                            return true;
                        }
                        index++;
                    }
                }
                
		return false;
	}

	public E getFirst() {
		// TODO Auto-generated method stub
		if (top.next == null){
                throw new NoSuchElementException();
                }       
            return top.next.value;
	}

	public E getLast() {
		// TODO Auto-generated method stub
		if (top.next == null){
                    throw new NoSuchElementException();
                }
        
                SNode<E> current = top;
                while(current.next.next != null)
                    current=current.next;
                return current.next.value;
	}

	public E get(int index) {
		// TODO Auto-generated method stub
		if(top.next == null) {
			throw new NoSuchElementException();
		}

		SNode<E> actual= top;
		for (int i=0; i<=index; i++) {
			actual=actual.next;
		}
		return actual.value;
	}

	public E set(int index, E element) {
		// TODO Auto-generated method stub
		SNode<E> actual= top;
		for (int i=0; i<=index; i++) {			 
                        actual=actual.next;			
		}
                actual.value= element;
                return actual.value;
	}

	public boolean contains(E e) {
		// TODO Auto-generated method stub
		if (top.next == null)
                    throw new NoSuchElementException();
                
                int index = 0;
                if(e==null){
                    for(SNode<E> x = top.next; x!= null; x =  x.next){
                        if(x.value == null)
                            return true;
                    index++;
                    }
                } else{
                    for(SNode<E> x = top.next; x != null; x = x.next){
                        if (e.equals(x.value))
                            return true;
                        index++;
                    }
                }
                
		return false;
	}

	public int indexOf(Object o) {
		// TODO Auto-generated method stub
                
		int index = 0;
                if(o==null){
                    for(SNode<E> x = top.next; x!= null; x =  x.next){
                        if(x.value == null)
                            return index;
                        index++;
                    }
                } else{
                    for(SNode<E> x = top.next; x != null; x = x.next){
                        if (o.equals(x.value))
                            return index;
                        index++;
                    }
                }
                return -1;
	}

	public void clear() {
		// TODO Auto-generated method stub
		top.next = null;
                size=0;
	}

	public int size() {
		// TODO Auto-generated method stub
                return size;	
        }

	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return size()==0;
	}

	public Object[] toArray() {
		// TODO Auto-generated method stub
                Object[] miarray = SLinkedList<E>(5);
                miarray = SLinkedList<E>.toArray(miarray);
		return null;
	}
	
        @Override
	public String toString() {
		// TODO Auto-generated method stub
		if (top.next == null)
                    return "[]";
        
                SNode<E> current = top.next;
                String returnValue = "[" + current.value;
                while (current.next != null){
                    current = current.next;
                    returnValue += ", " + current.value;
                }
                returnValue += "]";
                return returnValue;
            }
}
