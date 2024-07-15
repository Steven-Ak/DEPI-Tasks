public class PCDirector {
    private PCBuilder pcBuilder;

    public PCDirector(PCBuilder pcBuilder){
        this.pcBuilder = pcBuilder;
    }

    public PC highEndAmdPc(){
        return pcBuilder.cpu("Ryzen 9 8900X")
                .gpu("Radeon RX 7900M")
                .ram("Crucial DDR5 64Gb")
                .monitor("Samsung G5")
                .storage("Samsung Evo SSD 4Tb")
                .powerSup("950W")
                .build();
    }

    public PC GamingPC() {
        return pcBuilder.cpu("Intel Core i9-14900X")
                .gpu("NVIDIA RTX 4090Ti")
                .ram("Samsung 64GB DDR5")
                .monitor("Dell Horizon")
                .storage("4TB NVMe SSD")
                .powerSup("850W")
                .build();
    }

}
