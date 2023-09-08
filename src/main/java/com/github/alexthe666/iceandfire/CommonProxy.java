package com.github.alexthe666.iceandfire;

import com.github.alexthe666.iceandfire.block.*;
import com.github.alexthe666.iceandfire.entity.*;
import com.github.alexthe666.iceandfire.enums.EnumDragonArmor;
import com.github.alexthe666.iceandfire.enums.EnumSeaSerpent;
import com.github.alexthe666.iceandfire.enums.EnumSkullType;
import com.github.alexthe666.iceandfire.enums.EnumTroll;
import com.github.alexthe666.iceandfire.item.IafItemRegistry;
import com.github.alexthe666.iceandfire.item.block.ItemBlockMyrmexResin;
import com.github.alexthe666.iceandfire.item.block.ItemBlockPodium;
import com.github.alexthe666.iceandfire.misc.IafSoundRegistry;
import com.github.alexthe666.iceandfire.recipe.IafRecipeRegistry;
import com.github.alexthe666.iceandfire.world.IafWorldRegistry;
import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.EntityEntry;
import net.minecraftforge.fml.common.registry.EntityEntryBuilder;
import net.minecraftforge.fml.common.registry.VillagerRegistry;

import java.lang.reflect.Field;

@Mod.EventBusSubscriber
public class CommonProxy {

    @SubscribeEvent
    public static void registerSoundEvents(final RegistryEvent.Register<SoundEvent> event) {
        try {
            for (Field f : IafSoundRegistry.class.getDeclaredFields()) {
                Object obj = f.get(null);
                if (obj instanceof SoundEvent) {
                    event.getRegistry().register((SoundEvent) obj);
                } else if (obj instanceof SoundEvent[]) {
                    for (SoundEvent soundEvent : (SoundEvent[]) obj) {
                        event.getRegistry().register(soundEvent);
                    }
                }
            }
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    @SubscribeEvent
    public static void registerVillagers(RegistryEvent.Register<VillagerRegistry.VillagerProfession> event) {
        IafVillagerRegistry.INSTANCE.init();
        event.getRegistry().register(IafVillagerRegistry.INSTANCE.fisherman);
        event.getRegistry().register(IafVillagerRegistry.INSTANCE.craftsman);
        event.getRegistry().register(IafVillagerRegistry.INSTANCE.shaman);
        event.getRegistry().register(IafVillagerRegistry.INSTANCE.desertMyrmexWorker);
        event.getRegistry().register(IafVillagerRegistry.INSTANCE.jungleMyrmexWorker);
        event.getRegistry().register(IafVillagerRegistry.INSTANCE.desertMyrmexSoldier);
        event.getRegistry().register(IafVillagerRegistry.INSTANCE.jungleMyrmexSoldier);
        event.getRegistry().register(IafVillagerRegistry.INSTANCE.desertMyrmexSentinel);
        event.getRegistry().register(IafVillagerRegistry.INSTANCE.jungleMyrmexSentinel);
        event.getRegistry().register(IafVillagerRegistry.INSTANCE.desertMyrmexRoyal);
        event.getRegistry().register(IafVillagerRegistry.INSTANCE.jungleMyrmexRoyal);
        event.getRegistry().register(IafVillagerRegistry.INSTANCE.desertMyrmexQueen);
        event.getRegistry().register(IafVillagerRegistry.INSTANCE.jungleMyrmexQueen);
    }

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {
        try {
            for (Field f : IafBlockRegistry.class.getDeclaredFields()) {
                Object obj = f.get(null);
                if (obj instanceof Block) {
                    event.getRegistry().register((Block) obj);
                } else if (obj instanceof Block[]) {
                    for (Block block : (Block[]) obj) {
                        event.getRegistry().register(block);
                    }
                }
            }
            for (EnumSeaSerpent color : EnumSeaSerpent.values()) {
                color.scaleBlock = new BlockSeaSerpentScales(color.resourceName, color.color);
                event.getRegistry().register(color.scaleBlock);
            }
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    @SubscribeEvent
    public static void registerEntities(final RegistryEvent.Register<EntityEntry> event) {
        registerUnspawnable(EntityEntryBuilder.create(), event, (Class<? extends Entity>)EntityDragonEgg.class, "dragonegg", 1);
        registerUnspawnable(EntityEntryBuilder.create(), event, (Class<? extends Entity>)EntityDragonArrow.class, "dragonarrow", 2);
        registerUnspawnable(EntityEntryBuilder.create(), event, (Class<? extends Entity>)EntityDragonSkull.class, "dragonskull", 3);
        registerSpawnable(EntityEntryBuilder.create(), event, (Class<? extends Entity>)EntityFireDragon.class, "firedragon", 5, 3407872, 10823977, 256, 3);
        registerSpawnable(EntityEntryBuilder.create(), event, (Class<? extends Entity>)EntityIceDragon.class, "icedragon", 7, 11918843, 8305392, 256, 3);
        registerUnspawnable(EntityEntryBuilder.create(), event, (Class<? extends Entity>)EntityDragonFireCharge.class, "dragonfirecharge", 8);
        registerUnspawnable(EntityEntryBuilder.create(), event, (Class<? extends Entity>)EntityDragonIceCharge.class, "dragonicecharge", 9);
        registerSpawnable(EntityEntryBuilder.create(), event, (Class<? extends Entity>)EntitySnowVillager.class, "snowvillager", 10, 3942947, 7385551);
        registerUnspawnable(EntityEntryBuilder.create(), event, (Class<? extends Entity>)EntityHippogryphEgg.class, "hippogryphegg", 11);
        registerSpawnable(EntityEntryBuilder.create(), event, (Class<? extends Entity>)EntityHippogryph.class, "hippogryph", 12, 14211288, 13743453);
        registerUnspawnable(EntityEntryBuilder.create(), event, (Class<? extends Entity>)EntityStoneStatue.class, "stonestatue", 13);
        registerSpawnable(EntityEntryBuilder.create(), event, (Class<? extends Entity>)EntityGorgon.class, "gorgon", 14, 13687199, 6833456);
        registerSpawnable(EntityEntryBuilder.create(), event, (Class<? extends Entity>)EntityPixie.class, "if_pixie", 15, 16744329, 14863586);
        registerSpawnable(EntityEntryBuilder.create(), event, (Class<? extends Entity>)EntityCyclops.class, "cyclops", 17, 11567726, 3809039);
        registerSpawnable(EntityEntryBuilder.create(), event, (Class<? extends Entity>)EntitySiren.class, "siren", 18, 9365194, 15917000);
        registerSpawnable(EntityEntryBuilder.create(), event, (Class<? extends Entity>)EntityHippocampus.class, "hippocampus", 19, 4493767, 5227883);
        registerSpawnable(EntityEntryBuilder.create(), event, (Class<? extends Entity>)EntityDeathWorm.class, "deathworm", 20, 13749667, 4340282);
        registerUnspawnable(EntityEntryBuilder.create(), event, (Class<? extends Entity>)EntityDeathWormEgg.class, "deathwormegg", 21);
        registerSpawnable(EntityEntryBuilder.create(), event, (Class<? extends Entity>)EntityCockatrice.class, "if_cockatrice", 22, 9392133, 5200419);
        registerUnspawnable(EntityEntryBuilder.create(), event, (Class<? extends Entity>)EntityCockatriceEgg.class, "if_cockatriceegg", 23);
        registerSpawnable(EntityEntryBuilder.create(), event, (Class<? extends Entity>)EntityStymphalianBird.class, "stymphalianbird", 24, 7622455, 10382411);
        registerUnspawnable(EntityEntryBuilder.create(), event, (Class<? extends Entity>)EntityStymphalianFeather.class, "stymphalianfeather", 25);
        registerUnspawnable(EntityEntryBuilder.create(), event, (Class<? extends Entity>)EntityStymphalianArrow.class, "stymphalianarrow", 26);
        registerSpawnable(EntityEntryBuilder.create(), event, (Class<? extends Entity>)EntityTroll.class, "if_troll", 27, 4014397, 5784378);
        registerSpawnable(EntityEntryBuilder.create(), event, (Class<? extends Entity>)EntityMyrmexWorker.class, "myrmex_worker", 28, 10575910, 5850400);
        registerSpawnable(EntityEntryBuilder.create(), event, (Class<? extends Entity>)EntityMyrmexSoldier.class, "myrmex_soldier", 29, 10575910, 8217133);
        registerSpawnable(EntityEntryBuilder.create(), event, (Class<? extends Entity>)EntityMyrmexSentinel.class, "myrmex_sentinel", 30, 10575910, 10649402);
        registerSpawnable(EntityEntryBuilder.create(), event, (Class<? extends Entity>)EntityMyrmexRoyal.class, "myrmex_royal", 31, 10575910, 13081416);
        registerSpawnable(EntityEntryBuilder.create(), event, (Class<? extends Entity>)EntityMyrmexQueen.class, "myrmex_queen", 32, 10575910, 15513685);
        registerUnspawnable(EntityEntryBuilder.create(), event, (Class<? extends Entity>)EntityMyrmexEgg.class, "myrmex_egg", 33);
        registerSpawnable(EntityEntryBuilder.create(), event, (Class<? extends Entity>)EntityAmphithere.class, "amphithere", 34, 5862709, 43672);
        registerUnspawnable(EntityEntryBuilder.create(), event, (Class<? extends Entity>)EntityAmphithereArrow.class, "amphitherearrow", 35);
        registerSpawnable(EntityEntryBuilder.create(), event, (Class<? extends Entity>)EntitySeaSerpent.class, "seaserpent", 36, 33433, 12969703, 256, 3);
        registerUnspawnable(EntityEntryBuilder.create(), event, (Class<? extends Entity>)EntitySeaSerpentBubbles.class, "seaserpentbubble", 37);
        registerUnspawnable(EntityEntryBuilder.create(), event, (Class<? extends Entity>)EntitySeaSerpentArrow.class, "seaserpentarrow", 38);
        registerUnspawnable(EntityEntryBuilder.create(), event, (Class<? extends Entity>)EntityChainTie.class, "chaintie", 39);
        registerUnspawnable(EntityEntryBuilder.create(), event, (Class<? extends Entity>)EntityPixieCharge.class, "pixiecharge", 40);
        registerUnspawnable(EntityEntryBuilder.create(), event, (Class<? extends Entity>)EntityMyrmexSwarmer.class, "myrmex_swarmer", 41);
        registerUnspawnable(EntityEntryBuilder.create(), event, EntityTideTrident.class, "tide_trident", 42);
        registerUnspawnable(EntityEntryBuilder.create(), event, (Class<? extends Entity>)EntityMobSkull.class, "if_mob_skull", 43);
        registerSpawnable(EntityEntryBuilder.create(), event, (Class<? extends Entity>)EntityDreadThrall.class, "dread_thrall", 44, 14739174, 65535);
        registerSpawnable(EntityEntryBuilder.create(), event, (Class<? extends Entity>)EntityDreadGhoul.class, "dread_ghoul", 45, 14739174, 8094602);
        registerSpawnable(EntityEntryBuilder.create(), event, (Class<? extends Entity>)EntityDreadBeast.class, "dread_beast", 46, 14739174, 3684156);
        registerSpawnable(EntityEntryBuilder.create(), event, (Class<? extends Entity>)EntityDreadScuttler.class, "dread_scuttler", 47, 14739174, 5068391);
        registerSpawnable(EntityEntryBuilder.create(), event, (Class<? extends Entity>)EntityDreadLich.class, "dread_lich", 48, 14739174, 2574432);
        registerUnspawnable(EntityEntryBuilder.create(), event, (Class<? extends Entity>)EntityDreadLichSkull.class, "dread_lich_skull", 49);
        registerSpawnable(EntityEntryBuilder.create(), event, (Class<? extends Entity>)EntityDreadKnight.class, "dread_knight", 50, 14739174, 4877422);
        registerSpawnable(EntityEntryBuilder.create(), event, (Class<? extends Entity>)EntityDreadHorse.class, "dread_horse", 51, 14739174, 11316396);
        registerSpawnable(EntityEntryBuilder.create(), event, (Class<? extends Entity>)EntityHydra.class, "if_hydra", 52, 9145208, 3028779, 256, 3);
        registerUnspawnable(EntityEntryBuilder.create(), event, (Class<? extends Entity>)EntityHydraBreath.class, "hydra_breath", 53);
        registerUnspawnable(EntityEntryBuilder.create(), event, (Class<? extends Entity>)EntityHydraArrow.class, "hydra_arrow", 54);
    }
    public static void registerSpawnable(EntityEntryBuilder builder, RegistryEvent.Register<EntityEntry> event, Class<? extends Entity> entityClass, String name, int id, int mainColor, int subColor) {
        id += 900;
        builder.entity(entityClass);
        builder.id(new ResourceLocation(IceAndFire.MODID, name), id);
        builder.name(name);
        builder.egg(mainColor, subColor);
        builder.tracker(64, 1, true);
        event.getRegistry().register(builder.build());
    }

    public static void registerSpawnable(EntityEntryBuilder builder, RegistryEvent.Register<EntityEntry> event, Class<? extends Entity> entityClass, String name, int id, int mainColor, int subColor, int range, int frequency) {
        id += 900;
        builder.entity(entityClass);
        builder.id(new ResourceLocation(IceAndFire.MODID, name), id);
        builder.name(name);
        builder.egg(mainColor, subColor);
        builder.tracker(range, frequency, true);
        event.getRegistry().register(builder.build());
    }

    public static void registerUnspawnable(EntityEntryBuilder builder, RegistryEvent.Register<EntityEntry> event, Class<? extends Entity> entityClass, String name, int id) {
        id += 900;
        builder.entity(entityClass);
        builder.id(new ResourceLocation(IceAndFire.MODID, name), id);
        builder.name(name);
        builder.tracker(64, 1, true);
        event.getRegistry().register(builder.build());
    }

    @SubscribeEvent
    public static void registerItems(final RegistryEvent.Register<Item> event) {
        try {
            for (final Field f : IafBlockRegistry.class.getDeclaredFields()) {
                final Object obj = f.get(null);
                if (obj instanceof Block) {
                    ItemBlock itemBlock;
                    if (obj == IafBlockRegistry.jar_pixie) {
                        final BlockJar this$0 = (BlockJar)obj;
                        this$0.getClass();
                        itemBlock = this$0.new ItemBlockJar((Block)obj);
                    }
                    else if (obj instanceof BlockPixieHouse) {
                        final BlockPixieHouse this$2 = (BlockPixieHouse)obj;
                        this$2.getClass();
                        itemBlock = this$2.new ItemBlockPixieHouse((Block)obj);
                    }
                    else if (obj instanceof BlockPodium) {
                        itemBlock = new ItemBlockPodium((Block)obj);
                    }
                    else if (obj instanceof BlockMyrmexResin) {
                        itemBlock = new ItemBlockMyrmexResin((Block)obj);
                    }
                    else if (obj instanceof BlockGenericSlab) {
                        itemBlock = ((BlockGenericSlab)obj).getItemBlock();
                    }
                    else {
                        itemBlock = new ItemBlock((Block)obj);
                    }
                    itemBlock.setRegistryName(((Block) obj).getRegistryName());
                    event.getRegistry().register(itemBlock);
                } else if (obj instanceof Block[]) {
                    for (Block block : (Block[]) obj) {
                        ItemBlock itemBlock = new ItemBlock(block);
                        itemBlock.setRegistryName(block.getRegistryName());
                        event.getRegistry().register(itemBlock);
                    }
                }
            }
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
        for (EnumSeaSerpent color : EnumSeaSerpent.values()) {
            ItemBlock itemBlock = new ItemBlock(color.scaleBlock);
            itemBlock.setRegistryName(color.scaleBlock.getRegistryName());
            event.getRegistry().register(itemBlock);
        }

        // Items
        try {
            for (Field f : IafItemRegistry.class.getDeclaredFields()) {
                Object obj = f.get(null);
                if (obj instanceof Item) {
                    event.getRegistry().register((Item) obj);
                } else if (obj instanceof Item[]) {
                    for (Item item : (Item[]) obj) {
                        event.getRegistry().register(item);
                    }
                }
            }
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
        for (EnumDragonArmor armor : EnumDragonArmor.values()) {
            event.getRegistry().register(armor.helmet);
            event.getRegistry().register(armor.chestplate);
            event.getRegistry().register(armor.leggings);
            event.getRegistry().register(armor.boots);
        }
        for (EnumSeaSerpent armor : EnumSeaSerpent.values()) {
            event.getRegistry().register(armor.scale);
            event.getRegistry().register(armor.helmet);
            event.getRegistry().register(armor.chestplate);
            event.getRegistry().register(armor.leggings);
            event.getRegistry().register(armor.boots);
        }
        for (EnumTroll.Weapon weapon : EnumTroll.Weapon.values()) {
            event.getRegistry().register(weapon.item);
        }
        for (EnumTroll troll : EnumTroll.values()) {
            event.getRegistry().register(troll.leather);
            event.getRegistry().register(troll.helmet);
            event.getRegistry().register(troll.chestplate);
            event.getRegistry().register(troll.leggings);
            event.getRegistry().register(troll.boots);
        }
        for (EnumSkullType skull : EnumSkullType.values()) {
            event.getRegistry().register(skull.skull_item);
        }
        IafRecipeRegistry.preInit();
    }

    @SubscribeEvent
    public static void registerBiomes(RegistryEvent.Register<Biome> event) {
        event.getRegistry().register(IafWorldRegistry.GLACIER_BIOME);
        BiomeDictionary.addTypes(IafWorldRegistry.GLACIER_BIOME, BiomeDictionary.Type.SNOWY, BiomeDictionary.Type.COLD, BiomeDictionary.Type.SPARSE, BiomeDictionary.Type.DEAD, BiomeDictionary.Type.WASTELAND);
        //BiomeDictionary.addTypes(ModWorld.DREADLANDS_BIOME, BiomeDictionary.Type.SNOWY, BiomeDictionary.Type.COLD, BiomeDictionary.Type.SPOOKY, BiomeDictionary.Type.DEAD, BiomeDictionary.Type.WASTELAND);
        if (IceAndFire.CONFIG.spawnGlaciers) {
            BiomeManager.addSpawnBiome(IafWorldRegistry.GLACIER_BIOME);
            BiomeManager.addBiome(BiomeManager.BiomeType.COOL, new BiomeManager.BiomeEntry(IafWorldRegistry.GLACIER_BIOME, IceAndFire.CONFIG.glacierSpawnChance));

        }
    }

    public void preRender() {
    }

    public void render() {
    }

    public void postRender() {
    }

    public void spawnParticle(final String name, final double x, final double y, final double z, final double motX, final double motY, final double motZ) {
        this.spawnParticle(name, x, y, z, motX, motY, motZ, 1.0f);
    }

    public void spawnDragonParticle(final String name, final double x, final double y, final double z, final double motX, final double motY, final double motZ, final EntityDragonBase entityDragonBase) {
    }

    public void spawnParticle(final String name, final double x, final double y, final double z, final double motX, final double motY, final double motZ, final float size) {
    }

    public void openBestiaryGui(final ItemStack book) {
    }

    public void openMyrmexStaffGui(final ItemStack staff) {
    }

    public Object getArmorModel(final int armorId) {
        return null;
    }

    public Object getFontRenderer() {
        return null;
    }

    @SubscribeEvent
    public void onConfigChanged(final ConfigChangedEvent.OnConfigChangedEvent event) {
        if (event.getModID().equalsIgnoreCase("iceandfire")) {
            IceAndFire.syncConfig();
        }
    }

    public int getDragon3rdPersonView() {
        return 0;
    }

    public void setDragon3rdPersonView(final int view) {
    }

    public void openMyrmexAddRoomGui(final ItemStack staff, final BlockPos pos, final EnumFacing facing) {
    }

    public Object getDreadlandsRender(final int i) {
        return null;
    }

    public int getPreviousViewType() {
        return 0;
    }

    public void setPreviousViewType(final int view) {
    }

    public void updateDragonArmorRender(final String clear) {
    }

    public boolean shouldSeeBestiaryContents() {
        return true;
    }
}