/**
 Representa estructura básica de figura geométricas.
 Las subclases deben implementar los métodos para calcular área y perímetro.

 @author eldanii
*/
public abstract class Figura {

	/**
	Retorna el área de la figura
	@return Área como double
	*/
	public abstract double area();
	/**
	Retorna el perímetro de la figura
	@return Perímetro como double
	*/
	public abstract double perimetro();
}
