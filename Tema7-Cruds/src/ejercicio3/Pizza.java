package ejercicio3;

public class Pizza {
	enum Tamaño {
		Mediana, Familiar
	};

	enum Sabor {
		Margarita, CuatroQuesos, Funghi
	};

	enum Estado {
		Pedida, Servida
	};

	int codigo;
	Tamaño tamaño;
	Sabor tipo;
	Estado estado = Estado.Pedida;

	public Pizza() {
		super();
	}

	public Pizza(int codigo, Tamaño tamaño, Sabor tipo) {
		super();
		this.codigo = codigo;
		this.tamaño = tamaño;
		this.tipo = tipo;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public Tamaño getTamaño() {
		return tamaño;
	}

	public void setTamaño(Tamaño tamaño) {
		this.tamaño = tamaño;
	}

	public Sabor getTipo() {
		return tipo;
	}

	public void setTipo(Sabor tipo) {
		this.tipo = tipo;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "Código: " + codigo + "\n" + "Tamaño: " + tamaño + "\n" + "Tipo: " + tipo + "\n" + "Estado: " + estado;
	}

}
