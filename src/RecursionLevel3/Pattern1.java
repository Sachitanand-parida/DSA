package RecursionLevel3;

/*col   0   1   2   3
        *   *   *   *       row=4
        *   *   *           row=3
        *   *               row=2
        *                   row=1
*/
public class Pattern1 {
    public static void main(String[] args) {

        //pattern(4);
        pattern3(4,0);
    }

    public static void pattern(int n){

        if(n!=0) {
            for (int i = 0; i < n; i++) {
                System.out.print("* ");
            }
        }
        else return;
        System.out.println();
        pattern(n-1);
    }

    public static void pattern2(int row, int col){      //row starts from 4 as the above diagram.

        if (row==0)             //base condition: Here the pattern ends
            return;

        if(col<row) {
            System.out.print("* ");
            pattern2(row, col + 1);
        }
        else {
            System.out.println();
            pattern2(row - 1, 0);
        }
    }

    public static void pattern3(int row, int col){      //row starts from 4 as the above diagram.

        if (row==0)             //base condition: Here the pattern ends
            return;

        if(col<row) {
            pattern3(row, col + 1);
            System.out.print("* ");
        }
        else {
            pattern3(row - 1, 0);
            System.out.println();
        }
    }
}
