package dev.tarico.example.module;


import dev.tarico.api.pluginapi.PluginModule;

public class ForceSprint extends PluginModule {
    public ForceSprint() {
        super("ForceSprint");
    }

    @Override
    public void onTick() {
        // 如果玩家没有在疾跑则强制疾跑
        if(!player.isSprinting()) player.setSprint(true);
    }
}
