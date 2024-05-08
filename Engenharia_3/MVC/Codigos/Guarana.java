public class Guarana implements Bebida{
	private View view;
	private Pizzaria pizzaria;
	
	public void addBebida(){
		System.out.println("Guarana adicionado");
	}
	
	public void setView(View v){
		this.view = v;
	}
}