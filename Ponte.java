package produtor_consumidor;

public class Ponte {
    boolean disponivel; 
    
    public Ponte(){
        this.disponivel=true;
    }
    
    public synchronized void atravessa(String categoria){
        try{
           if(disponivel==false){
               System.out.println(categoria+"ocupado");
               wait();
           }
           disponivel=false;
           System.out.println(categoria+" atravessando"+Thread.currentThread().getPriority());
           for(int i=1;i<=10;i++){
               System.out.print(i+" ");
               Thread.sleep(10);
           }
           System.out.println("");
           System.out.println("-------------------------------------------------------------------");
           notifyAll();        
        }
        catch(InterruptedException e){}
        
        finally{
                System.out.println(categoria+" a seguir");
                disponivel=true;
                }
    }  
}
