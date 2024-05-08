
import java.util.List;

public class View implements Observer{
	private Bebida bebida;
	private List<Pizza> pizzas;
	
	public void setBebida(Bebida b){
		this.bebida = b;
	}
	
	public void update(List<Pizza> pizzas){
		this.pizzas = pizzas;
	}
}