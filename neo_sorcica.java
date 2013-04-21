package neo_sorcica;

import neo_sorcica_block.BlockAtlanteanOre;
import neo_sorcica_block.BlockBlazeMetalOre;
import neo_sorcica_block.BlockEndGarnetOre;
import neo_sorcica_block.BlockFluteWood;
import neo_sorcica_block.BlockFluteWoodLeaves;
import neo_sorcica_block.BlockGaianOre;
import neo_sorcica_block.BlockRedstoneFurnace;
import neo_sorcica_block.BlockSkyCrystalCluster;
import neo_sorcica_block.BlockUnavriteOre;
import neo_sorcica_item.ItemArconiumDust;
import neo_sorcica_item.ItemAtlanteanIngot;
import neo_sorcica_item.ItemEndGarnet;
import neo_sorcica_item.ItemGaianIngot;
import neo_sorcica_item.ItemLiquiumShard;
import neo_sorcica_item.ItemNalvrium;
import neo_sorcica_item.ItemPontusCrystal;
import neo_sorcica_item.ItemPontusIngot;
import neo_sorcica_item.ItemSkyCrystal;
import neo_sorcica_item.ItemSolenta;
import neo_sorcica_item.ItemTerrausDust;
import neo_sorcica_item.ItemUnavrite;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid=neo_sorcica.modid,name="NeoSorcica",version="Alpha 1.0")
@NetworkMod(clientSideRequired=true,serverSideRequired=false)
public class neo_sorcica 
{
    public static final String modid="Wizwardicuz_NeoSorcica";
    
    public static Block RedstoneFurnace;
    public static Block GaianOre;
    public static Item GaianIngot;
    public static Item PontusCrystal;
    public static Item PontusIngot;
    public static Item TerrausDust;
    public static Block UnavriteOre;
    public static Item Unavrite;
    public static Item Nalvrium;
    public static Item ArconiumDust;
    public static Block AtlanteanOre;
    public static Item AtlanteanIngot;
    public static Item LiquiumShard;
    public static Block SkyCrystalCluster;
    public static Item SkyCrystal;
    public static Item Solenta;
    public static Item Angelicite;
    public static Block BlazeMetalOre;
    public static Item BlazeMetalIngot;
    public static Item FlariteNugget;
    public static Item FlariteIngot;
    public static Item TorchiumDust;
    public static Block EndGarnetOre;
    public static Item EndGarnet;
    public static Item Dracite;
    public static Item Teleportium;
    public static Block FluteWood;
    public static Block FluteWoodLeaves;
    
    @Init
    public void load(FMLInitializationEvent event)
    {   
        GameRegistry.registerWorldGenerator(new NeoSorcicaWorldGenerator());
        
        RedstoneFurnace = new BlockRedstoneFurnace(510,Material.iron).setUnlocalizedName("Redstone Furnace");
        GameRegistry.registerBlock(RedstoneFurnace,modid+RedstoneFurnace.getUnlocalizedName2());
        LanguageRegistry.addName(RedstoneFurnace,"Redstone Furnace");
        
        GaianOre = new BlockGaianOre(511,Material.rock).setUnlocalizedName("Gaian Ore");
        GameRegistry.registerBlock(GaianOre,modid+GaianOre.getUnlocalizedName2());
        LanguageRegistry.addName(GaianOre,"Gaian Ore");
        
        GaianIngot = new ItemGaianIngot(5000).setUnlocalizedName("Gaian Ingot");
        GameRegistry.registerItem(GaianIngot,modid+GaianIngot.getUnlocalizedName());
        LanguageRegistry.addName(GaianIngot,"Gaian Ingot");
  
        PontusCrystal = new ItemPontusCrystal(5001).setUnlocalizedName("Pontus Crystal");
        GameRegistry.registerItem(PontusCrystal,modid+PontusCrystal.getUnlocalizedName());
        LanguageRegistry.addName(PontusCrystal,"Pontus Crystal");
       
        PontusIngot = new ItemPontusIngot(5011).setUnlocalizedName("Pontus Ingot");
        GameRegistry.registerItem(PontusIngot,modid+PontusIngot.getUnlocalizedName());
        LanguageRegistry.addName(PontusIngot,"Pontus Ingot");
          
        TerrausDust = new ItemTerrausDust(5002).setUnlocalizedName("Terraus Dust");
        GameRegistry.registerItem(TerrausDust,modid+TerrausDust.getUnlocalizedName());
        LanguageRegistry.addName(TerrausDust,"Terraus Dust");
        
        UnavriteOre = new BlockUnavriteOre(512,Material.iron).setUnlocalizedName("Unavrite Ore");
        GameRegistry.registerBlock(UnavriteOre,modid+UnavriteOre.getUnlocalizedName2());
        LanguageRegistry.addName(UnavriteOre,"Unavrite Ore");
    
        Unavrite = new ItemUnavrite(5003).setUnlocalizedName("Unavrite");
        GameRegistry.registerItem(Unavrite,modid+Unavrite.getUnlocalizedName());
        LanguageRegistry.addName(Unavrite,"Unavrite");
  
        Nalvrium = new ItemNalvrium(5004).setUnlocalizedName("Nalvrium");
        GameRegistry.registerItem(Nalvrium,modid+Nalvrium.getUnlocalizedName());
        LanguageRegistry.addName(Nalvrium,"Nalvrium");
   
        ArconiumDust = new ItemArconiumDust(5005).setUnlocalizedName("Arconium Dust");
        GameRegistry.registerItem(ArconiumDust,modid+ArconiumDust.getUnlocalizedName());
        LanguageRegistry.addName(ArconiumDust,"Arconium Dust");
       
        AtlanteanOre = new BlockAtlanteanOre(513,Material.iron).setUnlocalizedName("Atlantean Ore");
        GameRegistry.registerBlock(AtlanteanOre,modid+AtlanteanOre.getUnlocalizedName2());
        LanguageRegistry.addName(AtlanteanOre, "Altantean Ore");
        
        AtlanteanIngot = new ItemAtlanteanIngot(5006).setUnlocalizedName("Atlantean Ingot");
        GameRegistry.registerItem(AtlanteanIngot, modid+AtlanteanIngot.getUnlocalizedName());
        LanguageRegistry.addName(AtlanteanIngot, "Atlantean Ingot");
        
        LiquiumShard = new ItemLiquiumShard(5007).setUnlocalizedName("Liquium Shard");
        GameRegistry.registerItem(LiquiumShard,modid+LiquiumShard.getUnlocalizedName());
        LanguageRegistry.addName(LiquiumShard, "Liquium Shard");

        SkyCrystalCluster = new BlockSkyCrystalCluster(514,Material.iron).setUnlocalizedName("Sky Crystal Cluster");
        GameRegistry.registerBlock(SkyCrystalCluster,modid+SkyCrystalCluster.getUnlocalizedName2());
        LanguageRegistry.addName(SkyCrystalCluster, "Sky Crystal Cluster");
    
        SkyCrystal = new ItemSkyCrystal(5008).setUnlocalizedName("Sky Crystal");
        GameRegistry.registerItem(SkyCrystal,modid+SkyCrystal.getUnlocalizedName());
        LanguageRegistry.addName(SkyCrystal,"Sky Crystal");
    
        Solenta = new ItemSolenta(5009).setUnlocalizedName("Solenta");
        GameRegistry.registerItem(Solenta,modid+Solenta.getUnlocalizedName());
        LanguageRegistry.addName(Solenta,"Solenta");
        
        BlazeMetalOre = new BlockBlazeMetalOre(515,Material.iron).setUnlocalizedName("Blaze Metal Ore");
        GameRegistry.registerBlock(BlazeMetalOre,modid+BlazeMetalOre.getUnlocalizedName2());
        LanguageRegistry.addName(BlazeMetalOre,"Blaze Metal Ore");
        
        EndGarnetOre = new BlockEndGarnetOre(516,Material.iron).setUnlocalizedName("End Garnet Ore");
        GameRegistry.registerBlock(EndGarnetOre,modid+EndGarnetOre.getUnlocalizedName2());
        LanguageRegistry.addName(EndGarnetOre,"End Garnet Ore");
        
        EndGarnet = new ItemEndGarnet(5010).setUnlocalizedName("End Garnet");
        GameRegistry.registerItem(EndGarnet,modid+EndGarnet.getUnlocalizedName());
        LanguageRegistry.addName(EndGarnet, "End Garnet");
        
        FluteWood = new BlockFluteWood(517,Material.wood).setUnlocalizedName("Flute Wood");
        GameRegistry.registerBlock(FluteWood,modid+FluteWood.getUnlocalizedName2());
        LanguageRegistry.addName(FluteWood, "Flute Wood");
        
        FluteWoodLeaves = new BlockFluteWoodLeaves(518,Material.leaves).setUnlocalizedName("Flute Wood Leaves");
        GameRegistry.registerBlock(FluteWoodLeaves,modid+FluteWoodLeaves.getUnlocalizedName2());
        LanguageRegistry.addName(FluteWoodLeaves, "Flute Wood Leaves");
       
    }
}
