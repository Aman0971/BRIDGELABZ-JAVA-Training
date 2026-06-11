package Design_Patterns;
class Computer {
    private String cpu;
    private int ram;
    private int storage;
    private boolean bluetooth;
    private boolean wifi;

    // Private constructor
    private Computer(Builder builder) {
        this.cpu = builder.cpu;
        this.ram = builder.ram;
        this.storage = builder.storage;
        this.bluetooth = builder.bluetooth;
        this.wifi = builder.wifi;
    }

    // Display Computer Details
    public void showDetails() {
        System.out.println("CPU: " + cpu);
        System.out.println("RAM: " + ram + " GB");
        System.out.println("Storage: " + storage + " GB");
        System.out.println("Bluetooth: " + bluetooth);
        System.out.println("WiFi: " + wifi);
    }

    // Static Builder Class
    public static class Builder {

        private String cpu;
        private int ram;
        private int storage;
        private boolean bluetooth;
        private boolean wifi;

        public Builder cpu(String cpu) {
            this.cpu = cpu;
            return this;
        }

        public Builder ram(int ram) {
            this.ram = ram;
            return this;
        }

        public Builder storage(int storage) {
            this.storage = storage;
            return this;
        }

        public Builder bluetooth(boolean bluetooth) {
            this.bluetooth = bluetooth;
            return this;
        }

        public Builder wifi(boolean wifi) {
            this.wifi = wifi;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }
}

public class BuilderPattern {

    public static void main(String[] args) {

        Computer gamingPC = new Computer.Builder()
                .cpu("Intel i9")
                .ram(32)
                .storage(1000)
                .bluetooth(true)
                .wifi(true)
                .build();

        Computer officePC = new Computer.Builder()
                .cpu("Intel i5")
                .ram(16)
                .storage(512)
                .wifi(true)
                .build();

        System.out.println("Gaming PC:");
        gamingPC.showDetails();

        System.out.println("\nOffice PC:");
        officePC.showDetails();
    }
}
