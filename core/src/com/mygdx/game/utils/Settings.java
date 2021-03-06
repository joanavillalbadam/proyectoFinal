package com.mygdx.game.utils;

/**
 * Created by ALUMNEDAM on 18/04/2017.
 */

public class Settings {

    // Mida del joc, s'escalarà segons la necessitat
    public static final int GAME_WIDTH = 640;
    public static final int GAME_HEIGHT = 300;

    // Propietats de la nau
    public static float SPACECRAFT_VELOCITY = 50;
    public static float Bala_velocidad = 200;


    public static void setSpacecraftVelocity(float spacecraftVelocity) {
        SPACECRAFT_VELOCITY = spacecraftVelocity;
    }

    public static float getSpacecraftVelocity() {
        return SPACECRAFT_VELOCITY;
    }


    public static final int SPACECRAFT_WIDTH = 36;
    public static final int SPACECRAFT_HEIGHT = 15;
    public static float SPACECRAFT_STARTX = 20;
    public static float SPACECRAFT_STARTY = GAME_HEIGHT/2 - SPACECRAFT_HEIGHT/2;

    // Rang de valors per canviar la mida de l'asteroide.
    public static float MAX_ASTEROID = 2f;

    public static float getMaxAsteroid() {
        return MAX_ASTEROID;
    }

    public static void setMaxAsteroid(float maxAsteroid) {
        MAX_ASTEROID = maxAsteroid;
    }

    public static final float MIN_ASTEROID = 0.5f;

    // Configuració Scrollable
    public static  int ASTEROID_SPEED = -150;
    public static final int ASTEROID_GAP = 75;
    public static final int BG_SPEED = -100;

    public static int getAsteroidSpeed() {
        return ASTEROID_SPEED;
    }

    public static void setAsteroidSpeed(int asteroidSpeed) {
        ASTEROID_SPEED = asteroidSpeed;
    }


}