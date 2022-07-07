public class TankMain {
    public static void main(String[] args) {
        /*Tank411 tank = new Tank411(0,0, 200);
        tank.goForward(200);
        tank.printPosition();
        tank.fuelLevel();
        tank.goForward(100);
        tank.printPosition();
        tank.fuelLevel();*/

        Tank411 justTank = new Tank411();
// В (10;20) с fuel = 100
        Tank411 anywhereTank = new Tank411(10, 10);
// В (20;30) с fuel = 200
        Tank411 customTank = new Tank411(20, 30, 200);
        justTank.goForward(200);
        justTank.printPosition();
        anywhereTank.goBackward(-200);
        anywhereTank.printPosition();
        customTank.goForward(201);
        customTank.printPosition();

        /*ank411 tank = new Tank411();
        tank.yPosition = 1000;
        tank.xPosition = 2000;
        tank.printPosition();*/
    }
}
