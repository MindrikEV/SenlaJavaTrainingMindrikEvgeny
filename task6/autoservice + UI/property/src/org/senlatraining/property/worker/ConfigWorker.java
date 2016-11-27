package org.senlatraining.property.worker;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import org.apache.log4j.Logger;
import org.senlatraining.autoservice.util.Path;

public class ConfigWorker {
	private static final Logger log = Logger.getLogger(ConfigWorker.class);
	private final String PATH_TO_PROPERTIES = "config.properties";
	private org.senlatraining.autoservice.util.Properties properties;
	
	private Properties property;
	private Path path;
	
	public void initProperties() throws IOException{
		try {
			FileInputStream fis = new FileInputStream(PATH_TO_PROPERTIES);
			property.load(fis);
			properties.setAddebleOfGarage(Boolean.valueOf(property.getProperty("addebleOfGarage")));
			properties.setRemovebleOfGarage(Boolean.valueOf(property.getProperty("removebleOfGarage")));
			properties.setMovableOfOrder(Boolean.valueOf(property.getProperty("movableOfOrder")));
			properties.setRemovebleOfOrder(Boolean.valueOf(property.getProperty("removebleOfOrder")));
			path.setPathForMaster(property.getProperty("pathForMaster"));
			path.setPathForGarage(property.getProperty("pathForGarage"));
			path.setPathForOrder(property.getProperty("pathForOrder"));
			path.setPathForMasterManager(property.getProperty("pathForMasterManager"));
			path.setPathForGarageManager(property.getProperty("pathForGarageManager"));
			path.setPathForOrderManager(property.getProperty("pathForOrderManager"));
		} catch (FileNotFoundException fnfe){
			log.error(fnfe);
		}
	}
}
