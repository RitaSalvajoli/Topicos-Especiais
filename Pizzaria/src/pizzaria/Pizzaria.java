/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzaria;

import java.util.ArrayList;
import java.util.ArrayList;

/**
 *
 *
 */
public class Pizzaria{

     private ArrayList <Pizza> pizzas = new ArrayList <Pizza>();
    private double precoTotal =0;

	public int totalPizzas()
	{
		return pizzas.size();
	}
        
    public double getPrecoTotal()
	{
		for(int i=0; i< pizzas.size(); i++)
		{
			precoTotal += pizzas.get(i).getPreco();	
		}
		return precoTotal;
	}
    public static void main(String[] args) {
        // TODO code application logic here public void mostraPizza(Pizza p)
 	
            System.out.print("Olá! Nosso Cardápio é:");
 	}
	
    }
 
