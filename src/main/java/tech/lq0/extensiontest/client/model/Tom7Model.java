package tech.lq0.extensiontest.client.model;

import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;
import tech.lq0.extensiontest.ExtensionTest;
import tech.lq0.extensiontest.entity.Tom7Entity;

public class Tom7Model extends GeoModel<Tom7Entity> {

    @Override
    public ResourceLocation getAnimationResource(Tom7Entity entity) {
        return null;
    }

    @Override
    public ResourceLocation getModelResource(Tom7Entity entity) {
        return new ResourceLocation(ExtensionTest.MODID, "geo/tom_7.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(Tom7Entity entity) {
        return new ResourceLocation(ExtensionTest.MODID, "textures/entity/tom_7.png");
    }
}
