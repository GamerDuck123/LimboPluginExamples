package com.gamerduck.examples;

import com.gamerduck.examples.commands.ExampleCommand;
import com.gamerduck.examples.commands.ExampleCommandWithTabExecutor;
import com.loohp.limbo.plugins.LimboPlugin;

public class CommandExampleMain extends LimboPlugin {
	@Override
	public void onEnable() {
		getServer().getPluginManager().registerCommands(this, new ExampleCommand());
		getServer().getPluginManager().registerCommands(this, new ExampleCommandWithTabExecutor());
	}
}
