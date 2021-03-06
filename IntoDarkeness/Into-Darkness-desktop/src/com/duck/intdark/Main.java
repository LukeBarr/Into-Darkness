package com.duck.intdark;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

public class Main {
	public static void main(String[] args) {
		LwjglApplicationConfiguration cfg = new LwjglApplicationConfiguration();
		cfg.title = "Into-Darkness";
		cfg.useGL20 = true;
		cfg.width = 800;
		cfg.height = 600;
		cfg.vSyncEnabled=true;
		new LwjglApplication(new IntDarkMain(), cfg);
	}
}
