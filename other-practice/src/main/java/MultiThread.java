import config.NormalThreadFactory;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * CopyRight (C),深圳市万古盛世互联科技有限公司
 * <br/><b/>
 *
 * @author SingleCycle(QQ ： 单曲循环)
 * @date 2019/8/30 ~ 上午 11:00
 */

public class MultiThread {

    private static boolean stopRequested;

    private static ThreadPoolExecutor THREAD_POOL_EXECUTOR;

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        THREAD_POOL_EXECUTOR = new ThreadPoolExecutor(availableProcessors, availableProcessors * 2, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue<>(availableProcessors * 4), new NormalThreadFactory(), new ThreadPoolExecutor.CallerRunsPolicy());
    }

    /**
     * jvm默认会尽力保证数据的可见性，若cpu有时间去保证数据可见性，那么线程就能获得最新的数据（神奇，现在才知道有这事，抽空看看多线程实战那本书，看看书里面有没有提到这点）
     *
     * @param args 请求参数
     * @throws InterruptedException 中断异常类
     */
    public static void main(String[] args) throws InterruptedException {
        AtomicInteger count = new AtomicInteger(0);
        THREAD_POOL_EXECUTOR.execute(new MultiThread.CounterThread());
        TimeUnit.SECONDS.sleep(1L);
        stopRequested = true;
        int activeCount = THREAD_POOL_EXECUTOR.getActiveCount();
        long taskCount = THREAD_POOL_EXECUTOR.getTaskCount();
        while (!THREAD_POOL_EXECUTOR.isTerminated()) {
            System.out.println("当前记数：" + count.getAndIncrement() + "\n活跃的线程数量：" + activeCount + "\n待执行的任务数量（非运行状态的线程数量）：" + taskCount);
            TimeUnit.SECONDS.sleep(1L);
        }
    }

    public static class CounterThread implements Runnable {

        @Override
        public void run() {
            int index = 0;
            while (!stopRequested) {
                try {
                    TimeUnit.SECONDS.sleep(2L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                index++;
                System.out.println("啥东西" + index);
            }
            System.out.println("哦豁，状态值被主线程改了" + stopRequested);
        }
    }
}
