
package produtor_consumidor;

public class Carro extends Thread {
    String categoria;
    int prioridade;
    Ponte ponte;
    
    public Carro(String categoria, Ponte ponte){
        this.categoria=categoria;
        this.ponte=ponte;
        
        if(categoria=="carro"){  //aplica prioridade com base na categoria do carro
            this.prioridade=5;
        }
        else if(categoria=="viatura"){
            this.prioridade=7;
        }
        else if(categoria=="ambulancia"){
            this.prioridade=10;
        }     
    }
    
    @Override
    public void run(){
        ponte.atravessa(categoria);
    }
}
