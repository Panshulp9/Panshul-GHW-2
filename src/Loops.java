public class Loops {
    public static void main(String[] args) {
        Loops myCount = new Loops();
    }
    public Loops() { //constructor
        countUp();
        countByThrees();
        countDown();
        nestedLoop();

    }
    public void countUp() {
        for (int x = 1; x < 6; x=x+1 ){
            System.out.println(x);
        }
    }
    public void countByThrees() {
        for (int y = 3; y < 16; y=y+3) {
            System.out.print(y);
        }
    }
    public void countDown(){
        System.out.println();
        for (int z = 10; z > 0; z=z-1){
            System.out.print(z);
        }
    }
    public void nestedLoop(){
        System.out.println();
        for (int x = 1; x<=5; x=x+1){
            for (int y = 1; y<=x; y=y+1){
                System.out.print(x);
            }
            System.out.println();
        }
    }
}
