package tech.lq0.extensiontest.init;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import tech.lq0.extensiontest.ExtensionTest;
import tech.lq0.extensiontest.entity.Tom7Entity;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, ExtensionTest.MODID);

    // Register Tom7
    public static final RegistryObject<EntityType<Tom7Entity>> TOM_7 = register("tom_7",
            EntityType.Builder.<Tom7Entity>of(Tom7Entity::new, MobCategory.MISC)
                    .setTrackingRange(64)
                    .setUpdateInterval(1)
                    .setCustomClientFactory(Tom7Entity::new)
                    .fireImmune()
                    .sized(1.05f, 1.0f)
    );

    private static <T extends Entity> RegistryObject<EntityType<T>> register(String name, EntityType.Builder<T> entityTypeBuilder) {
        return REGISTRY.register(name, () -> entityTypeBuilder.build(name));
    }
}
