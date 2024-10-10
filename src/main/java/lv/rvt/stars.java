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
    public static void printSpaces(int number){
        for(int spc = 1; number + 1 > spc; spc++){
            System.out.print(" ");

        }

    }
    public static void printTriangle2(int size){
        for(int rig = 1; rig < size + 1; rig++){

            printSpaces(size-rig);
            printStars(rig);
            

        }


    }
    public static void christmasTree(int height){
        int Crstars = 1;

        for(int tree = 1; tree < height + 1; tree++){

            printSpaces(height-tree);
            printStars(Crstars);

            Crstars += 2;

        }
        for(int pen = 0; pen < 2; pen++ ){
            printSpaces(height-2);
            printStars(3);
            


        }
        



    }


}
