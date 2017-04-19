package com.mygdx.game.screens;


import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Container;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.utils.viewport.StretchViewport;
import com.mygdx.game.TowerAttack;
import com.mygdx.game.helpers.AssetManager;
import com.mygdx.game.utils.Settings;


/**
 * Created by ALUMNEDAM on 18/04/2017.
 */

public class PrimeraScreen implements Screen {

    private TowerAttack game;
    private Stage stage;

    private Label.LabelStyle textStyle;
    private Label textLbl;
    private Label textLbl2;
    private Label textLbl3;
    private Label textLbl4;
    private Label textLbl5;
    private Label textLbl6;
    private Label textLbl7;
    private Label textLbl8;
    private Container container1, container2, container3,container4, container5, container6, container7, container8;


    public PrimeraScreen(TowerAttack game) {

        this.game = game;

        // Creem la càmera de les dimensions del joc
        OrthographicCamera camera = new OrthographicCamera(Settings.GAME_WIDTH, Settings.GAME_HEIGHT);
        // Posant el paràmetre a true configurem la càmera per a
        // que faci servir el sistema de coordenades Y-Down
        camera.setToOrtho(true);

        // Creem el viewport amb les mateixes dimensions que la càmera
        StretchViewport viewport = new StretchViewport(Settings.GAME_WIDTH, Settings.GAME_HEIGHT, camera);

        // Creem l'stage i assginem el viewport
        stage = new Stage(viewport);

        // Afegim el fons
        stage.addActor(new Image(AssetManager.background));

        // Creem l'estil de l'etiqueta i l'etiqueta
        textStyle = new Label.LabelStyle(AssetManager.font, null);
        // textStyle2 = new Label.LabelStyle(AssetManager.font, null);
        //textStyle3 = new Label.LabelStyle(AssetManager.font, null);
        textLbl = new Label("1", textStyle);
        textLbl2 = new Label("2", textStyle);
        textLbl3 = new Label("3", textStyle);
        textLbl4 = new Label("4", textStyle);
        textLbl5 = new Label("5", textStyle);
        textLbl6 = new Label("6", textStyle);
        textLbl7 = new Label("7", textStyle);
        textLbl8 = new Label("8", textStyle);

        // Creem el contenidor necessari per aplicar-li les accions
        container1 = new Container(textLbl);
        container2 = new Container(textLbl2);
        container3 = new Container(textLbl3);
        container4 = new Container(textLbl4);
        container5 = new Container(textLbl5);
        container6 = new Container(textLbl6);
        container7 = new Container(textLbl7);
        container8 = new Container(textLbl8);

        container1.setTransform(true);
        container1.center();
        container1.setPosition((Settings.GAME_WIDTH / 5),Settings.GAME_HEIGHT/4);

        container2.setTransform(true);
        container2.center();
        container2.setPosition((Settings.GAME_WIDTH / 5)*2,Settings.GAME_HEIGHT/4);

        container3.setTransform(true);
        container3.center();
        container3.setPosition((Settings.GAME_WIDTH / 5)*3,Settings.GAME_HEIGHT/4);

        container4.setTransform(true);
        container4.center();
        container4.setPosition((Settings.GAME_WIDTH / 5)*4,Settings.GAME_HEIGHT/4);

        container5.setTransform(true);
        container5.center();
        container5.setPosition((Settings.GAME_WIDTH / 5),Settings.GAME_HEIGHT/2 + Settings.GAME_HEIGHT/4);

        container6.setTransform(true);
        container6.center();
        container6.setPosition((Settings.GAME_WIDTH / 5)*2,Settings.GAME_HEIGHT/2 +Settings.GAME_HEIGHT/4);

        container7.setTransform(true);
        container7.center();
        container7.setPosition((Settings.GAME_WIDTH / 5)*3,Settings.GAME_HEIGHT/2 + Settings.GAME_HEIGHT/4);

        container8.setTransform(true);
        container8.center();
        container8.setPosition((Settings.GAME_WIDTH / 5)*4,Settings.GAME_HEIGHT/2 + Settings.GAME_HEIGHT/4);



        // Afegim les accions de escalar: primer es fa gran i després torna a l'estat original ininterrompudament
        //container1.addAction(Actions.repeat(RepeatAction.FOREVER, Actions.sequence(Actions.scaleTo(1.5f, 1.5f, 1), Actions.scaleTo(1, 1, 1))));
        //container1.setName("Facil");
        stage.addActor(container1);

        //container2.addAction(Actions.repeat(RepeatAction.FOREVER, Actions.sequence(Actions.scaleTo(1.5f, 1.5f, 1), Actions.scaleTo(1, 1, 1))));
        stage.addActor(container2);

        //container3.addAction(Actions.repeat(RepeatAction.FOREVER, Actions.sequence(Actions.scaleTo(1.5f, 1.5f, 1), Actions.scaleTo(1, 1, 1))));
        stage.addActor(container3);
        stage.addActor(container4);
        stage.addActor(container5);
        stage.addActor(container6);
        stage.addActor(container7);
        stage.addActor(container8);

        // Creem la imatge de la nau i li assignem el moviment en horitzontal
/*        Image spacecraft = new Image(AssetManager.spacecraft);
        float y = Settings.GAME_HEIGHT / 2 + textLbl.getHeight();
        spacecraft.addAction(Actions.repeat(RepeatAction.FOREVER, Actions.sequence(Actions.moveTo(0 - spacecraft.getWidth(), y), Actions.moveTo(Settings.GAME_WIDTH, y, 5))));

        stage.addActor(spacecraft);*/


    }

    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {

        stage.draw();
        stage.act(delta);
        Vector3 vector;

        // Si es fa clic en la pantalla, canviem la pantalla
        if (Gdx.input.isTouched()) {
             vector = new Vector3 (Gdx.input.getX(), Gdx.input.getY(), 0);
            // stage.getCamera().unproject(vector);

            if(vector.x >= container1.getRight()-55 && vector.x <= container1.getRight()+80 && vector.y >= container1.getTop()&& vector.y <= container1.getTop()+35){
                Gdx.app.log ("coordenada Facil has clickado en" + Float.toString (Gdx.input.getX()), Float.toString(container1.getRight()));
                //game.setScreen(new SegundaScreen(stage.getBatch(), stage.getViewport()));
                dispose();
            }
            if(Gdx.input.getX()/2 >= container2.getRight()-25 && Gdx.input.getX()/2 <= container2.getRight()+23 && Gdx.input.getY() >= container2.getTop() &&Gdx.input.getY() <= container2.getTop()+30){
                //Gdx.app.log ("En costruccion" + Float.toString (Gdx.input.getX()), Float.toString(container2.getRight()));
                //game.setScreen(new GameScreen(stage.getBatch(), stage.getViewport()));
                dispose();
            }
            if(Gdx.input.getX()/2 >= container3.getRight()-25 && Gdx.input.getX()/2 <= container3.getRight()+25 && Gdx.input.getY() >= container3.getTop() &&Gdx.input.getY() <= container3.getTop()+30){
               // Gdx.app.log ("coordenada Facil has clickado en" + Float.toString (Gdx.input.getX()), Float.toString(container3.getRight()));
                //game.setScreen(new GameScreen(stage.getBatch(), stage.getViewport()));
                dispose();
            }

           /* Gdx.app.log ("facil dificil medio left", Double.toString(containerF.getPadLeft())+ " " +Double.toString(containerD.getPadLeft())+ " "+Double.toString(containerM.getPadLeft()));
            Gdx.app.log ("facil dificil medio right", Double.toString(containerF.getRight()) + " " +Double.toString(containerD.getRight())+ " "+Double.toString(containerM.getRight()));
            Gdx.app.log ("facil dificil medio top", Double.toString(containerF.getPadTop())+ " " +Double.toString(containerD.getPadTop())+ " "+Double.toString(containerM.getPadTop()));
            Gdx.app.log ("facil dificil medio", Double.toString(containerF.getPadBottom())+ " " +Double.toString(containerD.getPadBottom())+ " "+Double.toString(containerM.getPadBottom()));
            Gdx.app.log ("facil dificil medio PadX", Float.toString(containerF.getPadX())+ " " +Float.toString(containerD.getPadX())+ " "+Float.toString(containerM.getPadX()));
            Gdx.app.log ("coordenada Facil", Float.toString(containerF.getTop()));
*/
/*
            */
        }


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