package dev.tarico.example;

import dev.tarico.api.pluginapi.Plugin;
import dev.tarico.api.pluginapi.PluginAPI;
import dev.tarico.example.command.CommandName;
import dev.tarico.example.module.AutoJump;
import dev.tarico.example.module.ForceSprint;
import dev.tarico.example.module.LTap;

public class Main implements Plugin {

    @Override
    public void onLoad() {
        // 注册模块和命令
        PluginAPI.commandManager.registerCommand(new CommandName());
        PluginAPI.moduleManager.registerModule(new AutoJump());
        PluginAPI.moduleManager.registerModule(new ForceSprint());
        PluginAPI.moduleManager.registerModule(new LTap());
    }

    @Override
    public void onUnload() {
        // 退出事件
        System.out.println("GoodBye!");
    }
}
