public class Computer{
    private String CPU;
    private String RAM;
    private String storage;

    //Private Constructor
    private Computer(Builder builder){
        this.CPU = builder.CPU;
        this.RAM = builder.RAM;
        this.storage = builder.storage;
    }

    //Getters for the attributes
    public String getCPU(){
        return CPU;
    }

    public String getRAM(){
        return RAM;
    }

    public String getStorage(){
        return storage;
    }

    // Static Nested Builder class
    public static class Builder{
        private String CPU;
        private String RAM;
        private String storage;

        public Builder setCPU(String CPU){
            this.CPU = CPU;
            return this;
        }

        public Builder setRAM(String RAM){
            this.RAM = RAM;
            return this;
        }

        public Builder setStorage(String storage){
            this.storage = storage;
            return this;
        }

        public Computer build(){
            return new Computer(this);
        }
    }
}