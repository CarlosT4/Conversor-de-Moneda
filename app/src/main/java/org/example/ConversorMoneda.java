package org.example;

public class ConversorMoneda {
    
    private ConsultaMoneda consulta;

    public ConversorMoneda(){
        this.consulta = new ConsultaMoneda();
    }
  
    public double convertir(String monedaOrigen, String monedaCambio, double cantidad) {
        Moneda moneda = consulta.BuscarMoneda(monedaOrigen);
        double tasaCambio = moneda.getTasaDeCambio(monedaCambio);
        return cantidad * tasaCambio;
    }
}
