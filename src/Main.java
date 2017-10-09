
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
    
    

    public static int linealSearch(int lista[]){
         
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
        int[] lista={1,9,7,10,143, 4};
               binarySearch(lista); 
               insertionSort(lista);
               selectionSort(lista);
        
    }
}

