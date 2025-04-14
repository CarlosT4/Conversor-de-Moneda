package org.example;

import java.util.Map;

public class Moneda {
    private String base_code;
    private String name_currency;
    private Map<String, Double> conversion_rates;

    public Moneda (String baseCode, String nameCurrency){
        this.base_code = baseCode;
        this.name_currency = nameCurrency;
    }

    // Getters
    public String getBase_code() {
        return base_code;
    }

    public String getName_currency() {
        return name_currency;
    }

    public Map<String, Double> getConversion_rates() {
        return conversion_rates;
    }
    
    // Método de utilidad para obtener un tipo de cambio específico
    public Double getTasaDeCambio(String codigoMoneda) {
        if (conversion_rates != null && conversion_rates.containsKey(codigoMoneda)) {
            return conversion_rates.get(codigoMoneda);
        }
        return null;
    }
}
