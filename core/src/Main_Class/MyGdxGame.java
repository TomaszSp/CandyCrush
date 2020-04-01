package Main_Class;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import Service.BlockService;
import Views.StageView;

public class MyGdxGame extends ApplicationAdapter {
    BlockService blockService;
	StageView stageView;

	
	@Override
	public void create () {
        blockService = new BlockService();
		stageView = new StageView();
	}

	@Override
	public void render () {
		stageView.Draw();
	}
	
	@Override
	public void dispose () {
		stageView.dispose();
	}
}
