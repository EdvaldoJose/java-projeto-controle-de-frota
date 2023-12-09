package org.bytrybe.controlefrota.core;

public class Container implements InterfTransportador {

  private String modelo;
  private double capacidade;

  public Container(String modelo, double capacidade) {
    super();
    this.capacidade = capacidade;
    this.modelo = modelo;
  }

  public String getModelo() {
    return modelo;
  }

  public void setModelo(String modelo) {
    this.modelo = modelo;
  }

  public double getCapacidade() {
    return capacidade;
  }

  public void setCapacidade(double capacidade) {
    this.capacidade = capacidade;
  }

  @Override
  public String transportar(String origem, String destino) {
    return String.format("Veiculo de placa: %s, vai transportar carga"
        + " de %s para %s ", origem, destino);

  }

}

