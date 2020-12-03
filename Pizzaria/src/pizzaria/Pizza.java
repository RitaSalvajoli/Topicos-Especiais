/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzaria;

/**
 *
 * @author salva
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import pizzaria.Pizzaiolo;
import pizzaria.Mozzarella;
import pizzaria.Peperoni;
import pizzaria.CondimentDecorator;

public class Pizza extends CondimentDecorator{
    public char description;
    public static int totalIngredientes=0;
    private double preco;
    private ArrayList <String>  ingrediente = new ArrayList<String>();
    public static Map <String, Integer> mapaIngredientes = new HashMap <String, Integer> ();

    public Pizza(Pizza decorate_pizza) {
        super(decorate_pizza);
    }
    
    public char getDescription() {
        return description;
    }

    public void setDescription(char description) {
        this.description = description;
    }
    
    public double getPreco ()
	{
		
	return preco;
	}
	
	public static void contabilizaIngrediente(String ingrediente)
	{
		if (mapaIngredientes.containsKey(ingrediente))
		{
			int value = mapaIngredientes.get(ingrediente);
			mapaIngredientes.put(ingrediente, value+1);	
			}
		else
		{
			mapaIngredientes.put(ingrediente, 1);
		}
		totalIngredientes++;
				 
	}
}
