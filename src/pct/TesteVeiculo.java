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
public class TesteVeiculo {

    
    public static void main(String[] args) {
        
        //Criação do objeto da classe Veiculo
        Veiculo myCar;
        
        //Instancia
        myCar = new Veiculo();
        
        //Construir objeto
        myCar.marca = "Fiat";
        myCar.modelo = "Uninho da SKY";
        myCar.cor = 'B';
        myCar.velocidade = 0;
        
        //Exibir myCar
        System.out.println("\n\t\t\t -- Meu carro -- \n");
        myCar.exibirVeiculo();
        
        //Acelerando meu GTR
        for(int i =0; i < 300; i++)
        myCar.acelerar();
        
        //Exibir myCar acelerada
        System.out.println("\n\t\t\t -- Meu carro acelerado -- \n");
        myCar.exibirVeiculo();
        
        
        
    }
    
}
