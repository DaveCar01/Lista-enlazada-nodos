package strc;

import javax.swing.JOptionPane;
import javax.swing.text.StyledEditorKit.BoldAction;

public class Aplicacion {
	
	public static String herramientas;
	public static String lista;
	public static String localizarHerramienta;
	public static int eleminarHerramienta;
	public static int opcion;

	public static void main(String[] args) 
	{
		
		
		/*Slinkedlist lista = new Slinkedlist(); 
		
		 if (lista.estaVacia())
			 System.out.println("Lista sin llenar");
		 
		 lista.insertarFinal("cable gemelo");
		 lista.insertarFinal("ponchadora");
		 lista.insertarFinal("cable coaxial");
		 lista.insertarFinal("cable utp");
		 lista.insertarFinal("terminales");
		 
		 lista.insertaralInicio("suelda");
		 lista.insertaralInicio("cautin");
		 lista.insertaralInicio("estaño");
		 lista.insertaralInicio("baquelita");
		 lista.insertaralInicio("broca de pelo");
		 
		 
		 lista.imprimirLista();
		 System.out.println("la lista esta compuesta de :  "+lista.tamaño());
		 
		 lista.eliminarposicion(2);
		 
		 lista.imprimirLista();
		 System.out.println("la lista esta compuesta de :  "+lista.tamaño());
		 
		 lista.localizar(6);
		 
		 lista.vaciar();
		 
		 if (lista.estaVacia())
			 System.out.println("\nLista sin llenar");
		 
		 System.out.println("la lista esta compuesta de :  "+lista.tamaño());*/
		
		Slinkedlist elementos = new Slinkedlist();
		if(elementos.estaVacia())
			//JOptionPane.showInputDialog("la lista esta vacia"); 
	
		do{
			opcion=Integer.parseInt(JOptionPane.showInputDialog("cuantas herramientas quieres ingreasar -> "));
			
			if (opcion > 0)
			{
				for(int i=0; i < opcion; i++)
				{
					herramientas = JOptionPane.showInputDialog("ingrese las herraminetas que desea comprar");
					elementos.insertaralInicio(herramientas);
					
				}
			}
		}
		while( opcion<=0);
		elementos.imprimirLista();
		
		/*eleminarHerramienta= Integer.parseInt(JOptionPane.showInputDialog("desea eliminar una herramienta"+"\n" +elementos.ListaCab()));
		elementos.eliminarposicion(eleminarHerramienta);
		JOptionPane.showMessageDialog(null, "la lista es: "+elementos.tamaño());*/
		
		//elementos.imprimirLista(eleminarHerramienta+ elementos.ListaNueva());
		int a=Integer.parseInt(JOptionPane.showInputDialog("que herramienta desea buscar") );
		elementos.localizar(a);
		do{
			opcion=Integer.parseInt(JOptionPane.showInputDialog("cuantas herramientas quieres ingreasar -> "));
			
			if (opcion > 0)
			{
				for(int i=0; i < opcion; i++)
				{
					herramientas = JOptionPane.showInputDialog("ingrese las herraminetas que desea comprar");
					elementos.insertarFinal(herramientas);
					
				}
			}
		}
		while( opcion<=0);
		elementos.imprimirLista();
	}

}
