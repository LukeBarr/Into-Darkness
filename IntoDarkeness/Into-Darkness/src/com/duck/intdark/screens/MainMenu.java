package com.duck.intdark.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;

public class MainMenu implements Screen {
	private SpriteBatch batch;
	private Sprite buttonPlay;
	private Texture playTexture;
	private Rectangle playRec;
	private boolean test;
	private  int HEIGHT,WIDTH;
	@Override
	public void render(float delta) {
		Gdx.gl.glClearColor(0, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

		if (Gdx.input.isTouched()) {
			if (playRec.contains(Gdx.input.getX(), Gdx.input.getY())) {
				test = false;
				// Next screen

			}

		}

		batch.begin();
		if (test)
			buttonPlay.draw(batch);

		batch.end();

	}

	@Override
	public void resize(int width, int height) {

	}

	@Override
	public void show() {
		HEIGHT=Gdx.graphics.getHeight();
		WIDTH=Gdx.graphics.getWidth();
		test = true;
		batch = new SpriteBatch();
		playTexture = new Texture("ui/play.png");

		buttonPlay = new Sprite(playTexture);
		buttonPlay.setBounds(
				WIDTH / 2 - buttonPlay.getWidth() / 2,
				HEIGHT - HEIGHT / 3,
				WIDTH - WIDTH / 2,
				HEIGHT / 10);

		playRec = new Rectangle(buttonPlay.getBoundingRectangle());

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
		batch.dispose();
		playTexture.dispose();

	}

}
