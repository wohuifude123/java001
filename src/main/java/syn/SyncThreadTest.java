package syn;


public class SyncThreadTest {
    /**
     * 当两个并发线程（ thread1和thread2 ）访问同一个对象（ syncThread ）中的synchronized代码块时，
     * 在同一时刻只能有一个线程得到执行
     */
    public static void main(String[]args) {
        SyncThread syncThread = new SyncThread();
        Thread thread1 = new Thread(syncThread, "SyncThread1");
        Thread thread2 = new Thread(syncThread, "SyncThread2");
        thread1.start();
        thread2.start();

    }
}
