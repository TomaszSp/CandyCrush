package Views;
//Tutaj sa przechowane modele 2d ale info o nich jest pobrane z presentera

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import Presenter.StagePresenter;
import Service.NetService;

public class StageView{
    StagePresenter presenter;
    public static SpriteBatch batch;
    Texture img;



    public StageView() {
        presenter = new StagePresenter();
        batch = new SpriteBatch();

    }

    public void Draw(){
        DrawBackground();
        for (int i = 0; i < NetService.getBlockList().size(); i++) {
            img = new Texture("Blocks\\Blocks_01_256x256_Alt_00_00"+ NetService.getBlockList().get(i).getColorID()+ ".png");
            DrawBlock(presenter.GetXLocation()[i], presenter.GetYLocation()[i]);
            img.dispose();
        }

    }
    public void DrawBackground(){
        Gdx.gl.glClearColor(1, 1, 1, 0);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
    }

    public void DrawBlock(int XCoordinate, int YCoordinate){
        batch.begin();
        batch.draw(img, XCoordinate, YCoordinate, NetService.getWallLength() , NetService.getWallLength());
        batch.end();
    }
    public void dispose(){
        img.dispose();
        batch.dispose();
    }

}
