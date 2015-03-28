package dibki;

import blocks.*;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.LanguageRegistry;
import lib.*;
import net.minecraft.creativetab.CreativeTabs;

import java.util.logging.Level;

@Mod(modid = ModInfo.LOWERCASE_MOD_ID, name = ModInfo.MOD_NAME, version = ModInfo.MOD_VERSION)
public class DIBKI
{

	@Instance(ModInfo.MOD_ID)
	public static DIBKI instance;

	@SidedProxy(clientSide = "lib.ClientProxy", serverSide = "lib.CommonProxy")
	public static CommonProxy proxy;

	public static CreativeTabs dibkiTab = new DIBKITab(CreativeTabs.getNextID(), ModInfo.MOD_NAME);

	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		LogHelper.log(Level.INFO, "Dibki: PreInit");

		proxy.initSounds();
		proxy.initRenderers();
		ConfigHandler.init(event.getSuggestedConfigurationFile());
		blocks.init();
	}

	@EventHandler
	public void init(FMLInitializationEvent event)
	{
		LogHelper.log(Level.INFO, "Dibki: Init");
		LanguageRegistry.instance().addStringLocalization("itemGroup." + ModInfo.MOD_NAME, "en_US", ModInfo.MOD_NAME);
		LanguageRegistry.instance().addStringLocalization("itemGroup.dibkiTab", "en_US", "DIBKI");
		blocks.registerTileEntities();
		blocks.addNames();
		Recipes.init();
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		LogHelper.log(Level.INFO, "DIBKI: PostInit");
	}
}
