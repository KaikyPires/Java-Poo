
package estudo;

public class Caneta {
    String modelo;
    String cor;
    int carga;
    float ponta;
    boolean tampada;
    
    void status(){
        System.out.println("Uma caneta "+ this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("esta tampada ? " + this.tampada);
        System.out.println("Carga : " + carga);
    }
    void rabiscar(){
       if(tampada == false){
           System.out.println("Rabiscado");
       }else System.out.println("Erro");
    }
    void destampar(){
       this.tampada = false;
    }

    void tampar(){
       this.tampada = true;
    }
}
