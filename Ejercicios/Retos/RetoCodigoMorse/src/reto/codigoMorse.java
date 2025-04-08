package reto;

public enum codigoMorse {
	
	A(".-"),
    B("-..."),
    C("-.-."),
    D("-.."),
    E("."),
    F("..-."),
    G("--."),
    H("...."),
    I(".."),
    J(".---"),
    K("-.-"),
    L(".-.."),
    M("--"),
    N("-."),
    O("---"),
    P(".--."),
    Q("--.-"),
    R(".-."),
    S("..."),
    T("-"),
    U("..-"),
    V("...-"),
    W(".--"),
    X("-..-"),
    Y("-.--"),
    Z("--..");
	
	private final String codigo;

	codigoMorse(String codigo) {
		this.codigo = codigo;
	}

	public String getCodigo() {
		return codigo;
	}
	
}
