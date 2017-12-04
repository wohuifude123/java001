package baseKnowledge;

public class Extends extends BaseClass {
    /**
     * 类继承
     * @param args
     */
    public static void main(String[]args) {

        //创建 Extends 对象

        Extends ed = new Extends();

        //ExtendsDemo001本身没有weight属性，但是ExtendsDemo001的父类有weight属性，也可以访问ExtendsDemo001对象的属性

        ed.weight = 56;

        //调用ExtendsDemo001对象的info()方法
        ed.info();
    }
}
