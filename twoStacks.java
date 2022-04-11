import java.io.*;
import java.util.*;

public class twoStacks
{int [] arr;
 int top1,top2; 
 
 twoStacks(int cap){ // Checks capacity of the stacks
  if( cap <= 0) {
   throw new IllegalArgumentException( "Stack's Capacity must be positive");}
        arr = new int [cap];
        top1 = -1;
        top2 = -1;
        
 }
 void push1 (int value){
  if (top1 == arr.length){ throw new StackException("Stack's Underlying storage is overflow");}
    top1++;
    arr[top1] = value; 
  } 
 
 
 
 
 
 
 
 
 
 
 
 
 
 }
 
   