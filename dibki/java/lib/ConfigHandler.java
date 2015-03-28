package lib;

import net.minecraftforge.common.config.Configuration;

import java.io.File;

/**
 * Created by Komoden on 25/03/14.
 */
public class ConfigHandler {

	// General part of config
	public static final String CATEGORY_GENERAL = "General";
	public static boolean HARD_MODE;
	public static final String HARD_MODE_KEY = "Hard_Mode";
	public static final boolean HARD_MODE_DEFAULT = false;

	//Mod tweeks
	// dustClay to clay.

	public static void init(File file)
	{
		Configuration config = new Configuration(file);
		config.load();

		// General
		HARD_MODE = config.get(CATEGORY_GENERAL, HARD_MODE_KEY, HARD_MODE_DEFAULT, "This does nothing!").getBoolean(false);

		// Mod Tweeks


		// Items

		// Blocks

		config.save();
	}
}

