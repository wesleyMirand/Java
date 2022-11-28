public Carro (String marca, String modelo, int numPassageiros,
       double capCombustivel, double consumoCombustivel) {
	this.marca = marca;
	this.modelo = modelo;
	this.numPassageiros = numPassageiros;
	this.capCombustivel = capCombustivel;
	this.consumoCombustivel = consumoCombustivel;
}

public Carro () { }

public Carro(String marca, String modelo, int numPassageiros) {
	this.marca = marca;
	this.modelo = modelo;
	this.numPassageiros = numPassageiros;
    System.out.println("Chamando o construtor com 3 parametros");
}

public Carro (String marca, String modelo) {
	this(marca, modelo, 10);
	System.out.println("Chamandoo construtor com 2 parametros");
}
