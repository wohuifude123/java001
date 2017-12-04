package dextend;

public class MyDoor extends Door {

    String doorName="";
    public MyDoor(String doorName,int height)
    {
        this.setHeight(height);//这步不可少，顺序不可乱，否者测试的时候，door的高度就为0

        // 在重写情况下，使用super调用父类方法
        System.out.println("在被重写的情况下，只有使用关键字super进行调用输出的才是父类的实现内容");
        super.opendoor(doorName);

        /*
        //继承了父类的opendoor方法
        this.opendoor(doorName);
        this.doorName=doorName;
        */

        //继承了父类的opendoor方法
        System.out.println("在被重写的情况下，调用的是子类的方法，实现的是子类的实现内容");
        this.opendoor(doorName);
        this.doorName=doorName;
    }

    //重写了父类opendoor方法
    public void opendoor(String doorName)
    {
        System.out.println(doorName+" is a automatic door");
    }

    //扩展
    public void Close()
    {
        System.out.println("MyDoor is close.");
    }
}
