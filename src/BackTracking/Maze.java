package BackTracking;

import java.util.ArrayList;

public class Maze {
    public static void main(String[] args) {

        //System.out.println(maze(3,3));
        //mazePath("",3,3);
        //ArrayList<String> mazePathInList = mazePathInList("", 3, 3);
        //System.out.println(mazePathInList);
        ArrayList<String> mazePathWithDiagonalInList = mazePathWithDiagonalInList("", 3, 3);
        System.out.println(mazePathWithDiagonalInList);
    }

    static int maze(int row, int col){
        if(row==1 || col==1)            //note: remember the matrix. It starts from left to right i.e 3 to 1
            return 1;

        int left= maze(row-1, col);
        int right= maze(row, col-1);
        return left+ right;
    }

    static void mazePath(String path,int row, int col){
        if(row==1 && col==1){               // we have reached the end of the matrix
            System.out.println(path);
            return;
        }

        if(row>1)                                       //cannot go down if row=1, edge case
            mazePath(path+"D",row-1, col);
        if(col>1)                                       //cannot go right if col=1, edge case
            mazePath(path+"R",row, col-1);

    }

    static ArrayList<String> mazePathInList(String path, int row, int col){
        if(row==1 && col==1){// we have reached the end of the matrix

            ArrayList<String> list= new ArrayList<>();
            list.add(path);
            return list;
        }

        ArrayList<String> leftList= new ArrayList<>();          //we can create just one list and add the left and right response and return the same list at the end.
        ArrayList<String> rightList= new ArrayList<>();         // but for simplicity of understanding I have taken two lists
        if(row>1)                                       //cannot go down if row=1, edge case
            leftList= mazePathInList(path+"D",row-1, col);
        if(col>1)                                       //cannot go right if col=1, edge case
            rightList= mazePathInList(path+"R",row, col-1);

        leftList.addAll(rightList);
        return leftList;
    }

    static ArrayList<String> mazePathWithDiagonalInList(String path, int row, int col){
        if(row==1 && col==1){// we have reached the end of the matrix

            ArrayList<String> list= new ArrayList<>();
            list.add(path);
            return list;
        }

        ArrayList<String> finalList= new ArrayList<>();          //we can create just one list and add the left and right response and return the same list at the end.
        if(row>1)                                       //cannot go down if row=1, edge case
            finalList.addAll(mazePathWithDiagonalInList(path+"D",row-1, col));
        if(col>1)                                       //cannot go right if col=1, edge case
            finalList.addAll(mazePathWithDiagonalInList(path+"R",row, col-1));
        if(row>1 && col >1)
            finalList.addAll(mazePathWithDiagonalInList(path+"T",row-1, col-1));

        return finalList;
    }
}
