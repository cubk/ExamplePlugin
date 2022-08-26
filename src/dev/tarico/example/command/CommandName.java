package dev.tarico.example.command;

import dev.tarico.api.pluginapi.PluginCommand;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.security.NoSuchAlgorithmException;

public class CommandName extends PluginCommand {
    public CommandName() {
        super("name","Copy your name");
    }

    @Override
    public void onExecute(String[] strings) {
        // 获取Toolkit
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        Transferable trans;
        // 获取玩家名
        trans = new StringSelection(player.getName());
        // 复制到剪切板
        clipboard.setContents(trans, null);
        // 发送Copy IGN Success消息
        player.addChatMessage("Copy IGN Success.");
    }
}
