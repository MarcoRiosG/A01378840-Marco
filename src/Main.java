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
        int[] lista={1,4,7,9,10,143};
               binarySearch(lista); 
    
        
        
    }
}

