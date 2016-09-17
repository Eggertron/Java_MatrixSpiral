/*
 * Author: Edgar H. Han
 * Generates an nxn spiral matrix of ints
 * 
 */
public class MatrixSpiral {

    private int[][] _matrix;
    private int _n;
    
    MatrixSpiral(int n) {
        setN(n);
    }
    
    public void setN(int n) {
        _n = n;
        _matrix = new int[n][n];
    }
    
    public int[][] getSpiral() {
        int max = _n * _n;
        int counter = 1;
        int offset = 0;
        int x = 0, y = 0;
        
        while(counter <= max) {
            // to the right.
            while(x < _n - offset) {
                _matrix[x][y] = counter;
                x++;
                counter++;
            }
            x--;
            y++;
            // down.
            while(y < _n - offset) {
                _matrix[x][y] = counter;
                y++;
                counter++;
            }
            y--;
            x--;
            // to the left.
            while(x >= 0 + offset) {
                _matrix[x][y] = counter;
                x--;
                counter++;
            }
            x++;
            y--;
            offset++;
            // up.
            while(y >= 0 + offset) {
                _matrix[x][y] = counter;
                y--;
                counter++;
            }
            y++;
            x++;
        }
        
        return _matrix;
    }
    
    public void printMatrix(int[][] matrix) {
        System.out.print("[");
        for (int y = 0; y < _n; y++) {
            for (int x = 0; x < _n; x++) {
                if (x > 0) {
                    System.out.print(",\t");
                }
                System.out.print(matrix[x][y]);
            }
            if (y + 1 == _n) {
                System.out.println("]");
            }
            else {
                System.out.print("\n");
            }
        }
    }
}
