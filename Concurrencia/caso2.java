import java.util.concurrent.Semaphore;
 
public class caso2{
 
    static int contador = 0;
    static Semaphore semaforo = new Semaphore(1); 
    public static void main(String[] args) throws InterruptedException {
 
        Thread hilo1 = new Thread(() -> {
            for (int i = 0; i < 100000; i++) {
                try {
                    semaforo.acquire();
                    contador++;
                    semaforo.release();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
 
        Thread hilo2 = new Thread(() -> {
            for (int i = 0; i < 100000; i++) {
                try {
                    semaforo.acquire();
                    contador++;
                    semaforo.release();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
 
        hilo1.start();
        hilo2.start();
 
        hilo1.join();
        hilo2.join();
 
        System.out.println("Valor final del contador: " + contador);
        
    }
}