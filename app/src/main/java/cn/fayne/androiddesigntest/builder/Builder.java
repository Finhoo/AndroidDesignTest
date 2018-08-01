package cn.fayne.androiddesigntest.builder;

public abstract class Builder {
    public abstract void buildCpuCore(int core);
    public abstract void buildRam(int ram);
    public abstract void buildOs(String os);

    public abstract Computer create();
}
