package gmoney1324.skyblock.commands;
import java.util.HashMap;
import java.util.List;

import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
public class Ping extends CommandBase{

    @Override
    public String getCommandName() {
        // TODO Auto-generated method stub
        return "ping";
    }

    @Override
    public String getCommandUsage(ICommandSender sender) {
        // TODO Auto-generated method stub
        return "ping";
    }

    @Override
    public void processCommand(ICommandSender sender, String[] args) throws CommandException {
        // TODO Auto-generated method stub
        sender.addChatMessage(new ChatComponentText("sucess"));
    }
    @Override
    public boolean canCommandSenderUseCommand(ICommandSender sender) {
        return true;
        
    }
    @Override
    public int getRequiredPermissionLevel() {
        return 0;
    }
}