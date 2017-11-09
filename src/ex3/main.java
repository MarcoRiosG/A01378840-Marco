/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex3;

/**
 *
 * @author marki
 */
public class main {
    
    
    public static int maxDepth(String expression) {
             int depth=0;
             int maxdepth=0;
             Stack<Character> pila = new Stack<Character>();
             for(int i=0; i<=expression.length()-1; i++){
                     char a=expression.charAt(i);
                     if('('==a){
                         depth++;
                         if(maxdepth<depth)
                            maxdepth++;
                         pila.push(a);
                     
                     } else if(')'==a){
                         depth--;
                          if(pila.empty()){
                             return -1;
                         } else if('('!=pila.pop()){
                             return -1;
                         }
                     } 
             }
             if(!pila.empty()){
                 return -1;
             }
             return maxdepth;
 	}
    
   public static int shapeArea(int n){
       if(n==1){
           return 1;
       }
       
       return (4*(n-1))+shapeArea(n-1);
   }
   
   public static String allStar(String str){
       if (str.equals("")){
           return "";
       }
       if("".equals(str.substring(1)))
           return str.substring(0,1);
                   
       return str.substring(0,1)+"*"+allStar(str.substring(1));
   }
   
   public static String endX(String str){
        
        if (str.equals("")){
            return "";
        } else if (str.charAt(0) == 'x') {
            return endX(str.substring(1))+"x";
        } else {
            return str.charAt(0)+endX(str.substring(1));
        }
   }
    
    public static void main(String args[]){
        System.out.println(maxDepth("(p((q))((s)t))"));
        System.out.println(maxDepth(""));
        System.out.println(maxDepth("b)(c)()"));
        System.out.println(maxDepth("(b)((c)()"));
        System.out.println();
        System.out.println(shapeArea(1));
        System.out.println(shapeArea(2));
        System.out.println(shapeArea(3));
        System.out.println(shapeArea(4));
        System.out.println(shapeArea(5));
        System.out.println();
        System.out.println(allStar("hello"));
        System.out.println(allStar("abc"));
        System.out.println(allStar("ab"));
        System.out.println(allStar("a"));
        System.out.println();
        System.out.println(endX("a"));
        System.out.println(endX("x"));
        System.out.println(endX("rexx"));
        System.out.println(endX("xxhixx"));
        System.out.println(endX("xhixhix"));
        
    }
    
}
