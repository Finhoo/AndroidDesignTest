package cn.fayne.androiddesigntest.builder;

public class AppleComputer extends Computer {

    protected AppleComputer() {

    }

    @Override
    public void setCpuCore(int core) {
        mCpuCore = core;
    }

    @Override
    public void setRamSize(int ram) {
        mRamSize = ram;
    }

    @Override
    public void setOS(String os) {
        mOS = os;
    }
}
