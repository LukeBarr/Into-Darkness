package com.duck.intdark.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;

public class MainMenu implements Screen {
	private Sprite test;
	private SpriteBatch testbatch;
	private Texture testt;
	private Stage stage;
	private Table table;
	private TextButton buttonPlay,buttonExit;
	@Override
	public void render(float delta) {
		Gdx.gl.glClearColor(0, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		testbatch.begin();
		test.draw(testbatch);
		testbatch.end();

	}

	@Override
	public void resize(int width, int height) {

	}

	@Override
	public void show() {
		testt = new Texture("data/splash.png");
		test = new Sprite(testt);
		test.setSize(Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
		testbatch = new SpriteBatch();

	}

	@Override
	public void hide() {

	}

	@Override
	public void pause() {

	}

	@Override
	public void resume() {

	}

	@Override
	public void dispose() {

	}

}
