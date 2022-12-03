package mod.acgaming.universaltweaks.core;

import java.util.List;

import com.google.common.collect.Lists;
import net.minecraftforge.fml.common.Loader;

import zone.rong.mixinbooter.ILateMixinLoader;

public class UTMixinLoader implements ILateMixinLoader
{
    @Override
    public List<String> getMixinConfigs()
    {
        return Lists.newArrayList(
            "mixins.mods.customspawner.json",
            "mixins.mods.tconstruct.json"
        );
    }

    @Override
    public boolean shouldMixinConfigQueue(String mixinConfig)
    {
        switch (mixinConfig)
        {
            case "mixins.mods.customspawner.json":
                return Loader.isModLoaded("customspawner");
            case "mixins.mods.tconstruct.json":
                return Loader.isModLoaded("tconstruct");
        }
        return false;
    }
}