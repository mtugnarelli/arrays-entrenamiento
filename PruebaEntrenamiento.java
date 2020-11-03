
import org.junit.Test;
import org.junit.Assert;

public class PruebaEntrenamiento {

	@Test
	public void calcularRecorridoPromedioConEntrenamientoRegularDe10Km() {
		
		Entrenamiento entrenamiento = new Entrenamiento();
		entrenamiento.registrarRecorrido(1, 10);
		entrenamiento.registrarRecorrido(2, 10);
		entrenamiento.registrarRecorrido(3, 10);
		entrenamiento.registrarRecorrido(4, 10);
		entrenamiento.registrarRecorrido(5, 10);
		
		double promedio = entrenamiento.calcularRecorridoPromedio();
		
		Assert.assertEquals(10, promedio, 0.1);
	}
	
	@Test
	public void registrarRecorridoMenos2LanzaUnaExcepcion() {
		
		Entrenamiento entrenamiento = new Entrenamiento();
		
		entrenamiento.registrarRecorrido(1, -2);
	}
}
