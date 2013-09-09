package com.duck.intdark;

import com.badlogic.gdx.Game;
import com.duck.intdark.screens.Splash;

public class IntDarkMain extends Game {

	@Override
	public void create() {
		
		setScreen(new Splash());

	}

	@Override
	public void dispose() {
		super.dispose();
	}

	@Override
	public void render() {
		super.render();

	}

	@Override
	public void resize(int width, int height) {
		super.resize(width, height);
	}

	@Override
	public void pause() {
		super.pause();
	}

	@Override
	public void resume() {
		super.resume();
	}
}
