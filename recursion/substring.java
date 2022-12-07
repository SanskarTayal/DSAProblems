package practice.recursion;

import java.util.*;

public class substring {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String ques= sc.nextLine();
      // printSubsequences(ques);
        subsequenceprint(ques,"");
      // System.out.println(ques); 
       sc.close();
    }
 private static void subsequenceprint(String ques,String cur) {
    if(ques.length()==0)
    {
        System.out.println(cur);
        return;
    }
    subsequenceprint(ques.substring(1), cur);
    subsequenceprint(ques.substring(1), cur+ques.charAt(0));

    }
public static void printSubsequences(String s)
 {
    ArrayList<String> ans= findSubsequences(s);
    for(String i : ans)
    {
        System.out.println(i);
    }
 }
private static ArrayList<String> findSubsequences(String s) {
    if(s.length()==0)
    {
        ArrayList<String> ans = new ArrayList<>();
        ans.add("");      
        return ans;
    }
    
    ArrayList<String> ans= findSubsequences(s.substring(1));
    
    int l= ans.size();
  //  System.out.println(l);
    for(int j=0;j<l;j++)
    {
       ans.add(s.charAt(0)+ans.get(j));
    }
   
    return ans;
}       
}
