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
import pizzaria.Pizza;
import pizzaria.BaconDecorator;
import pizzaria.OreganoDecorator;
import pizzaria.TomatoDecorator;
import pizzaria.CreamCheeseEdgeDecorator;

public class CondimentDecorator {
    public Pizza decorate_pizza; 

    public CondimentDecorator(Pizza decorate_pizza) {
        this.decorate_pizza = decorate_pizza;
    }
    
}
