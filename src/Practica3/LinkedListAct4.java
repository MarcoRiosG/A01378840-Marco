package Practica3;


//Marco Antonio Rios Gutierrez A01378840


import java.util.NoSuchElementException;

public class LinkedListAct4<E> implements List<E> {
	private Node<E> header;
	private int size;
	
        
	public LinkedListAct4() {
		header = new Node<E>();
		size = 0;
	}
	
        
	/**
	 * Gets the node at the specified index.
	 * @param index the index of the node to get
	 * @return the node at the specified position
	 * @throws IndexOutOfBoundsException if the index is out of range (index < 0 || index >= size())
	 */
	private Node<E> node(int index) {
		if(index < 0 || index >= size()) {
			throw new IndexOutOfBoundsException();
		}
		
		if (index < (size >> 1)) {
            Node<E> x = header.next;
            for (int i = 0; i < index; i++)
                x = x.next;
            return x;
        } else {
            Node<E> x = header.prev;
            for (int i = size - 1; i > index; i--)
                x = x.prev;
            return x;
        }
	}
        
        
        //Método de la actividad extra del problema de Josephus
        
        public E josephus(int index){
            if(header.next == header) 
                throw new NoSuchElementException();
            
            Node<E> quitar = node(index);
            
            while(size!=1){
                Node<E> previo = node(index).prev;
                Node<E> siguiente = node(index).next;
                quitar.prev = null;
                quitar.next=null;
                
                previo.next=siguiente;
                siguiente.prev=previo;
                
                quitar = node(index+index);
                size--;
            }
            Node<E> sobreviviente = header.next; 
            
            return sobreviviente.value;
        }

        //Aqui finaliza el metodo de la actividad extra, el resto es la practica 3
        
	public void addFirst(E e) {
		// TODO Auto-generated method stub
                Node<E> newElement = new Node<E>(e);
            
            Node<E> firstElement = header.next;
            newElement.next=firstElement;
            firstElement.prev=newElement;
            
            newElement.prev=header;
            header.next = newElement;
            size++;
            
	}

	public void addLast(E e) {
		// TODO Auto-generated method stub
		Node<E> newElement = new Node<E>(e);
            
            Node<E> ultimo = header.prev;
            newElement.next=header;
            header.prev=newElement;
            
            ultimo.next=newElement;
            newElement.prev = ultimo;
            size++;
	}


        public void add(int index, E element) {
		// TODO Auto-generated method stub
		if(index <0 || index >= size())
                throw new IndexOutOfBoundsException();
            
            if(index==size()){
                addLast(element);
            }else{
            Node<E> newNode = new Node<E>(element);
            Node<E> current = node(index);
            Node<E> previousNode = current.prev;
            
            newNode.prev = previousNode;
            previousNode= newNode;
            
            newNode.next = current;
            current.prev = newNode;
            size++;
            }
	}

	public E removeFirst() {
		// TODO Auto-generated method stub
		if(header.next == header) 
                   throw new NoSuchElementException();
 		
 		
 		Node<E> quitar = header.next;
 		Node<E> proximo = quitar.next;
                
                quitar.next = null;
 		quitar.prev = null;
 		header.next = proximo;
 		proximo.prev = header;
                
 		size--;
                
 		return quitar.value;
	}

	public E removeLast() {
		// TODO Auto-generated method stub
		if(header.next == header) 
                   throw new NoSuchElementException();
 		
 		
 		Node<E> quitar = header.prev;
 		Node<E> previo = quitar.prev;
                
                quitar.next = null;
 		quitar.prev = null;
 		header.prev = previo;
 		previo.next = header;
                
 		size--;
                
 		return quitar.value;
	}

       
	public E remove(int index) {
		// TODO Auto-generated method stub
		if(index <0 || index >= size())
                throw new IndexOutOfBoundsException();
            
            
            Node<E> quitar = node(index);
            Node<E> siguiente = quitar.next;
            Node<E> previo = quitar.prev;
            
            quitar.next = null;
            quitar.prev= null;
            
            previo.next = siguiente;
            siguiente.prev = previo;
            size--;
            
            return quitar.value;
	}

	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		int indice = indexOf(o);
 		
 		if(indice >= 0 && indice < size()) {
 			remove(indice);
 			return true;
 		}
 		
  		return false;
	}

	public E getFirst() {
		// TODO Auto-generated method stub
		if(header.next == header) 
                    throw new NoSuchElementException();
		
		
		return header.next.value;
	}

	public E getLast() {
		// TODO Auto-generated method stub
		if(header.next == header) 
                    throw new NoSuchElementException();
		
		
		return header.prev.value;
	}

	public E get(int index) {
		// TODO Auto-generated method stub
		if(index < 0 || index >= size()) 
                    throw new IndexOutOfBoundsException();
 		 		
 		Node<E> nodeToReturn = node(index);
 		
 		return nodeToReturn.value;
	}

	public E set(int index, E element) {
		// TODO Auto-generated method stub
		if(index < 0 || index >= size()) 
                    throw new IndexOutOfBoundsException();
 		 		
 		Node<E> cambio = node(index);
 		E currentValue = cambio.value;
 		cambio.value = element;
 		
 		return currentValue;
	}

	public boolean contains(E e) {
		// TODO Auto-generated method stub
		int indice = indexOf(e);
 		
 		if(indice >= 0 && indice < size()) 
                    return true;
 		 		
  		return false;
	}

	public int indexOf(Object o) {
		// TODO Auto-generated method stub
		int indice = 0;
 		
 		if(o == null) {
 			for (Node<E> x = header.next; x != header; x = x.next) {
                            if (x.value == null)
                                return indice;
                            indice++;
                        }
 		} else {
 			for (Node<E> x = header.next; x != header; x = x.next) {
                            if (o.equals(x.value))
                                return indice;
                            indice++;
                        }
 		}
 		
 		return -1;
	}

	public void clear() {
		// TODO Auto-generated method stub
		header.next = header;
 		header.prev = header;
                
 		size = 0;
	}

	public int size() {
		// TODO Auto-generated method stub
		return size;
	}

	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return size() == 0;
	}

	public Object[] toArray() {
		// TODO Auto-generated method stub
		Object[] arreglo = new Object[size];
 		
 		int indice = 0;
 		for(Node<E> x = header.next; x != header; x = x.next)
                    arreglo[indice++] = x.value;
 		
 		return arreglo;
	}
	
	@Override
	public String toString() {
		if(header.next == header) {
 			return "[]";
 		}
 		
 		Node<E> actual = header.next;
                
 		String str = "[" + actual.value;
 		while(actual.next != header) {
                    actual = actual.next;
                    str += ", " + actual.value;
 		}
 		str += "]";
 		
 		return str;
	}
}
