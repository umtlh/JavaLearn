public class KronometreThread implements Runnable{

    private Thread t;
    private String threadName;
    private Thread thread;

    public KronometreThread(String threadName){
        this.threadName = threadName;
        System.out.println("Oluşturuluyor:"+threadName);

    }

    @Override
    public void run() {
        System.out.println("Çalıştırılıyor: "+threadName);
        try
        {
            for (int i=1;i<=10;i++){
                System.out.println(threadName + ": " +i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("Kesildi: "+threadName);
                    throw new RuntimeException(e);
                }
                System.out.println("Thread bitti:"+ threadName);
            }

        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }
    }
    public void start(){
        System.out.println("Thread nesnesi oluşturuluyor");
        if(thread==null){
            thread =new Thread(this,threadName);
            thread.start();
        }
    }

}
