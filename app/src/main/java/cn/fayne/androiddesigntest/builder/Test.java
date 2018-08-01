package cn.fayne.androiddesigntest.builder;

public class Test {

    public static void main(String[] args) {
         Builder builder = new AppleBuilder();
         Director director = new Director(builder);
         director.construct(4, 8, "Mac-OS");
         System.out.println("Computer Info: "+ builder.create().toString());
    }
}
