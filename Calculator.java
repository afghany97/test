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
public class Calculator {
    
    public static Coordinate calcEndPoint(Coordinate center , int distance, double  bearing)
    {
      Coordinate gp=null;

      double R = 6371000; // meters , earth Radius approx
      double PI = 3.1415926535;
      double RADIANS = PI/180;
      double DEGREES = 180/PI;

      double lat2;
      double lon2;

      double lat1 = center.getDoubleLat() * RADIANS;
      double lon1 = center.getDoubleLon() * RADIANS;
      double radbear = bearing * RADIANS;

     // System.out.println("lat1="+lat1 + ",lon1="+lon1);

      lat2 = Math.asin( Math.sin(lat1)*Math.cos(distance / R) +
              Math.cos(lat1)*Math.sin(distance/R)*Math.cos(radbear) );
      lon2 = lon1 + Math.atan2(Math.sin(radbear)*Math.sin(distance / R)*Math.cos(lat1),
                     Math.cos(distance/R)-Math.sin(lat1)*Math.sin(lat2));

     // System.out.println("lat2="+lat2*DEGREES + ",lon2="+lon2*DEGREES);

        gp = new Coordinate(lat2*DEGREES,lon2*DEGREES);


      return(gp);
  }
}
