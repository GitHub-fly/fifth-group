package part4;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @Author xuyuan
 * @Date 2020/2/23 0:07
 * @Version 1.0
 */
public class CallableTest {
    public static void main(String[] args) {
        ThreadDemo td = new ThreadDemo();
        //1.执行 Callable 方式，需要 FutureTask 实现类的支持，用于接收运算结果。
        FutureTask<Integer> result = new FutureTask<>(td);
        new Thread(result).start();
        try {
            Integer sum = result.get();
            System.out.println(sum);
            System.out.println("-----------------------------");
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }
}

class ThreadDemo implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        int sum = 0;

        for (int i = 0; i <= 100; i++) {
            sum += i;
        }
        return sum;
    }
    }

