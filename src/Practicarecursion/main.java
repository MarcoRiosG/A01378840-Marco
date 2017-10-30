/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practicarecursion;

/**
 *
 * @author marki
 */
public class main {
    
    public int factorial(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * factorial(n-1);
        }
    }

    public int bunnyEars(int bunnies) {
  if(bunnies==0){
    return 0;
  } else {
    return 2+bunnyEars(bunnies-1);
  }
}

    public int fibonacci(int n) {
  if(n==0){
    return 0;
  } else if(n==1){
    return 1;
  } else{
    return fibonacci(n-1)+fibonacci(n-2);
  }
}
    
    public int bunnyEars2(int bunnies) {
  if(bunnies==0){
    return 0;
  } else if(bunnies%2==0){
    return 3+bunnyEars2(bunnies-1);
  } else if(bunnies%2!=0){
    return 2+bunnyEars2(bunnies-1);
  } else {
    return 0;
  }
}

    public int triangle(int rows) {
  if(rows==0){
    return 0;
  } else {
    return rows+triangle(rows -1);
  }
}
   
    public int sumDigits(int n) {
  if(n==0){
    return 0;
  } else {
    return (n%10)+sumDigits(n/10);
  }
}

    public int count7(int n) {
  if(n==0){
    return 0;
  } else if(n%10==7){
    return 1+count7(n/10);
  } else{
    return count7(n/10);
  }
}

    public int count8(int n) {
  if(n==0){
    return 0;
  } else if(n%10==8){
    if((n/10)%10==8){
      return 2+count8(n/10);
    } else{
      return 1+count8(n/10);
    }
  } else{
    return count8(n/10);
  }
}
    
    public int powerN(int base, int n) {
  int r=base;
  if(n==0){
    return 1;
  } else{
    return base*powerN(base, n-1);
  }
}

    public int countX(String str) {
  if (str.equals("")){
    return 0;
  } else if (str.charAt(0) == 'x') {
    return 1 + countX(str.substring(1));
  } else {
    return countX(str.substring(1));
  }
}

    public String changeXY(String str) {
  if (str.equals("")) {
    return str;
  } else if (str.charAt(0) == 'x'){ 
    return "y" + changeXY(str.substring(1));
  } else {
    return str.charAt(0) + changeXY(str.substring(1));
  }
}
    
    public boolean array6(int[] nums, int index) {
  if(index>=nums.length){
    return false;
  }else if(nums[index]==6){
    return true;
  } else{
    return array6(nums, index+1);
  }
}

 public int array11(int[] nums, int index) {
  if(index>=nums.length){
    return 0;
  }else if(nums[index]==11){
    return 1+array11(nums, index+1);
  } else{
    return array11(nums, index+1);
  }
}

    
}
