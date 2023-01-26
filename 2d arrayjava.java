import java.util.Scanner;
class code3
{
 public static void main(String[] args)
 {
    Scanner scan = new Scanner(System.in);
    int[][] arr=new int[3][3];
    int i,j;
    System.out.println("enter the elements in two dimensional");
    for(i=0;i<3;i++)
    {
        for(j=0;j<3;j++)
        {
            arr[i][j]=scan.nextInt();

        }

 }
 for(i=0;i<3;i++)
 {
    System.out.printf("\n");
     for(j=0;j<3;j++)
     {
         System.out.printf("%d ",arr[i][j]);
         
     }

}
}
}