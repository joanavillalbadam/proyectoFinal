package com.mygdx.game.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.maps.tiled.TmxMapLoader;
import com.badlogic.gdx.maps.tiled.renderers.OrthogonalTiledMapRenderer;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Container;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.utils.viewport.StretchViewport;
import com.badlogic.gdx.utils.viewport.Viewport;
import com.mygdx.game.TowerAttack;
import com.mygdx.game.helpers.AssetManager;
import com.mygdx.game.utils.Settings;

/**
 * Created by ALUMNEDAM on 18/04/2017.
 */

public class SegundaScreen implements Screen {

    private Stage stage;
    private TowerAttack game;
    private Label.LabelStyle textStyle;
    private Label textLbl;
    private Label textLbl2;
    private Label textLbl3;
    private Label textLbl4;
    private Label textLbl5;
    private Container container1, container2, container3,container4;
    TiledMap tiledMap;
    OrthogonalTiledMapRenderer renderer;
    OrthographicCamera camera;

    public SegundaScreen(Batch batch, Viewport viewport) {

        System.out.println("Estamos en la 2");
        this.game = game;

        // Creem la càmera de les dimensions del joc
        camera = new OrthographicCamera(Settings.GAME_WIDTH, Settings.GAME_HEIGHT);
        // Posant el paràmetre a true configurem la càmera per a
        // que faci servir el sistema de coordenades Y-Down
        camera.setToOrtho(true);

        container1 = new Container(new Image(AssetManager.mapa));
        container1.setTransform(true);
        container1.center();
        container1.setSize(200,100); //HACER CONSTANTES DE LOS TAMAÑOS EN SETTINGS
        container1.setPosition(Settings.GAME_WIDTH - 200, 0);

        tiledMap = new TmxMapLoader().load("texturas/mapa1.tmx");
        renderer = new OrthogonalTiledMapRenderer(tiledMap);


        // Creem el viewport amb les mateixes dimensions que la càmera
        //StretchViewport viewport;
        viewport = new StretchViewport(Settings.GAME_WIDTH, Settings.GAME_HEIGHT, camera);

        // Creem l'stage i assginem el viewport
        stage = new Stage(viewport, batch);

        stage.addActor(container1);

        System.out.println("despues de img");
    }

    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(0, 0, 0, 0);
        Gdx.gl.glBlendFunc(GL20.GL_SRC_ALPHA, GL20.GL_ONE_MINUS_SRC_ALPHA);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        stage.draw();
        stage.act(delta);
    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {

    }
}
