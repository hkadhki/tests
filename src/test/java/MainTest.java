import org.example.RotateMatrix;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainTest {



    @Test
    public void evenTest(){

        //arrange given
        RotateMatrix rotateMatrix = new RotateMatrix();
        int[][] matrix = rotateMatrix.createMatrix(4);

        //act      when
        int[][] rotatedMatrix = rotateMatrix.rotate(matrix);

        //act      when
        Assertions.assertEquals(1,rotatedMatrix[0][rotatedMatrix.length-1]);
        Assertions.assertEquals(5,rotatedMatrix[1][rotatedMatrix.length-1]);
        Assertions.assertEquals(6,rotatedMatrix[1][rotatedMatrix.length-2]);
    }

    @Test
    public void oddTest(){
        //arrange given
        RotateMatrix rotateMatrix = new RotateMatrix();
        int[][] matrix = rotateMatrix.createMatrix(5);

        //act      when
        int[][] rotatedMatrix = rotateMatrix.rotate(matrix);

        //act      when
        Assertions.assertEquals(13,rotatedMatrix[matrix.length/2][matrix.length/2]);
    }

    @Test
    public void cercleTest(){

        //arrange given
        RotateMatrix rotateMatrix = new RotateMatrix();
        int[][] matrix = rotateMatrix.createMatrix(4);

        //act      when
        int[][] rotatedMatrix = matrix;
        for (int i = 0;i < 4;i++){
           rotatedMatrix = rotateMatrix.rotate(rotatedMatrix);
        }

        //act      when
        Assertions.assertEquals(1,rotatedMatrix[0][0]);
    }


}
