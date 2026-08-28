package com.herobrot.mastery.config;

import com.herobrot.heroslib.api.ConfigSync.ClientOnly;
import com.herobrot.mastery.Mastery;
import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.autoconfig.annotation.ConfigEntry;
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.Comment;

@Config(name = Mastery.MODID)
@Config.Gui.Background("minecraft:textures/block/stone.png")
public class MasteryConfig implements ConfigData {

    @Comment("Count for how many jobs can a player have at a time")
    public int employedJobs = 2;
    @Comment("Delay to employ new job")
    public int jobChangeTime = 24000;
    @Comment("Reset current job lvl xp when died")
    public boolean resetCurrentJobXP = true;
    public boolean defaultJobs = true;
    @ClientOnly
    @Comment("Only for Devs")
    public boolean devMode = false;

    @ConfigEntry.Category("experience_settings")
    @Comment("XP equation: lvl^exponent * multiplicator + base")
    public int jobXPBaseCost = 100;
    @ConfigEntry.Category("experience_settings")
    public float jobXPCostMultiplicator = 0.5F;
    @ConfigEntry.Category("experience_settings")
    public int jobXPExponent = 2;
    @ConfigEntry.Category("experience_settings")
    public int jobXPMaxCost = 0;

    @ConfigEntry.Category("reward_settings")
    public int xpMultiplicator = 3;
    @ConfigEntry.Category("reward_settings")
    public int levelZXPMultiplicator = 3;
    @ConfigEntry.Category("reward_settings")
    @Comment("Numismatic Overhaul compat lvl * multiplicator")
    public int moneyMultiplicator = 20;
    public boolean allowMaxLvlProgress = false;
}
