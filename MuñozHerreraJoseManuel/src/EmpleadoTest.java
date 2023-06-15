import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class EmpleadoTest {

	Empleado emp1 = new Empleado("Pepe",1500);
	
	/**
	 * @author DAM-1
	 * @exception 
	 * @param resultadoObtenido --> Boolean que obtendre al realizar el metodo tieneSueldoBajo
	 * @return nothing
	 * @see Empleado.tieneSueldoBajo
	 * @throws
	 */
	@Test
	public void testSueldoBajo() {
		
		boolean resultadoObtenido = emp1.tieneSueldoBajo();
		assertFalse(resultadoObtenido, "El sueldo de este trabajador no es bajo");
		
	}
	
	@Test
	public void testSueldoAlto() {
		
		boolean resultadoObtenido = emp1.tieneSueldoAlto();
		assertFalse(resultadoObtenido, "El sueldo de este trabajador no es alto");
		
	}
	
	Empleado emp2 = new Empleado("Pepe",1100);
	
	@Test
	public void testSueldoBajo2() {
		
		boolean resultadoObtenido = emp2.tieneSueldoBajo();
		assertTrue(resultadoObtenido, "El sueldo de este trabajador si es bajo");
		
	}
	
	@Test
	public void testSueldoAlto2() {
		
		boolean resultadoObtenido = emp2.tieneSueldoAlto();
		assertFalse(resultadoObtenido, "El sueldo de este trabajador no es alto");
		
	}
	
Empleado emp3 = new Empleado("Pepe",4000);
	
	@Test
	public void testSueldoBajo3() {
		
		boolean resultadoObtenido = emp3.tieneSueldoBajo();
		assertFalse(resultadoObtenido, "El sueldo de este trabajador no es bajo");
		
	}
	
	@Test
	public void testSueldoAlto3() {
		
		boolean resultadoObtenido = emp3.tieneSueldoAlto();
		assertTrue(resultadoObtenido, "El sueldo de este trabajador si es alto");
		
	}

}
