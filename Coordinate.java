/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author afghany
 */
public class Coordinate {
    
    private double lat;
    private double lng;
    public Coordinate(double lat,double lng)
    {
        this.lat = lat;
        this.lng=lng;
    }
    
    public double getDoubleLat()
    {
        return this.lat;
    }
    
    public double getDoubleLon()
    {
        return this.lng;
    }
}
