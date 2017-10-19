package Practica7;


public class Main {
    
    //********
    //Examen Reporte 2
    //********
    public static String reverseParentheses(String a){
        Stack<Character> pila=new Stack<Character>();
        String c="";
        for(int i=0;i<a.length();i++){
            char b=a.charAt(i);
            if('('==b){
                char d=a.charAt(i+1);
                char e=a.charAt(i+2);
                pila.push(d);
                pila.push(e);
                i+=2;
            } else if(')'==b){
                c+=pila.pop();
                c+=pila.pop();
            } else{
                
                c+=b;
            }
        }
        
        return c;
    }
	
	//public static String checkForBalance(String expression) {
            
            /*Stack<Character> pila = new Stack<Character>();
            String b="";
            for(int i=0; i<=expression.length()-1; i++){
                    char a=expression.charAt(i);
                    //System.out.println(a);
                    if('['==a || '{'==a || '('==a){
                        pila.push(a);
                    } else if(']'==a){
                        if(pila.empty()){
                            System.out.println(expression);
                            return b+"^ Missing Left Symbol";
                        } else if('['!=pila.pop()){
                            System.out.println(expression);
                            return b+"^ Missing Left Symbol";
                        }
                    } else if('}'==a){
                         if(pila.empty()){
                            System.out.println(expression);
                            return b+"^ Missing Left Symbol";
                        } else if('{'!=pila.pop()){
                            System.out.println(expression);
                            return b+"^ Missing Left Symbol";
                        }
                    } else if(')'==a){
                         if(pila.empty()){
                            System.out.println(expression);
                            return b+"^ Missing Left Symbol";
                        } else if('('!=pila.pop()){
                            System.out.println(expression);
                            return b+"^ Missing Left Symbol";
                        }
                    } 
                    b+=" ";
            }
            if(!pila.empty()){
                System.out.println(expression);
                return b+"^ Missing Right Symbol";
            }
            return "Expression is Balanced";
	}*/
	
	/*public static String postfixEval(String expression) {
		Stack<Integer> pila = new Stack<Integer>();
                String r = "";
                for(int i=0;i<expression.length();i++){
                    char a=expression.charAt(i);
                    //System.out.println(a);
                    if('+'==a){
                        if(pila.empty()){
                            return "The expression has too many operators";
                        } else {
                            int y = pila.pop();
                            if(pila.empty()){
                                return "The expression has too many operators";
                            } else {
                                int x = pila.pop()+y;
                                r = String.valueOf(x);
                                pila.push(x);
                            }
                            
                        }
                        
                    } else if('-'==a){
                        if(pila.empty()){
                            return "The expression has too many operators";
                        } else {
                            int y = pila.pop();
                            if(pila.empty()){
                                return "The expression has too many operators";
                            } else {
                                int x = pila.pop()-y;
                                r = String.valueOf(x);
                                pila.push(x);
                            }
                            
                        }
                        
                    } else if('*'==a){
                        if(pila.empty()){
                            return "The expression has too many operators";
                        } else {
                            int y = pila.pop();
                            if(pila.empty()){
                                return "The expression has too many operators";
                            } else {
                                int x = pila.pop()*y;
                                r = String.valueOf(x);
                                pila.push(x);
                            }
                            
                        }
                        
                    } else if('/'==a){
                        if(pila.empty()){
                            return "The expression has too many operators";
                        } else {
                            int y = pila.pop();
                            if(pila.empty()){
                                return "The expression has too many operators";
                            } else {
                                int x = pila.pop()/y;
                                r = String.valueOf(x);
                                pila.push(x);
                            }
                            
                        }
                        
                    } else if(Character.isDigit(a)){
                        int x=Character.getNumericValue(a);
                        pila.push(x);
                    }
                }
                if(!pila.empty())
                    return "The experession has too many operands";
		return r;
	}
	
	public static void fibonacci(int n) {
		Queue<Integer> fila = new Queue<Integer>();
                fila.offer(1);
                fila.offer(1);
                for(int i=0; i<20;i++){
                    int a=fila.remove();
                    int b=fila.remove();
                    System.out.print(a +" ");
                    fila.offer(b);
                    fila.offer(a+b);
                }
                
                
	}*/
	
	public static void main(String[] args) {
            
            System.out.println(reverseParentheses("¡Mi examen de estructura de datos!"));
            System.out.println(reverseParentheses("a(bc)de"));
            System.out.println(reverseParentheses("(ab)(cd)(ef)"));
		/*System.out.println("Testing balanced symbols");
		System.out.println(checkForBalance("t = arr[3] + a) - 4"));
		System.out.println(checkForBalance("if (arr(3] < 4)"));
		System.out.println(checkForBalance("System.out.println(std.charAt(3);"));
		System.out.println(checkForBalance("while (i > 100) { sum += i; i++; }"));
		System.out.println();
		
		System.out.println("Testing postfix evaluation");
		System.out.println("4 3 5 * + => " + postfixEval("4 3 5 * +"));
		System.out.println("1 2 * 3  4 / - => " + postfixEval("1 2 * 3 4 / -"));
		System.out.println("1 2 * 3 * 4 * 5 * 6 * => " + postfixEval("1 2 * 3 * 4 * 5 * 6 *"));
		System.out.println("1 2 3 * 4 + 5 / + => " + postfixEval("1 2 3 * 4 + 5 / +"));
		System.out.println("2 2 * 4 1 * 3 * - 2 1 * / => " + postfixEval("2 2 * 4 1 * 3 * - 2 1 * /"));
		System.out.println("3 8 + * 9 => " + postfixEval("3 8 + * 9"));
		System.out.println("9 8 + 7 => " + postfixEval("9 8 + 7"));
		System.out.println();
		
		System.out.println("Testing Fibonacci sequence");
		fibonacci(20);
		System.out.println();
		System.out.println();
		System.out.println("Testing the Printer class");
		Printer printer = new Printer();
		printer.printDocument("gato.jpg");
		printer.printDocument("tarea.docx");
		printer.printDocument("meme.png");
		try {
			printer.runPrinter();			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println();*/
                
	}
}
