/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class RestaurantDirectory {
    private ArrayList<Restaurant> restaurantDirectory;
    
    public RestaurantDirectory(){
      restaurantDirectory= new ArrayList();
    }

    public ArrayList<Restaurant> getRestaurantDirectory() {
        return restaurantDirectory;
    }

    public void setRestaurantDirectory(ArrayList<Restaurant> restaurantDirectory) {
        this.restaurantDirectory = restaurantDirectory;
    }
    
    public Restaurant newRestaurant(String name, String address,String manName, String phoneNumber){
      Restaurant restaurant=new Restaurant(name,address,manName,phoneNumber);
      restaurantDirectory.add(restaurant);
      System.out.println(restaurantDirectory.size()+"New Restaurant");
      return restaurant;
    }
    
    public void removeRestaurant(Restaurant restaurant){
    restaurantDirectory.remove(restaurant);
    }
    
    public Restaurant getRestaurant(String name){
    
    for(Restaurant rest:restaurantDirectory){
    if(rest.getRestaurantName().equals(name)){
    return rest;
    }
    }
    return null;
    }
    
}
