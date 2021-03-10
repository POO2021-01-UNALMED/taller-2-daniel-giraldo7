package test;
public class Auto {
	String modelo;
	int precio;
	Asiento asientos[];
	String marca;
	Motor motor;
	int registro;
	static int cantidadCreados;
	int cantidadAsientos() {
		int numeroAsientos = 0;
		for (Asiento asiento : asientos) {
			if (asiento != null) {
			numeroAsientos++;
			}
		}
		return numeroAsientos;
	}
	public String verificarIntegridad() {
		boolean registroIgual = true;
		
		for(Asiento asiento : asientos) {
			if(asiento != null) {
				if(asiento.registro != this.registro) {
					registroIgual = false;
				}
			}
		}
		if((motor.registro == this.registro) && registroIgual) {
			return "Auto original";
		}
		else {
			return "Las piezas no son originales";
		}
	}
}