public class Main {
    public static void main(String[] args) {
        System.out.println("Main thread starts");

        //создание обьекта, реализующего интерфейс Runnable
        MyThread2 myThread = new MyThread2("Thread1");

        //создание потока на этом обьекте
        Thread newThread = new Thread(myThread);
        Thread newThread1 = new Thread(myThread,"Thread2");

        //запуск потока
        newThread.start();




        for (int i=0;i<100;i++){
            System.out.print("#");
            try{
                Thread.sleep(100);
                //  Thread.sleep(0);
            }
            catch(InterruptedException e){
                System.out.println("main thread interrupted");
            }
        }
        System.out.println("end of main");
    }
}