package kiba.rockcandy.registry;

import kiba.rockcandy.blocks.BlockCandy;
import kiba.rockcandy.blocks.BlockCandyInfuser;
import kiba.rockcandy.blocks.BlockCandyOre;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModBlocks {

    public static BlockCandyOre blockCandyOre;
    public static BlockCandyInfuser blockCandyInfuser;
    public static BlockCandy blockCandy;


    public static void init(){
        blockCandyOre = new BlockCandyOre();
        blockCandyInfuser = new BlockCandyInfuser();
        blockCandy = new BlockCandy();
    }


    @SideOnly(Side.CLIENT)
    public static void initModels(){
        blockCandyOre.initModel();
        blockCandyInfuser.initModel();
        blockCandy.initModel();
    }
}
