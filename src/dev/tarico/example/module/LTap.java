package dev.tarico.example.module;


import dev.tarico.api.pluginapi.Option;
import dev.tarico.api.pluginapi.PluginModule;
import dev.tarico.example.utils.AbuseUtil;
import org.lwjgl.input.Keyboard;

public class LTap extends PluginModule {
    public LTap() {
        super("LTap");
    }

    @Override
    public void onKey() {
       if(gameSetting.isKeyDown(Keyboard.KEY_L))
            player.sendChatMessage(AbuseUtil.getL());
    }
}
