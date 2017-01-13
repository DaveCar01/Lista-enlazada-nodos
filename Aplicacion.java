package strc;

public class Aplicacion {

	public static void main(String[] args)
	{
				 
		Slinkedlist lista = new Slinkedlist(); 
		
		 if (lista.estaVacia())
			 System.out.println("Lista sin llenar");
		 
		 lista.insertarFinal("cable");
		 lista.insertarFinal("ponchadora");
		 lista.insertarFinal("cable coaxial");
		 lista.insertarFinal("cable utp");
		 lista.insertarFinal("terminales");
		 
		 lista.imprimirLista();
		 System.out.println("la lista esta compuesta de :  "+lista.tamaño()+" y los elentos son:");
		 
		 lista.eliminarpos(3);
		 
		 lista.imprimirLista();
		 System.out.println("la lista esta compuesta de :  "+lista.tamaño()+" y los elentos son:");
		 
		 lista.localizar(3);
		 
		 lista.vaciar();
		 
		 if (lista.estaVacia())
			 System.out.println("\nLista sin llenar");
		 
		 System.out.println("la lista esta compuesta de :  "+lista.tamaño()+" y los elentos son:");

	}

}
