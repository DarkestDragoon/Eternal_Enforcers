package net.DarkestDragon.eternal_enforcers.item;

import net.DarkestDragon.eternal_enforcers.Eternal_Enforcers;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> Items =
            DeferredRegister.create(ForgeRegistries.ITEMS, Eternal_Enforcers.MOD_ID);

    public static final RegistryObject<Item> CONSTRUCT_MIND = Items.register("construct_mind",
            ()->new Item(new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));

    public static void register(IEventBus eventBus) {
        Items.register(eventBus);
    }

}
