package dev.tarico.example.module;


import dev.tarico.api.pluginapi.PluginModule;

public class AutoJump extends PluginModule {
    public AutoJump() {
        super("AutoJump");
    }

    @Override
    public void onTick() {
        // 判断玩家是否可以跳跃
        if(player.canJump())
            // 玩家跳跃
            player.jump();
    }
}
