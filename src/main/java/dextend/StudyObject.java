package dextend;

public class StudyObject {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println("Hello MyJava!");

        //继承测试代码调用
        MyDoor myDoor =new MyDoor("MyDoor",123);

        System.out.println("===========调用===========");

        //调用方法
        myDoor.opendoor(myDoor.doorName);

        //扩展方法调用
        myDoor.Close();

    }

}