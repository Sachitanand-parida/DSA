package BitwiseAndNumberSystem;

public class FlipImage {
    public static void main(String[] args) {


    }
    public static int[][] flipAndReverseImage(int[][] image){
        for(int[] row: image){
            for (int i = 0; i <(image[0].length+1)/2; i++) {
                //adding 1 and dividing by 2 ensures the middle element
                // in case of odd number of columns is not swapped multiple times
                int temp= row[i];
                row[i]= row[image[0].length-i-1];
                row[image[0].length-i-1]= temp;
            }
        }
        return image;
    }
}
