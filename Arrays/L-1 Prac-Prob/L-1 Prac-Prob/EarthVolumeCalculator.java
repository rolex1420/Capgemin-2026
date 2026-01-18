/* Write a Program to compute the volume of Earth in km^3 and miles^3 */
public class EarthVolumeCalculator {
    public static void main(String[] args){
        double earthRadiusKm = 6378;
        double kmToMilesConversion = 0.621371;        
        double earthRadiusMiles = earthRadiusKm * kmToMilesConversion;
        double volumeFactor = 4.0 / 3.0;
        double volumeKm3 = volumeFactor * Math.PI * Math.pow(earthRadiusKm, 3);
        double volumeMiles3 = volumeFactor * Math.PI * Math.pow(earthRadiusMiles, 3);
        System.out.println("The volume of earth in cubic kilometers is " + volumeKm3 + " and cubic miles is " + volumeMiles3);
    }
}