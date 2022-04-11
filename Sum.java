
import java.util.Scanner;

public class Sum
{
 public static void main(String[] args) // main method, holds scanner for input and prints result.
 { Scanner n = new Scanner(System.in);
 
  int input = n.nextInt();
  
  System.out.println(getSum(input));
  }
  
 static int getSum(int k){ //accepts input 
 
  if(k== 0){ // checks to see if input is now zero and ends recursion
  return k;
  }
  
  else{
  return k + getSum( k-1); // takes input and adds itself minus one recursively until reaching zero
  }
 
}


}
