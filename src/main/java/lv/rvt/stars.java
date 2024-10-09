package lv.rvt;

public class stars {
    
    public static void printStars(int number) {
        while (number != 0) {
            System.out.print("*");
            number--;
        }
        System.out.println("");

    }
    public static void printSquare(int size){

        for(int sqr = 0; sqr < size; sqr++)
        {
            printStars(4);
        }

    }
    public static void printRectangle(int width, int height){

        for(int rec = 0; rec < height; rec++){
            printStars(width);
        }

    }
    public static void printTriangle(int size){
        for( int tri = 0; tri < size+1; tri++){
            printStars(tri);
        }
    }
}
