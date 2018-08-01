package cn.fayne.androiddesigntest.singleton;


// 单例模式
public class CEO extends Person {

    private static final CEO mCeo = new CEO();

    private CEO() {
    }

    public static CEO getCeo() {
        return mCeo;
    }

    @Override
    public void talk() {

    }
}
