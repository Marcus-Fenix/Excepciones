import java.util.ArrayList;
import java.util.List;


public final class ListaNumeros {
	
	private List<Integer> list;
	private final int size = 10;
	
	public ListaNumeros(){
		list = new ArrayList<Integer>(size);
		for(int i = 0; i < 10; i++){
			list.add(new Integer(i));
		}
	}
	
	public void ImprimirLista(){
		try{
			for(int i = 0; i < 20; i++){
				System.out.println("El valor en "+i+" = "+list.get(i));
			}
		}
		catch(IndexOutOfBoundsException e){
			System.out.println("la Lista solo tiene "+size+ " elementos");
		}
	}

}
