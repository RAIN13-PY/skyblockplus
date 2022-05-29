package gmoney1324.skyblock;
import net.minecraft.client.Minecraft;
import net.minecraft.command.ICommand;
import net.minecraftforge.client.ClientCommandHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import gmoney1324.skyblock.proxy.CommonProxy;
import gmoney1324.skyblock.commands.Commands;
import gmoney1324.skyblock.commands.help.Ping;
import gmoney1324.skyblock.proxy.ClientProxy;

@Mod(modid = Refernce.MOD_ID, name = Refernce.MOD_NAME, version = Refernce.Version)
public class Main {
    @SidedProxy(clientSide = Refernce.CLIENT_PROXY_CLASS, serverSide = Refernce.SERVER_PROXY_CLASS)
    public static CommonProxy proxy;

    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
    	
    }
    public Commands commands = new Commands();
    

    
    public void postInit(FMLPostInitializationEvent event) {
        

    }
	


}