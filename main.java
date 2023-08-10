
package produtor_consumidor;

import java.lang.*;

public class ProduzConsome {
    public static void main(String[] args) throws InterruptedException {
        Ponte ponte = new Ponte();
        Carro ambulancia = new Carro("ambulancia",ponte);
        Carro viatura1 = new Carro("viatura",ponte);
        Carro viatura2 = new Carro("viatura",ponte);
        Carro carro1 = new Carro("carro",ponte);
        Carro carro2 = new Carro("carro",ponte);

        ambulancia.start();
        viatura1.start();
        viatura2.start();
        carro1.start();
        carro2.start();
        
        for(int j=1;j<=10;j++){
        ambulancia.join();
        viatura1.join();
        viatura2.join();
        carro1.join();
        carro2.join();  
        }
    }
}
