import java.util.Scanner;
import java.util.Queue;
import java.util.Stack;
import java.util.LinkedList;
public class reverseQ
{
 public static void main(String[] args){ 
   System.out.println("Please enter amount of integers you wish to add, between 4 and 21.");
   Scanner scan = new Scanner(System.in); 
   int amount = scan.nextInt();           //sets size of queue and stack 
   Queue<Integer> q = new LinkedList<>(); // generates your q 
   Stack<Integer> s = new Stack<>();      // generates your stack 
   
   if (amount> 4 && amount < 21){   // checks if requested size is within determined boundries 
      int num = 0; 
      while ( num < amount){        // adds user inputted elements to q 
        System.out.println("Enter an integer");
        q.add(scan.nextInt());
        num++;
        }
   } 
   
   else{
     System.out.println("Please enter an amount between 4 and 21.");
       }  
       
       System.out.println("Queue before being reversed: " + q);
       
     while(amount > 0){     // removes elements from q and pushes them to stack s 
       s.push(q.remove());
       amount--;
       } 
       while(!s.empty()){ // pops elements from stack and adds thems back int your queue in the reverse order of which they were originally added. 
       q.add(s.pop());
       } 
    System.out.println("Queue after being reversed: "+ q);
    
  }
  }