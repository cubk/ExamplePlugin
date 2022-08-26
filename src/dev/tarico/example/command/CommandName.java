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
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        Transferable trans;
        trans = new StringSelection(player.getName());
        clipboard.setContents(trans, null);
        player.addChatMessage("Copy IGN Success.");
    }
}
