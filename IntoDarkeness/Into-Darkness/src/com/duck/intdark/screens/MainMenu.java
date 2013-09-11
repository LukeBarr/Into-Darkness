package com.duck.intdark.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton.TextButtonStyle;

public class MainMenu implements Screen {
	private Sprite test;
	private SpriteBatch test_batch;
	private Texture test_texture;
	private Stage stage;
	private TextureAtlas atlas;
	private Table table;
	private TextButton buttonPlay, buttonExit;
	private BitmapFont white;
	private Label heading;
	private Skin skin;

	@Override
	public void render(float delta) {
		Gdx.gl.glClearColor(0, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		
		test_batch.begin();
		test.draw(test_batch); //Background Image
		test_batch.end();
		
		
		stage.act(delta);

		stage.draw();

	}

	@Override
	public void resize(int width, int height) {

	}

	@Override
	public void show() {
		test_texture = new Texture("data/splash.png"); // TODO: Menu image
		test = new Sprite(test_texture);
		test.setSize(Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
		test_batch = new SpriteBatch();

		stage = new Stage();
		white = new BitmapFont(Gdx.files.internal("font/abbeyFont.fnt"), false); //See BMFont to create fonts

		
		Gdx.input.setInputProcessor(stage); //Stage reads inputs
		
		
		
		
		
		
		atlas = new TextureAtlas("ui/button.pack"); //See Libgdx texturepacker
		skin = new Skin(atlas);
		table = new Table(skin);
		table.setBounds(0, 0, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
		TextButtonStyle textButtonStyle = new TextButtonStyle();
		textButtonStyle.up = skin.getDrawable("button.up");
		textButtonStyle.down = skin.getDrawable("button.down.9");
		textButtonStyle.pressedOffsetX = 1;
		textButtonStyle.pressedOffsetY = 1;
		textButtonStyle.font = white;
		textButtonStyle.fontColor = Color.BLACK;

		buttonPlay = new TextButton("Play", textButtonStyle);
		buttonPlay.pad(20);

		table.add(buttonPlay);
		stage.addActor(table);
		

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
		test_batch.dispose();
		test_texture.dispose();
		stage.dispose();
		skin.dispose();
		

	}

}
