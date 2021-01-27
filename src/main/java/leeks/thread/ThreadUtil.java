package leeks.thread;


import java.util.concurrent.ExecutorService;

public class ThreadUtil {

    public static ExecutorService obtainExecutor() {
//            return (ExecutorService) AsyncTask.THREAD_POOL_EXECUTOR;
        return ThreadPool.defaultPool();
    }

    public static void runOnBackground(Runnable con) {
        obtainExecutor().execute(con);
    }


    /**
     * for some task should not wait in the queue, malloc a new thread for them,
     *
     * @param con
     * @param noWait
     */
    public static void runOnBackground(Runnable con, boolean noWait) {
        if (noWait) {
            new Thread(con).start();
        } else {
            runOnBackground(con);
        }
    }

}
