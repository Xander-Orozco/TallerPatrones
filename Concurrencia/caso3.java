import java.util.concurrent.Semaphore;
class CuentaBancaria {
    private int saldo;
    private Semaphore semaforo;
    public CuentaBancaria(int saldoInicial) {
        this.saldo = saldoInicial;
        this.semaforo = new Semaphore(1);
    }
    public void retirar(int cantidad, String nombreHilo) {
        try {
            semaforo.acquire();
            if (saldo >= cantidad) {
                System.out.println(nombreHilo + " retira " + cantidad);
                saldo -= cantidad;
                System.out.println("Saldo restante: " + saldo);
            } else {
                System.out.println(nombreHilo + " no pudo retirar. Saldo: " + saldo);
            }
            semaforo.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public int getSaldo() {
        return saldo;
    }
}
public class caso3 {
    public static void main(String[] args) throws InterruptedException {
        CuentaBancaria cuenta = new CuentaBancaria(1000);
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                cuenta.retirar(300, "Hilo 1");
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                cuenta.retirar(300, "Hilo 2");
            }
        });
        Thread t3 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                cuenta.retirar(300, "Hilo 3");
            }
        });
        t1.start();
        t2.start();
        t3.start();
        t1.join();
        t2.join();
        t3.join();
        System.out.println("Saldo final: " + cuenta.getSaldo());
    }
}