package org.senlatraining.property.worker;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import org.apache.log4j.Logger;
import org.senlatraining.autoservice.manager.*;

public class ConfigWorker {
	private static final Logger log = Logger.getLogger(ConfigWorker.class);
	private final String PATH_TO_PROPERTIES = "config.properties";
	private GarageManager gm = new GarageManager();
	private OrderManager om = new OrderManager();
	
	private Properties property = new Properties();
	
	public void initProperties() throws IOException{
		try {
			FileInputStream fis = new FileInputStream(PATH_TO_PROPERTIES);
			property.load(fis);
			gm.setAddebleOfGarage(Boolean.valueOf(property.getProperty("addebleOfGarage")));
			gm.setRemovebleOfGarage(Boolean.valueOf(property.getProperty("removebleOfGarage")));
			om.setMovableOfOrder(Boolean.valueOf(property.getProperty("movableOfOrder")));
			om.setRemovebleOfOrder(Boolean.valueOf(property.getProperty("removebleOfOrder")));
		} catch (FileNotFoundException fnfe){
			log.error(fnfe);
		}
	}
//----------------------------------------------------------------------------
	public void rr(){
		GarageManager gm = new GarageManager();
		
	} 
}
