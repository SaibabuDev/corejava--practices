package arrays;
/*Objective: Given a two-dimensional array, write a program to print all middle elements of the array. Or In other words, print all the elements from the array except boundary elements.

Example:

int [][] grid = new int[][] {
               {1, 2, 3, 4, 8},
               {5, 6, 7, 8, 9},
               {9, 8, 7, 6, 7},
               {5, 4, 3, 2, 2},
               {1, 2, 3, 4, 8}
Output:
6   7   8
8   7   6
4   3   2
Approach: 

Iterate the two-dimensional array and print the array elements on the following conditions-

For element at (h, w)

If h is either 0 or height-1, do not print the element. (this will skip the first and last row)
Else if either w>0 or width-1, print the elements. (this will all the elements in the middle of the array.
Else do not the element (this will skip first and last element of middle rows)*/
public class PrintMiddleElements2DArray {
	public void print(int [][]input){
        int height = input.length;
        int width = input[0].length;

        for (int h = 0; h <height ; h++) {
            for (int w = 0; w <width ; w++) {
                if(h==0 || h==height-1){
                    //print all the elements
                    //do nothing
                }else if(w>0 && w<width-1){
                    System.out.print(input[h][w] + "   ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int [][] grid = new int[][] {
                {1, 2, 3, 4, 8},
                {5, 6, 7, 8, 9},
                {9, 8, 7, 6, 7},
                {5, 4, 3, 2, 2},
                {1, 2, 3, 4, 8}
        };
        PrintMiddleElements2DArray p = new PrintMiddleElements2DArray();
        p.print(grid);
    }
}
