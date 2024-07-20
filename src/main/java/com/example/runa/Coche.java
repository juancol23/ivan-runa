package com.example.runa;

public class Coche extends VehiculoConMotor{
    @Override
    public void mover() {
        System.out.println("Se está moviendo el vehiculo");
    }

    @Override
    public void claxon() {
        System.out.println("Activando la bocina para que se muevan las bestias.");
    }

    @Override
    public void cargarCombustible() {
        System.out.println("Cargando gasolina al coche");
    }
}
