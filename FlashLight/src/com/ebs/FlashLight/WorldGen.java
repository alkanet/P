package com.ebs.FlashLight;

/**
 * Created by yyh on 14-9-16.
 */
public class WorldGen implements IntWorldGen{

    String planetName="Earth";
    int planetMass;
    double planetGravity;
    int planetColonies;
    long planetPopulation;
    int planetBases;
    int planetMilitary;
    boolean planetProtection;


    public boolean forceFieldState;
    public long colonyImmigration;
    public int baseProtection;




    public WorldGen(String name,int mass, double gravity ){
        planetName=name;
        planetMass=mass;
        planetGravity=gravity;
        planetPopulation=0;
        planetBases=0;
        planetMilitary=0;
        planetProtection=false;


    }

    public String getPlanetName() {
        return planetName;
    }

    public void setPlanetName(String planetName) {
        this.planetName = planetName;
    }

    public int getPlanetMass() {
        return planetMass;
    }

    public void setPlanetMass(int planetMass) {
        this.planetMass = planetMass;
    }

    public double getPlanetGravity() {
        return planetGravity;
    }

    public void setPlanetGravity(double planetGravity) {
        this.planetGravity = planetGravity;
    }

    public long getPlanetPopulation() {
        return planetPopulation;
    }

    public void setPlanetPopulation(long planetPopulation) {
        this.planetPopulation = planetPopulation;
    }

    public int getPlanetBases() {
        return planetBases;
    }

    public void setPlanetBases(int planetBases) {
        this.planetBases = planetBases;
    }

    public boolean isPlanetProtection() {
        return planetProtection;
    }

    public void setPlanetProtection(boolean planetProctection) {
        this.planetProtection = planetProctection;
    }


    public void setPlanetColonies(int numColonies) {
        planetColonies=numColonies;
    }

    public int getPlanetColonies() {
        return planetColonies;
    }

    public void setPlanetMilitary(int numBases) {
        planetMilitary=numBases;
    }

    public int getPlanetMilitary() {
        return planetMilitary;
    }

    public void turnForceFieldOn() {
        forceFieldState=true;

    }

    public void turnForceFieldOff() {
        forceFieldState=false;

    }

    public boolean getForceFieldState() {
        return forceFieldState;
    }

    public void setColonyImmigration(int numColonists) {
        colonyImmigration=numColonists;

    }

    public long getColonyImmigration() {
        return colonyImmigration;
    }

    public void setBaseProtection(int numForces) {
        baseProtection=numForces;
    }

    public int getBaseProtection() {
        return baseProtection;
    }
}
