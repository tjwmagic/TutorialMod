package tjwmagic.tutorialmod.init;

import tjwmagic.tutorialmod.Reference;
import tjwmagic.tutorialmod.items.ItemTinTIngot;
import tjwmagic.tutorialmod.util.Utils;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {
	
	public static Item tinIngot;
	
	public static void init() {
		tinIngot = new ItemTinTIngot("tin_ingot", "tin_ingot");
	}
	
	
	public static void register() {
		registerItem(tinIngot);
		
	}
	
	
	public static void registerRenders() {
		registerRender(tinIngot);
		
	}
	
	public static void registerItem(Item item) {
		GameRegistry.register(item);
		Utils.getLogger().info("Register item " + item.getUnlocalizedName().substring(5));
	}
	
	public static void registerRender(Item item) {
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(new ResourceLocation(Reference.MODID, item.getUnlocalizedName().substring(5)), "inventory"));
		Utils.getLogger().info("Register render for " + item.getUnlocalizedName().substring(5));
	}
}
