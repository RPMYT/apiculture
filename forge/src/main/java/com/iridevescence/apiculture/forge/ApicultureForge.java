package com.iridevescence.apiculture.forge;

import dev.architectury.platform.forge.EventBuses;
import com.iridevescence.apiculture.Apiculture;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Apiculture.MOD_ID)
public class ApicultureForge {
    public ApicultureForge() {
        // Submit our event bus to let architectury register our content on the right time
        EventBuses.registerModEventBus(Apiculture.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());
        Apiculture.init();
    }
}