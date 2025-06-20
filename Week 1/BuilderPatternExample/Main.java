public class Main {
    public static void main(String[] args){
        
        Computer basic = new Computer.Builder()
            .setCPU("Intel i5")
            .setRAM("8GB")
            .setStorage("500GB HDD")
            .build();
        
        Computer gaming = new Computer.Builder()
            .setCPU("Intel i9")
            .setRAM("32GB")
            .setStorage("1TB SSD")
            .build();

        System.out.println("Basic Computer:");
        System.out.println("CPU: " + basic.getCPU());
        System.out.println("RAM: " + basic.getRAM());
        System.out.println("Storage: " + basic.getStorage());
        System.out.println();

        System.out.println("Gaming Computer:");
        System.out.println("CPU: " + gaming.getCPU());
        System.out.println("RAM: " + gaming.getRAM());
        System.out.println("Storage: " + gaming.getStorage());
    }
}