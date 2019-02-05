/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question.pkg3;

/**
 *
 * @author agutu
 */
public class switch1 {
    public static void main(String[] args){
        int drinktype = 1;
        String drinkName;
        switch(drinktype){
            case 0:
                drinkName = "Pepsi";
                break;
            case 1:
                drinkName = "Mountain Dew";
                break;
            case 2:
                drinkName = "Water";
                break;
            default:
                drinkName = "Unkown";
        }
        System.out.println("Drink Type:" + drinkName);
    }
}
