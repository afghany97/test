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
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Coordinate center = new Coordinate(30.035804,31.2046248);
        Coordinate center2 = new Coordinate(30.058911, 31.192835);
        Coordinate center3 = new Coordinate(30.059870, 31.192824);
        Coordinate result = Calculator.calcEndPoint(center, 100, 90);
        DIstanceCalculator distance = new DIstanceCalculator();
        System.out.println(result.getDoubleLat() + "," + result.getDoubleLon());
        System.out.println("Distance is : " + distance.getDistance(center3,center2));

    }
    
}
