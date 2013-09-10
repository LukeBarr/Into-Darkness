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
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.badlogic.gdx.scenes.scene2d.Actor;

public class MainMenu implements Screen {
	private Sprite test;
	private SpriteBatch test_batch;
	private Texture test_texture;
	private Stage stage;
	private Table table;
	private TextButton buttonPlay, buttonExit;
	
	@Override
	public void render(float delta) {
		Gdx.gl.glClearColor(0, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		test_batch.begin();
		test.draw(test_batch);
		test_batch.end();

	}

	@Override
	public void resize(int width, int height) {

	}

	@Override
	public void show() {
		test_texture = new Texture("data/splash.png"); //TODO: Menu image
		test = new Sprite(test_texture);
		test.setSize(Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
		test_batch = new SpriteBatch();

		//TODO: Skins, etc... See http://steigert.blogspot.ie/2012/03/4-libgdx-tutorial-tablelayout.html
		table = new Table();
		TableLayout layout = table.getTableLayout();


		//Register buttonPlay and buttonExit
		buttonPlay = new TextButton("Play!", new TextButton.TextButtonStyle());
		buttonPlay.setClickListener( new ClickListener() {
			@Override
			public void click(Actor actor, float x, float y) {
				//TODO: game.setScreen();
			}
		} );
		layout.register("buttonPlay", buttonPlay);

		buttonExit = new TextButton("Exit", new TextButton.TextButtonStyle());
		buttonExit.setClickListener( new ClickListener() {
			@Override
			public void click(Actor actor, float x, float y) {
				//TODO: game.setScreen();
			}
		});
		layout.register("buttonExit", buttonExit);
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
		//TODO: Dispose objects created...
	}

}
