package factory_producer;
/*
 * This is the factory_producer which helps the main class to bring in which kind of factory is being called by the Client
 * So it gives the instances of Branch_Factory or Staff_Factory in the casting of Hospital_Factory according to the needs of Client.s
 */
import factories.*;

public class Factory_Producer {

	public static Hospital_Factory getFactory(String factoryType) {
		if ("staff".equalsIgnoreCase(factoryType))
		{
			return new Staff_Factory();
		}
		else
			if ("branch".equalsIgnoreCase(factoryType))
			{
				return new Branch_Factory();
			}
			
			
			
		return null;
	}
}
