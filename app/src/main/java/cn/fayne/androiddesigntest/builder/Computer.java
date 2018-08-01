package cn.fayne.androiddesigntest.builder;

public abstract class Computer {

    protected int mCpuCore;
    protected int mRamSize;
    protected String mOS;

    protected Computer() {

    }

    public abstract void setCpuCore(int core);
    public abstract void setRamSize(int ram);
    public abstract void setOS(String os);

    @Override
    public String toString() {
        return "Computer [mCpuCore=" + mCpuCore + ", mRamSize=" + mRamSize
                + ", mOs=" + mOS + "]";
    }
}
