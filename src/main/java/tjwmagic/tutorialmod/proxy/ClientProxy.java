package tjwmagic.tutorialmod.proxy;

import tjwmagic.tutorialmod.init.ModItems;

public class ClientProxy extends CommonProxy {
	
	
	@Override
	public void registerRenders() {
		ModItems.registerRenders();
	}
}
