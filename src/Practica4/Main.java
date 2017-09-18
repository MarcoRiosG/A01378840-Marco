
//Marco Antonio Rios Gutierrez A01378840
//Alan Sevilla Martinez A01378571

package Practica4;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		
		System.out.println("Testing array reversing");
		int[] inputArray = {1, 2, 3, 4, 5};
		
		// TODO: push every item in inputArray into a Stack
		
		int[] outputArray = new int[inputArray.length];
                
                Stack<Integer> pila = new Stack<Integer>();
                
                for(int x=0;x<inputArray.length;x++)
                    pila.push(inputArray[x]);
                    
                for(int x=0;x<inputArray.length;x++)
                    outputArray[x] = pila.pop();
                
		// TODO: pop every item in inputArray and save them in outputArray
		
		System.out.println("Input: " + Arrays.toString(inputArray));
		System.out.println("Output: " + Arrays.toString(outputArray));
		System.out.println();
		
		System.out.println("Testing train ordering");
		Stack<Integer> train = new Stack<Integer>();
		train.push(3);
		train.push(2);
		train.push(1);
		train.push(3);
		train.push(2);
		
		System.out.println("Train as it arrived to the station: " + Arrays.toString(train.toArray()));
		
		// TODO: sort the wagons in priority order
                Stack<Integer> h1 = new Stack<Integer>();
                Stack<Integer> h2 = new Stack<Integer>();
                Stack<Integer> h3 = new Stack<Integer>();
                
                /*
                Posible solucion en caso de haber más elementos aunque solo para los numeros 1,2,3
                Solo faltaría un sustituto para length que funcione con pilas
                for(int x=train.length-1;x>=0;x--){
                        if(train.peek()==1){
                            h1.push(train.pop());
                        }else if(train.peek()==2){
                            h2.push(train.pop());
                        }else if(train.peek()==3){
                            h3.push(train.pop());}
                */
                
                h2.push(train.pop());
                h3.push(train.pop());
                h1.push(train.pop());
                h2.push(train.pop());
                
                train.push(h3.pop());
                train.push(h2.pop());
                train.push(h2.pop());
                train.push(h1.pop());
		
		System.out.println("Train ordered by priority: " + Arrays.toString(train.toArray()));
		System.out.println();
		
		Stack<Integer> towerOne = new Stack<Integer>();
		Stack<Integer> towerTwo = new Stack<Integer>();
		Stack<Integer> towerThree = new Stack<Integer>();
		
		towerOne.push(3);
		towerOne.push(2);
		towerOne.push(1);
		
		System.out.println("At the beginning");
		System.out.println("Hanoi tower #1: " + Arrays.toString(towerOne.toArray()));
		System.out.println("Hanoi tower #2: " + Arrays.toString(towerTwo.toArray()));
		System.out.println("Hanoi tower #3: " + Arrays.toString(towerThree.toArray()));
		
		// TODO: run a simulation so that towerTwo ends with all discs in correct order.
                
                towerTwo.push(towerOne.pop());
                towerThree.push(towerOne.pop());
                towerThree.push(towerTwo.pop());
                towerTwo.push(towerOne.pop());
                towerOne.push(towerThree.pop());
                towerTwo.push(towerThree.pop());
                towerTwo.push(towerOne.pop());
                
		
		System.out.println("At the end");
		System.out.println("Hanoi tower #1: " + Arrays.toString(towerOne.toArray()));
		System.out.println("Hanoi tower #2: " + Arrays.toString(towerTwo.toArray()));
		System.out.println("Hanoi tower #3: " + Arrays.toString(towerThree.toArray()));
		System.out.println();
	}
}
