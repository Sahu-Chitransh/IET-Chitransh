import java.util.Scanner;
public class Matrix_Multiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] m1 = new int[3][3];
        int[][] m2 = new int[3][3];
        int[][] m3 = new int[3][3];

        System.out.println("Enter values fo matrix 1");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                m1[i][j] = sc.nextInt();
            }
        }
        
        System.out.println("Enter values fo matrix 2");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                m2[i][j] = sc.nextInt();
            }
        }
        
        /*   To Print Matrix M1
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print( m1[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        
            To Print Matrix M2
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print( m2[i][j]+" ");
            }
            System.out.println();
        }
            */
            
            // For Multiplication Logic
            for(int i=0;i<3;i++){
                for(int j=0;j<3;j++){
                    m3[i][j] = m1[i][0]*m2[0][j] + m1[i][1]*m2[1][j] + m1[i][2]*m2[2][j];
                }
            }
            System.out.println();
        
        // To Print Matrix M3
            for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print( m3[i][j]+" ");
            }
            System.out.println();
        }
         
    } 
}
