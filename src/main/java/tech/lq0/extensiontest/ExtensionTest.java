package tech.lq0.extensiontest;

import com.mojang.logging.LogUtils;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;
import tech.lq0.extensiontest.init.ModEntities;
import tech.lq0.extensiontest.init.ModTabs;

@Mod(ExtensionTest.MODID)
public class ExtensionTest {
    public static final String MODID = "extensiontest";
    private static final Logger LOGGER = LogUtils.getLogger();

    public ExtensionTest() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        // Register entities for your extension mod
        ModEntities.REGISTRY.register(bus);

        // Register a separate tab
        // TODO directly register into SuperbWarfare's containers
        ModTabs.TABS.register(bus);

        bus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        LOGGER.info("common setup");
    }
}
