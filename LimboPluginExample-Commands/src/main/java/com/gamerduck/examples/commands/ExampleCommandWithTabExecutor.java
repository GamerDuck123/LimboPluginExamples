package com.gamerduck.examples.commands;

import java.util.ArrayList;
import java.util.List;

import com.loohp.limbo.Console;
import com.loohp.limbo.commands.CommandExecutor;
import com.loohp.limbo.commands.CommandSender;
import com.loohp.limbo.commands.TabCompletor;
import com.loohp.limbo.player.Player;

public class ExampleCommandWithTabExecutor implements CommandExecutor, TabCompletor {

	public void execute(CommandSender sender, String[] args) {
		if (sender instanceof Console) {
			sender.sendMessage("Player only command!");
			return;
		}
		
		if (args[0].equalsIgnoreCase("testcommandwithtabcompletor")) {
			Player p = (Player) sender;
			p.sendMessage("This is an example command but with tab completor as well!!");
		}
	}

	public List<String> tabComplete(CommandSender sender, String[] args) {
		List<String> arguments = new ArrayList<String>();
		if (args.length <= 1) {
			arguments.add("testcommandwithtabcompletor");
			return arguments;
		}
		if (args.length == 2 && args[0].equalsIgnoreCase("testcommandwithtabcompletor")) {
			arguments.add("this");
			arguments.add("is");
			arguments.add("an");
			arguments.add("example");
			return arguments;
		}
		return arguments;
	}

}
