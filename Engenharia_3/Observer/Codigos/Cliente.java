public class Cliente implements Observer{
    public void notify(String msg){
        System.out.println(msg);
    }
}
