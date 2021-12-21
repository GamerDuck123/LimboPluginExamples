package com.gamerduck.examples.commands;

import com.loohp.limbo.Console;
import com.loohp.limbo.commands.CommandExecutor;
import com.loohp.limbo.commands.CommandSender;
import com.loohp.limbo.player.Player;

public class ExampleCommand implements CommandExecutor {

	public void execute(CommandSender sender, String[] args) {
		if (sender instanceof Console) {
			sender.sendMessage("Player only command!");
			return;
		}
		
		if (args[0].equalsIgnoreCase("testcommand")) {
			Player p = (Player) sender;
			p.sendMessage("This is an example command!");
		}
	}

}
