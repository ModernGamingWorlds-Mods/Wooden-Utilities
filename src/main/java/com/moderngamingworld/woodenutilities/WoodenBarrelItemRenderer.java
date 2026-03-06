package com.moderngamingworld.woodenutilities;

//? if (has_geckolib && forge) {
import software.bernie.geckolib.renderer.GeoItemRenderer;

public class WoodenBarrelItemRenderer extends GeoItemRenderer<WoodenBarrelBlockItem> {

    public WoodenBarrelItemRenderer() {
        super(new WoodenBarrelItemGeoModel());
    }
}
//?}
//? if (has_geckolib && neoforge) {
/*import software.bernie.geckolib.renderer.GeoItemRenderer;

public class WoodenBarrelItemRenderer extends GeoItemRenderer<WoodenBarrelBlockItem> {

    public WoodenBarrelItemRenderer() {
        super(new WoodenBarrelItemGeoModel());
    }
}
*///?}
