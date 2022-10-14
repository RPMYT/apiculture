package com.iridevescence.apiculture.fabric;

import com.iridevescence.apiculture.Apiculture;
import net.fabricmc.api.ModInitializer;

public class ApicultureFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        Apiculture.init();
    }
}