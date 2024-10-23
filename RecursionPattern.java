// public class RecursionDemo {

 
//     // *****
//     // *****
//     // *****
//     // *****
//     // *****
//       static void print12(int  j){
//         if(j<=0){
//           return ;
//         }
//         System.out.print("*");
//         print12(j-1);
    
//       }
    
//       static void print11(int i,int j){
//         if(i<=0){
//           return ;
//         }
//         print12(j);
//         System.out.println();
//         print11(i-1, j);
    
//       }
    
    
//     // *****
//     // *   *
//     // *   *
//     // *   *
//     // *****
    
//       static void print22(int  j,int n){
//         if(j<=0){
//           return ;
//         }
//         if(j==1||j==n)
//         System.out.print("*");
//         else
//         System.out.print(" ");
//         print22(j-1,n);
    
//       }
    
//       static void print21(int i,int j,int n){
//         if(i<=0){
//           return ;
//         }
//         if(i==1 || i==n)
//         print12(j);
//         else
//         print22(j,n);
//         System.out.println();
//         print21(i-1, j,n);
    
//       }
    
    
//     // *
//     // **
//     // ***
//       static void print31(int i,int j){
//         if(i<=0){
//           return;
//         }
//         print31(i-1, j-1);
//         System.out.println();
//         print12(j);
//       }
    
    
//       // ****
//       // ***
//       // **
//       // *
      
//       static void print41(int i,int j){
//         if(i<=0){
//           return;
//         }
//         print12(j);
//         System.out.println();
//         print41(i-1, j-1);
//       }
    
//     // *****
//     //  *****
//     //   *****
//     //    *****
//     //     *****
    
//       static void print52(int  j){
//         if(j<=0){
//           return ;
//         }
//         System.out.print(" ");
//         print52(j-1);
//       }
    
//       static void print51(int i,int j,int n){
//         if(i<=0){
//           return;
//         }
//         print51(i-1, j-1,n);
//         print52(j-1);
//         print12(n);
//         System.out.println();
//       }
    
    
      
//     //    *****
//     //   *****
//     //  *****
//     // *****
//     //*****
//       static void print61(int i,int j,int n){
//         if(i<=0){
//           return;
//         }
//         print52(j-1);
//         print12(n);
//         System.out.println();
//         print61(i-1, j-1,n);
//       }
    
    
    
//       public static void main(String[] args) {
//         print11(5, 5);
//         print21(5, 5, 5);
//         print31(5, 5);
//         print41(4, 4);
//         print51(5, 5, 5);
//         print61(5, 5, 5);
//       }
//     }








// import java.util.Scanner;

// public class rec7 {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         pattern((2*n+1),(2*n+1),n);


//     }
//     public static void plus(int n)
//     {
//         if(n==0)
//         return;
//         System.out.print("+");
//         plus(n-1);
//     }
//     public static void space(int n)
//     {
//         if(n==0)
//         return;
//         System.out.print(" ");
//         space(n-1);
//     }
//     public static void pattern(int row,int col,int n)
//     {
//         if(row==0)
//         return;
//         if(row==(n+1))
//         plus(col);
//         else
//         {
//             space(n);
//             plus(1);
//             space(n);
//         }
//         System.out.println();
//         pattern(row-1,col,n);
//     }
    
// }








// import java.util.Scanner;

// public class rec8 {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int row=2*n+1;
//         pattern(row,n);
//     }
//     public static void star(int col)
//     {
//         if(col==0)
//         return ;
//         System.out.print("*");
//         star(col-1);
//     }
    
//     public static void space(int col)
//     {
//         if(col==0)
//         return ;
//         System.out.print(" ");
//         space(col-1);
//     }
//     public static void pattern(int row,int col)
//     {
//         if(row==0)
//         return;
//         if(row==(col*2+1)|| row%col==1 || row==col+1)
//         {
//             space(1);
//             star(col-2);
//             space(1);
//         }
//         else
//         {
//             star(1);
//             space(col-2);
//             star(1);
//         }
//         System.out.println();
//         pattern(row-1,col);
//     }
    
// }










// import java.util.Scanner;

// public class rec9 {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int row=2*n+1;
//         int col=row;
//         upperpattern(0, col,n);
//         midstar(row, col, n);
//         System.out.println();
//         lowerpattern(n, col-(n-1), n);


//     }
//     public static void star(int n)
//     {
//         if(n==0)
//         return;
//         System.out.print("*");
//         star(n-1);
//     }
//     public static void space(int col)
//     {
//         if(col==0)
//         return;
//         System.out.print(" ");
//         space(col-1);
//     }
//     public static void upperpattern(int row,int col,int n)
//     {
//         if(row==n)
//         return;
//         space(row);
//         star(1);
//         space(col-row-2);
//         star(1);
//         System.out.println();
//         upperpattern(row+1, col-1, n);

        
//     }
//     public static void lowerpattern(int row,int col,int n)
//     {
//         if(row==0)
//         return;
//         space(row-1);
//         star(1);
//         space(col-row-1);
//         star(1);
//         System.out.println();
//         lowerpattern(row-1, col+1, n);

        
//     }
//     public static void midstar(int row,int col,int n)
//     {
//         space(n);
//         star(1);

//     }

    
// }