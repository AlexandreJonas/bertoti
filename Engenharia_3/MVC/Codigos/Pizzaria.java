
import java.util.List;

public class Pizzaria implements Subject{
	private List<Pizza> pizzas;
	private List<Observer> observer;
	
	public void registerObserver(Observer o){
	this.observer.add(o);
	}
	
	public void notifyObserver(List<Pizza> pizzas){
		this.observer.stream().forEach(k -> {
		System.out.println("Pizzas Add");
		pizzas.stream().forEach(p -> {
		System.out.println(p.getNome());
		});
		});
	}
	
	public void addPizza(Pizza p){
		this.pizzas.add(p);
	}
}