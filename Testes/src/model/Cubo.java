package model;

public class Cubo {
	private double aresta;
	
	public double getAresta() {
		return aresta;
	}
	public void setAresta(double aresta) {
		this.aresta = aresta;
		
		
	}
	public double volume (double aresta) {
		return Math.pow(aresta, 3);
	}
	public double areaFace(double aresta) {
		return Math.pow(aresta, 2);
	}
	public double areaTotal(double aresta) {
		return 6*(Math.pow(aresta, 2));
	}
	public double diagonalFace(double aresta) {
		return aresta;
	}
	public double diagonalInterna(double aresta) {
		return aresta * Math.sqrt(3);
	}
	public double comprimentoTotalArestas(double aresta) {
		return aresta *12;
	}
}
