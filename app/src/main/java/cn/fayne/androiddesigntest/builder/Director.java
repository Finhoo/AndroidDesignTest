package cn.fayne.androiddesigntest.builder;

public class Director {

    Builder mBuilder = null;

    public Director(Builder builder){
        mBuilder = builder;
    }

    public void construct(int core, int ram, String Os) {
        mBuilder.buildCpuCore(core);
        mBuilder.buildRam(ram);
        mBuilder.buildOs(Os);
    }
}
