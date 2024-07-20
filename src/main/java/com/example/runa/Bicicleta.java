package com.example.runa;

public class Bicicleta extends Vehiculo{
    @Override
    public void mover() {
        System.out.println("Se está moviendo el vehiculo");
    }

    @Override
    public void claxon() {
        System.out.println("Activando la bocina para que se muevan las bestias.");
    }

}
