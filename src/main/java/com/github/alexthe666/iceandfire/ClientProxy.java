package com.github.alexthe666.iceandfire;

import com.github.alexthe666.iceandfire.block.*;
import java.util.ArrayList;
import org.lwjgl.input.Keyboard;
import com.github.alexthe666.iceandfire.client.render.entity.layer.LayerDragonArmor;
import com.github.alexthe666.iceandfire.client.gui.GuiMyrmexAddRoom;
import com.github.alexthe666.iceandfire.client.gui.GuiMyrmexStaff;
import com.github.alexthe666.iceandfire.client.gui.bestiary.GuiBestiary;
import com.github.alexthe666.iceandfire.client.model.*;
import com.github.alexthe666.iceandfire.client.model.animator.FireDragonTabulaModelAnimator;
import com.github.alexthe666.iceandfire.client.model.animator.IceDragonTabulaModelAnimator;
import com.github.alexthe666.iceandfire.client.model.animator.SeaSerpentTabulaModelAnimator;
import com.github.alexthe666.iceandfire.client.model.util.EnumDragonAnimations;
import com.github.alexthe666.iceandfire.client.model.util.EnumSeaSerpentAnimations;
import com.github.alexthe666.iceandfire.client.model.util.IceAndFireTabulaModel;
import com.github.alexthe666.iceandfire.client.gui.GuiMyrmexStaff;
import net.minecraft.client.gui.GuiScreen;
import com.github.alexthe666.iceandfire.client.gui.bestiary.GuiBestiary;
import com.github.alexthe666.iceandfire.client.model.*;
import com.github.alexthe666.iceandfire.client.model.animator.FireDragonTabulaModelAnimator;
import com.github.alexthe666.iceandfire.client.particle.*;
import com.github.alexthe666.iceandfire.client.render.RenderDreadlandsAurora;
import com.github.alexthe666.iceandfire.client.render.RenderDreadlandsSky;
import com.github.alexthe666.iceandfire.client.render.RenderDreadlandsWeather;
import com.github.alexthe666.iceandfire.client.render.entity.*;
import com.github.alexthe666.iceandfire.client.render.entity.layer.LayerDragonArmor;
import com.github.alexthe666.iceandfire.client.render.tile.*;
import com.github.alexthe666.iceandfire.client.render.entity.RenderHydra;
import com.github.alexthe666.iceandfire.compat.TinkersCompatBridge;
import com.github.alexthe666.iceandfire.block.IafBlockRegistry;
import com.github.alexthe666.iceandfire.client.model.animator.IceDragonTabulaModelAnimator;
import net.minecraft.item.ItemStack;
import com.github.alexthe666.iceandfire.client.particle.ParticleHydraBreath;
import com.github.alexthe666.iceandfire.client.particle.ParticleSerpentBubble;
import com.github.alexthe666.iceandfire.client.particle.ParticleSirenMusic;
import com.github.alexthe666.iceandfire.client.particle.ParticleSirenAppearance;
import com.github.alexthe666.iceandfire.client.particle.ParticlePixieDust;
import com.github.alexthe666.iceandfire.client.particle.ParticleBlood;
import com.github.alexthe666.iceandfire.client.particle.ParticleDreadPortal;
import com.github.alexthe666.iceandfire.client.particle.ParticleDreadTorch;
import net.minecraft.client.particle.Particle;
import net.minecraft.world.World;
import com.github.alexthe666.iceandfire.client.particle.ParticleDragonFrost;
import com.github.alexthe666.iceandfire.client.particle.ParticleDragonFlame;
import com.github.alexthe666.iceandfire.entity.EntityDragonBase;
import com.github.alexthe666.iceandfire.client.render.tile.RenderDreadSpawner;
import com.github.alexthe666.iceandfire.entity.tile.TileEntityDreadSpawner;
import com.github.alexthe666.iceandfire.client.render.tile.RenderDreadPortal;
import com.github.alexthe666.iceandfire.entity.tile.TileEntityDreadPortal;
import com.github.alexthe666.iceandfire.client.render.tile.RenderJar;
import com.github.alexthe666.iceandfire.entity.tile.TileEntityJar;
import com.github.alexthe666.iceandfire.client.render.tile.RenderPixieHouse;
import com.github.alexthe666.iceandfire.entity.tile.TileEntityPixieHouse;
import com.github.alexthe666.iceandfire.client.render.tile.RenderEggInIce;
import com.github.alexthe666.iceandfire.entity.tile.TileEntityEggInIce;
import com.github.alexthe666.iceandfire.client.render.tile.RenderLectern;
import com.github.alexthe666.iceandfire.entity.tile.TileEntityLectern;
import com.github.alexthe666.iceandfire.client.render.tile.RenderPodium;
import com.github.alexthe666.iceandfire.entity.tile.TileEntityPodium;
import com.github.alexthe666.iceandfire.client.render.entity.RenderHydraArrow;
import com.github.alexthe666.iceandfire.entity.EntityHydraArrow;
import com.github.alexthe666.iceandfire.entity.EntityHydraBreath;
import com.github.alexthe666.iceandfire.client.render.entity.RenderHydra;
import com.github.alexthe666.iceandfire.entity.EntityHydra;
import com.github.alexthe666.iceandfire.client.render.entity.RenderDreadQueen;
import com.github.alexthe666.iceandfire.entity.EntityDreadQueen;
import com.github.alexthe666.iceandfire.client.render.entity.RenderBlackFrostDragon;
import com.github.alexthe666.iceandfire.entity.EntityBlackFrostDragon;
import com.github.alexthe666.iceandfire.client.render.entity.RenderDreadHorse;
import com.github.alexthe666.iceandfire.entity.EntityDreadHorse;
import com.github.alexthe666.iceandfire.client.render.entity.RenderDreadKnight;
import com.github.alexthe666.iceandfire.entity.EntityDreadKnight;
import com.github.alexthe666.iceandfire.client.model.RenderDreadLichSkull;
import com.github.alexthe666.iceandfire.entity.EntityDreadLichSkull;
import com.github.alexthe666.iceandfire.client.render.entity.RenderDreadLich;
import com.github.alexthe666.iceandfire.entity.EntityDreadLich;
import com.github.alexthe666.iceandfire.client.render.entity.RenderDreadScuttler;
import com.github.alexthe666.iceandfire.entity.EntityDreadScuttler;
import com.github.alexthe666.iceandfire.client.render.entity.RenderDreadBeast;
import com.github.alexthe666.iceandfire.entity.EntityDreadBeast;
import com.github.alexthe666.iceandfire.client.render.entity.RenderDreadGhoul;
import com.github.alexthe666.iceandfire.entity.EntityDreadGhoul;
import com.github.alexthe666.iceandfire.client.render.entity.RenderDreadThrall;
import com.github.alexthe666.iceandfire.entity.EntityDreadThrall;
import com.github.alexthe666.iceandfire.client.render.entity.RenderMobSkull;
import com.github.alexthe666.iceandfire.entity.EntityMobSkull;
import com.github.alexthe666.iceandfire.client.render.entity.RenderTideTrident;
import com.github.alexthe666.iceandfire.entity.EntityTideTrident;
import com.github.alexthe666.iceandfire.entity.EntityPixieCharge;
import com.github.alexthe666.iceandfire.client.render.entity.RenderChainTie;
import com.github.alexthe666.iceandfire.entity.EntityChainTie;
import com.github.alexthe666.iceandfire.client.render.entity.RenderSeaSerpentArrow;
import com.github.alexthe666.iceandfire.entity.EntitySeaSerpentArrow;
import com.github.alexthe666.iceandfire.client.render.entity.RenderNothing;
import com.github.alexthe666.iceandfire.entity.EntitySeaSerpentBubbles;
import com.github.alexthe666.iceandfire.client.render.entity.RenderSeaSerpent;
import com.github.alexthe666.iceandfire.entity.EntitySeaSerpent;
import com.github.alexthe666.iceandfire.client.render.entity.RenderAmphithereArrow;
import com.github.alexthe666.iceandfire.entity.EntityAmphithereArrow;
import com.github.alexthe666.iceandfire.client.render.entity.RenderAmphithere;
import com.github.alexthe666.iceandfire.entity.EntityAmphithere;
import com.github.alexthe666.iceandfire.entity.EntityMyrmexSwarmer;
import com.github.alexthe666.iceandfire.client.model.ModelMyrmexRoyal;
import com.github.alexthe666.iceandfire.entity.EntityMyrmexRoyal;
import com.github.alexthe666.iceandfire.client.model.ModelMyrmexSentinel;
import com.github.alexthe666.iceandfire.entity.EntityMyrmexSentinel;
import com.github.alexthe666.iceandfire.client.render.entity.RenderMyrmexEgg;
import com.github.alexthe666.iceandfire.entity.EntityMyrmexEgg;
import com.github.alexthe666.iceandfire.client.model.ModelMyrmexQueen;
import com.github.alexthe666.iceandfire.entity.EntityMyrmexQueen;
import com.github.alexthe666.iceandfire.client.model.ModelMyrmexSoldier;
import com.github.alexthe666.iceandfire.entity.EntityMyrmexSoldier;
import net.minecraft.client.model.ModelBase;
import com.github.alexthe666.iceandfire.client.render.entity.RenderMyrmexBase;
import com.github.alexthe666.iceandfire.client.model.ModelMyrmexWorker;
import com.github.alexthe666.iceandfire.entity.EntityMyrmexWorker;
import com.github.alexthe666.iceandfire.client.render.entity.RenderTroll;
import com.github.alexthe666.iceandfire.entity.EntityTroll;
import com.github.alexthe666.iceandfire.client.render.entity.RenderStymphalianArrow;
import com.github.alexthe666.iceandfire.entity.EntityStymphalianArrow;
import com.github.alexthe666.iceandfire.client.render.entity.RenderStymphalianFeather;
import com.github.alexthe666.iceandfire.entity.EntityStymphalianFeather;
import com.github.alexthe666.iceandfire.client.render.entity.RenderStymphalianBird;
import com.github.alexthe666.iceandfire.entity.EntityStymphalianBird;
import com.github.alexthe666.iceandfire.entity.EntityCockatriceEgg;
import com.github.alexthe666.iceandfire.client.render.entity.RenderCockatrice;
import com.github.alexthe666.iceandfire.entity.EntityCockatrice;
import com.github.alexthe666.iceandfire.entity.EntityDeathWormEgg;
import com.github.alexthe666.iceandfire.client.render.entity.RenderDeathWorm;
import com.github.alexthe666.iceandfire.entity.EntityDeathWorm;
import com.github.alexthe666.iceandfire.client.render.entity.RenderHippocampus;
import com.github.alexthe666.iceandfire.entity.EntityHippocampus;
import com.github.alexthe666.iceandfire.client.render.entity.RenderSiren;
import com.github.alexthe666.iceandfire.entity.EntitySiren;
import com.github.alexthe666.iceandfire.client.render.entity.RenderCyclops;
import com.github.alexthe666.iceandfire.entity.EntityCyclops;
import com.github.alexthe666.iceandfire.client.render.entity.RenderPixie;
import com.github.alexthe666.iceandfire.entity.EntityPixie;
import com.github.alexthe666.iceandfire.client.render.entity.RenderGorgon;
import com.github.alexthe666.iceandfire.entity.EntityGorgon;
import com.github.alexthe666.iceandfire.client.render.entity.RenderStoneStatue;
import com.github.alexthe666.iceandfire.entity.EntityStoneStatue;
import com.github.alexthe666.iceandfire.client.render.entity.RenderHippogryph;
import com.github.alexthe666.iceandfire.entity.EntityHippogryph;
import net.minecraft.client.renderer.entity.RenderSnowball;
import com.github.alexthe666.iceandfire.entity.EntityHippogryphEgg;
import com.github.alexthe666.iceandfire.client.render.entity.RenderSnowVillager;
import com.github.alexthe666.iceandfire.entity.EntitySnowVillager;
import com.github.alexthe666.iceandfire.entity.EntityDragonIceCharge;
import com.github.alexthe666.iceandfire.client.render.entity.RenderDragonFireCharge;
import com.github.alexthe666.iceandfire.entity.EntityDragonFireCharge;
import com.github.alexthe666.iceandfire.client.render.entity.RenderDragonSkull;
import com.github.alexthe666.iceandfire.entity.EntityDragonSkull;
import net.minecraftforge.client.ForgeHooksClient;
import com.github.alexthe666.iceandfire.entity.tile.TileEntityDummyGorgonHeadActive;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import com.github.alexthe666.iceandfire.client.render.tile.RenderGorgonHead;
import com.github.alexthe666.iceandfire.entity.tile.TileEntityDummyGorgonHead;
import com.github.alexthe666.iceandfire.event.ClientEvents;
import com.github.alexthe666.iceandfire.item.IafItemRegistry;
import com.github.alexthe666.iceandfire.client.render.entity.RenderModCapes;
import net.minecraftforge.common.MinecraftForge;
import com.github.alexthe666.iceandfire.client.IafKeybindRegistry;
import com.github.alexthe666.iceandfire.entity.*;
import com.github.alexthe666.iceandfire.entity.tile.*;
import com.github.alexthe666.iceandfire.enums.*;
import com.github.alexthe666.iceandfire.item.ICustomRendered;
import net.minecraft.block.Block;
import net.minecraft.client.resources.IResourceManagerReloadListener;
import net.minecraft.client.resources.IReloadableResourceManager;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.block.model.ModelBakery;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import java.lang.reflect.Field;
import com.github.alexthe666.iceandfire.compat.TinkersCompatBridge;
import com.github.alexthe666.iceandfire.block.BlockDreadWoodLock;
import com.github.alexthe666.iceandfire.block.BlockDreadStoneFace;
import net.minecraft.block.Block;
import com.github.alexthe666.iceandfire.block.BlockDreadBase;
import com.github.alexthe666.iceandfire.block.BlockCharedPath;
import com.github.alexthe666.iceandfire.block.BlockFallingReturningState;
import net.minecraft.client.renderer.block.statemap.IStateMapper;
import com.github.alexthe666.iceandfire.block.BlockReturningState;
import net.minecraft.block.properties.IProperty;
import net.minecraft.client.renderer.block.statemap.StateMap;
import net.minecraft.client.renderer.entity.RenderSnowball;
import net.minecraft.client.resources.IReloadableResourceManager;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import com.github.alexthe666.iceandfire.item.ICustomRendered;
import com.github.alexthe666.iceandfire.enums.EnumSkullType;
import com.github.alexthe666.iceandfire.enums.EnumTroll;
import com.github.alexthe666.iceandfire.enums.EnumSeaSerpent;
import com.github.alexthe666.iceandfire.enums.EnumDragonArmor;
import com.github.alexthe666.iceandfire.enums.EnumHippogryphTypes;
import com.github.alexthe666.iceandfire.item.IafItemRegistry;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.renderer.block.model.ModelBakery;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.client.ForgeHooksClient;
import net.minecraftforge.client.IRenderHandler;
import net.minecraft.item.Item;
import com.github.alexthe666.iceandfire.block.IafBlockRegistry;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import com.github.alexthe666.iceandfire.client.render.RenderDreadlandsAurora;
import com.github.alexthe666.iceandfire.client.render.RenderDreadlandsSky;
import com.github.alexthe666.iceandfire.client.render.RenderDreadlandsWeather;
import net.minecraftforge.client.IRenderHandler;
import net.minecraft.client.gui.FontRenderer;
import com.github.alexthe666.iceandfire.client.particle.IceAndFireParticleSpawner;
import com.github.alexthe666.iceandfire.entity.MyrmexHive;
import java.util.UUID;
import java.util.List;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.lwjgl.input.Keyboard;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import com.github.alexthe666.iceandfire.client.render.tile.IceAndFireTEISR;
import com.github.alexthe666.iceandfire.client.model.ModelSilverArmor;
import com.github.alexthe666.iceandfire.client.model.ModelDragonsteelIceArmor;
import com.github.alexthe666.iceandfire.client.model.ModelDragonsteelFireArmor;
import com.github.alexthe666.iceandfire.client.model.ModelSeaSerpentArmor;
import com.github.alexthe666.iceandfire.client.model.ModelTrollArmor;
import com.github.alexthe666.iceandfire.client.model.ModelDeathWormArmor;
import com.github.alexthe666.iceandfire.client.model.ModelIceDragonArmor;
import com.github.alexthe666.iceandfire.client.model.ModelFireDragonArmor;
import net.minecraftforge.fml.common.Mod;

import static net.ilexiconn.llibrary.client.model.tabula.TabulaModelHandler.*;

@Mod.EventBusSubscriber
public class ClientProxy extends CommonProxy
{
    private static final ModelFireDragonArmor FIRE_DRAGON_SCALE_ARMOR_MODEL;
    private static final ModelFireDragonArmor FIRE_DRAGON_SCALE_ARMOR_MODEL_LEGS;
    private static final ModelIceDragonArmor ICE_DRAGON_SCALE_ARMOR_MODEL;
    private static final ModelIceDragonArmor ICE_DRAGON_SCALE_ARMOR_MODEL_LEGS;
    private static final ModelDeathWormArmor DEATHWORM_ARMOR_MODEL;
    private static final ModelDeathWormArmor DEATHWORM_ARMOR_MODEL_LEGS;
    private static final ModelTrollArmor TROLL_ARMOR_MODEL;
    private static final ModelTrollArmor TROLL_ARMOR_MODEL_LEGS;
    private static final ModelSeaSerpentArmor TIDE_ARMOR_MODEL;
    private static final ModelSeaSerpentArmor TIDE_ARMOR_MODEL_LEGS;
    private static final ModelDragonsteelFireArmor DRAGONSTEEL_FIRE_ARMOR_MODEL;
    private static final ModelDragonsteelFireArmor DRAGONSTEEL_FIRE_ARMOR_MODEL_LEGS;
    private static final ModelDragonsteelIceArmor DRAGONSTEEL_ICE_ARMOR_MODEL;
    private static final ModelDragonsteelIceArmor DRAGONSTEEL_ICE_ARMOR_MODEL_LEGS;
    private static final ModelSilverArmor SILVER_ARMOR_MODEL;
    private static final ModelSilverArmor SILVER_ARMOR_MODEL_LEGS;
    @SideOnly(Side.CLIENT)
    private static final IceAndFireTEISR TEISR;
    public static List<UUID> currentDragonRiders;
    private static MyrmexHive referedClientHive;
    private IceAndFireParticleSpawner particleSpawner;
    private FontRenderer bestiaryFontRenderer;
    private int previousViewType;
    private int thirdPersonViewDragon;
    private IRenderHandler dreadlandsWeatherRenderer;
    private IRenderHandler dreadlandsSkyRenderer;
    private IRenderHandler dreadlandsAuroraRender;

    public ClientProxy() {
        this.previousViewType = 0;
        this.thirdPersonViewDragon = 0;
        this.dreadlandsWeatherRenderer = new RenderDreadlandsWeather();
        this.dreadlandsSkyRenderer = new RenderDreadlandsSky();
        this.dreadlandsAuroraRender = new RenderDreadlandsAurora();
    }

    @SubscribeEvent
    @SideOnly(Side.CLIENT)
    public static void registerModels(final ModelRegistryEvent event) {
        ModelBakery.registerItemVariants(Item.getItemFromBlock(IafBlockRegistry.podium), new ResourceLocation[] { new ResourceLocation("iceandfire:podium_oak"), new ResourceLocation("iceandfire:podium_spruce"), new ResourceLocation("iceandfire:podium_birch"), new ResourceLocation("iceandfire:podium_jungle"), new ResourceLocation("iceandfire:podium_acacia"), new ResourceLocation("iceandfire:podium_dark_oak") });
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(IafBlockRegistry.podium), 0, new ModelResourceLocation("iceandfire:podium_oak", "inventory"));
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(IafBlockRegistry.podium), 1, new ModelResourceLocation("iceandfire:podium_spruce", "inventory"));
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(IafBlockRegistry.podium), 2, new ModelResourceLocation("iceandfire:podium_birch", "inventory"));
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(IafBlockRegistry.podium), 3, new ModelResourceLocation("iceandfire:podium_jungle", "inventory"));
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(IafBlockRegistry.podium), 4, new ModelResourceLocation("iceandfire:podium_acacia", "inventory"));
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(IafBlockRegistry.podium), 5, new ModelResourceLocation("iceandfire:podium_dark_oak", "inventory"));
        ModelBakery.registerItemVariants(IafItemRegistry.dragonbone_bow, new ResourceLocation[] { new ResourceLocation("iceandfire:dragonbone_bow"), new ResourceLocation("iceandfire:dragonbone_bow_pulling_0"), new ResourceLocation("iceandfire:dragonbone_bow_pulling_1") });
        ModelLoader.setCustomModelResourceLocation(IafItemRegistry.dragonbone_bow, 0, new ModelResourceLocation("iceandfire:dragonbone_bow", "inventory"));
        ModelBakery.registerItemVariants(IafItemRegistry.dragon_skull, new ResourceLocation[] { new ResourceLocation("iceandfire:dragon_skull_fire"), new ResourceLocation("iceandfire:dragon_skull_ice") });
        ModelLoader.setCustomModelResourceLocation(IafItemRegistry.dragon_skull, 0, new ModelResourceLocation("iceandfire:dragon_skull_fire", "inventory"));
        ModelLoader.setCustomModelResourceLocation(IafItemRegistry.dragon_skull, 1, new ModelResourceLocation("iceandfire:dragon_skull_ice", "inventory"));
        ModelBakery.registerItemVariants(IafItemRegistry.dragon_armor_iron, new ResourceLocation[] { new ResourceLocation("iceandfire:dragonarmor_iron_head"), new ResourceLocation("iceandfire:dragonarmor_iron_neck"), new ResourceLocation("iceandfire:dragonarmor_iron_body"), new ResourceLocation("iceandfire:dragonarmor_iron_tail") });
        ModelLoader.setCustomModelResourceLocation(IafItemRegistry.dragon_armor_iron, 0, new ModelResourceLocation("iceandfire:dragonarmor_iron_head", "inventory"));
        ModelLoader.setCustomModelResourceLocation(IafItemRegistry.dragon_armor_iron, 1, new ModelResourceLocation("iceandfire:dragonarmor_iron_neck", "inventory"));
        ModelLoader.setCustomModelResourceLocation(IafItemRegistry.dragon_armor_iron, 2, new ModelResourceLocation("iceandfire:dragonarmor_iron_body", "inventory"));
        ModelLoader.setCustomModelResourceLocation(IafItemRegistry.dragon_armor_iron, 3, new ModelResourceLocation("iceandfire:dragonarmor_iron_tail", "inventory"));
        ModelBakery.registerItemVariants(IafItemRegistry.dragon_armor_gold, new ResourceLocation[] { new ResourceLocation("iceandfire:dragonarmor_gold_head"), new ResourceLocation("iceandfire:dragonarmor_gold_neck"), new ResourceLocation("iceandfire:dragonarmor_gold_body"), new ResourceLocation("iceandfire:dragonarmor_gold_tail") });
        ModelLoader.setCustomModelResourceLocation(IafItemRegistry.dragon_armor_gold, 0, new ModelResourceLocation("iceandfire:dragonarmor_gold_head", "inventory"));
        ModelLoader.setCustomModelResourceLocation(IafItemRegistry.dragon_armor_gold, 1, new ModelResourceLocation("iceandfire:dragonarmor_gold_neck", "inventory"));
        ModelLoader.setCustomModelResourceLocation(IafItemRegistry.dragon_armor_gold, 2, new ModelResourceLocation("iceandfire:dragonarmor_gold_body", "inventory"));
        ModelLoader.setCustomModelResourceLocation(IafItemRegistry.dragon_armor_gold, 3, new ModelResourceLocation("iceandfire:dragonarmor_gold_tail", "inventory"));
        ModelBakery.registerItemVariants(IafItemRegistry.dragon_armor_diamond, new ResourceLocation[] { new ResourceLocation("iceandfire:dragonarmor_diamond_head"), new ResourceLocation("iceandfire:dragonarmor_diamond_neck"), new ResourceLocation("iceandfire:dragonarmor_diamond_body"), new ResourceLocation("iceandfire:dragonarmor_diamond_tail") });
        ModelLoader.setCustomModelResourceLocation(IafItemRegistry.dragon_armor_diamond, 0, new ModelResourceLocation("iceandfire:dragonarmor_diamond_head", "inventory"));
        ModelLoader.setCustomModelResourceLocation(IafItemRegistry.dragon_armor_diamond, 1, new ModelResourceLocation("iceandfire:dragonarmor_diamond_neck", "inventory"));
        ModelLoader.setCustomModelResourceLocation(IafItemRegistry.dragon_armor_diamond, 2, new ModelResourceLocation("iceandfire:dragonarmor_diamond_body", "inventory"));
        ModelLoader.setCustomModelResourceLocation(IafItemRegistry.dragon_armor_diamond, 3, new ModelResourceLocation("iceandfire:dragonarmor_diamond_tail", "inventory"));
        ModelBakery.registerItemVariants(IafItemRegistry.dragon_armor_silver, new ResourceLocation[] { new ResourceLocation("iceandfire:dragonarmor_diamond_head"), new ResourceLocation("iceandfire:dragonarmor_diamond_neck"), new ResourceLocation("iceandfire:dragonarmor_diamond_body"), new ResourceLocation("iceandfire:dragonarmor_diamond_tail") });
        ModelLoader.setCustomModelResourceLocation(IafItemRegistry.dragon_armor_silver, 0, new ModelResourceLocation("iceandfire:dragonarmor_silver_head", "inventory"));
        ModelLoader.setCustomModelResourceLocation(IafItemRegistry.dragon_armor_silver, 1, new ModelResourceLocation("iceandfire:dragonarmor_silver_neck", "inventory"));
        ModelLoader.setCustomModelResourceLocation(IafItemRegistry.dragon_armor_silver, 2, new ModelResourceLocation("iceandfire:dragonarmor_silver_body", "inventory"));
        ModelLoader.setCustomModelResourceLocation(IafItemRegistry.dragon_armor_silver, 3, new ModelResourceLocation("iceandfire:dragonarmor_silver_tail", "inventory"));
        ModelBakery.registerItemVariants(IafItemRegistry.dragon_armor_dragonsteel_fire, new ResourceLocation[] { new ResourceLocation("iceandfire:dragonarmor_dragonsteel_fire_head"), new ResourceLocation("iceandfire:dragonarmor_dragonsteel_fire_neck"), new ResourceLocation("iceandfire:dragonarmor_dragonsteel_fire_body"), new ResourceLocation("iceandfire:dragonarmor_dragonsteel_fire_tail") });
        ModelLoader.setCustomModelResourceLocation(IafItemRegistry.dragon_armor_dragonsteel_fire, 0, new ModelResourceLocation("iceandfire:dragonarmor_dragonsteel_fire_head", "inventory"));
        ModelLoader.setCustomModelResourceLocation(IafItemRegistry.dragon_armor_dragonsteel_fire, 1, new ModelResourceLocation("iceandfire:dragonarmor_dragonsteel_fire_neck", "inventory"));
        ModelLoader.setCustomModelResourceLocation(IafItemRegistry.dragon_armor_dragonsteel_fire, 2, new ModelResourceLocation("iceandfire:dragonarmor_dragonsteel_fire_body", "inventory"));
        ModelLoader.setCustomModelResourceLocation(IafItemRegistry.dragon_armor_dragonsteel_fire, 3, new ModelResourceLocation("iceandfire:dragonarmor_dragonsteel_fire_tail", "inventory"));
        ModelBakery.registerItemVariants(IafItemRegistry.dragon_armor_dragonsteel_ice, new ResourceLocation[] { new ResourceLocation("iceandfire:dragonarmor_dragonsteel_ice_head"), new ResourceLocation("iceandfire:dragonarmor_dragonsteel_ice_neck"), new ResourceLocation("iceandfire:dragonarmor_dragonsteel_ice_body"), new ResourceLocation("iceandfire:dragonarmor_dragonsteel_ice_tail") });
        ModelLoader.setCustomModelResourceLocation(IafItemRegistry.dragon_armor_dragonsteel_ice, 0, new ModelResourceLocation("iceandfire:dragonarmor_dragonsteel_ice_head", "inventory"));
        ModelLoader.setCustomModelResourceLocation(IafItemRegistry.dragon_armor_dragonsteel_ice, 1, new ModelResourceLocation("iceandfire:dragonarmor_dragonsteel_ice_neck", "inventory"));
        ModelLoader.setCustomModelResourceLocation(IafItemRegistry.dragon_armor_dragonsteel_ice, 2, new ModelResourceLocation("iceandfire:dragonarmor_dragonsteel_ice_body", "inventory"));
        ModelLoader.setCustomModelResourceLocation(IafItemRegistry.dragon_armor_dragonsteel_ice, 3, new ModelResourceLocation("iceandfire:dragonarmor_dragonsteel_ice_tail", "inventory"));
        for (int i = 0; i < EnumHippogryphTypes.values().length; ++i) {
            ModelLoader.setCustomModelResourceLocation(IafItemRegistry.hippogryph_egg, i, new ModelResourceLocation("iceandfire:hippogryph_egg", "inventory"));
        }
        ModelLoader.setCustomModelResourceLocation(IafItemRegistry.gorgon_head, 0, new ModelResourceLocation("iceandfire:gorgon_head", "inventory"));
        ModelLoader.setCustomModelResourceLocation(IafItemRegistry.gorgon_head, 1, new ModelResourceLocation("iceandfire:gorgon_head", "inventory"));
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(IafBlockRegistry.pixieHouse), 0, new ModelResourceLocation("iceandfire:pixie_house", "inventory"));
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(IafBlockRegistry.pixieHouse), 1, new ModelResourceLocation("iceandfire:pixie_house", "inventory"));
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(IafBlockRegistry.pixieHouse), 2, new ModelResourceLocation("iceandfire:pixie_house", "inventory"));
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(IafBlockRegistry.pixieHouse), 3, new ModelResourceLocation("iceandfire:pixie_house", "inventory"));
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(IafBlockRegistry.pixieHouse), 4, new ModelResourceLocation("iceandfire:pixie_house", "inventory"));
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(IafBlockRegistry.pixieHouse), 5, new ModelResourceLocation("iceandfire:pixie_house", "inventory"));
        ModelBakery.registerItemVariants(Item.getItemFromBlock(IafBlockRegistry.jar_pixie), new ResourceLocation[] { new ResourceLocation("iceandfire:jar_0"), new ResourceLocation("iceandfire:jar_1"), new ResourceLocation("iceandfire:jar_2"), new ResourceLocation("iceandfire:jar_3"), new ResourceLocation("iceandfire:jar_4") });
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(IafBlockRegistry.jar_empty), 0, new ModelResourceLocation("iceandfire:jar", "inventory"));
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(IafBlockRegistry.jar_pixie), 0, new ModelResourceLocation("iceandfire:jar_0", "inventory"));
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(IafBlockRegistry.jar_pixie), 1, new ModelResourceLocation("iceandfire:jar_1", "inventory"));
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(IafBlockRegistry.jar_pixie), 2, new ModelResourceLocation("iceandfire:jar_2", "inventory"));
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(IafBlockRegistry.jar_pixie), 3, new ModelResourceLocation("iceandfire:jar_3", "inventory"));
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(IafBlockRegistry.jar_pixie), 4, new ModelResourceLocation("iceandfire:jar_4", "inventory"));
        ModelBakery.registerItemVariants(IafItemRegistry.deathworm_chitin, new ResourceLocation[] { new ResourceLocation("iceandfire:deathworm_chitin_yellow"), new ResourceLocation("iceandfire:deathworm_chitin_white"), new ResourceLocation("iceandfire:deathworm_chitin_red") });
        ModelLoader.setCustomModelResourceLocation(IafItemRegistry.deathworm_chitin, 0, new ModelResourceLocation("iceandfire:deathworm_chitin_yellow", "inventory"));
        ModelLoader.setCustomModelResourceLocation(IafItemRegistry.deathworm_chitin, 1, new ModelResourceLocation("iceandfire:deathworm_chitin_white", "inventory"));
        ModelLoader.setCustomModelResourceLocation(IafItemRegistry.deathworm_chitin, 2, new ModelResourceLocation("iceandfire:deathworm_chitin_red", "inventory"));
        ModelBakery.registerItemVariants(IafItemRegistry.deathworm_egg, new ResourceLocation[] { new ResourceLocation("iceandfire:deathworm_egg"), new ResourceLocation("iceandfire:deathworm_egg_giant") });
        ModelLoader.setCustomModelResourceLocation(IafItemRegistry.deathworm_egg, 0, new ModelResourceLocation("iceandfire:deathworm_egg", "inventory"));
        ModelLoader.setCustomModelResourceLocation(IafItemRegistry.deathworm_egg, 1, new ModelResourceLocation("iceandfire:deathworm_egg_giant", "inventory"));
        for (final EnumDragonArmor armor : EnumDragonArmor.values()) {
            renderDragonArmors(armor);
        }
        for (final EnumSeaSerpent armor2 : EnumSeaSerpent.values()) {
            renderSeaSerpentArmors(armor2);
        }
        for (final EnumTroll.Weapon weapon : EnumTroll.Weapon.values()) {
            ModelLoader.setCustomModelResourceLocation(weapon.item, 0, new ModelResourceLocation("iceandfire:troll_weapon", "inventory"));
        }
        for (final EnumTroll troll : EnumTroll.values()) {
            ModelLoader.setCustomModelResourceLocation(troll.leather, 0, new ModelResourceLocation("iceandfire:troll_leather_" + troll.name().toLowerCase(), "inventory"));
            ModelLoader.setCustomModelResourceLocation(troll.helmet, 0, new ModelResourceLocation("iceandfire:" + troll.name().toLowerCase() + "_troll_leather_helmet", "inventory"));
            ModelLoader.setCustomModelResourceLocation(troll.chestplate, 0, new ModelResourceLocation("iceandfire:" + troll.name().toLowerCase() + "_troll_leather_chestplate", "inventory"));
            ModelLoader.setCustomModelResourceLocation(troll.leggings, 0, new ModelResourceLocation("iceandfire:" + troll.name().toLowerCase() + "_troll_leather_leggings", "inventory"));
            ModelLoader.setCustomModelResourceLocation(troll.boots, 0, new ModelResourceLocation("iceandfire:" + troll.name().toLowerCase() + "_troll_leather_boots", "inventory"));
        }
        for (final EnumSkullType skull : EnumSkullType.values()) {
            ModelLoader.setCustomModelResourceLocation(skull.skull_item, 0, new ModelResourceLocation("iceandfire:" + skull.itemResourceName, "inventory"));
        }
        ModelBakery.registerItemVariants(Item.getItemFromBlock(IafBlockRegistry.myrmex_resin), new ResourceLocation[] { new ResourceLocation("iceandfire:desert_myrmex_resin"), new ResourceLocation("iceandfire:jungle_myrmex_resin") });
        ModelBakery.registerItemVariants(Item.getItemFromBlock(IafBlockRegistry.myrmex_resin_sticky), new ResourceLocation[] { new ResourceLocation("iceandfire:desert_myrmex_resin_sticky"), new ResourceLocation("iceandfire:jungle_myrmex_resin_sticky") });
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(IafBlockRegistry.myrmex_resin), 0, new ModelResourceLocation("iceandfire:desert_myrmex_resin", "inventory"));
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(IafBlockRegistry.myrmex_resin), 1, new ModelResourceLocation("iceandfire:jungle_myrmex_resin", "inventory"));
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(IafBlockRegistry.myrmex_resin_sticky), 0, new ModelResourceLocation("iceandfire:desert_myrmex_resin_sticky", "inventory"));
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(IafBlockRegistry.myrmex_resin_sticky), 1, new ModelResourceLocation("iceandfire:jungle_myrmex_resin_sticky", "inventory"));
        for (int i = 0; i < 5; ++i) {
            ModelLoader.setCustomModelResourceLocation(IafItemRegistry.myrmex_desert_egg, i, new ModelResourceLocation("iceandfire:myrmex_desert_egg", "inventory"));
            ModelLoader.setCustomModelResourceLocation(IafItemRegistry.myrmex_jungle_egg, i, new ModelResourceLocation("iceandfire:myrmex_jungle_egg", "inventory"));
        }
        for (final EnumSeaSerpent color : EnumSeaSerpent.values()) {
            ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(color.scaleBlock), 0, new ModelResourceLocation("iceandfire:" + color.scaleBlock.getRegistryName().getPath(), "inventory"));
        }
        try {
            for (final Field f : IafItemRegistry.class.getDeclaredFields()) {
                final Object obj = f.get(null);
                if (obj instanceof Item && !(obj instanceof ICustomRendered)) {
                    ModelLoader.setCustomModelResourceLocation((Item)obj, 0, new ModelResourceLocation("iceandfire:" + ((Item)obj).getRegistryName().getPath(), "inventory"));
                }
                else if (obj instanceof Item[]) {
                    for (final Item item : (Item[])obj) {
                        if (!(item instanceof ICustomRendered)) {
                            ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation("iceandfire:" + item.getRegistryName().getPath(), "inventory"));
                        }
                    }
                }
            }
        }
        catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
        ModelLoader.setCustomStateMapper(IafBlockRegistry.charedDirt, (IStateMapper)new StateMap.Builder().ignore(new IProperty[] { (IProperty)BlockReturningState.REVERTS }).build());
        ModelLoader.setCustomStateMapper(IafBlockRegistry.charedGrass, (IStateMapper)new StateMap.Builder().ignore(new IProperty[] { (IProperty)BlockReturningState.REVERTS }).build());
        ModelLoader.setCustomStateMapper(IafBlockRegistry.charedStone, (IStateMapper)new StateMap.Builder().ignore(new IProperty[] { (IProperty)BlockReturningState.REVERTS }).build());
        ModelLoader.setCustomStateMapper(IafBlockRegistry.charedCobblestone, (IStateMapper)new StateMap.Builder().ignore(new IProperty[] { (IProperty)BlockReturningState.REVERTS }).build());
        ModelLoader.setCustomStateMapper(IafBlockRegistry.charedGravel, (IStateMapper)new StateMap.Builder().ignore(new IProperty[] { (IProperty)BlockFallingReturningState.REVERTS }).build());
        ModelLoader.setCustomStateMapper(IafBlockRegistry.charedGrassPath, (IStateMapper)new StateMap.Builder().ignore(new IProperty[] { (IProperty)BlockCharedPath.REVERTS }).build());
        ModelLoader.setCustomStateMapper(IafBlockRegistry.frozenDirt, (IStateMapper)new StateMap.Builder().ignore(new IProperty[] { (IProperty)BlockReturningState.REVERTS }).build());
        ModelLoader.setCustomStateMapper(IafBlockRegistry.frozenGrass, (IStateMapper)new StateMap.Builder().ignore(new IProperty[] { (IProperty)BlockReturningState.REVERTS }).build());
        ModelLoader.setCustomStateMapper(IafBlockRegistry.frozenStone, (IStateMapper)new StateMap.Builder().ignore(new IProperty[] { (IProperty)BlockReturningState.REVERTS }).build());
        ModelLoader.setCustomStateMapper(IafBlockRegistry.frozenCobblestone, (IStateMapper)new StateMap.Builder().ignore(new IProperty[] { (IProperty)BlockReturningState.REVERTS }).build());
        ModelLoader.setCustomStateMapper(IafBlockRegistry.frozenGravel, (IStateMapper)new StateMap.Builder().ignore(new IProperty[] { (IProperty)BlockFallingReturningState.REVERTS }).build());
        ModelLoader.setCustomStateMapper(IafBlockRegistry.frozenGrassPath, (IStateMapper)new StateMap.Builder().ignore(new IProperty[] { (IProperty)BlockCharedPath.REVERTS }).build());
        ModelLoader.setCustomStateMapper((Block)IafBlockRegistry.dread_stone, (IStateMapper)new StateMap.Builder().ignore(new IProperty[] { (IProperty)BlockDreadBase.PLAYER_PLACED }).build());
        ModelLoader.setCustomStateMapper((Block)IafBlockRegistry.dread_stone_bricks, (IStateMapper)new StateMap.Builder().ignore(new IProperty[] { (IProperty)BlockDreadBase.PLAYER_PLACED }).build());
        ModelLoader.setCustomStateMapper((Block)IafBlockRegistry.dread_stone_bricks_chiseled, (IStateMapper)new StateMap.Builder().ignore(new IProperty[] { (IProperty)BlockDreadBase.PLAYER_PLACED }).build());
        ModelLoader.setCustomStateMapper((Block)IafBlockRegistry.dread_stone_bricks_cracked, (IStateMapper)new StateMap.Builder().ignore(new IProperty[] { (IProperty)BlockDreadBase.PLAYER_PLACED }).build());
        ModelLoader.setCustomStateMapper((Block)IafBlockRegistry.dread_stone_bricks_mossy, (IStateMapper)new StateMap.Builder().ignore(new IProperty[] { (IProperty)BlockDreadBase.PLAYER_PLACED }).build());
        ModelLoader.setCustomStateMapper((Block)IafBlockRegistry.dread_stone_tile, (IStateMapper)new StateMap.Builder().ignore(new IProperty[] { (IProperty)BlockDreadBase.PLAYER_PLACED }).build());
        ModelLoader.setCustomStateMapper(IafBlockRegistry.dread_stone_face, (IStateMapper)new StateMap.Builder().ignore(new IProperty[] { (IProperty)BlockDreadStoneFace.PLAYER_PLACED }).build());
        ModelLoader.setCustomStateMapper((Block)IafBlockRegistry.dreadwood_planks, (IStateMapper)new StateMap.Builder().ignore(new IProperty[] { (IProperty)BlockDreadBase.PLAYER_PLACED }).build());
        ModelLoader.setCustomStateMapper(IafBlockRegistry.dreadwood_planks_lock, (IStateMapper)new StateMap.Builder().ignore(new IProperty[] { (IProperty)BlockDreadWoodLock.PLAYER_PLACED }).build());
        try {
            for (final Field f : IafBlockRegistry.class.getDeclaredFields()) {
                final Object obj = f.get(null);
                if (obj instanceof Block && !(obj instanceof ICustomRendered)) {
                    ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock((Block)obj), 0, new ModelResourceLocation("iceandfire:" + ((Block)obj).getRegistryName().getPath(), "inventory"));
                }
                else if (obj instanceof Block[]) {
                    for (final Block block : (Block[])obj) {
                        if (!(block instanceof ICustomRendered)) {
                            ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation("iceandfire:" + block.getRegistryName().getPath(), "inventory"));
                        }
                    }
                }
            }
        }
        catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
        TinkersCompatBridge.loadTinkersClientModels(event);
    }

    @SideOnly(Side.CLIENT)
    public static void renderDragonArmors(final EnumDragonArmor armor) {
        ModelLoader.setCustomModelResourceLocation(armor.helmet, 0, new ModelResourceLocation("iceandfire:" + armor.name() + "_helmet", "inventory"));
        ModelLoader.setCustomModelResourceLocation(armor.chestplate, 0, new ModelResourceLocation("iceandfire:" + armor.name() + "_chestplate", "inventory"));
        ModelLoader.setCustomModelResourceLocation(armor.leggings, 0, new ModelResourceLocation("iceandfire:" + armor.name() + "_leggings", "inventory"));
        ModelLoader.setCustomModelResourceLocation(armor.boots, 0, new ModelResourceLocation("iceandfire:" + armor.name() + "_boots", "inventory"));
    }

    @SideOnly(Side.CLIENT)
    public static void renderSeaSerpentArmors(final EnumSeaSerpent armor) {
        ModelLoader.setCustomModelResourceLocation(armor.scale, 0, new ModelResourceLocation("iceandfire:sea_serpent_scales_" + armor.resourceName, "inventory"));
        ModelLoader.setCustomModelResourceLocation(armor.helmet, 0, new ModelResourceLocation("iceandfire:tide_" + armor.resourceName + "_helmet", "inventory"));
        ModelLoader.setCustomModelResourceLocation(armor.chestplate, 0, new ModelResourceLocation("iceandfire:tide_" + armor.resourceName + "_chestplate", "inventory"));
        ModelLoader.setCustomModelResourceLocation(armor.leggings, 0, new ModelResourceLocation("iceandfire:tide_" + armor.resourceName + "_leggings", "inventory"));
        ModelLoader.setCustomModelResourceLocation(armor.boots, 0, new ModelResourceLocation("iceandfire:tide_" + armor.resourceName + "_boots", "inventory"));
    }

    public static MyrmexHive getReferedClientHive() {
        return ClientProxy.referedClientHive;
    }

    public static void setReferedClientHive(final MyrmexHive hive) {
        ClientProxy.referedClientHive = hive;
    }

    @SideOnly(Side.CLIENT)
    @Override
    public void preRender() {
        TinkersCompatBridge.loadTinkersClientCompat();
    }

    @SideOnly(Side.CLIENT)
    @Override
    public void render() {
        try {
            this.bestiaryFontRenderer = new FontRenderer(Minecraft.getMinecraft().gameSettings, new ResourceLocation("iceandfire:textures/font/bestiary.png"), Minecraft.getMinecraft().renderEngine, false);
            ((IReloadableResourceManager)Minecraft.getMinecraft().getResourceManager()).registerReloadListener((IResourceManagerReloadListener)this.bestiaryFontRenderer);
        }
        catch (Exception e) {
            this.bestiaryFontRenderer = Minecraft.getMinecraft().fontRenderer;
        }
        this.particleSpawner = new IceAndFireParticleSpawner();
        ((IReloadableResourceManager)Minecraft.getMinecraft().getResourceManager()).registerReloadListener((IResourceManagerReloadListener)this.bestiaryFontRenderer);
        IafKeybindRegistry.init();
        MinecraftForge.EVENT_BUS.register((Object)new RenderModCapes());
        MinecraftForge.EVENT_BUS.register((Object)new ClientEvents());
        ClientRegistry.bindTileEntitySpecialRenderer((Class)TileEntityDummyGorgonHead.class, (TileEntitySpecialRenderer)new RenderGorgonHead(false));
        ClientRegistry.bindTileEntitySpecialRenderer((Class)TileEntityDummyGorgonHeadActive.class, (TileEntitySpecialRenderer)new RenderGorgonHead(true));
        ForgeHooksClient.registerTESRItemStack(IafItemRegistry.gorgon_head, 0, (Class)TileEntityDummyGorgonHead.class);
        ForgeHooksClient.registerTESRItemStack(IafItemRegistry.gorgon_head, 1, (Class)TileEntityDummyGorgonHeadActive.class);
        this.renderEntities();
    }

    @SideOnly(Side.CLIENT)
    @Override
    public void postRender() {
        ClientEvents.initializeStoneLayer();
        for (final EnumTroll.Weapon weapon : EnumTroll.Weapon.values()) {
            weapon.item.setTileEntityItemStackRenderer((TileEntityItemStackRenderer)ClientProxy.TEISR);
        }
        IafItemRegistry.deathworm_gauntlet_yellow.setTileEntityItemStackRenderer((TileEntityItemStackRenderer)ClientProxy.TEISR);
        IafItemRegistry.deathworm_gauntlet_white.setTileEntityItemStackRenderer((TileEntityItemStackRenderer)ClientProxy.TEISR);
        IafItemRegistry.deathworm_gauntlet_red.setTileEntityItemStackRenderer((TileEntityItemStackRenderer)ClientProxy.TEISR);
        Item.getItemFromBlock(IafBlockRegistry.dread_portal).setTileEntityItemStackRenderer((TileEntityItemStackRenderer)ClientProxy.TEISR);
    }

    @SideOnly(Side.CLIENT)
    private void renderEntities() {
        EnumDragonAnimations.initializeDragonModels();
        EnumSeaSerpentAnimations.initializeSerpentModels();
        ModelBase firedragon_model = null;
        ModelBase icedragon_model = null;
        ModelBase seaserpent_model = null;
        try {
            firedragon_model = (ModelBase)new IceAndFireTabulaModel(TabulaModelHandler.INSTANCE.loadTabulaModel("/assets/iceandfire/models/tabula/firedragon/dragonFireGround"), new FireDragonTabulaModelAnimator());
            icedragon_model = (ModelBase)new IceAndFireTabulaModel(TabulaModelHandler.INSTANCE.loadTabulaModel("/assets/iceandfire/models/tabula/icedragon/dragonIceGround"), new IceDragonTabulaModelAnimator());
            seaserpent_model = (ModelBase)new IceAndFireTabulaModel(TabulaModelHandler.INSTANCE.loadTabulaModel("/assets/iceandfire/models/tabula/seaserpent/seaserpent"), new SeaSerpentTabulaModelAnimator());
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        RenderingRegistry.registerEntityRenderingHandler((Class)EntityFireDragon.class, (Render)new RenderDragonBase(Minecraft.getMinecraft().getRenderManager(), firedragon_model, true));
        RenderingRegistry.registerEntityRenderingHandler((Class)EntityIceDragon.class, (Render)new RenderDragonBase(Minecraft.getMinecraft().getRenderManager(), icedragon_model, false));
        RenderingRegistry.registerEntityRenderingHandler((Class)EntityDragonEgg.class, (Render)new RenderDragonEgg(Minecraft.getMinecraft().getRenderManager()));
        RenderingRegistry.registerEntityRenderingHandler((Class)EntityDragonArrow.class, (Render)new RenderDragonArrow(Minecraft.getMinecraft().getRenderManager()));
        RenderingRegistry.registerEntityRenderingHandler((Class)EntityDragonSkull.class, (Render)new RenderDragonSkull(Minecraft.getMinecraft().getRenderManager(), firedragon_model, icedragon_model));
        RenderingRegistry.registerEntityRenderingHandler((Class)EntityDragonFireCharge.class, (Render)new RenderDragonFireCharge(Minecraft.getMinecraft().getRenderManager(), true));
        RenderingRegistry.registerEntityRenderingHandler((Class)EntityDragonIceCharge.class, (Render)new RenderDragonFireCharge(Minecraft.getMinecraft().getRenderManager(), false));
        RenderingRegistry.registerEntityRenderingHandler((Class)EntitySnowVillager.class, (Render)new RenderSnowVillager(Minecraft.getMinecraft().getRenderManager()));
        RenderingRegistry.registerEntityRenderingHandler((Class)EntityHippogryphEgg.class, (Render)new RenderSnowball(Minecraft.getMinecraft().getRenderManager(), IafItemRegistry.hippogryph_egg, Minecraft.getMinecraft().getRenderItem()));
        RenderingRegistry.registerEntityRenderingHandler((Class)EntityHippogryph.class, (Render)new RenderHippogryph(Minecraft.getMinecraft().getRenderManager()));
        RenderingRegistry.registerEntityRenderingHandler((Class)EntityStoneStatue.class, (Render)new RenderStoneStatue(Minecraft.getMinecraft().getRenderManager()));
        RenderingRegistry.registerEntityRenderingHandler((Class)EntityGorgon.class, (Render)new RenderGorgon(Minecraft.getMinecraft().getRenderManager()));
        RenderingRegistry.registerEntityRenderingHandler((Class)EntityPixie.class, (Render)new RenderPixie(Minecraft.getMinecraft().getRenderManager()));
        RenderingRegistry.registerEntityRenderingHandler((Class)EntityCyclops.class, (Render)new RenderCyclops(Minecraft.getMinecraft().getRenderManager()));
        RenderingRegistry.registerEntityRenderingHandler((Class)EntitySiren.class, (Render)new RenderSiren(Minecraft.getMinecraft().getRenderManager()));
        RenderingRegistry.registerEntityRenderingHandler((Class)EntityHippocampus.class, (Render)new RenderHippocampus(Minecraft.getMinecraft().getRenderManager()));
        RenderingRegistry.registerEntityRenderingHandler((Class)EntityDeathWorm.class, (Render)new RenderDeathWorm(Minecraft.getMinecraft().getRenderManager()));
        RenderingRegistry.registerEntityRenderingHandler((Class)EntityDeathWormEgg.class, (Render)new RenderSnowball(Minecraft.getMinecraft().getRenderManager(), IafItemRegistry.deathworm_egg, Minecraft.getMinecraft().getRenderItem()));
        RenderingRegistry.registerEntityRenderingHandler((Class)EntityCockatrice.class, (Render)new RenderCockatrice(Minecraft.getMinecraft().getRenderManager()));
        RenderingRegistry.registerEntityRenderingHandler((Class)EntityCockatriceEgg.class, (Render)new RenderSnowball(Minecraft.getMinecraft().getRenderManager(), IafItemRegistry.rotten_egg, Minecraft.getMinecraft().getRenderItem()));
        RenderingRegistry.registerEntityRenderingHandler((Class)EntityStymphalianBird.class, (Render)new RenderStymphalianBird(Minecraft.getMinecraft().getRenderManager()));
        RenderingRegistry.registerEntityRenderingHandler((Class)EntityStymphalianFeather.class, (Render)new RenderStymphalianFeather(Minecraft.getMinecraft().getRenderManager()));
        RenderingRegistry.registerEntityRenderingHandler((Class)EntityStymphalianArrow.class, (Render)new RenderStymphalianArrow(Minecraft.getMinecraft().getRenderManager()));
        RenderingRegistry.registerEntityRenderingHandler((Class)EntityTroll.class, (Render)new RenderTroll(Minecraft.getMinecraft().getRenderManager()));
        RenderingRegistry.registerEntityRenderingHandler((Class)EntityMyrmexWorker.class, (Render)new RenderMyrmexBase(Minecraft.getMinecraft().getRenderManager(), (ModelBase)new ModelMyrmexWorker(), 0.5f));
        RenderingRegistry.registerEntityRenderingHandler((Class)EntityMyrmexSoldier.class, (Render)new RenderMyrmexBase(Minecraft.getMinecraft().getRenderManager(), (ModelBase)new ModelMyrmexSoldier(), 0.75f));
        RenderingRegistry.registerEntityRenderingHandler((Class)EntityMyrmexQueen.class, (Render)new RenderMyrmexBase(Minecraft.getMinecraft().getRenderManager(), (ModelBase)new ModelMyrmexQueen(), 1.25f));
        RenderingRegistry.registerEntityRenderingHandler((Class)EntityMyrmexEgg.class, (Render)new RenderMyrmexEgg(Minecraft.getMinecraft().getRenderManager()));
        RenderingRegistry.registerEntityRenderingHandler((Class)EntityMyrmexSentinel.class, (Render)new RenderMyrmexBase(Minecraft.getMinecraft().getRenderManager(), (ModelBase)new ModelMyrmexSentinel(), 0.85f));
        RenderingRegistry.registerEntityRenderingHandler((Class)EntityMyrmexRoyal.class, (Render)new RenderMyrmexBase(Minecraft.getMinecraft().getRenderManager(), (ModelBase)new ModelMyrmexRoyal(), 0.75f));
        RenderingRegistry.registerEntityRenderingHandler((Class)EntityMyrmexSwarmer.class, (Render)new RenderMyrmexBase(Minecraft.getMinecraft().getRenderManager(), (ModelBase)new ModelMyrmexRoyal(), 0.25f));
        RenderingRegistry.registerEntityRenderingHandler((Class)EntityAmphithere.class, (Render)new RenderAmphithere(Minecraft.getMinecraft().getRenderManager()));
        RenderingRegistry.registerEntityRenderingHandler((Class)EntityAmphithereArrow.class, (Render)new RenderAmphithereArrow(Minecraft.getMinecraft().getRenderManager()));
        RenderingRegistry.registerEntityRenderingHandler((Class)EntitySeaSerpent.class, (Render)new RenderSeaSerpent(Minecraft.getMinecraft().getRenderManager(), seaserpent_model));
        RenderingRegistry.registerEntityRenderingHandler((Class)EntitySeaSerpentBubbles.class, (Render)new RenderNothing(Minecraft.getMinecraft().getRenderManager()));
        RenderingRegistry.registerEntityRenderingHandler((Class)EntitySeaSerpentArrow.class, (Render)new RenderSeaSerpentArrow(Minecraft.getMinecraft().getRenderManager()));
        RenderingRegistry.registerEntityRenderingHandler((Class)EntityChainTie.class, (Render)new RenderChainTie(Minecraft.getMinecraft().getRenderManager()));
        RenderingRegistry.registerEntityRenderingHandler((Class)EntityPixieCharge.class, (Render)new RenderNothing(Minecraft.getMinecraft().getRenderManager()));
        RenderingRegistry.registerEntityRenderingHandler((Class)EntityTideTrident.class, (Render)new RenderTideTrident(Minecraft.getMinecraft().getRenderManager()));
        RenderingRegistry.registerEntityRenderingHandler((Class)EntityMobSkull.class, (Render)new RenderMobSkull(Minecraft.getMinecraft().getRenderManager(), seaserpent_model));
        RenderingRegistry.registerEntityRenderingHandler((Class)EntityDreadThrall.class, (Render)new RenderDreadThrall(Minecraft.getMinecraft().getRenderManager()));
        RenderingRegistry.registerEntityRenderingHandler((Class)EntityDreadGhoul.class, (Render)new RenderDreadGhoul(Minecraft.getMinecraft().getRenderManager()));
        RenderingRegistry.registerEntityRenderingHandler((Class)EntityDreadBeast.class, (Render)new RenderDreadBeast(Minecraft.getMinecraft().getRenderManager()));
        RenderingRegistry.registerEntityRenderingHandler((Class)EntityDreadScuttler.class, (Render)new RenderDreadScuttler(Minecraft.getMinecraft().getRenderManager()));
        RenderingRegistry.registerEntityRenderingHandler((Class)EntityDreadLich.class, (Render)new RenderDreadLich(Minecraft.getMinecraft().getRenderManager()));
        RenderingRegistry.registerEntityRenderingHandler((Class)EntityDreadLichSkull.class, (Render)new RenderDreadLichSkull(Minecraft.getMinecraft().getRenderManager()));
        RenderingRegistry.registerEntityRenderingHandler((Class)EntityDreadKnight.class, (Render)new RenderDreadKnight(Minecraft.getMinecraft().getRenderManager()));
        RenderingRegistry.registerEntityRenderingHandler((Class)EntityDreadHorse.class, (Render)new RenderDreadHorse(Minecraft.getMinecraft().getRenderManager()));
        RenderingRegistry.registerEntityRenderingHandler((Class)EntityBlackFrostDragon.class, (Render)new RenderBlackFrostDragon(Minecraft.getMinecraft().getRenderManager(), icedragon_model, false));
        RenderingRegistry.registerEntityRenderingHandler((Class)EntityDreadQueen.class, (Render)new RenderDreadQueen(Minecraft.getMinecraft().getRenderManager()));
        RenderingRegistry.registerEntityRenderingHandler((Class)EntityHydra.class, (Render)new RenderHydra(Minecraft.getMinecraft().getRenderManager()));
        RenderingRegistry.registerEntityRenderingHandler((Class)EntityHydraBreath.class, (Render)new RenderNothing(Minecraft.getMinecraft().getRenderManager()));
        RenderingRegistry.registerEntityRenderingHandler((Class)EntityHydraArrow.class, (Render)new RenderHydraArrow(Minecraft.getMinecraft().getRenderManager()));
        ClientRegistry.bindTileEntitySpecialRenderer((Class)TileEntityPodium.class, (TileEntitySpecialRenderer)new RenderPodium());
        ClientRegistry.bindTileEntitySpecialRenderer((Class)TileEntityLectern.class, (TileEntitySpecialRenderer)new RenderLectern());
        ClientRegistry.bindTileEntitySpecialRenderer((Class)TileEntityEggInIce.class, (TileEntitySpecialRenderer)new RenderEggInIce());
        ClientRegistry.bindTileEntitySpecialRenderer((Class)TileEntityPixieHouse.class, (TileEntitySpecialRenderer)new RenderPixieHouse());
        ClientRegistry.bindTileEntitySpecialRenderer((Class)TileEntityJar.class, (TileEntitySpecialRenderer)new RenderJar());
        ClientRegistry.bindTileEntitySpecialRenderer((Class)TileEntityDreadPortal.class, (TileEntitySpecialRenderer)new RenderDreadPortal());
        ClientRegistry.bindTileEntitySpecialRenderer((Class)TileEntityDreadSpawner.class, (TileEntitySpecialRenderer)new RenderDreadSpawner());
        ForgeHooksClient.registerTESRItemStack(Item.getItemFromBlock(IafBlockRegistry.pixieHouse), 0, (Class)TileEntityPixieHouse.class);
        ForgeHooksClient.registerTESRItemStack(Item.getItemFromBlock(IafBlockRegistry.pixieHouse), 1, (Class)TileEntityPixieHouse.class);
        ForgeHooksClient.registerTESRItemStack(Item.getItemFromBlock(IafBlockRegistry.pixieHouse), 2, (Class)TileEntityPixieHouse.class);
        ForgeHooksClient.registerTESRItemStack(Item.getItemFromBlock(IafBlockRegistry.pixieHouse), 3, (Class)TileEntityPixieHouse.class);
        ForgeHooksClient.registerTESRItemStack(Item.getItemFromBlock(IafBlockRegistry.pixieHouse), 4, (Class)TileEntityPixieHouse.class);
        ForgeHooksClient.registerTESRItemStack(Item.getItemFromBlock(IafBlockRegistry.pixieHouse), 5, (Class)TileEntityPixieHouse.class);
    }

    @SideOnly(Side.CLIENT)
    @Override
    public void spawnDragonParticle(final String name, final double x, final double y, final double z, final double motX, final double motY, final double motZ, final EntityDragonBase entityDragonBase) {
        final World world = (World)Minecraft.getMinecraft().world;
        if (world == null) {
            return;
        }
        Particle particle = null;
        if (name.equals("dragonfire")) {
            particle = (Particle)new ParticleDragonFlame(world, x, y, z, motX, motY, motZ, entityDragonBase, 0);
        }
        if (name.equals("dragonice")) {
            particle = (Particle)new ParticleDragonFrost(world, x, y, z, motX, motY, motZ, entityDragonBase, 0);
        }
        if (particle != null) {
            this.particleSpawner.spawnParticle(particle, true, true, false, x, y, z);
        }
    }

    @SideOnly(Side.CLIENT)
    @Override
    public void spawnParticle(final String name, final double x, final double y, final double z, final double motX, final double motY, final double motZ, final float size) {
        final World world = (World)Minecraft.getMinecraft().world;
        if (world == null) {
            return;
        }
        Particle particle = null;
        if (name.equals("dragonfire")) {
            particle = (Particle)new ParticleDragonFlame(world, x, y, z, motX, motY, motZ, size);
        }
        if (name.equals("dragonice")) {
            particle = (Particle)new ParticleDragonFrost(world, x, y, z, motX, motY, motZ, size);
        }
        if (name.equals("dread_torch")) {
            particle = (Particle)new ParticleDreadTorch(world, x, y, z, motX, motY, motZ, size);
        }
        if (name.equals("dread_portal")) {
            particle = (Particle)new ParticleDreadPortal(world, x, y, z, motX, motY, motZ, size);
        }
        if (name.equals("blood")) {
            particle = (Particle)new ParticleBlood(world, x, y, z);
        }
        if (name.equals("if_pixie")) {
            particle = new ParticlePixieDust(world, x, y, z, (float)motX, (float)motY, (float)motZ);
        }
        if (name.equals("siren_appearance")) {
            particle = (Particle)new ParticleSirenAppearance(world, x, y, z);
        }
        if (name.equals("siren_music")) {
            particle = new ParticleSirenMusic(world, x, y, z, motX, motY, motZ);
        }
        if (name.equals("serpent_bubble")) {
            particle = (Particle)new ParticleSerpentBubble(world, x, y, z, motX, motY, motZ);
        }
        if (name.equals("hydra")) {
            particle = new ParticleHydraBreath(world, x, y, z, (float)motX, (float)motY, (float)motZ);
        }
        if (particle != null) {
            this.particleSpawner.spawnParticle(particle, false, false, false, x, y, z);
        }
    }

    @SideOnly(Side.CLIENT)
    @Override
    public void openBestiaryGui(final ItemStack book) {
        Minecraft.getMinecraft().displayGuiScreen((GuiScreen)new GuiBestiary(book));
    }

    @SideOnly(Side.CLIENT)
    @Override
    public void openMyrmexStaffGui(final ItemStack staff) {
        Minecraft.getMinecraft().displayGuiScreen((GuiScreen)new GuiMyrmexStaff(staff));
    }

    @SideOnly(Side.CLIENT)
    @Override
    public void openMyrmexAddRoomGui(final ItemStack staff, final BlockPos pos, final EnumFacing facing) {
        Minecraft.getMinecraft().displayGuiScreen((GuiScreen)new GuiMyrmexAddRoom(staff, pos, facing));
    }

    @SideOnly(Side.CLIENT)
    @Override
    public Object getArmorModel(final int armorId) {
        switch (armorId) {
            case 0: {
                return ClientProxy.FIRE_DRAGON_SCALE_ARMOR_MODEL;
            }
            case 1: {
                return ClientProxy.FIRE_DRAGON_SCALE_ARMOR_MODEL_LEGS;
            }
            case 2: {
                return ClientProxy.ICE_DRAGON_SCALE_ARMOR_MODEL;
            }
            case 3: {
                return ClientProxy.ICE_DRAGON_SCALE_ARMOR_MODEL_LEGS;
            }
            case 4: {
                return ClientProxy.DEATHWORM_ARMOR_MODEL;
            }
            case 5: {
                return ClientProxy.DEATHWORM_ARMOR_MODEL_LEGS;
            }
            case 6: {
                return ClientProxy.TROLL_ARMOR_MODEL;
            }
            case 7: {
                return ClientProxy.TROLL_ARMOR_MODEL_LEGS;
            }
            case 8: {
                return ClientProxy.TIDE_ARMOR_MODEL;
            }
            case 9: {
                return ClientProxy.TIDE_ARMOR_MODEL_LEGS;
            }
            case 10: {
                return ClientProxy.DRAGONSTEEL_FIRE_ARMOR_MODEL;
            }
            case 11: {
                return ClientProxy.DRAGONSTEEL_FIRE_ARMOR_MODEL_LEGS;
            }
            case 12: {
                return ClientProxy.DRAGONSTEEL_ICE_ARMOR_MODEL;
            }
            case 13: {
                return ClientProxy.DRAGONSTEEL_ICE_ARMOR_MODEL_LEGS;
            }
            case 14: {
                return ClientProxy.SILVER_ARMOR_MODEL;
            }
            case 15: {
                return ClientProxy.SILVER_ARMOR_MODEL_LEGS;
            }
            default: {
                return null;
            }
        }
    }

    @Override
    public Object getFontRenderer() {
        return this.bestiaryFontRenderer;
    }

    @Override
    public int getDragon3rdPersonView() {
        return this.thirdPersonViewDragon;
    }

    @Override
    public void setDragon3rdPersonView(final int view) {
        this.thirdPersonViewDragon = view;
    }

    @Override
    public Object getDreadlandsRender(final int i) {
        if (i == 0) {
            return this.dreadlandsSkyRenderer;
        }
        if (i == 1) {
            return this.dreadlandsWeatherRenderer;
        }
        if (i == 2) {
            return this.dreadlandsAuroraRender;
        }
        return null;
    }

    @Override
    public int getPreviousViewType() {
        return this.previousViewType;
    }

    @Override
    public void setPreviousViewType(final int view) {
        this.previousViewType = view;
    }

    @Override
    public void updateDragonArmorRender(final String clear) {
        LayerDragonArmor.clearCache(clear);
    }

    @Override
    public boolean shouldSeeBestiaryContents() {
        return Keyboard.isKeyDown(54) || Keyboard.isKeyDown(42);
    }

    static {
        FIRE_DRAGON_SCALE_ARMOR_MODEL = new ModelFireDragonArmor(0.5f, false);
        FIRE_DRAGON_SCALE_ARMOR_MODEL_LEGS = new ModelFireDragonArmor(0.2f, true);
        ICE_DRAGON_SCALE_ARMOR_MODEL = new ModelIceDragonArmor(0.5f, false);
        ICE_DRAGON_SCALE_ARMOR_MODEL_LEGS = new ModelIceDragonArmor(0.2f, true);
        DEATHWORM_ARMOR_MODEL = new ModelDeathWormArmor(0.5f);
        DEATHWORM_ARMOR_MODEL_LEGS = new ModelDeathWormArmor(0.2f);
        TROLL_ARMOR_MODEL = new ModelTrollArmor(0.75f);
        TROLL_ARMOR_MODEL_LEGS = new ModelTrollArmor(0.35f);
        TIDE_ARMOR_MODEL = new ModelSeaSerpentArmor(0.4f);
        TIDE_ARMOR_MODEL_LEGS = new ModelSeaSerpentArmor(0.2f);
        DRAGONSTEEL_FIRE_ARMOR_MODEL = new ModelDragonsteelFireArmor(0.4f);
        DRAGONSTEEL_FIRE_ARMOR_MODEL_LEGS = new ModelDragonsteelFireArmor(0.2f);
        DRAGONSTEEL_ICE_ARMOR_MODEL = new ModelDragonsteelIceArmor(0.4f);
        DRAGONSTEEL_ICE_ARMOR_MODEL_LEGS = new ModelDragonsteelIceArmor(0.2f);
        SILVER_ARMOR_MODEL = new ModelSilverArmor(0.5f);
        SILVER_ARMOR_MODEL_LEGS = new ModelSilverArmor(0.2f);
        TEISR = new IceAndFireTEISR();
        ClientProxy.currentDragonRiders = new ArrayList<UUID>();
        ClientProxy.referedClientHive = null;
    }
}