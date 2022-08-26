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
        // 判断L键是否按下
       if(gameSetting.isKeyDown(Keyboard.KEY_L))
           // 玩家发送随机辱骂信息
            player.sendChatMessage(AbuseUtil.getL());
    }
}
