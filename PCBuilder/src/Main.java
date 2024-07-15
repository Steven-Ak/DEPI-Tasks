public class Main {
    public static void main(String[] args) {
        PCBuilder amd = new PCBuilder(1);
        PCBuilder builder = new PCBuilder(6);
        PCDirector amdDir = new PCDirector(amd);
        PCDirector director = new PCDirector(builder);

        PC amdPC = amdDir.highEndAmdPc();
        System.out.println("High End Amd PC:\n" + amdPC);

        PC customPC = new PCBuilder(3)
                .cpu("Intel Core I7-14700X")
                .gpu("Nvidia RTX 4070")
                .monitor("Samsung G5")
                .storage("Western Digital 2TB SSD")
                .ram("Crucial DDR5 5800MHZ 32GB")
                .powerSup("750W")
                .build();
        System.out.println("Custom PC:\n" + customPC);

        PC gamingPC = director.GamingPC();
        System.out.println("Gaming PC:\n" + gamingPC);
    }
}
