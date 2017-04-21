package com.mygdx.game.helpers;

/**
 * Created by ALUMNEDAM on 18/04/2017.
 */

        import com.badlogic.gdx.Gdx;
        import com.badlogic.gdx.audio.Music;
        import com.badlogic.gdx.audio.Sound;
        import com.badlogic.gdx.files.FileHandle;
        import com.badlogic.gdx.graphics.Texture;
        import com.badlogic.gdx.graphics.g2d.Animation;
        import com.badlogic.gdx.graphics.g2d.BitmapFont;
        import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class AssetManager {

    // Sprite Sheet
    public static Texture sheet;

    public static Texture mapa;

    // Nau i fons
    public static TextureRegion spacecraft, spacecraftDown, spacecraftUp, background;

    //disparo
    public static TextureRegion disparo, disparoI;

    // Asteroid
    public static TextureRegion[] asteroid;
    public static Animation asteroidAnim;

    // Explosió
    public static TextureRegion[] explosion;
    public static Animation explosionAnim;

    // Sons
    public static Sound explosionSound;
    public static Music music;

    // Font
    public static BitmapFont font;

    private static float m_fboScaler = 1.5f;


    public static void load() {
        int width = Gdx.graphics.getWidth();
        int height = Gdx.graphics.getHeight();
        // Carreguem les textures i li apliquem el mètode d'escalat 'nearest'
        sheet = new Texture(Gdx.files.internal("fondos/fondo2.jpg"));
        sheet.setFilter(Texture.TextureFilter.Nearest, Texture.TextureFilter.Nearest);

        mapa = new Texture(Gdx.files.internal("badlogic.jpg"));
        mapa.setFilter(Texture.TextureFilter.Nearest, Texture.TextureFilter.Nearest);

        //sprites de el disparo
       // disparo = new TextureRegion(bullet, 125,253,715,250);
       // disparo.flip(false,true);

      //  disparoI = new TextureRegion(bullet, 0,0,0,0);
      //  disparoI.flip(false,true);

        //Disparo.flip(false, true);

        // Sprites de la nau
        /*spacecraft = new TextureRegion(sheet, 0, 0, 36, 15);
        spacecraft.flip(false, true);

        spacecraftUp = new TextureRegion(sheet, 36, 0, 36, 15);
        spacecraftUp.flip(false, true);

        spacecraftDown = new TextureRegion(sheet, 72, 0, 36, 15);
        spacecraftDown.flip(false, true);

        // Carreguem els 16 estats de l'asteroid
        asteroid = new TextureRegion[16];
        for (int i = 0; i < asteroid.length; i++) {

            asteroid[i] = new TextureRegion(sheet, i * 34, 15, 34, 34);
            asteroid[i].flip(false, true);

        }*/

        // Creem l'animació de l'asteroid i fem que s'executi contínuament en sentit anti-horari
       /* asteroidAnim = new Animation(0.05f, asteroid);
        asteroidAnim.setPlayMode(Animation.PlayMode.LOOP_REVERSED);
*/
        // Creem els 16 estats de l'explosió
        //explosion = new TextureRegion[16];

        // Carreguem els 16 estats de l'explosió
       /* int index = 0;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 8; j++) {
                explosion[index++] = new TextureRegion(sheet, j * 64,  i * 64 + 49, 64, 64);
                explosion[index-1].flip(false, true);
            }
        }*/

        // Finalment creem l'animació
       // explosionAnim = new Animation(0.04f, explosion);



        // Fons de pantalla
        background = new TextureRegion(sheet);
        background.flip(false, true);

        /******************************* Sounds *************************************/
        // Explosió
       /* explosionSound = Gdx.audio.newSound(Gdx.files.internal("sounds/explosion.wav"));

        // Música del joc
        music = Gdx.audio.newMusic(Gdx.files.internal("sounds/Afterburner.ogg"));
        music.setVolume(0.2f);
        music.setLooping(true);*/

        /******************************* Text *************************************/
        // Font space
        FileHandle fontFile = Gdx.files.internal("fonts/fuente1.fnt");
        font = new BitmapFont(fontFile, true);
        font.getData().setScale(1.4f);
    }

    public static void dispose() {

        // Descrtem els recursos
        sheet.dispose();
      //  explosionSound.dispose();
      //  music.dispose();

    }
}