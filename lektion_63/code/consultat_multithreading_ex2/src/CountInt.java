public class CountInt implements Runnable {

    int counter = 0;

    @Override
    public void run() {
        for (int i = 0; i<1000;i++){
            counter++;
        }
    }
}