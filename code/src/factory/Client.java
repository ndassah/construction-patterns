package factory;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("test de la solution");
		ProduitFactory produitfactoryA =  new ProduitFactoryA();
		ProduitFactory produitfactoryB =  new ProduitFactoryB();
		ProduitFactory produitfactoryC =  new ProduitFactoryC();
		ProduitFactory produitfactoryD =  new ProduitFactoryD();
		
		
		Produit produit = null;
		
		produit = produitfactoryD.getProduit();
		produit.methodeproduit();
	}

}
