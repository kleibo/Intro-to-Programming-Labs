package matrix;

public class MatrixArray{
    public int[] matrix;
    public int rows;
    public int cols;
    
    public MatrixArray(int rows, int cols){
        this.rows = rows;
        this.cols = cols;
        this.matrix = new int[rows*cols];
        for(int i = 0; i < rows*cols; i++){
            matrix[i] = 0;
        }
    }
    
    public void consolePrint(){
        for(int i = 0; i < rows*cols; i++){
            if(i < rows*cols && (i + 1)%10 != 0){
                System.out.print(matrix[i] + "\t");
            }else if((i + 1)%10 == 0){
                System.out.print(matrix[i] + "\n");
            }else{
                break;
            }        
        }
    }
    public void changeEvenColsPattern(){
        for(int i = 0; i < rows*cols; i++){
            if(i < rows*cols && i%2 == 0){
                matrix[i] = 1;
            }else if(i < rows*cols && (i + 1)%10 != 0){
            }else if((i + 1)%10 == 0){
            }
        }
    }
    public void changeAllEvenPattern(){
        int x = 1;
        for(int i = 0; i < rows*cols; i++){
            if(i < rows*cols && i%2 == 0){
                matrix[i] = 1;
            }
            for(int j = 0; j < rows; j++){
                if(i >= j*20-9 && i <= j*20){
                matrix[i] = 1;
                }
            }
        }
        
    }
    public int getSum(){
        int sum = 0;
        for(int i = 0; i < matrix.length; i++){
            sum = matrix[i] + sum;
        }
        return sum;
    }
    
    public double getAverage(){
        double avg = 0;
        
        for(int i = 0; i <= matrix.length; i++){
            if(i < matrix.length){
                avg = matrix[i] + avg;
            }else{
                avg = avg/matrix.length;
            }
        }
        return avg;
    } 
}
