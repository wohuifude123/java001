package dextend;

/**
 * Door 父类
 */

public class Door {

    private int height;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }


    @Override
    public String toString() {
        return super.toString();
    }

    public void opendoor(String doorName)
    {

        System.out.println(doorName+" ,"+this.getHeight() +"m , is open");

    }
}
