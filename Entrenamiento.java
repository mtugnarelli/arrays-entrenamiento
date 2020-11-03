
public class Entrenamiento {

	private double recorrido1;
	private double recorrido2;
	private double recorrido3;
	private double recorrido4;
	private double recorrido5;
	
	/**
	 * post: devuelve el promedio de las distancias recorridas [Km].
	 */
	public double calcularRecorridoPromedio() {
		
		return (recorrido1 + recorrido2 + 
				recorrido3 + recorrido4 + 
				recorrido5) / 5;
	}
}
