package gmoney1324.skyblock;
import net.minecraft.command.ICommand;
import net.minecraftforge.client.ClientCommandHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import gmoney1324.skyblock.commands.Ping;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import gmoney1324.skyblock.proxy.CommonProxy;
import gmoney1324.skyblock.proxy.ClientProxy;

@Mod(modid = Refernce.MOD_ID, name = Refernce.MOD_NAME, version = Refernce.Version)
public class Main {
    @SidedProxy(clientSide = Refernce.CLIENT_PROXY_CLASS, serverSide = Refernce.SERVER_PROXY_CLASS)
    public static CommonProxy proxy;
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        

    }
    
    public void commands(FMLInitializationEvent event)
    {
        ClientCommandHandler.instance.registerCommand(new Ping());

    }
    public void postInit(FMLPostInitializationEvent event)
    {
        

    }



}