package factoryMethods;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("test avec le pattern factory methode");
		
		FabriqueProduit fabriqueproduit = new FabriqueProduit();
		Produit produit=null;
		
		produit=fabriqueproduit.createProduit(fabriqueproduit.typeA);
		produit.methodeproduit();
		
		produit=fabriqueproduit.createProduit(fabriqueproduit.typeC);
		produit.methodeproduit();

	}

}
