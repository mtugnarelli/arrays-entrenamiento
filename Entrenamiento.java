
public class Entrenamiento {

	double recorrido1;
	double recorrido2;
	double recorrido3;
	double recorrido4;
	double recorrido5;
	
	/**
	 * post: devuelve el promedio de las distancias recorridas [Km].
	 */
	double calcularRecorridoPromedio() {
		
		return (recorrido1 + recorrido2 + 
				recorrido3 + recorrido4 + 
				recorrido5) / 5;
				
	}
}
