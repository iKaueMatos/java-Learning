package POO.herança.carro;

public class Ferrari extends  Carro{


    public Ferrari(int velocidadeAtual) {
        super();
    }

    //@ Significa -> anotashion = ou seja anotação
    @Override //@override -> serve para verificarmos se estamos sobreescrevendo um metodo que esta na nossa classe pai
    void acelerar2(){
    if(velocidadeAtual > limiteVelocidade){
        System.out.println("Você atigiu o limite de velocidade");
        freiar();
    }
    velocidadeAtual += 15; //atribuindo velocidade para ferrari de 15 km/h
    }
}
