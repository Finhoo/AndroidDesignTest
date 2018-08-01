package cn.fayne.androiddesigntest.builder;

public class AppleBuilder extends Builder{

    private Computer mApplePc = new AppleComputer();

    @Override
    public void buildCpuCore(int core) {
        mApplePc.setCpuCore(core);
    }

    @Override
    public void buildRam(int ram) {
        mApplePc.setRamSize(ram);
    }

    @Override
    public void buildOs(String os) {
        mApplePc.setOS(os);
    }

    @Override
    public Computer create() {
        return mApplePc;
    }
}
