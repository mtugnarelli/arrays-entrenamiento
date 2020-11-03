
public class Entrenamiento {

	private double recorrido1;
	private double recorrido2;
	private double recorrido3;
	private double recorrido4;
	private double recorrido5;
	

	/**
	 * pre : 'dia' está en rango [1-5] y 'distancia' es mayor o igual a 0.
	 * post: registra la distancia recorrida en el día indicado. 
	 * 
	 * @param dia
	 * @param distancia
	 */
	public void registrarRecorrido(int dia, double distancia) {
		
	}
	
	/**
	 * post: devuelve el promedio de las distancias recorridas [Km].
	 */
	public double calcularRecorridoPromedio() {
		
		return (recorrido1 + recorrido2 + 
				recorrido3 + recorrido4 + 
				recorrido5) / 5;
	}
}
