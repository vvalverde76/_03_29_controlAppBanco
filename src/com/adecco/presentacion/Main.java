package com.adecco.presentacion;

import com.adecco.modelo.Cuenta;
import com.adecco.modelo.CuentaAhorro;
import com.adecco.modelo.CuentaNomina;

public class Main {
    public static void main(String[] args) {

        //CUENTA AHORRO
        Cuenta c1 = new CuentaAhorro("Luis","06249502V","C/Alcala 230");
        System.out.println(c1);

        CuentaAhorro c2 = (CuentaAhorro) c1;
        c2.setIngresos(2000);
        c2.setSaldoAnterior(1000);
        c2.setRetiros(1500);
        System.out.println(c2);
        System.out.println(c2.calcularSaldo());
        System.out.println(c2.calcularSaldo(3));

        //CUENTA NOMINA

        Cuenta c3 = new CuentaNomina("Ana","03449502R",
                "C/Caleruega 3","90000000","Adecco",0.5);
        System.out.println(c3.toString());
        CuentaNomina c4= (CuentaNomina) c3;
        c4.setSaldoAnterior(3000);
        c4.setIngresos(1500);
        c4.setRetiros(1200);
        System.out.println(c4);
        System.out.println(c4.calcularSaldo());




    }
}