package com.github.barteks2x.b173gen.test.fakeimpl;

import com.github.barteks2x.b173gen.test.util.ChunkData;
import com.github.barteks2x.b173gen.test.util.IChunkSource;
import org.bukkit.*;
import org.bukkit.block.Biome;
import org.bukkit.block.Block;
import org.bukkit.block.data.BlockData;
import org.bukkit.boss.DragonBattle;
import org.bukkit.entity.*;
import org.bukkit.generator.BlockPopulator;
import org.bukkit.generator.ChunkGenerator;
import org.bukkit.inventory.ItemStack;
import org.bukkit.material.MaterialData;
import org.bukkit.metadata.MetadataValue;
import org.bukkit.plugin.Plugin;
import org.bukkit.util.BoundingBox;
import org.bukkit.util.Consumer;
import org.bukkit.util.RayTraceResult;
import org.bukkit.util.Vector;

import java.io.File;
import java.util.*;
import java.util.function.Predicate;

public class BukkitWorldStub implements World {

    private long seed;
    private String name;
    private IChunkSource chunkSource;

    public void setSeed(long seed) {
        this.seed = seed;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setChunkSource(IChunkSource chunkSource) {
        this.chunkSource = chunkSource;
    }

    @Override
    public long getSeed() {
        return this.seed;
    }

    @Override
    public String getName() {
        return this.name;
    }

    //Simple world implementation:
    @Override
    public Block getBlockAt(int x, int y, int z) {
        ChunkData chunk = chunkSource.getChunkData(x >> 4, z >> 4);
        if (chunk == null || y >= 128 || y < 0) {
            return new BukkitBlockStub(this, x, y, z, Material.AIR);
        }
        return new BukkitBlockStub(this, x, y, z, chunk.getBlock(x & 0xF, y, z & 0xF));
    }

    public void setTypeDirectly(int x, int y, int z, Material type) {
        ChunkData chunk = chunkSource.getChunkData(x >> 4, z >> 4);
        if (chunk == null || y >= 128 || y < 0) {
            return;
        }
        chunk.setBlock(x & 0xF, y, z & 0xF, type);
    }

    public ChunkData getChunkDataAt(int x, int z) {
        return chunkSource.getChunkData(x, z);
    }

    //--------------------------------
    //         UNIMPLEMENTED
    //--------------------------------


    @Override
    public Block getBlockAt(Location location) {
        throw new UnsupportedOperationException();
    }

    public int getBlockTypeIdAt(int i, int i1, int i2) {
        throw new UnsupportedOperationException();
    }

    public int getBlockTypeIdAt(Location location) {
        throw new UnsupportedOperationException();
    }

    @Override
    public int getHighestBlockYAt(int i, int i1) {
        throw new UnsupportedOperationException();
    }

    @Override
    public int getHighestBlockYAt(Location location) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Block getHighestBlockAt(int i, int i1) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Block getHighestBlockAt(Location location) {
        throw new UnsupportedOperationException();
    }

    @Override
    public int getHighestBlockYAt(int i, int i1, HeightMap heightMap) {
        throw new UnsupportedOperationException("Not implemented");
    }

    @Override
    public int getHighestBlockYAt(Location location, HeightMap heightMap) {
        throw new UnsupportedOperationException("Not implemented");
    }

    @Override
    public Block getHighestBlockAt(int i, int i1, HeightMap heightMap) {
        throw new UnsupportedOperationException("Not implemented");
    }

    @Override
    public Block getHighestBlockAt(Location location, HeightMap heightMap) {
        throw new UnsupportedOperationException("Not implemented");
    }

    @Override
    public Chunk getChunkAt(int i, int i1) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Chunk getChunkAt(Location location) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Chunk getChunkAt(Block block) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean isChunkLoaded(Chunk chunk) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Chunk[] getLoadedChunks() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void loadChunk(Chunk chunk) {
    }

    @Override
    public boolean isChunkLoaded(int i, int i1) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean isChunkGenerated(int i, int i1) {
        throw new UnsupportedOperationException("Not implemented");
    }

    @Override
    public boolean isChunkInUse(int i, int i1) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void loadChunk(int i, int i1) {
    }

    @Override
    public boolean loadChunk(int i, int i1, boolean b) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean unloadChunk(Chunk chunk) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean unloadChunk(int i, int i1) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean unloadChunk(int i, int i1, boolean b) {
        throw new UnsupportedOperationException();
    }

    public boolean unloadChunk(int i, int i1, boolean b, boolean b1) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean unloadChunkRequest(int i, int i1) {
        throw new UnsupportedOperationException();
    }

    public boolean unloadChunkRequest(int i, int i1, boolean b) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean regenerateChunk(int i, int i1) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean refreshChunk(int i, int i1) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean isChunkForceLoaded(int i, int i1) {
        throw new UnsupportedOperationException("Not implemented");
    }

    @Override
    public void setChunkForceLoaded(int i, int i1, boolean b) {
        throw new UnsupportedOperationException("Not implemented");
    }

    @Override
    public Collection<Chunk> getForceLoadedChunks() {
        throw new UnsupportedOperationException("Not implemented");
    }

    @Override
    public boolean addPluginChunkTicket(int i, int i1, Plugin plugin) {
        throw new UnsupportedOperationException("Not implemented");
    }

    @Override
    public boolean removePluginChunkTicket(int i, int i1, Plugin plugin) {
        throw new UnsupportedOperationException("Not implemented");
    }

    @Override
    public void removePluginChunkTickets(Plugin plugin) {
        throw new UnsupportedOperationException("Not implemented");
    }

    @Override
    public Collection<Plugin> getPluginChunkTickets(int i, int i1) {
        throw new UnsupportedOperationException("Not implemented");
    }

    @Override
    public Map<Plugin, Collection<Chunk>> getPluginChunkTickets() {
        throw new UnsupportedOperationException("Not implemented");
    }

    @Override
    public Item dropItem(Location location, ItemStack itemStack) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Item dropItemNaturally(Location location, ItemStack itemStack) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Arrow spawnArrow(Location location, Vector vector, float v, float v1) {
        throw new UnsupportedOperationException("Not implemented");
    }

    @Override
    public <T extends AbstractArrow> T spawnArrow(Location location, Vector vector, float v, float v1, Class<T> aClass) {
        throw new UnsupportedOperationException("Not implemented");
    }

    @Override
    public boolean generateTree(Location location, TreeType treeType) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean generateTree(Location location, TreeType treeType, BlockChangeDelegate blockChangeDelegate) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Entity spawnEntity(Location location, EntityType entityType) {
        throw new UnsupportedOperationException();
    }

    @Override
    public LightningStrike strikeLightning(Location location) {
        throw new UnsupportedOperationException();
    }

    @Override
    public LightningStrike strikeLightningEffect(Location location) {
        throw new UnsupportedOperationException();
    }

    @Override
    public List<Entity> getEntities() {
        throw new UnsupportedOperationException();
    }

    @Override
    public List<LivingEntity> getLivingEntities() {
        throw new UnsupportedOperationException();
    }

    @Override
    public <T extends Entity> Collection<T> getEntitiesByClass(Class<T>... classes) {
        throw new UnsupportedOperationException();
    }

    @Override
    public <T extends Entity> Collection<T> getEntitiesByClass(Class<T> aClass) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Collection<Entity> getEntitiesByClasses(Class<?>... classes) {
        throw new UnsupportedOperationException();
    }

    @Override
    public List<Player> getPlayers() {
        throw new UnsupportedOperationException();
    }

    @Override
    public Collection<Entity> getNearbyEntities(Location location, double v, double v1, double v2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Collection<Entity> getNearbyEntities(Location location, double v, double v1, double v2, Predicate<Entity> predicate) {
        throw new UnsupportedOperationException("Not implemented");
    }

    @Override
    public Collection<Entity> getNearbyEntities(BoundingBox boundingBox) {
        throw new UnsupportedOperationException("Not implemented");
    }

    @Override
    public Collection<Entity> getNearbyEntities(BoundingBox boundingBox, Predicate<Entity> predicate) {
        throw new UnsupportedOperationException("Not implemented");
    }

    @Override
    public RayTraceResult rayTraceEntities(Location location, Vector vector, double v) {
        throw new UnsupportedOperationException("Not implemented");
    }

    @Override
    public RayTraceResult rayTraceEntities(Location location, Vector vector, double v, double v1) {
        throw new UnsupportedOperationException("Not implemented");
    }

    @Override
    public RayTraceResult rayTraceEntities(Location location, Vector vector, double v, Predicate<Entity> predicate) {
        throw new UnsupportedOperationException("Not implemented");
    }

    @Override
    public RayTraceResult rayTraceEntities(Location location, Vector vector, double v, double v1, Predicate<Entity> predicate) {
        throw new UnsupportedOperationException("Not implemented");
    }

    @Override
    public RayTraceResult rayTraceBlocks(Location location, Vector vector, double v) {
        throw new UnsupportedOperationException("Not implemented");
    }

    @Override
    public RayTraceResult rayTraceBlocks(Location location, Vector vector, double v, FluidCollisionMode fluidCollisionMode) {
        throw new UnsupportedOperationException("Not implemented");
    }

    @Override
    public RayTraceResult rayTraceBlocks(Location location, Vector vector, double v, FluidCollisionMode fluidCollisionMode, boolean b) {
        throw new UnsupportedOperationException("Not implemented");
    }

    @Override
    public RayTraceResult rayTrace(Location location, Vector vector, double v, FluidCollisionMode fluidCollisionMode, boolean b, double v1, Predicate<Entity> predicate) {
        throw new UnsupportedOperationException("Not implemented");
    }

    @Override
    public UUID getUID() {
        throw new UnsupportedOperationException();
    }

    @Override
    public Location getSpawnLocation() {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean setSpawnLocation(Location location) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean setSpawnLocation(int i, int i1, int i2, float v) {
        throw new UnsupportedOperationException("Not implemented");
    }

    @Override
    public boolean setSpawnLocation(int i, int i1, int i2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public long getTime() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void setTime(long l) {
        throw new UnsupportedOperationException();
    }

    @Override
    public long getFullTime() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void setFullTime(long l) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean hasStorm() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void setStorm(boolean b) {
        throw new UnsupportedOperationException();
    }

    @Override
    public int getWeatherDuration() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void setWeatherDuration(int i) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean isThundering() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void setThundering(boolean b) {
        throw new UnsupportedOperationException();
    }

    @Override
    public int getThunderDuration() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void setThunderDuration(int i) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean createExplosion(double v, double v1, double v2, float v3) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean createExplosion(double v, double v1, double v2, float v3, boolean b) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean createExplosion(double v, double v1, double v2, float v3, boolean b, boolean b1) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean createExplosion(double v, double v1, double v2, float v3, boolean b, boolean b1, Entity entity) {
        throw new UnsupportedOperationException("Not implemented");
    }

    @Override
    public boolean createExplosion(Location location, float v) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean createExplosion(Location location, float v, boolean b) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean createExplosion(Location location, float v, boolean b, boolean b1) {
        throw new UnsupportedOperationException("Not implemented");
    }

    @Override
    public boolean createExplosion(Location location, float v, boolean b, boolean b1, Entity entity) {
        throw new UnsupportedOperationException("Not implemented");
    }

    @Override
    public Environment getEnvironment() {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean getPVP() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void setPVP(boolean b) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ChunkGenerator getGenerator() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void save() {
        throw new UnsupportedOperationException();
    }

    @Override
    public List<BlockPopulator> getPopulators() {
        throw new UnsupportedOperationException();
    }

    @Override
    public <T extends Entity> T spawn(Location location, Class<T> aClass) throws IllegalArgumentException {
        throw new UnsupportedOperationException();
    }

    @Override
    public FallingBlock spawnFallingBlock(Location location, Material material, byte b) throws IllegalArgumentException {
        throw new UnsupportedOperationException();
    }

    public FallingBlock spawnFallingBlock(Location location, int i, byte b) throws IllegalArgumentException {
        throw new UnsupportedOperationException();
    }

    @Override
    public void playEffect(Location location, Effect effect, int i) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void playEffect(Location location, Effect effect, int i, int i1) {
        throw new UnsupportedOperationException();
    }

    @Override
    public <T> void playEffect(Location location, Effect effect, T t) {
        throw new UnsupportedOperationException();
    }

    @Override
    public <T> void playEffect(Location location, Effect effect, T t, int i) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ChunkSnapshot getEmptyChunkSnapshot(int i, int i1, boolean b, boolean b1) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void setSpawnFlags(boolean b, boolean b1) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean getAllowAnimals() {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean getAllowMonsters() {
        throw new UnsupportedOperationException();
    }

    @Override
    public Biome getBiome(int i, int i1) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Biome getBiome(int i, int i1, int i2) {
        throw new UnsupportedOperationException("Not implemented");
    }

    @Override
    public void setBiome(int i, int i1, Biome biome) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void setBiome(int i, int i1, int i2, Biome biome) {
        throw new UnsupportedOperationException("Not implemented");
    }

    @Override
    public double getTemperature(int i, int i1) {
        throw new UnsupportedOperationException();
    }

    @Override
    public double getTemperature(int i, int i1, int i2) {
        throw new UnsupportedOperationException("Not implemented");
    }

    @Override
    public double getHumidity(int i, int i1) {
        throw new UnsupportedOperationException();
    }

    @Override
    public double getHumidity(int i, int i1, int i2) {
        throw new UnsupportedOperationException("Not implemented");
    }

    @Override
    public int getMaxHeight() {
        throw new UnsupportedOperationException();
    }

    @Override
    public int getSeaLevel() {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean getKeepSpawnInMemory() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void setKeepSpawnInMemory(boolean b) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean isAutoSave() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void setAutoSave(boolean b) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void setDifficulty(Difficulty difficulty) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Difficulty getDifficulty() {
        throw new UnsupportedOperationException();
    }

    @Override
    public File getWorldFolder() {
        throw new UnsupportedOperationException();
    }

    @Override
    public WorldType getWorldType() {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean canGenerateStructures() {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean isHardcore() {
        throw new UnsupportedOperationException("Not implemented");
    }

    @Override
    public void setHardcore(boolean b) {
        throw new UnsupportedOperationException("Not implemented");
    }

    @Override
    public long getTicksPerAnimalSpawns() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void setTicksPerAnimalSpawns(int i) {
        throw new UnsupportedOperationException();
    }

    @Override
    public long getTicksPerMonsterSpawns() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void setTicksPerMonsterSpawns(int i) {
        throw new UnsupportedOperationException();
    }

    @Override
    public long getTicksPerWaterSpawns() {
        throw new UnsupportedOperationException("Not implemented");
    }

    @Override
    public void setTicksPerWaterSpawns(int i) {
        throw new UnsupportedOperationException("Not implemented");
    }

    @Override
    public long getTicksPerWaterAmbientSpawns() {
        throw new UnsupportedOperationException("Not implemented");
    }

    @Override
    public void setTicksPerWaterAmbientSpawns(int i) {
        throw new UnsupportedOperationException("Not implemented");
    }

    @Override
    public long getTicksPerAmbientSpawns() {
        throw new UnsupportedOperationException("Not implemented");
    }

    @Override
    public void setTicksPerAmbientSpawns(int i) {
        throw new UnsupportedOperationException("Not implemented");
    }

    @Override
    public int getMonsterSpawnLimit() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void setMonsterSpawnLimit(int i) {
        throw new UnsupportedOperationException();
    }

    @Override
    public int getAnimalSpawnLimit() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void setAnimalSpawnLimit(int i) {
        throw new UnsupportedOperationException();
    }

    @Override
    public int getWaterAnimalSpawnLimit() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void setWaterAnimalSpawnLimit(int i) {
        throw new UnsupportedOperationException();
    }

    @Override
    public int getWaterAmbientSpawnLimit() {
        throw new UnsupportedOperationException("Not implemented");
    }

    @Override
    public void setWaterAmbientSpawnLimit(int i) {
        throw new UnsupportedOperationException("Not implemented");
    }

    @Override
    public int getAmbientSpawnLimit() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void setAmbientSpawnLimit(int i) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void playSound(Location location, Sound sound, float v, float v1) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void playSound(Location location, String s, float v, float v1) {
        throw new UnsupportedOperationException();
    }

    @Override
    public String[] getGameRules() {
        throw new UnsupportedOperationException();
    }

    @Override
    public String getGameRuleValue(String s) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean setGameRuleValue(String s, String s1) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean isGameRule(String s) {
        throw new UnsupportedOperationException();
    }

    @Override
    public <T> T getGameRuleValue(GameRule<T> gameRule) {
        throw new UnsupportedOperationException("Not implemented");
    }

    @Override
    public <T> T getGameRuleDefault(GameRule<T> gameRule) {
        throw new UnsupportedOperationException("Not implemented");
    }

    @Override
    public <T> boolean setGameRule(GameRule<T> gameRule, T t) {
        throw new UnsupportedOperationException("Not implemented");
    }

    @Override
    public WorldBorder getWorldBorder() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void spawnParticle(Particle particle, Location location, int i) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void spawnParticle(Particle particle, double v, double v1, double v2, int i) {
        throw new UnsupportedOperationException();
    }

    @Override
    public <T> void spawnParticle(Particle particle, Location location, int i, T t) {
        throw new UnsupportedOperationException();
    }

    @Override
    public <T> void spawnParticle(Particle particle, double v, double v1, double v2, int i, T t) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void spawnParticle(Particle particle, Location location, int i, double v, double v1, double v2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void spawnParticle(Particle particle, double v, double v1, double v2, int i, double v3, double v4, double v5) {
        throw new UnsupportedOperationException();
    }

    @Override
    public <T> void spawnParticle(Particle particle, Location location, int i, double v, double v1, double v2, T t) {
        throw new UnsupportedOperationException();
    }

    @Override
    public <T> void spawnParticle(Particle particle, double v, double v1, double v2, int i, double v3, double v4, double v5, T t) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void spawnParticle(Particle particle, Location location, int i, double v, double v1, double v2, double v3) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void spawnParticle(Particle particle, double v, double v1, double v2, int i, double v3, double v4, double v5, double v6) {
        throw new UnsupportedOperationException();
    }

    @Override
    public <T> void spawnParticle(Particle particle, Location location, int i, double v, double v1, double v2, double v3, T t) {
        throw new UnsupportedOperationException();
    }

    @Override
    public <T> void spawnParticle(Particle particle, double v, double v1, double v2, int i, double v3, double v4, double v5, double v6, T t) {
        throw new UnsupportedOperationException();
    }

    @Override
    public <T> void spawnParticle(Particle particle, Location location, int i, double v, double v1, double v2, double v3, T t, boolean b) {
        throw new UnsupportedOperationException("Not implemented");
    }

    @Override
    public <T> void spawnParticle(Particle particle, double v, double v1, double v2, int i, double v3, double v4, double v5, double v6, T t, boolean b) {
        throw new UnsupportedOperationException("Not implemented");
    }

    @Override
    public Location locateNearestStructure(Location location, StructureType structureType, int i, boolean b) {
        throw new UnsupportedOperationException("Not implemented");
    }

    @Override
    public int getViewDistance() {
        throw new UnsupportedOperationException("Not implemented");
    }

    @Override
    public Spigot spigot() {
        throw new UnsupportedOperationException("Not implemented");
    }

    @Override
    public Raid locateNearestRaid(Location location, int i) {
        throw new UnsupportedOperationException("Not implemented");
    }

    @Override
    public List<Raid> getRaids() {
        throw new UnsupportedOperationException("Not implemented");
    }

    @Override
    public DragonBattle getEnderDragonBattle() {
        throw new UnsupportedOperationException("Not implemented");
    }

    @Override
    public void setMetadata(String s, MetadataValue metadataValue) {
        throw new UnsupportedOperationException();
    }

    @Override
    public List<MetadataValue> getMetadata(String s) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean hasMetadata(String s) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void removeMetadata(String s, Plugin plugin) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void sendPluginMessage(Plugin plugin, String s, byte[] bytes) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Set<String> getListeningPluginChannels() {
        throw new UnsupportedOperationException();
    }

	@Override
	public void playSound(Location arg0, Sound arg1, SoundCategory arg2, float arg3, float arg4) {
        throw new UnsupportedOperationException();
	}

	@Override
	public void playSound(Location arg0, String arg1, SoundCategory arg2, float arg3, float arg4) {
        throw new UnsupportedOperationException();
	}

	@Override
	public <T extends Entity> T spawn(Location arg0, Class<T> arg1, Consumer<T> arg2) throws IllegalArgumentException {
        throw new UnsupportedOperationException();
	}

	@Override
	public FallingBlock spawnFallingBlock(Location arg0, MaterialData arg1) throws IllegalArgumentException {
        throw new UnsupportedOperationException();
	}

    @Override
    public FallingBlock spawnFallingBlock(Location location, BlockData blockData) throws IllegalArgumentException {
        throw new UnsupportedOperationException("Not implemented");
    }
}
