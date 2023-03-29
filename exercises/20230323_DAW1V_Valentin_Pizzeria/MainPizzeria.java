import java.security.cert.PKIXReason;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class MainPizzeria {
  public static void main(String[] args) {

  /*
    Pizza.TamanioPizza tamanio = Pizza.TamanioPizza.SMALL;
    System.out.println("Tamanio es: " + tamanio);
    tamanio = Pizza.TamanioPizza.MEDIUM;
    System.out.println("Tamanio es: " + tamanio);
    tamanio = Pizza.TamanioPizza.BIG;
    System.out.println("Tamanio es: " + tamanio);

    tamanio = Pizza.TamanioPizza.SUPERBIG;
    System.out.println("Tamanio es: " + tamanio);
  */

    List<Cliente> listaClientes=new Vector<Cliente>();
    List<Pedido> listaPedidos=new LinkedList<Pedido>();

    Cliente cliente = new Cliente("valentin", "Paun", "Sargento barriga", "6666666");
    listaClientes.add(cliente);

    cliente = new Cliente("Maria", "de la O", "Narnia", "6666667");
    listaClientes.add(cliente);

    Pedido pedido = new Pedido(cliente, Pizza.TamanioPizza.BIG , "margarita");
    listaPedidos.add(pedido);

    pedido = new Pedido(listaClientes.get(0), Pizza.TamanioPizza.SMALL , "hawaiana");
    listaPedidos.add(pedido);


    System.out.println("Lista clientes:");
    for(int i=0; i< listaClientes.size(); i++){
      System.out.println((i+1) + ") " + listaClientes.get(i) );
    }
    
    System.out.println("Lista pedidos:");
    for(int i=0; i< listaPedidos.size(); i++){
      System.out.println((i+1) + ") " + listaPedidos.get(i) );
    }

    
  }

}
