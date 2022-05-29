package gmoney1324.skyblock.commands;
import net.minecraftforge.client.ClientCommandHandler;

import net.minecraftforge.fml.common.Loader;
import gmoney1324.skyblock.commands.help.*;
public class Commands {
	public Commands() {
		// Help Commands
		ClientCommandHandler.instance.registerCommand(new Ping());
	}

}
