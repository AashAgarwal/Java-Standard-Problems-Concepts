import java.util.Scanner;

/* Product - Motor */
abstract class Motor {

    String model;
    long power;

    public Motor(String model, long power) {
        this.model = model;
        this.power = power;
    }

    @Override
    public String toString() {
        return "motor={model:" + model + ",power:" + power + "}";
    }
}

class PneumaticMotor extends Motor {
    PneumaticMotor(String model, long power) {
        super(model, power);
    }

    @Override
    public String toString() {
        return "Pneumatic " + super.toString();
    }
}

class HydraulicMotor extends Motor {
    HydraulicMotor(String model, long power) {
        super(model, power);
    }

    @Override
    public String toString() {
        return "Hydraulic " + super.toString();
    }
}

class ElectricMotor extends Motor {
    ElectricMotor(String model, long power) {
        super(model, power);
    }

    @Override
    public String toString() {
        return "Electric " + super.toString();
    }
}

class WarpDrive extends Motor {
    WarpDrive(String model, long power) {
        super(model, power);
    }

    @Override
    public String toString() {
        return "Warp Drive " + super.toString();
    }
}

class MotorFactory {

    /**
     * It returns an initialized motor according to the specified type by the first character:
     * 'P' or 'p' - pneumatic, 'H' or 'h' - hydraulic, 'E' or 'e' - electric, 'W' or 'w' - warp.
     */
    public static Motor make(char type, String model, long power) {
        if (type == 'P' || type == 'p') {
            return new PneumaticMotor(model, power);
        } else if (type == 'H' || type == 'h') {
            return new HydraulicMotor(model, power);
        } else if (type == 'E' || type == 'e') {
            return new ElectricMotor(model, power);
        } else if (type == 'W' || type == 'w') {
            return new WarpDrive(model, power);
        }
        return null;
    }
}

public class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final char type = scanner.next().charAt(0);     
        final String model = scanner.next();
        final long power = scanner.nextLong();
        Motor motor = MotorFactory.make(type, model, power);
        scanner.close();
        System.out.println(motor);
    }
}