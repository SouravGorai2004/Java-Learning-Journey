class Functionality {
    class Light {
        private boolean light = false;

        void turnOn() {
            if (!light) {
                System.out.println("Light is turnned on ...");
                light = true;
            } else {
                System.out.println("Light is already turned on ...");
            }
        }

        void turnOff() {
            if (light) {
                System.out.println("Light is turnned off ...");
                light = false;
            } else {
                System.out.println("Light is already turned off...");
            }
        }
    }

    static class Thermostate {
        private int temp;

        void setTemperatur(int x) {
            temp = x;
        }

        void showTemperature() {
            System.out.println("The current tempurature is : " + temp +" degree Centrigrade");
        }
    }

    void activeSecurity(String mode) {
        class SecuritySystem {
            void arm() {
                System.out.println("The security System is armed...");
            }

            void disarm() {
                System.out.println("The security system is disarmeds");
            }

        }
        SecuritySystem ss = new SecuritySystem();
        if(mode == "night"){
            ss.arm();
        }
        else ss.disarm();
    }
@FunctionalInterface
interface Monitor{
    void checkusges();
}
void startMonitoring(){
    Monitor monitor = new Monitor(){
        @Override
        public void checkusges(){
            System.out.println("Energy Consumption for today is : 5KW");
        }
    };
    monitor.checkusges();
}
}


class SmartHome{
    public static void main(String[] args) {
        Functionality home1 = new Functionality();
        Functionality.Light L1 = home1.new Light();
        L1.turnOn();
        L1.turnOff();
        System.out.println("---------------------------");
        Functionality.Thermostate t1 = new Functionality.Thermostate();
        t1.setTemperatur(30);
        t1.showTemperature();
        System.out.println("---------------------------");
        home1.activeSecurity("night");
        System.out.println("---------------------------");
        home1.startMonitoring();

    }
}