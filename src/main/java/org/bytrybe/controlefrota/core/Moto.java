package org.bytrybe.controlefrota.core;

public class Moto extends Veiculo {

  public Moto(String placa, int anoFabricacao) {
    super(placa, anoFabricacao);
    this.setCombustivel("Gasolina");
  }

  @Override
  public void abastecer(String local, String motorista, double valor) {
    this.abastecimentos.add(String.format("Local: base, Motociclista: %s, valor: R$ %.2f"
        , motorista, valor));
  }

}
