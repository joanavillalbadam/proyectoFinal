package com.mygdx.game;

import com.badlogic.gdx.Game;
import com.mygdx.game.helpers.AssetManager;
import com.mygdx.game.screens.PrimeraScreen;

/**
 * Created by ALUMNEDAM on 18/04/2017.
 */

public class TowerAttack extends Game {
    public static int puntos = 0;
    @Override
    public void create() {

        // A l'iniciar el joc carreguem els recursos
        AssetManager.load();
        // I definim la pantalla d'splash com a pantalla
        setScreen(new PrimeraScreen(this));

    }

    // Cridem per descartar els recursos carregats.
    @Override
    public void dispose() {
        super.dispose();
        AssetManager.dispose();
    }
}