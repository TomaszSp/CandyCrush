package Views;
//Tutaj sa przechowane modele 2d ale info o nich jest pobrane z presentera

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import Presenter.StagePresenter;

public class StageView{

    int lastX, lastY;
    StagePresenter presenter = new StagePresenter();
    public static SpriteBatch batch;
    Texture img;

    public void Draw(){
        DrawBackground();
        for (int i = 0; i < 6; i++) {
            int[] location = presenter.GetLocation();
            DrawBlock(location);
        }
    }
    public void DrawBackground(){
        Gdx.gl.glClearColor(0, 0, 0, 0);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
    }

    public void DrawBlock(int [] coordinations){
        batch = new SpriteBatch();
        img = new Texture("Blocks\\Blocks_01_256x256_Alt_00_002.png");
        batch.begin();
        batch.draw(img, coordinations[0], coordinations[1], 180, 180);
        batch.end();
    }

}
