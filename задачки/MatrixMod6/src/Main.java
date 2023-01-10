import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
       Matrix matrix = new Matrix(3, 2);
        //System.out.println(matrix.getH());
        //System.out.println(matrix.getW());
        //System.out.println(Arrays.deepToString(matrix.getMatrix()));
        //matrix.pprint();

        Matrix m = new Matrix(new int[][]
        {
                {1,2,3},
                {4,5,6}
        });

        matrix.sum(-4);
        matrix.pprint();

        m.sum(matrix);

        m.pprint();

//        m.pprint();
//        System.out.println(m.getH());  //2
//        System.out.println(m.getW());  //3
    }
}