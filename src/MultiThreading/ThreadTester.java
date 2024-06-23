package MultiThreading;

public class ThreadTester {
    public static void main(String[] args) {

        System.out.println("Main is starting");
        Thread thread1= new Thread1("Thread1");
        thread1.setDaemon(true);        //should be done before thread starts
        thread1.start();                //JVM gets the instruction on when to start the thread

        /**
         * Thread class has an overridden run method for which we need to make sure that the target is
         * not null. For this reason, we pass an instance of Thread2 in the parameter.
         */
        Thread thread2= new Thread(new Thread2(),"Thread2");
        thread2.start();

        Thread thread3= new Thread(()->{            //using lambda function
            for(int i=0;i<5;i++)
                System.out.println("Inside "+Thread.currentThread());
        },"thread3");

        thread3.start();;
        System.out.println("Main in exiting");      //JVM decides which thread to run and it is on its mercy
    }
}
