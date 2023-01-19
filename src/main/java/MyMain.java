public class MyMain {

    // Returns the number of odd numbers in mat
    public static int countOdds(int[][] mat) {
        int tally = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (Math.abs(mat[i][j]) %2 == 1) {
                    tally++;
                }
            }
        }
        return tally;
    }

    // Returns the largest value in mat
    public static int findLargest(int[][] mat) {
        int largest = mat[0][0];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (mat[i][j] > largest) {
                    largest = mat[i][j];
                }
            }
        }
        return largest;
    }

    // Write a method that "left-shifts" each row in a 2D array.
    // This means that for each row, all the numbers should be
    // shifted to the left by 1, with wraparound (the first value
    // should wrap around to the last entry in the row)
    public static int[][] leftShift(int[][] mat) {
        int temp;
        for (int i = 0; i < mat.length; i++) {
            temp = mat[i][0];
            for (int j = 1; j < mat[0].length;j++){
                mat[i][j-1] = mat[i][j];
            }
            mat[i][mat[0].length-1] = temp;

        }
        return mat;
    }

    // Creates a 2D array of size arraySize x arraySize
    // where each value is each to the sum of its row and col indexes
    public static int[][] arrayBuilder(int arraySize) {
        int[][] arr = new int[arraySize][];
        for (int i = 0; i < arraySize; i++) {
            arr[i] = new int[arraySize];
        }
        for (int j = 0; j <arraySize; j++){
            for (int k = 0; k < arraySize; k++) {
                arr[j][k] = j+k;
            }
        }
        return arr;
    }










    // Methods for the homework:

    // Returns the mean of the 2D array mat
    public static double mean(double[][] mat) {
        double sum = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                sum += (double)mat[i][j];
            }
        }
        return sum / (mat.length * mat[0].length);
    }

    // Returns the median of the 2D array mat
    // Remember that the array is sorted!
    public static double median(double[][] mat) {
        int med1;
        int med2;
        double median;
        if (mat.length % 2 == 1) {
            med1 = mat.length / 2;
            if (mat[0].length % 2 == 1) {


                med2 = mat.length / 2;
                median = mat[med1][med2];
            }
            else {
                med2 = (mat.length/2);
                median = (mat[med1][med2] + mat[med1][mat.length/2 +1])/2;
            }

        } else {
            median = (mat[mat.length/2 -1][mat[0].length-1] + mat[mat.length/2][0])/2;


        }
        return median;
    }


    // Returns the mode of the 2D array mat
    // Remember that the array is sorted!
    public static double mode(double[][] mat) {
        int maxRep = 0;
        double mode = 0;
        int current = 0;
        double current1 = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == current1) {
                    current++;
                } else {
                    if (current > maxRep) {
                        maxRep = current;
                        mode = current1;
                    }
                    current = 1;
                    current1 = mat[i][j];
                }
            }
        }
        if (current > maxRep) {
            mode = current1;
        }
        return mode;
    }


        public static void main(String[] args) {
        // Write some code here to test your methods!
    }
}
