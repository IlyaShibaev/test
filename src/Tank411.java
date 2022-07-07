public class Tank411 {
    private int yPosition;
    private int xPosition;
    private int direction;
    private int fuel = 200;
    private final String modelName = "T34";
    private static int tankCount;
    int tankNumber;

    public Tank411(int yPosition, int xPosition) {
        this.yPosition = yPosition;
        this.xPosition = xPosition;
        tankNumber = ++tankCount;
    }

    public Tank411(int yPosition, int xPosition, int fuel) {
        this.yPosition = yPosition;
        this.xPosition = xPosition;
        this.fuel = fuel;
        tankNumber = ++tankCount;
    }

    public Tank411() {
        tankNumber = ++tankCount;
    }

    void goForward(int x){
        if (fuel >= Math.abs(x)) fuel -= Math.abs(x);
        else x = fuel * x / Math.abs(x);
        System.out.println("After fuelSpare method " + x);
            switch (direction){
                case 0:
                    yPosition+= x;
                    break;
                case 1:
                    xPosition-= x;
                    break;
                case 2:
                    yPosition-= x;
                    break;
                case 3:
                    xPosition+= x;
                    break;
            }
    }
    void goBackward(int x){
        goForward(-x);
    }
    void printPosition(){
        System.out.println("The Tank " + modelName + '-' + tankNumber + " is at " + yPosition + ','+ xPosition + " now.");
    }
    void turnRight(){
        direction++;
        if (direction >3) direction = 0;
    }
    void turnLeft(){
        direction--;
        if (direction<0) direction = 3;
    }
    void fuelLevel(){
        System.out.println(fuel);
    }
}
