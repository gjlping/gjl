package redis;

import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

/**
 * @author gjl
 * @date 16:49 2019/4/2
 */
public class Service {
    DistributedLock lock = new DistributedLock();

    int n = 500;

    public void seckill() {
        // 返回锁的value值，供释放锁时候进行判断
        //这个位置可以封装起来，用注解扫描并且代理模式，实现代理执行锁已经解锁，实现开闭原则。
        String indentifier = lock.lockWithTimeout("resource", 5000, 1000);
        System.out.println(Thread.currentThread().getName() + "获得了锁");
        System.out.println(--n);
        lock.releaseLock("resource", indentifier);
    }
}
