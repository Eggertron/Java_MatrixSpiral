
public class Driver {

    private static MatrixSpiral ms;
    
    public static void main(String[] args) {
        ms = new MatrixSpiral(4);
        ms.printMatrix(ms.getSpiral());
    }

}
