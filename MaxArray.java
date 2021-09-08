//Assignment 2
public class MaxArray {
    public static void main(String args[]) {
      int[][] arr=new int[5][5];
      for (int i=0;i<5;i++){
          for (int j=0;j<5;j++){
              arr[i][j]=(int)(Math.random() * 100) + 1;
          }
      }
        int max=0;
        int pos1=-1;
        int pos2=-1;
        for (int i=0;i<5;i++){
            for (int j=0;j<5;j++){
                if (arr[i][j]>max){
                    max=arr[i][j];
                    pos1=i;
                    pos2=j;
                }
            }
        }
        System.out.print("Max: "+max+" at position ["+pos1+"]["+pos2+"]");
    }
}