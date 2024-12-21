package com.github.roitoayanokoji.tutorial;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public final class Tutorial extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getLogger().info("OnEnable");

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().info("OnDisable");
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
            if (cmd.getName().equalsIgnoreCase("hello")){
                //cmd.getName()は実行されたコマンドの名前を取得する
                //equalsIgnoreCase("hello")はコマンド名がhelloであることを確認する。
                // equalsIgnoreCase を使うことで、大文字と小文字を区別せずに比較します。
                // つまり、「/hello」や「/Hello」、「/HELLO」など、どの形式でも正しく処理されます。
                if (sender instanceof Player){
                    Player player = (Player) sender;
                    player.sendMessage("こんにちは" + player.getName() + "さん");
                }else{
                    sender.sendMessage("このコマンドはプレイヤーから実行する必要があります。");
                }
                return true;
                //コマンドが実行された場合は、trueを返して当メソッドを抜ける。
            }
            return false;
            //コマンドが実行されなかった場合は、falseを返して当メソッドを抜ける。
    }
}
