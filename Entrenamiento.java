
public class Entrenamiento {

	private double[] recorridos = new double[5];
	
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
		
		if (distancia < 0.0) {
			
			Error distanciaInvalida = new Error("La distancia no puede ser menor 0");
			throw distanciaInvalida;
		}
		
		if (dia == 1) {
			recorridos[0] = distancia;

		} else if (dia == 2) {
			recorridos[1] = distancia;

		} else if (dia == 3) {
			recorridos[2] = distancia;
			
		} else if (dia == 4) {
			recorridos[3] = distancia;
			
		} else if (dia == 5) {
			recorridos[4] = distancia;
			
		}
	}
	
	/**
	 * post: devuelve el promedio de las distancias recorridas [Km].
	 */
	public double calcularRecorridoPromedio() {
		
		return (recorrido1 + recorrido2 + 
				recorrido3 + recorrido4 + 
				recorrido5) / 5;
	}
	
	/**
	 * post: devuelve la distancia máxima de los recorridos registrados.
	 * 
	 */
	public double buscarRecorridoMaximo() {
		
		double maximo = recorrido1;
		
		if (recorrido2 > maximo) {
			maximo = recorrido2;
		} 
		
		if (recorrido3 > maximo) {
			maximo = recorrido3;
		}
		
		if (recorrido4 > maximo) {
			maximo = recorrido4;
		}
		
		if (recorrido5 > maximo) {
			maximo = recorrido5;
		}

		return maximo;
	}
}
