package com.herobrot.mastery.init;

import com.herobrot.mastery.config.MasteryConfig;
import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.serializer.GsonConfigSerializer;

public class ConfigInit {
    public static MasteryConfig CONFIG = new MasteryConfig();

    public static void init() {
        AutoConfig.register(MasteryConfig.class, GsonConfigSerializer::new);
        CONFIG = AutoConfig.getConfigHolder(MasteryConfig.class).getConfig();
    }
}
