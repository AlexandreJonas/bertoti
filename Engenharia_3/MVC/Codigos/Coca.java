public class Coca implements Bebida{
	private View view;
	private Pizzaria pizzaria;
	
	public void addBebida(){
		System.out.println("Coca adicionado");
	}
	
	public void setView(View v){
		this.view = v;
	}
}