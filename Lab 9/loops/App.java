//=============================================================================
// PROGRAMMER:	Kyle Leibovitz
// PANTHER ID:	5827545
//
// CLASS:  COP 2210
// SECTION: U15	
// SEMESTER: Spring 2019 	
// CLASSTIME: Mon Wed 5:00-6:15
//
// Project: Lab 9
// DUE: 4/8/19
//
// CERTIFICATION: I certify that this work is my own and that
//                 none of it is the work of any other person.
//=============================================================================
package loops;


public class App {

    public static void main(String[] args) {
        for(int i = 0; i < 10; i++){
            for(int row = 0; row < 10; row++){
                System.out.print("X");
            }
        System.out.println("");
        }
        System.out.println("\n");
        for(int x = 0; x < 10; x++){
            if(x%2 == 0){
                for(int y = 0; y < 10; y++){
                    System.out.print("X");
                }
            }else{
                for(int z = 0; z < 10; z++){
                    System.out.print("O");
                }
            }
        System.out.println("");
        }
        System.out.print("\n");
        
        for(int row = 1; row <= 10; row++){
            for(int col = 1; col <= 10; col++){
                if(row == col || row + col == 11){
                    System.out.print("X");
                }else{
                    System.out.print("O");
                }    
            }
        System.out.println("");    
        }
        System.out.println("\n");
        
        int[][] storage = new int[8][6];
        for(int row = 0; row < 8; row++){
            for(int col = 0; col < 6; col++){
                if(row != 7 && col != 5){
                storage[row][col] = 0;
                }else{
                        storage[row][col] = 1;
                    }
            System.out.print(storage[row][col]);    
            }
        }
        
    }
    
}