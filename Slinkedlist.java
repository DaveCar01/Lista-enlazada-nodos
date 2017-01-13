package strc;

public class Slinkedlist 
{
	protected Node head;
	protected long size;
	
	
	public void SLinkedlist() 
	{
	head = null;
	size= 0; 

	}
	 public boolean estaVacia(){
		 
		 return head==null;
		 
	 }

	 public void insertaralInicio(String a){
		 if (estaVacia()) 
			  head= new Node(a);
		 else 
			  head = new Node(a,head);
		 
		 
	 }
	 
	 public void insertarFinal(String a){

	     Node auxiliar = new Node(a);
	     Node inicio;

	     if (estaVacia()) {
	         insertaralInicio(a);
	     }else {
	         inicio = head;         
	         while(inicio.getNext() != null){
	             inicio=inicio.getNext();
	         }              
	         inicio.setNext(auxiliar);
	     }
	 }
	 
	 public  void vaciar(){
		  head=null;
	 }
	 
	 public int tamaño()
	 {
	     Node auxiliar;
	     size=0;
	     auxiliar = head;

	     while(auxiliar != null)
	     {
	         size++;
	         auxiliar = auxiliar.getNext();
	     }
	     return (int) size;

	 }
	 
	public void localizar(int posicion){
		 
	     Node auxiliar= head;
	     int contador=1;

	     if(posicion<1 || posicion>=tamaño()){
	         System.out.println("posicion no encontrada");
	     }else{
	         while(auxiliar!=null){
	             if (posicion == contador){
	                 System.out.println("el elemento es : "+auxiliar.getElement()
	                 					+": en la posicion "+ posicion);
	                 auxiliar=null;
	                 }
	                 
	             else{                 
	                 auxiliar=auxiliar.getNext();
	                 contador++;
	             }
	         }
	     }
	 }
	 public void eliminarpos(int posicion){
		 
	     Node auxiliar= head;
	     Node anterior=null;
	     int contador=1;

	     if(posicion<1 || posicion>=tamaño()){
	         System.out.println("posicion no encontrada");
	     }else{
	         while(auxiliar!=null){
	             if (posicion == contador){
	                 if (anterior==null){
	                     head = head.getNext();
	                 }else {
	                     anterior.setNext(auxiliar.getNext());
	                 }
	                 auxiliar=null;
	             }else{
	                 anterior=auxiliar;
	                 auxiliar=auxiliar.getNext();
	                 contador++;
	             }
	         }
	     }
	 }
	 
	 public void imprimirLista(){
	     System.out.println("LA LISTA ES :  ");
	 
	     
	     Node auxiliar= head;
	     
	     while(auxiliar!=null){
	         System.out.println(auxiliar.getElement());
	         auxiliar=auxiliar.getNext();
	     }
	     
	 }

	
	
}
