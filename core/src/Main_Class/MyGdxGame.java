package Main_Class;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import Views.StageView;
import Model.Block;

public class MyGdxGame extends ApplicationAdapter {
	StageView view;
	Block block;

	@Override
	public void create () {
		Block.ProduceObjects();
		view = new StageView();
	}

	@Override
	public void render () {
		view.Draw();
	}
	
	@Override
	public void dispose () {

	}
}
