package cn.fayne.androiddesigntest.singleton;

public class SingleTonTest {
    public static void main(String[] args) {
        Campany cp = new Campany();
        Person ceo1 = CEO.getCeo();
        Person ceo2 = CEO.getCeo();

        Person vp1 = new VP();
        Person vp2 = new VP();

        Person staff1 = new Staff();
        Person staff2 = new Staff();
        Person staff3 = new Staff();

        cp.addStaff(ceo1);
        cp.addStaff(ceo2);
        cp.addStaff(vp1);
        cp.addStaff(vp2);
        cp.addStaff(staff1);
        cp.addStaff(staff2);
        cp.addStaff(staff3);
        cp.showAllStaff();
    }
}
