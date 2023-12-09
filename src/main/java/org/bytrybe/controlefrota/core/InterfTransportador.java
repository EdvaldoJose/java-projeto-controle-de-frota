package org.bytrybe.controlefrota.core;

public interface InterfTransportador {

  default String transportar(String origem, String destino) {

    return origem;
  }

}
