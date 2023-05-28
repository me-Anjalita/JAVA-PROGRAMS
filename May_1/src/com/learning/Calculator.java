package com.learning;

class Calculator
{
 public static void main(String[] args)
 {
 Calculator calc = new Calculator(); //constructor
 calc.add (); //method calling statemet 
 calc.sub ();
// calc.multiply(10,20);
calc.multiply();
}
 void add()
 { // method body / method definition
 System.out.println(10+20);
 }
 void sub()
 {
 System.out.println(20-10);
 }
// void multiply(int no1,int no2)
// {
 //System.out.println(no1*no2);
 //}
 void multiply()    // both statement for multiplication is right with or without int no1 
 {
 System.out.println(10*20);
 }

}
//2 method calling and 2 method definition in this
