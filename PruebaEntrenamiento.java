
import org.junit.Test;
import org.junit.Assert;

public class PruebaEntrenamiento {

	@Test
	public void calcularRecorridoPromedioConEntrenamientoRegularDe10Km() {
		
		Entrenamiento entrenamiento = new Entrenamiento();
		entrenamiento.recorrido1 = 10;
		entrenamiento.recorrido2 = 10;
		entrenamiento.recorrido3 = 10;
		entrenamiento.recorrido4 = 10;
		entrenamiento.recorrido5 = 10;
		
		double promedio = entrenamiento.calcularRecorridoPromedio();
		
		Assert.assertEquals(10, promedio, 0.1);
	}
}
