public class Main {
    public static void main(String[] args){
        System.out.println("                Multiplication Table\n       1   2   3   4   5   6   7   8   9  10  11  12\n----------------------------------------------------");
        for(int x = 1; x<=12; x++){
            if(x>9){
                System.out.print(x+" |");
            } else {
                System.out.print(" "+x+" |");
            }
            for(int y = 1; y<=12;y++){
                if(x*y>99){
                    System.out.print(" ");
                } else if(x*y>9){
                    System.out.print("  ");
                } else {
                    System.out.print("   ");
                }
                System.out.print(x*y);
            }
            System.out.println();
        }
    }
}
