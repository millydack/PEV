package pevolp1.algoritmo.cromosoma;

import pevolp1.algoritmo.gen.Gen;

public abstract class Cromosoma {
	
	protected double fitness;
	protected double fitness_bruto; //Aptitud antes de transformarla
	protected double punt;
	protected double puntAcum;
	protected Gen[] genes;
	protected double fenotipo;
	private int longitud;
	protected static int N_GENES;
	
	public double getFitness() {
		return fitness;
	}
	public void setFitness(double fitness) {
		this.fitness = fitness;
	}
	public double getPunt() {
		return punt;
	}
	public void setPunt(double d) {
		this.punt = d;
	}
	public double getPuntAcum() {
		return puntAcum;
	}
	public void setPuntAcum(double puntAcum) {
		this.puntAcum = puntAcum;
	}
	public Gen[] getGenes() {
		return genes;
	}
	public void setGenes(Gen[] genes) {
		this.genes = genes;
	}
	
	public int getNGenes(){
		return N_GENES;
	
	}
	public double getFitness_bruto() {
		return fitness_bruto;
	}
	public void setFitness_bruto(double fitness_bruto) {
		this.fitness_bruto = fitness_bruto;
	}
	
	/**
	 * Convierte el contenido de la cadena binaria que lleva el gen en su valor decimal
	 * @param gen Gen que se traducirá a decimal
	 * @return Valor decimal de la cadena binaria
	 */
	public double bin_dec(Gen gen) {
		int longGen = gen.getLongAlelo();
		int pos = 0;
		double valor = 0;
		
		for(int i = longGen-1; i >= 0; i--){
			if(gen.getPosAlelo(i)){
				double num = (float)Math.pow(2, pos);
				valor += num;
			}
			pos++;
		}
		
		return valor;
	}
	
	public abstract double fenotipo(int pos);
	public abstract double evalua();
	public abstract String toString();
	public abstract Cromosoma copia();
	public int getLongitud() {
		return longitud;
	}
	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}
}
