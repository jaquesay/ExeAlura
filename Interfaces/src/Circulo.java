public class Circulo implements AreaCalculavel {
	
	private int raio;
	
	public Circulo(int raio){
		this.raio = raio;
	}
	
	@Override
	public double calculaArea() {
		// TODO Auto-generated method stub
		return this.raio * this.raio * Math.PI;
	}
	
}
