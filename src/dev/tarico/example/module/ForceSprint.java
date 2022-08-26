package dev.tarico.example.module;


import dev.tarico.api.pluginapi.PluginModule;

public class ForceSprint extends PluginModule {
    public ForceSprint() {
        super("ForceSprint");
    }

    @Override
    public void onTick() {
        if(!player.isSprinting()) player.setSprint(true);
    }
}
