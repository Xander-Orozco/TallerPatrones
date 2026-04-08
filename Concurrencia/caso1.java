//EDWARD STIVEN PANTOJA PANTOJA
//XANDER RIKELME OROZCO BURBANO
public class caso1 {
 
    static int contador = 0;
 
    public static void main(String[] args) throws InterruptedException {
 
        Thread hilo1 = new Thread(() -> {
            for (int i = 0; i < 100000; i++) {
                contador++;
            }
        });
 
        Thread hilo2 = new Thread(() -> {
            for (int i = 0; i < 100000; i++) {
                contador++;
            }
        });
 
        hilo1.start();
        hilo2.start();
 
        hilo1.join();
        hilo2.join();
 
        System.out.println("Valor final del contador: " + contador);
    }
}