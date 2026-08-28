package com.herobrot.mastery;

import com.herobrot.mastery.init.ConfigInit;
import net.neoforged.fml.ModList;
import net.neoforged.neoforge.event.AddReloadListenerEvent;
import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

@Mod(Mastery.MODID)
public class Mastery {

    public static final String MODID = "mastery";
    public static final Logger LOGGER = LogUtils.getLogger();

    public Mastery(IEventBus modEventBus) {
        ConfigInit.init();
    }

    private void onAddReloadListeners(final AddReloadListenerEvent event) {

    }

    private void verifyingModsInstalled() {

    }

    public static boolean isModLoaded(String modTarget) { return ModList.get().isLoaded(modTarget); }
}
