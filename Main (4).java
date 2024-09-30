import java.util.*;

public class Main {
    public static void main(String[] args) {
      toh(5,'A','B','C');
  }
  public static void toh(int n,char src, char aux, char des){
    if(n==1){
      System.out.println("Move disk "+n+" from "+src+" to "+des);
    }else{
      toh(n-1,src,des,aux);
      System.out.println("Move disk "+n+" from "+src+" to "+des);
      toh(n-1,aux,src,des);
    }
  }
}