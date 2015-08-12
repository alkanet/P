package com.ebs.FlashLight;

/**
 * Created by yyh on 14-9-16.
 */
public interface IntWorldGen {
    void setPlanetColonies(int numColonies);
    int getPlanetColonies();
    void setPlanetMilitary(int numBases);
    int getPlanetMilitary();
    void turnForceFieldOn();
    void turnForceFieldOff();
    boolean getForceFieldState();
    void setColonyImmigration(int numColonists);
    long getColonyImmigration();
    void setBaseProtection(int numForces);
    int getBaseProtection();

}
