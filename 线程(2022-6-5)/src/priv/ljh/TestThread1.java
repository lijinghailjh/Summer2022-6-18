package priv.ljh;

/**
 * @Author lijinghai
 * @ClassName:TestThread1
 * @Email: lijinghailjh@163.com
 * @Description: 测试线程  创建线程方式一：继承Thread类，重写run（）方法，调用start开启线程
 * @Date: 2022/6/5 18:28
 * @Version: v1.0
 * 总结： 注意，线程开启不一定立即执行，由CPU调度
 */

public class TestThread1 extends Thread{
    @Override
    public void run() {
        // run方法线程体
        for (int i = 0; i < 20; i++) {
            System.out.println("我在看代码----"+i);
        }
    }

    public static void main(String[] args) {
        // main线程，主线程
        // 创建一个线程对象
        TestThread1 testThread1 = new TestThread1();
//        TestThread1 testThread1 = new TestThread1(()->{
//            for (int i = 0; i < 5; i++) {
//               try {
//                   Thread.sleep(1000);
//               } catch (InterruptedException e) {
//                   e.printStackTrace();
//               }
//            }
//        });
        // 调用start()方法,开启线程
        testThread1.start();

        for (int i = 0; i < 2000; i++) {
            System.out.println("我在学习多线程---"+i);
        }
    }
}
