package uristqwerty.CraftGuide.server;

import net.minecraft.client.multiplayer.NetClientHandler;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.network.packet.Packet250CustomPayload;
import uristqwerty.CraftGuide.CraftGuideSide;
import uristqwerty.CraftGuide.api.Util;

public class CraftGuideServer implements CraftGuideSide
{
	@Override
	public void initKeybind()
	{
	}

	@Override
	public void preInit()
	{
		Util.instance = new UtilImplementationServer();
	}

	@Override
	public void reloadRecipes()
	{
	}

	@Override
	public void openGUI(EntityPlayer player)
	{
	}

	@Override
	public void initNetworkChannels()
	{
	}

	@Override
	public void handlePacket(NetClientHandler handler, Packet250CustomPayload packet)
	{
	}

	@Override
	public void stopTessellating()
	{
	}
}
