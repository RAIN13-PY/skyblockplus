package gmoney1324.skyblock.commands.help;
import gmoney1324.skyblock.Main;
import gmoney1324.skyblock.commands.ClientCommandBase;
import net.minecraft.client.Minecraft;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.util.ChatComponentText;
import java.util.ArrayList;
import java.util.List;

public class Ping extends ClientCommandBase {
	public Ping() {
		super("test");
	}
	
	@Override
	public void processCommand(ICommandSender sender, String[] args) {
		String message = "sucess";
		Minecraft.getMinecraft().thePlayer.addChatMessage(new ChatComponentText(message));
		
		
	}
	
}
