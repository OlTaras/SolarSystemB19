package SolarSystem;

public class SolarSystem {

    public static void main(String[] args) {
        SolarSystemBase solar=new SolarSystemBase();
        solar.sun="1";
        solar.planet="2";
        solar.star="2";
        System.out.println("The solar system is ready ");


        // ...
        FeatureSun xros=new FeatureSun();
        xros.color="pink";
        xros.temp="23424Kv";
        xros.size="OKm";


        // ...
        Planet2 perox = new Planet2();
        perox.color="green";
        perox.size="1m";
        perox.radius="3m";
        
    }

}

