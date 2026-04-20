
public class Example1 {

	public static void main(String[] args) {
        System.out.println(Thread.currentThread());
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        MyThread t3 = new MyThread();
        MyThread t4 = new MyThread();
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        
	}

}
