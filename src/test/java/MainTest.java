import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainTest {



    @Test
    public void evenTest(){

        //arrange given
        int[][] matrix = create(4);

        //act      when
        int[][] rotatedMatrix = rotate(matrix);

        //act      when
        Assertions.assertEquals(1,rotatedMatrix[0][rotatedMatrix.length-1]);
        Assertions.assertEquals(5,rotatedMatrix[1][rotatedMatrix.length-1]);
        Assertions.assertEquals(6,rotatedMatrix[1][rotatedMatrix.length-2]);
    }

    @Test
    public void oddTest(){
        //arrange given
        int[][] matrix = create(5);

        //act      when
        int[][] rotatedMatrix = rotate(matrix);

        //act      when
        Assertions.assertEquals(13,rotatedMatrix[matrix.length/2][matrix.length/2]);
    }

    @Test
    public void cercleTest(){

        //arrange given
        int[][] matrix = create(4);

        //act      when
        int[][] rotatedMatrix = rotate(matrix);
        rotatedMatrix = rotate(rotatedMatrix);
        rotatedMatrix = rotate(rotatedMatrix);
        rotatedMatrix = rotate(rotatedMatrix);

        //act      when
        Assertions.assertEquals(1,rotatedMatrix[0][0]);
    }


    public int[][] create(int size){
        int s = 0;
        int[][] matrix = new int[size][size];
        for(int i= 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                s++;
                matrix[j][i] = s;
            }
        }
        return matrix;
    }

    public int[][] rotate(int[][]matrix){
        int[][] rotatedMatrix = new int[matrix.length][matrix.length];
        for (int j = 0; j < matrix.length; j++) {
            for (int i = 0; i < matrix.length; i++) {
                rotatedMatrix[i][j] = matrix[matrix.length - 1 - j][i];
            }
        }
        return rotatedMatrix;
    }
}
