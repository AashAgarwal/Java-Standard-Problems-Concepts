class EnjoyVehicle {

    public static void startVehicle() {
        // start your vehicle
        Engine engine = new Engine();
        engine.start();
    }

    static class Engine {

        void start() {
            System.out.println("RRRrrrrrrr....");
        }
    }
}