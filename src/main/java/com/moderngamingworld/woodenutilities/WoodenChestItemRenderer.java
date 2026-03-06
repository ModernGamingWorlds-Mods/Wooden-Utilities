package com.moderngamingworld.woodenutilities;

//? if (has_geckolib && forge) {
import software.bernie.geckolib.renderer.GeoItemRenderer;

public class WoodenChestItemRenderer extends GeoItemRenderer<WoodenChestBlockItem> {

    public WoodenChestItemRenderer() {
        super(new WoodenChestItemGeoModel());
    }
}
//?}
//? if (has_geckolib && neoforge) {
/*import software.bernie.geckolib.renderer.GeoItemRenderer;

public class WoodenChestItemRenderer extends GeoItemRenderer<WoodenChestBlockItem> {

    public WoodenChestItemRenderer() {
        super(new WoodenChestItemGeoModel());
    }
}
*///?}
