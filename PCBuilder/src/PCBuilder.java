public class PCBuilder {
    private int id;
    private String cpu;
    private String gpu;
    private String ram;
    private String monitor;
    private String storage;
    private String powerSup;

    public PCBuilder (int id){
        this.id = id;
    }

    public PCBuilder cpu(String cpu){
        this.cpu = cpu;
        return this;
    }

    public PCBuilder gpu(String gpu){
        this.gpu = gpu;
        return this;
    }

    public PCBuilder ram(String ram){
        this.ram = ram;
        return this;
    }

    public PCBuilder monitor(String monitor){
        this.monitor = monitor;
        return this;
    }

    public PCBuilder storage(String storage){
        this.storage = storage;
        return this;
    }

    public PCBuilder powerSup(String powerSup){
        this.powerSup = powerSup;
        return this;
    }

    public int getId(){return id;}
    public String getCpu(){return cpu;}
    public String getGpu(){return gpu;}
    public String getRam(){return ram;}
    public String getMonitor(){return monitor;}
    public String getStorage(){return storage;}
    public String getPowerSup(){return powerSup;}

    public PC build(){
        return new PC(this);
    }
}
