package dev.tarico.example.module;


import dev.tarico.api.pluginapi.PluginModule;

public class AutoJump extends PluginModule {
    public AutoJump() {
        super("AutoJump");
    }

    @Override
    public void onTick() {
        if(player.canJump())
            player.jump();
    }
}
