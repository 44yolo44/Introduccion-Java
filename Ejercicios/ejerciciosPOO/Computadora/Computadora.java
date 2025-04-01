package EjercicioPoo;

import java.util.Objects;

public class Computadora {
	
	private String Marca;
	private String Modelo;
	private int Ram;
	private int Almacenamiento;
	private int AlmacenamientoUtilizado;
	private boolean Encendido;
	
	public Computadora() throws IllegalAccessException  {
		this("","",4,50);
	}

	public Computadora(int ram) throws IllegalAccessException  {
		this("","",ram,50);
	}

	public Computadora(int ram, int almacenamiento) throws IllegalAccessException  {
		this("","",ram,almacenamiento);
	}

	public Computadora(String marca, String modelo, int ram, int almacenamiento) throws IllegalAccessException  {
		
		if(!espotenciade2(ram)) {
			throw new IllegalAccessException("la ram no es potencia de 2");
		}
		
		Marca = marca;
		Modelo = modelo;
		Ram = ram;
		Almacenamiento = almacenamiento;
	}
	

	public String getMarca() {
		return Marca;
	}

	public void setMarca(String marca) {
		Marca = marca;
	}

	public String getModelo() {
		return Modelo;
	}

	public void setModelo(String modelo) {
		Modelo = modelo;
	}

	public int getRam() {
		return Ram;
	}

	public void setRam(int ram) {
		Ram = ram;
	}

	public int getAlmacenamiento() {
		return Almacenamiento;
	}

	public void setAlmacenamiento(int almacenamiento) {
		Almacenamiento = almacenamiento;
	}

	public int getAlmacenamientoUtilizado() {
		return AlmacenamientoUtilizado;
	}

	public void setAlmacenamientoUtilizado(int almacenamientoUtilizado) {
		AlmacenamientoUtilizado = almacenamientoUtilizado;
	}

	public boolean isEncendido() {
		return Encendido;
	}

	public void setEncendido(boolean encendido) {
		Encendido = encendido;
	}
	
	
	public void encender () {
		if (this.Encendido) {
			System.out.println("El ordenador ya estaba encendido");
		} else {
			this.Encendido=true;
			System.out.println("El ordenador ya esta encendido");

		}
	}
	
	public void apagar () {
		if (!this.Encendido) {
			System.out.println("El ordenador ya estaba apagado");
		} else {
			this.Encendido=false;
			System.out.println("El ordenador ya esta apagado");

		}
	}
	
	public void tranferirArchivos(int gb) {
		if(this.Encendido) {
			if (this.AlmacenamientoUtilizado + gb <= this.Almacenamiento) {
				
				this.AlmacenamientoUtilizado+=gb;
				
				System.out.println("transferido "+gb+"gb.Espacio Actual : "+this.AlmacenamientoUtilizado);
				
			} else {
				
				System.out.println("no hay espacio suficiente");
			}		
		}else {
			System.out.println("el ordenador esta apagado");
		}
	}
	
	public void eliminarArchivos(int gb) {
		if(this.Encendido) {
			if (this.AlmacenamientoUtilizado - gb < 0) 
				this.AlmacenamientoUtilizado = 0;
			else {
				this.AlmacenamientoUtilizado-=gb;
			}
			System.out.println("transferido "+gb+"gb.Espacio Actual : "+this.AlmacenamientoUtilizado);		
		}else {
			System.out.println("el ordenador esta apagado");
		}
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(Marca, Modelo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Computadora other = (Computadora) obj;
		return Objects.equals(Marca, other.Marca) && Objects.equals(Modelo, other.Modelo);
	}

	
	@Override
	public String toString() {
		
		String estadoEncendido = "no";
		
		if(this.Encendido) {
			estadoEncendido = "si";
		}
		
		
		return "Computadora [Marca=" + Marca + ", Modelo=" + Modelo + ", Ram=" + Ram + ", Almacenamiento="
				+ Almacenamiento + ", AlmacenamientoUtilizado=" + AlmacenamientoUtilizado + ", Encendido=" + estadoEncendido
				+ "]";
	}

	private boolean espotenciade2(int numero) {
		if(numero<=0) {
			return false;
		}
		
		double logbase2 = Math.log(numero)/Math.log(2);
		return logbase2 == (int)logbase2;
	}
	
	
	
	
	
	
	
	
	
	

}
