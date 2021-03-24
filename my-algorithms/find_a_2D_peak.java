/**
* @author Mateusz Milewczyk
* the algorithm searches a two-dimensional array for a peak.

Example array:

int[][] array= {{23, 2, 3, 4, 6},
                {1, 4, 5, 4, 1 },
                {9, 5, 3, 7, 4 },
                {2, 7, 1, 5, 2}};
                
algorithm returns 23
*/

public int find2DArrayPeak(int[][] array){
        int max = 0;
        int actualMax = 0;
        for (int[] ints : array) {
            for (int j = 0; j < array.length - 1; j++) {
                if (ints[j] > ints[j + 1]) {
                    actualMax = ints[j];
                }
                if (ints[j + 1] < ints[j + 2]) {
                    if (ints[j + 2] > actualMax)
                        actualMax = ints[j + 2];
                }
                if (ints[j + 1] > ints[j] && ints[j + 1] > ints[j + 2]) {
                    if (ints[j + 1] > actualMax)
                        actualMax = ints[j + 1];
                }
                if (actualMax > max) {
                    max = actualMax;
                }
            }
        }
        return max;
    }
