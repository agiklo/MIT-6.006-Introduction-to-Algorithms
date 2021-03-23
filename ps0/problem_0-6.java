/**
An increasing subarray of an integer array is any consecutive sequence of array integers whose values strictly increase. Write Python function count long subarrays(A)
which accepts Python Tuple A = (a0, a1, . . . , an−1) of n > 0 positive integers, and returns the
number of longest increasing subarrays of A, i.e., the number of increasing subarrays with length at
least as large as every other increasing subarray. For example, if A = (1,3,4,2,7,5,6,9,8),
your program should return 2 since the maximum length of any increasing subarray of A is three
and there are two increasing subarrays with that length: specifically, subarrays (1,3,4) and
(5,6,9)

As my main language is Java, the problem has been implemented in java as practice.
*/

public int countLongSubarray(int[] array){
    int n = array.length;
    int current = 1;
    int length = 1;
    int count = 1;
    for (int i = 1; i<n; i++){
        if (array[i - 1] < array[i])
            current++;
        else
            current = 1;
        if (current == length)
            count++;
        else if (current > length)
            count = 1;
    }
    return count;
}
