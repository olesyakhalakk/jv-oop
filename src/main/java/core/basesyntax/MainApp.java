package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Truck truck = new Truck();
        Bulldozer bulldozer = new Bulldozer();
        Excavator excavator = new Excavator();
        truck.doWork();
        bulldozer.doWork();
        excavator.doWork();
        excavator.stopWork();
        truck.stopWork();
        bulldozer.stopWork();
    }

}
