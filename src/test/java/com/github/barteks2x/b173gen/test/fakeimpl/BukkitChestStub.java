package com.github.barteks2x.b173gen.test.fakeimpl;

import org.bukkit.Chunk;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.block.Chest;
import org.bukkit.block.data.BlockData;
import org.bukkit.inventory.Inventory;
import org.bukkit.loot.LootTable;
import org.bukkit.material.MaterialData;
import org.bukkit.metadata.MetadataValue;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.plugin.Plugin;

import java.util.List;

class BukkitChestStub implements Chest {

    private BukkitInventoryStub inventory = BukkitInventoryStub.builder().setSize(9*3).build();

    @Override
    public Inventory getInventory() {
        return inventory;
    }

    @Override
    public boolean update() {
        //noop, data is not used in tests
        return true;
    }

    //UNIMPLEMENTED:

    @Override
    public Inventory getBlockInventory() {
        throw new UnsupportedOperationException();
    }

    @Override
    public Block getBlock() {
        throw new UnsupportedOperationException();
    }

    @Override
    public MaterialData getData() {
        throw new UnsupportedOperationException();
    }

    @Override
    public BlockData getBlockData() {
        throw new UnsupportedOperationException("Not implemented");
    }

    @Override
    public Material getType() {
        throw new UnsupportedOperationException();
    }

    public int getTypeId() {
        throw new UnsupportedOperationException();
    }

    @Override
    public byte getLightLevel() {
        throw new UnsupportedOperationException();
    }

    @Override
    public World getWorld() {
        throw new UnsupportedOperationException();
    }

    @Override
    public int getX() {
        throw new UnsupportedOperationException();
    }

    @Override
    public int getY() {
        throw new UnsupportedOperationException();
    }

    @Override
    public int getZ() {
        throw new UnsupportedOperationException();
    }

    @Override
    public Location getLocation() {
        throw new UnsupportedOperationException();
    }

    @Override
    public Location getLocation(Location loc) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Chunk getChunk() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void setData(MaterialData data) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void setBlockData(BlockData blockData) {
        throw new UnsupportedOperationException("Not implemented");
    }

    @Override
    public void setType(Material type) {
        throw new UnsupportedOperationException();
    }

    public boolean setTypeId(int type) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean update(boolean force) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean update(boolean force, boolean applyPhysics) {
        throw new UnsupportedOperationException();
    }

    @Override
    public byte getRawData() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void setRawData(byte data) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean isPlaced() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void setMetadata(String metadataKey, MetadataValue newMetadataValue) {
        throw new UnsupportedOperationException();
    }

    @Override
    public List<MetadataValue> getMetadata(String metadataKey) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean hasMetadata(String metadataKey) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void removeMetadata(String metadataKey, Plugin owningPlugin) {
        throw new UnsupportedOperationException();
    }

	@Override
	public Inventory getSnapshotInventory() {
        throw new UnsupportedOperationException();
	}

	@Override
	public String getLock() {
        throw new UnsupportedOperationException();
	}

	@Override
	public boolean isLocked() {
        throw new UnsupportedOperationException();
	}

	@Override
	public void setLock(String arg0) {
        throw new UnsupportedOperationException();
	}

	@Override
	public String getCustomName() {
        throw new UnsupportedOperationException();
	}

	@Override
	public void setCustomName(String arg0) {
        throw new UnsupportedOperationException();
	}

    @Override
    public PersistentDataContainer getPersistentDataContainer() {
        throw new UnsupportedOperationException("Not implemented");
    }

    @Override
    public void open() {
        throw new UnsupportedOperationException("Not implemented");
    }

    @Override
    public void close() {
        throw new UnsupportedOperationException("Not implemented");
    }

    @Override
    public void setLootTable(LootTable lootTable) {
        throw new UnsupportedOperationException("Not implemented");
    }

    @Override
    public LootTable getLootTable() {
        throw new UnsupportedOperationException("Not implemented");
    }

    @Override
    public void setSeed(long l) {
        throw new UnsupportedOperationException("Not implemented");
    }

    @Override
    public long getSeed() {
        throw new UnsupportedOperationException("Not implemented");
    }
}
