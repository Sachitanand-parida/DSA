package BackTracking;

public class BackTrackingBasic {
    public static void main(String[] args) {

        boolean[][] maze={
                {true,true,true},
                {true,true,true},
                {true,true,true}
        };

        allPath("",maze,0,0);
    }
    static void allPath(String path, boolean[][] maze, int row, int col){

        if(row== maze.length-1 && col== maze[0].length -1) {  //we considered here that the matrix is starting from 0,1,2 etc
            System.out.println(path);
            return;
        }
        if(!maze[row][col])         //if any element of the boolean matrix is false, then return. Not allowed to enter the box already false
            return;

        maze[row][col]= false;      //so that this particular [row][col] is not traversed again

        if(row < maze.length-1)
            allPath(path+'D',maze, row+1, col);

        if(col < maze[0].length -1)
            allPath(path+'R',maze, row, col+1);

        if(row > 0)
            allPath(path+'U',maze,row-1, col);

        if(col > 0)
            allPath(path+'L',maze, row, col-1);

        //this is the line where the function will get over
        //before the function gets removed, also remove the changes made by that function

        maze[row][col]= true;                       // so that other branches of recursion are not reluctant to traverse this [row][col]

    }
}
