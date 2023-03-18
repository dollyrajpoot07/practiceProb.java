import java.util.*;

// class Practice {
    /**
    //  * @param args
     */
    // public static void main(String[] args) {
        // *****
        // *   *
        // *   *
        // *****
        // int start = 4;
        // int end = 5;
        // for(int i = 1; i <= start; i++) {
        //     for(int j = 1; j <= end; j++) {
        //         if(i == 1 || i >= start || j == 1 || j >= end) {
        //             System.out.print("*");
        //         } else {
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }

            // ****
            // ***
            // **
            // *
            // int n = 4;
            // for(int i = 1; i <= n; i++) {
            //     for(int j = i; j <= n; j++) {
            //             System.out.print("*");
            //         }
            //         System.out.println();
            //     }
        
            // *
            // **
            // ***
            // ****
            // int n = 4;
            // for(int i = 1; i <= n; i++) {
            //     for(int j = 1; j <= i; j++) {
            //             System.out.print("*");
            //         }
            //         System.out.println();
            //     }

            //    *
            //   **
            //  ***
            // ****
            // int n = 4;
            // for(int i = 1; i <= n; i++) {
            //     for(int j = 1; j <= n-i; j++) {
            //             System.out.print(" ");
            //         }
            //         for(int j = 1; j <= i; j++) {
            //             System.out.print("*");
            //         }
            //         System.out.println();
            //     }

            // 1
            // 12
            // 123
            // 1234
            // 12345
            // int n = 5;
            // for(int i = 1; i <= n; i++) {
            //     for(int j = 1; j <= i; j++) {
            //         System.out.print(j);
            //     }
            //     System.out.println();
            // }

            // 12345
            // 2345
            // 345
            // 45
            // 5
            // int n = 5;
            // for(int i = 1; i <= n; i++) {
            //     for(int j = i; j <= n; j++) {
            //         System.out.print(j);
            //     }
            //     System.out.println();
            // }

            // 12345
            // 1234
            // 123
            // 12
            // 1
            // int n = 5;
            // for(int i = 1; i <= n; i++) {
            //     for(int j = 1; j <= n-i+1; j++) {
            //         System.out.print(j);
            //     }
            //     System.out.println();
            // }

            // Floyd's Triangle
            // 1 
            // 2 3 
            // 4 5 6 
            // 7 8 9 10 
            // 11 12 13 14 15
            // int n = 5;
            // int num = 1;
            // for(int i = 1; i <= n; i++) {
            //     for(int j = 1; j <= i; j++) {
            //         System.out.print(num + " ");
            //         num++;
            //     }
            //     System.out.println();
            // }

            // 1
            // 01
            // 101
            // 0101
            // 10101
            // int n = 5;
            // for(int i = 1; i <= n; i++) {
            //     for(int j = 1; j <= i; j++) { 
            //         if((i + j) % 2 == 0) {
            //             System.out.print("1");
            //         } else {
            //             System.out.print("0");
            //         }
            //     }
            //     System.out.println();
            // }

            // *      *
            // **    **
            // ***  ***
            // ********
            // ********
            // ***  ***
            // **    **
            // *      *
            // int n = 4;
            // for(int i = 1; i <= n; i++) {
            //     for(int j = 1; j <= i; j++) {
            //         System.out.print("*");
            //     }
            //     int spaces = 2*(n-i);
            //     for(int j = 1; j <= spaces; j++) {
            //         System.out.print(" ");
            //     }
            //     for(int j = 1; j <= i; j++) {
            //         System.out.print("*");
            //     }
            //     System.out.println();
            // }
            // for(int i = n; i >= 1; i--) {
            //     for(int j = 1; j <= i; j++) {
            //         System.out.print("*");
            //     }
            //     int spaces = 2*(n-i);
            //     for(int j = 1; j <= spaces; j++) {
            //         System.out.print(" ");
            //     }
            //     for(int j = 1; j <= i; j++) {
            //         System.out.print("*");
            //     }
            //     System.out.println();
            // }


    //     *****
    //    *****
    //   *****
    //  *****
    // *****            
            // int n = 5;
            // for(int i = 1; i <= n; i++) {
            //     for(int j = 1; j <= n-i; j++) {
            //         System.out.print(" ");
            //     }
            //     for(int j = 1; j <= n; j++) {
            //         System.out.print("*");
            //     }
            //     System.out.println();
            // }

        //      1     
        //     2 2    
        //    3 3 3   
        //   4 4 4 4  
        //  5 5 5 5 5 
            // int n = 5;
            // for(int i = 1; i <= n; i++) {
            //     for(int j = 1; j <= n-i; j++) {
            //         System.out.print(" ");
            //     }
            //     for(int j = 1; j <= i; j++) {
            //         System.out.print(i + " ");
            //     }
            //     for(int j = n-i; j >= 1; j--) {
            //         System.out.print(" ");
            //     }
            //     System.out.println();
            // }

        //      1    
        //     212   
        //    32123  
        //   4321234 
        //  543212345            
            // int n = 5;
            // for(int i = 1; i <= n; i++) {
            //     for(int j = 1; j <= n-i; j++) {
            //         System.out.print(" ");
            //     }
            //     for(int j = i; j >= 1; j--) {
            //         System.out.print(j);
            //     }
            //     for(int j = 2; j <= i; j++) {
            //         System.out.print(j);
            //     }
            //     for(int j = n-i; j >= 1; j--) {
            //         System.out.print(" ");
            //     }
            //     System.out.println();
            // }

        //      *
        //     ***
        //    *****
        //   *******
        //   *******
        //    *****
        //     ***
        //      *
            // int n = 4;
            // for(int i = 1; i <= n; i++) {
            //     for(int j = 1; j <= n-i; j++) {
            //         System.out.print(" ");
            //     }
            //     for(int j = i; j >= 1; j--) {
            //         System.out.print("*");
            //     }
            //     for(int j = 2; j <= i; j++) {
            //         System.out.print("*");
            //     }
            //     System.out.println();
            // }
            // for(int i = n; i >= 1; i--) {
            //     for(int j = 1; j <= n-i; j++) {
            //         System.out.print(" ");
            //     }
            //     for(int j = i; j >= 1; j--) {
            //         System.out.print("*");
            //     }
            //     for(int j = 2; j <= i; j++) {
            //         System.out.print("*");
            //     }
            //     System.out.println();
            // } 
    // }
// }

// Print the spiral order matrix as output for a given matrix of numbers.  
// public class Practice {
//     public static void main(String args[]) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int m = sc.nextInt();
  
//        int matrix[][] = new int[n][m];
//        for(int i=0; i<n; i++) {
//             for(int j=0; j<m; j++) {
//                 matrix[i][j] = sc.nextInt();
//             }
//        }
  
//        System.out.println("The Spiral Order Matrix is : ");
//        int rowStart = 0;
//        int rowEnd = n-1;
//        int colStart = 0;
//        int colEnd = m-1;
  
//        //To print spiral order matrix
//        while(rowStart <= rowEnd && colStart <= colEnd) {
//            //1
//            for(int col=colStart; col<=colEnd; col++) {
//                System.out.print(matrix[rowStart][col] + " ");
//            }
//            rowStart++;
  
//            //2
//            for(int row=rowStart; row<=rowEnd; row++) {
//                System.out.print(matrix[row][colEnd] +" ");
//            }
//            colEnd--;
  
//            //3
//            for(int col=colEnd; col>=colStart; col--) {
//                System.out.print(matrix[rowEnd][col] + " ");
//            }
//            rowEnd--;
  
//            //4
//            for(int row=rowEnd; row>=rowStart; row--) {
//                System.out.print(matrix[row][colStart] + " ");
//            }
//            colStart++;
  
//            System.out.println();
//        }
//     }
//  }
 

// For a given matrix of N x M, print its transpose.
 
// public class Practice {
//    public static void main(String args[]) {
//       Scanner sc = new Scanner(System.in);
//       int n = sc.nextInt();
//       int m = sc.nextInt();
 
//       int matrix[][] = new int[n][m];
//       for(int i=0; i<n; i++) {
//            for(int j=0; j<m; j++) {
//                matrix[i][j] = sc.nextInt();
//            }
//       }
 
//       System.out.println("The transpose is : ");
//       //To print transpose
//       for(int j=0; j<m ;j++) {
//           for(int i=0; i<n; i++) {
//               System.out.print(matrix[i][j]+" ");
//           }
//           System.out.println();
//       }
//    }
// }
