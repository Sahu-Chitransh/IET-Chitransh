public class Patterns {
    public static void main(String[] args) {
        
       // Star Pattern 
        for(int j=0;j<5;j++){
            for(int i=0;i<=j;i++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
        
        
        // Inverted Star Pattern 
        for(int i=5;i>0;i--){
            for(int j=0;j<i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();
        
        
        // M Star Pattern 
        
        for(int i=0; i<5; i++){
            for(int j=0;j<5-i;j++){
                System.out.print("*");
            }
            for(int j=0;j<i;j++)
            {
                System.out.print("  ");
            }
            for(int j=0;j<5-i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
        
        System.out.println();
        System.out.println();
        
        
        // Mirror Star Pattern 
        for(int i=5;i>0;i--){
            for(int j=0;j<i-1;j++)
            {
                System.out.print(" ");
            }
            for(int k=0;k<=5-i;k++)
            {
                System.out.print("*");
            }

            System.out.println();
        }
    

    System.out.println();
    System.out.println();
    // Alphabet Pattern
    char C = 'A';
    for(int i=0;i<10;i++){
        for(int j=0;j<=i;j++)
        {
            C += j; 
            System.out.print(C +" ");
            C = 'A';
        }
        System.out.println();
        
    }




    }
}
