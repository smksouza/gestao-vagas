package br.com.samuelsouza.gestao_vagas;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class PrimeiroTeste {

    @Test
    public void deve_ser_possivel_calcular_dois_numeros() {
       var result = calculate(1, 9);

       assertEquals(result, 10);
    }

    @Test
    public void validarValorIncorreto() {
        var result = calculate(1, 9);
        assertNotEquals(result, 4);
    }

    public static int calculate(int num1, int num2){
        return num1 + num2;
    }

}
