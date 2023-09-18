package atividade5;

import atividade5.hierarquia.carro;
import atividade5.hierarquia.moto;
import atividade5.hierarquia.bicicleta;

public class exe {
    public static void main(String[] args) {
        carro c1 = new carro("Hyundai", 2020, "HB20", 60, "Prata");
        carro c2 = new carro("Chevrolet", 2018, "Onix", 80, "Preto");
        moto m1 = new moto("Honda", 2021, "XRE 190", 120, "Azul");
        bicicleta b1 = new bicicleta("BMC", 2015, "Speedfox AL ONE", 20, "Amarela");

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(m1);
        System.out.println(b1);


    }
}
