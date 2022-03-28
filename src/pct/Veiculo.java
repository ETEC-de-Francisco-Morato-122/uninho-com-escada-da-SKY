/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pct;

/**
 *
 * @author EtecMorato
 */
public class Veiculo {
    
        //Atributos
    String marca, modelo;
    
    char cor; //R = Red; B - Black; S - SIlver
    
    int velocidade;
    
    //Metodos
    public void exibirVeiculo(){
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Cor: " + cor);
        System.out.println("Velocidade: " + velocidade + "km/hr.");
    }
    
    public void acelerar(){
        if(velocidade < 320)
        velocidade++;
    }
    
}
