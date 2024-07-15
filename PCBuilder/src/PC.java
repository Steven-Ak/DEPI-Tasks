public class PC {
    private final int id;
    private final String cpu;
    private final String gpu;
    private final String ram;
    private final String monitor;
    private final String storage;
    private final String powerSup;

    public PC(PCBuilder pcBuilder){
        this.id = pcBuilder.getId();
        this.cpu = pcBuilder.getCpu();
        this.gpu = pcBuilder.getGpu();
        this.ram = pcBuilder.getRam();
        this.monitor = pcBuilder.getMonitor();
        this.storage = pcBuilder.getStorage();
        this.powerSup = pcBuilder.getPowerSup();
    }

    @Override
    public String toString(){
        return "PC Specifications: " +
                "\n ID: " + id +
                "\n CPU: " + cpu +
                "\n GPU: " + gpu +
                "\n RAM: " + ram +
                "\n Monitor: " + monitor +
                "\n Storage: " + storage +
                "\n Power Supply: " + powerSup;
    }
}
