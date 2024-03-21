public class Main {
    public static void main(String[] args){
        Conta conta = Conta.getInstance();
        
        conta.setConta(1.0);
        conta.setConta(2.0);
        conta.setConta(3.0);
        
        System.out.println(conta.getConta());
    }
}
