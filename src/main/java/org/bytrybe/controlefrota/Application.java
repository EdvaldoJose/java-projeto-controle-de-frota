package org.bytrybe.controlefrota;

import org.bytrybe.controlefrota.core.Caminhao;
import org.bytrybe.controlefrota.core.Carro;
import org.bytrybe.controlefrota.core.Moto;

public class Application {

  public static void main(String[] args) {
    Carro v1 = new Carro("RTF 1234", 2021);
    Caminhao v2 = new Caminhao("RDF 4254", 2022);
    Moto v3 = new Moto("FFR 2546", 2023);

    v1.abastecer("Posto 1", "Edvaldo", 180);
    v1.abastecer("Posto 2", "Dinaldo", 220);
    v1.abastecer("Posto 3", "Marcelo", 280);

    v2.abastecer("Posto 1", "Claudio", 180);
    v2.abastecer("Posto 2", "Fernando", 220);
    v2.abastecer("Posto 3", "Carlinho", 280);

    v3.abastecer("Posto 1", "Edvaldo", 180);
    v3.abastecer("Posto 2", "Dinaldo", 220);
    v3.abastecer("Posto 3", "Marcelo", 280);

    v1.listaAbastecimentos();
    v2.listaAbastecimentos();
    v3.listaAbastecimentos();

    System.out.println("Hello and welcome!");

  }
}
