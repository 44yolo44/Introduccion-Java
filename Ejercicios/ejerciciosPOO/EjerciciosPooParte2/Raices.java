package parte1;

class Raices {
	//atributos
	private double a; 
	private double b;
	private double c;
	//metodos
	
	//constructor 
	public Raices (double a , double b , double c) {
		this.a=a;
		this.b=b;
		this.c=c;
	}
	//metodos
	
	private double getDiscriminante() {
		
		double d =(b*b)-4*(a*c);
		
		return d;
	}
	
	private boolean tieneRaices () {
		if(getDiscriminante()>0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	private boolean tieneRaiz () {
		if(getDiscriminante()==0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	private String getRaices(){
		
		if (getDiscriminante()>0) {
		
		double x1 = (-b + Math.sqrt(getDiscriminante()))/(2*a);
		double x2 = (-b - Math.sqrt(getDiscriminante()))/(2*a);
		
		return "Raiz 1 : "+x1+" Raiz 2 : "+x2;
		}
		else {
			return "la ecuacion no cuenta con 2 raices";
		}
		
	}
	
	private String getRaiz(){
		
		if (getDiscriminante()==0) {
		
		double x = (-b)/(2*a);
		
		return "Raiz  : "+x;
		}
		else {
			return "la ecuacion no cuenta con una sola raiz";
		}
		
	}
	
	public String Calcular() {
		if (getDiscriminante()>0) {
			return getRaices(); 
		}
		else if (getDiscriminante()==0) {
			return getRaiz();
		}
		else {
			return "la ecuacion no tiene solucion Real";
		}
	}

}
