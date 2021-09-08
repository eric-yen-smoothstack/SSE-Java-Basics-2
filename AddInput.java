import java.util.*;

public class AddInput {
    public static void main(String args[]) {
    int sum=0;
      ArrayList<Integer> ar=new ArrayList<Integer>();
      Scanner sc=new Scanner(System.in);
      while (sc.hasNext()){
          System.out.println("Input an integer:");
          ar.add(sc.nextInt());
      }
      for (int i=0;i<ar.size();i++){
          sum+=ar.get(i);
      }
      System.out.println(sum);
    }
}