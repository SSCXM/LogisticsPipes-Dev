package logisticspipes.proxy.interfaces;

import buildcraft.transport.Pipe;
import logisticspipes.items.ItemLogisticsPipe;
import logisticspipes.pipes.basic.LogisticsTileGenericPipe;
import logisticspipes.utils.ItemIdentifier;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.Player;

public interface IProxy {
	public String getSide();
	public World getWorld();
	public void registerTileEntities();
	public EntityPlayer getClientPlayer();
	public boolean isMainThreadRunning();
	
	public void addLogisticsPipesOverride(IconRegister par1IconRegister, int index, String override1, String override2, boolean flag);
	public void registerParticles();
	public String getName(ItemIdentifier item);
	public void updateNames(ItemIdentifier item, String name);
	public void tick();
	public void sendNameUpdateRequest(Player player);
	public int getDimensionForWorld(World world);
	public LogisticsTileGenericPipe getPipeInDimensionAt(int dimension, int x, int y, int z, EntityPlayer player);
	public int getPipeRenderId();
	public void setIconProviderFromPipe(ItemLogisticsPipe item, Pipe<?> dummyPipe);
	public void registerPipeItemRenderer(int itemID);
}