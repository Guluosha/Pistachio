package org.pistachio.practice;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * CopyRight (C),深圳市万古盛世互联科技有限公司
 * <br/><b/>
 *
 * @author SingleCycle(QQ ： 单曲循环)
 * @date 2019/7/4 ~ 下午 7:20
 */

public class SequentialPrint {

    private static int state = 0;

    public static void main(String[] args) {
        final Lock lock = new ReentrantLock();
        Thread threadA = new Thread(new Runnable() {
            public void run() {
                lock.lock();
                while (state <= 30) {
                    if (state % 3 == 0) {
                        System.out.println("A");
                        state++;
                    }
                }
                lock.unlock();
            }
        });

        Thread threadB = new Thread(new Runnable() {
            public void run() {
                lock.lock();
                while (state <= 30) {
                    if (state % 3 == 1) {
                        System.out.println("B");
                        state++;
                    }
                }
                lock.unlock();
            }
        });

        Thread threadC = new Thread(new Runnable() {
            public void run() {
                lock.lock();
                while (state <= 30) {
                    if (state % 3 == 2) {
                        System.out.println("C");
                        state++;
                    }
                }
                lock.unlock();
            }
        });
        threadA.start();
        threadB.start();
        threadC.start();
    }
}
