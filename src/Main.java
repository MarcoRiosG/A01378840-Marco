
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author marki
 */
public class Main {
    
    

    /*public static int linealSearch(int lista[]){
         
        int t= 5;
            for(int x=0;x>=lista.length;x++){
                if(lista[x]==t)
                    return x;
                if(lista[x]<t)
                    return -1;
                    
            }
            return -1;
        }
    
    public static int binarySearch(int lista[]){
        int t=10;
        int min = 0;
        int max = lista.length-1;
        while(min<=max){
            int mid = (min+max)/2;
            if (t==lista[mid]){
            System.out.println(mid);
                
                return mid;
            }else if (t<lista[mid]){
                max=mid-1;
            }else if (t>lista[mid]){
                min=mid+1;
            }
        }
        return -1;
    }
    */
	
	private static void shiftContentsRight(int lista[], int start, int end) {		                
		int k=lista[end];
		for(int x=end; x >start; x--){
			lista[end] = lista[x-1];
                        end--;
                }
		lista[start] = k;
	}
    
    public static void insertionSort(int lista[]){
        int i=1;
        for (i=1;i<lista.length;i++){
            
            int j;
            for(j=0;j<i;j++){
                if(lista[i]<lista[j]){
                    shiftContentsRight(lista,j,i);
                }                
            }          
        }
        System.out.println(Arrays.toString(lista));
    }
    
    public static void selectionSort(int lista[]){
        int i;
        for(i=0;i<lista.length;i++){
            int j;
            int s=lista[i];
            for(j=i;j<lista.length;j++){
                if(lista[j]<s)
                    s=lista[j];
                
            }
            if(s!=lista[i]){
                lista[j]=lista[i];
                lista[i]=s;
            }
        }
             System.out.println(Arrays.toString(lista));   
    }
    
    public static void bubbleSort(int lista[]){
        boolean not_sorted = true;
        while(not_sorted){
            not_sorted=false;
            for(int x=1;x<lista.length;x++){
                if(lista[x]<lista[x-1]){
                    int t=lista[x];
                    lista[x]=lista[x-1];
                    lista[x-1]=t;
                    not_sorted=true;
                }
            }
        }
        System.out.println(Arrays.toString(lista));
    }
    public static void makeHeap(int lista[]){
        for(int i=0; i<lista.length;i++){
            int index=i;
            while(index !=0){
                int parent = (index-1)/2;
                if(lista[index]<=lista[parent])
                    break;
                
                int temp = lista[index];
                lista[index]=lista[parent];
                lista[parent]= temp;
                
                index=parent;
            }
        }
    }
    
    public static int removeTopItem(int lista[], int count){
        int result = lista[0];
        
        lista[0]=lista[count-1];
        int index=0;
        while(true){
            int child1=2*index+1;
            int child2=2*index+2;
            
            if(child1>=count){
                child1=index;
            }
            
            if(child2>=count){
                child2=index;
            }
        
            if(lista[index]>=lista[child1] && lista[index]>=lista[child2]){
                break;
            }
            
            int swapChild=child1;
            if(lista[child2]>lista[child1]){
                swapChild=child2;
            }
            
            int temp=lista[index];
            lista[index]=lista[swapChild];
            lista[swapChild]=temp;
        }
        return result;
    }
    
    public static void heapSort(int lista[]){
        makeHeap(lista);
        for(int x=lista.length; x>0;x--){
            int t = removeTopItem(lista, x);
            lista[x-1] = t;
        }
        
    }
    
    public static void quickSort(int lista[], int inicio, int fin){
        if(inicio>=fin)
            return;
        
        int divisor=lista[inicio];
        
        Stack<Integer> menores = new Stack<Integer>();
        Stack<Integer> mayores = new Stack<Integer>();
        
        for(int i=inicio+1;i<=fin;i++){
            if(lista[i]<divisor)
                menores.push(lista[i]);
            else
                mayores.push(lista[i]);
                        
        }
        
        int j=inicio;
        
        while(!menores.empty()){
            lista[j++]=menores.pop();
        }
        
        int middle=j++;
        lista[middle]=divisor;
        while(!mayores.empty()){
            lista[j++]=mayores.pop();
        }
                
        quickSort(lista, inicio, divisor-1);
        quickSort(lista, divisor+1, fin);
        
    }
    
    public static void mergeSort(int[] lista, int[] temporal, int inicio, int fin){
        
        if(inicio>=fin)
            return;
        
        int mitad = (inicio+fin)/2;
        
        mergeSort(lista,temporal,inicio,mitad);
        mergeSort(lista,temporal,mitad+1,fin);
        
        int indiceizq=inicio;
        int indiceder=mitad+1;
        int indicetemp=indiceizq;
        
        
        
        while(indiceizq<=mitad && indiceder<=fin){
            if(lista[indiceizq] <=lista[indiceder]){
                temporal[indicetemp] =lista[indiceizq];
                indiceizq+=1;
            } else {
                temporal[indicetemp] =lista[indiceder];
                indiceder+=1;

            }
            indicetemp++;
        }
        
        
        for(int i=indiceizq; i<=mitad; i++){
            temporal[indicetemp]=lista[i];
            indicetemp+=1;
        }
        
        for(int i=indiceder; i<=fin; i++){
            temporal[indicetemp]=lista[i];
            indicetemp+=1;
        }
        
        
        
        for(int i=inicio;i<=fin;i++){
            lista[i]=temporal[i];
        }
        
        
        
        
    }
    
    public static void main(String[] args){
        /*IntegerLinkedList iList = new IntegerLinkedList();
        System.out.println(iList);
        iList.addFirst(5);
        System.out.println(iList);
        iList.addFirst(10);
        System.out.println(iList);
        iList.addLast(7);        

        System.out.println(iList);*/
        
        /*SLinkedList<String> sList = new SLinkedList<String>();
        sList.addFirst("World");
        sList.addFirst("Hello");
        System.out.println(sList);
        
        SLinkedList<Integer> iList = new SLinkedList<Integer>();
        for (int i=0;i<=10;i++)
            iList.addFirst(i);
        System.out.println(iList);
        
        while(!iList.isEmpty()){
            iList.removeFirst();
            System.out.println(iList);
        */
        
        /*while(!iList.isEmpty()){
            iList.removeLast();
            System.out.println(iList);
        }
        
        for(int i=0;i<10;i++)
            iList.addLast(i*2);
        
        System.out.println(iList);
        System.out.println(iList.getFirst());
        System.out.println(iList.getLast());*/
        
        //Busqueda lineal
        int[] lista={1,9,7,10,143,4};
        int[] temporal=new int[lista.length];
               //binarySearch(lista); 
               /*insertionSort(lista);
               selectionSort(lista);
               bubbleSort(lista);*/
               /*System.out.println(Arrays.toString(lista));
               makeHeap(lista);
               System.out.println(Arrays.toString(lista));
               System.out.println(removeTopItem(lista, lista.length));
               System.out.println(Arrays.toString(lista));*/
        //heapSort(lista);
        System.out.println(Arrays.toString(lista));
        //quickSort(lista,0,lista.length);
        //System.out.println(Arrays.toString(lista));
        mergeSort(lista,temporal,0,lista.length-1);
        System.out.println(Arrays.toString(lista));
    }
}

