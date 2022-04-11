import java.util.Scanner;

public class reverse
{
 public static void main(String[] args) // main method, holds scanner for input and prints result.
 { Scanner n = new Scanner(System.in);
  String name = n.nextLine();
  name = name.replaceAll("\\s", "");
  System.out.println(revName(name));
  } 
  
static String revName(String str){ 

if ((null == str) || (str.length() <= 1)) {
        return str;
    }
else{
return revName(str.substring(1)) + str.charAt(0);
}
}
}