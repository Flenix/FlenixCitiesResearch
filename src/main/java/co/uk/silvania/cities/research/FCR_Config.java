package co.uk.silvania.cities.research;

import java.io.File;
import net.minecraftforge.common.config.Configuration;

public class FCR_Config {
	
	public static File fcrConfigFile;
	
	public static void init(String configPath) {
		fcrConfigFile = new File(configPath + "FlenixCities_Research.cfg");
		FCR_Config.initConfig(fcrConfigFile);
	}
	
	public static Configuration config;


	
	public static void initConfig(File configFile) {
		config = new Configuration(configFile);
		
		try {
			config.load();
		}
		
		catch (Exception e) {
			//FMLLog.log(Level.SEVERE, e, "### Warning! FlenixCities Research could not load it's config file! ###");
		}
		
		finally {
			if (config.hasChanged()) {
				config.save();
			}
		}
		
	}

}
