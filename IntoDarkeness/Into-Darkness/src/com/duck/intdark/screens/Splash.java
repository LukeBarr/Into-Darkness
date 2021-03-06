package com.duck.intdark.screens;

import aurelienribon.tweenengine.BaseTween;
import aurelienribon.tweenengine.Tween;
import aurelienribon.tweenengine.TweenCallback;
import aurelienribon.tweenengine.TweenManager;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.audio.Sound;
import com.duck.intdark.tween.SpriteAccessor;

public class Splash implements Screen {
	private Sprite splash;
	private SpriteBatch batch;
	private Texture splashTexture;
	private TweenManager tweenManager;
	private Sound splash_music; // Sound for audio < 10s, Music for audio > 10s

	@Override
	public void render(float delta) {
		Gdx.gl.glClearColor(0, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		tweenManager.update(delta);

		batch.begin();
		splash.draw(batch);
		batch.end();
	}

	@Override
	public void resize(int width, int height) {

	}

	@Override
	public void show() {
		batch = new SpriteBatch();
		tweenManager = new TweenManager();
		Tween.registerAccessor(Sprite.class, new SpriteAccessor());

		splashTexture = new Texture("data/splash.png");
		splashTexture.setEnforcePotImages(false);
		splash = new Sprite(splashTexture);
		splash.setSize(Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
		splash_music = Gdx.audio.newSound(Gdx.files
				.internal("data/splash_music.mp3"));
		//Apparently android needs a second to store mp3 in its RAM, if no break was taken 
		//Sometimes it would play sometimes it wouldn't
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
		}
		
		
		
		splash_music.play();

		Tween.set(splash, SpriteAccessor.ALPHA).target(0).start(tweenManager);
		Tween.to(splash, SpriteAccessor.ALPHA, 3).target(1).start(tweenManager);

		Tween.to(splash, SpriteAccessor.ALPHA, 5).target(0).delay(3)
				.setCallback(new TweenCallback() {

					@Override
					public void onEvent(int type, BaseTween<?> source) {
						// Links to MainMenu after animation is done loading
						((Game) Gdx.app.getApplicationListener())
								.setScreen(new MainMenu());
					}

				}).start(tweenManager);

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
		splashTexture.dispose();
		splash_music.dispose();
	}

}
