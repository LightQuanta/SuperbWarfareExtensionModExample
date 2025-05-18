package tech.lq0.extensiontest.init;

import com.atsuishio.superbwarfare.init.ModItems;
import com.atsuishio.superbwarfare.item.ContainerBlockItem;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import tech.lq0.extensiontest.ExtensionTest;

@SuppressWarnings("unused")
public class ModTabs {
    public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ExtensionTest.MODID);

    public static final RegistryObject<CreativeModeTab> BLOCK_TAB = TABS.register("tom7",
            () -> CreativeModeTab.builder()
                    .title(Component.translatable("item_group.extensiontest.tom7"))
                    .icon(() -> new ItemStack(ModItems.CONTAINER.get()))
                    .displayItems((param, output) -> output.accept(ContainerBlockItem.createInstance(ModEntities.TOM_7.get())))
                    .build());
}
