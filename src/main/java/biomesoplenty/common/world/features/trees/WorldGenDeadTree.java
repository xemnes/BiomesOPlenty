package biomesoplenty.common.world.features.trees;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;
import biomesoplenty.api.content.BOPCBlocks;

public class WorldGenDeadTree extends WorldGenAbstractTree
{
	private int strengthRand;
	private int bMax;
	private double offset;
	
	public WorldGenDeadTree()
	{
		this(35, 10, 1.3D);
	}
	
    public WorldGenDeadTree(int strengthRand, int bMax, double offset)
    {
        super(false);
        
        this.strengthRand = strengthRand;
        this.bMax = bMax;
        this.offset = offset;
    }

    @Override
    public boolean generate(World world, Random random, int x, int y, int z)
    {
        while (world.isAirBlock(x, y, z) && y > 2)
        {
            --y;
        }

        Block block = world.getBlock(x, y, z);

        if (block != Blocks.grass && block != Blocks.dirt && block != BOPCBlocks.driedDirt && block != Blocks.hardened_clay && block != BOPCBlocks.newBopDirt  && block != BOPCBlocks.newBopGrass)
        {
            return false;
        }
        else
        {
            for (int var7 = -2; var7 <= 2; ++var7)
            {
                for (int var8 = -2; var8 <= 2; ++var8)
                {
                    int v_0 = x + var7;int v_1 = z + var8;
                    if (world.isAirBlock(v_0, y - 1, v_1) && world.isAirBlock(v_0, y - 2, v_1) && !world.isAirBlock(v_0, y, v_1))
                    {
                        return false;
                    }
                }
            }
            
            int var999 = random.nextInt(8);
            
            if (var999 == 0)
            {
            	int y_0  = y + 2;int y_1  = y + 3;int y_2  = y + 4;int y_3  = y + 5;int y_4  = y + 6;int y_5  = y + 7;int y_6  = y + 8;
            	int x_0  = x + 1;int x_1  = x + 2;int x_2  = x - 1;int x_3  = x - 2;
            	int z_0  = z + 1;int z_1  = z + 2;int z_2  = z - 1;int z_3  = z - 2;
            	buildBlock(world, x, y + 1, z, BOPCBlocks.logs3, 2);
	            buildBlock(world, x, y_0, z, BOPCBlocks.logs3, 2);
	            buildBlock(world, x, y_1, z, BOPCBlocks.logs3, 2);
	            buildBlock(world, x, y_2, z, BOPCBlocks.logs3, 2);
	            buildBlock(world, x, y_3, z, BOPCBlocks.logs3, 2);
	            buildBlock(world, x, y_4, z, BOPCBlocks.logs3, 2);
	            buildBlock(world, x, y_5, z, BOPCBlocks.logs3, 2);
	            buildBlock(world, x, y_6, z, BOPCBlocks.logs3, 2);
	            buildBlock(world, x, y + 9, z, BOPCBlocks.logs3, 2);
	            
	            buildBlock(world, x_0, y_1, z, BOPCBlocks.logs3, 6);
	            buildBlock(world, x_1, y_1, z, BOPCBlocks.logs3, 6);
	            buildBlock(world, x_0, y_2, z, BOPCBlocks.logs3, 6);
	            buildBlock(world, x_1, y_3, z, BOPCBlocks.logs3, 6);
	            buildBlock(world, x + 3, y_3, z, BOPCBlocks.logs3, 6);
	            buildBlock(world, x_0, y_5, z, BOPCBlocks.logs3, 6);
	            buildBlock(world, x_1, y_5, z, BOPCBlocks.logs3, 6);
	            
	            buildBlock(world, x_2, y_0, z, BOPCBlocks.logs3, 6);
	            buildBlock(world, x_3, y_2, z, BOPCBlocks.logs3, 6);
	            buildBlock(world, x_2, y_2, z, BOPCBlocks.logs3, 6);
	            buildBlock(world, x_2, y_4, z, BOPCBlocks.logs3, 2);
	            buildBlock(world, x_2, y_5, z, BOPCBlocks.logs3, 2);
	            buildBlock(world, x_3, y_6, z, BOPCBlocks.logs3, 6);
	            
	            buildBlock(world, x, y_1, z_0, BOPCBlocks.logs3, 10);
	            buildBlock(world, x, y_1, z_1, BOPCBlocks.logs3, 10);
	            buildBlock(world, x, y_3, z_0, BOPCBlocks.logs3, 10);
	            buildBlock(world, x, y_4, z_1, BOPCBlocks.logs3, 10);
	            buildBlock(world, x, y_4, z + 3, BOPCBlocks.logs3, 10);
	            buildBlock(world, x, y_6, z_0, BOPCBlocks.logs3, 10);
	            
	            buildBlock(world, x, y_1, z_2, BOPCBlocks.logs3, 2);
	            buildBlock(world, x, y_2, z_3, BOPCBlocks.logs3, 10);
	            buildBlock(world, x, y_4, z_2, BOPCBlocks.logs3, 2);
	            buildBlock(world, x, y_5, z_3, BOPCBlocks.logs3, 10);
            }
            else if (var999 == 1)
            {
            	int y_0  = y + 2;int y_1  = y + 3;int y_2  = y + 4;int y_3  = y + 5;int y_4  = y + 6;int y_5  = y + 7;int y_6  = y + 8;
            	int x_0  = x + 1;int x_1  = x + 2;int x_2  = x - 1;int x_3  = x - 2;
            	int z_0  = z + 1;int z_1  = z + 2;int z_2  = z - 1;int z_3  = z - 2;
            	buildBlock(world, x, y + 1, z, BOPCBlocks.logs3, 2);
	            buildBlock(world, x, y_0, z, BOPCBlocks.logs3, 2);
	            buildBlock(world, x, y_1, z, BOPCBlocks.logs3, 2);
	            buildBlock(world, x, y_2, z, BOPCBlocks.logs3, 2);
	            buildBlock(world, x, y_3, z, BOPCBlocks.logs3, 2);
	            buildBlock(world, x, y_4, z, BOPCBlocks.logs3, 2);
	            buildBlock(world, x, y_5, z, BOPCBlocks.logs3, 2);
	            buildBlock(world, x, y_6, z, BOPCBlocks.logs3, 2);
	            buildBlock(world, x, y + 9, z, BOPCBlocks.logs3, 2);
	            
	            buildBlock(world, x_2, y_1, z, BOPCBlocks.logs3, 6);
	            buildBlock(world, x_3, y_1, z, BOPCBlocks.logs3, 6);
	            buildBlock(world, x_2, y_2, z, BOPCBlocks.logs3, 6);
	            buildBlock(world, x_3, y_3, z, BOPCBlocks.logs3, 6);
	            buildBlock(world, x - 3, y_3, z, BOPCBlocks.logs3, 6);
	            buildBlock(world, x_2, y_5, z, BOPCBlocks.logs3, 6);
	            buildBlock(world, x_3, y_5, z, BOPCBlocks.logs3, 6);
	            
	            buildBlock(world, x_0, y_0, z, BOPCBlocks.logs3, 6);
	            buildBlock(world, x_1, y_2, z, BOPCBlocks.logs3, 6);
	            buildBlock(world, x_0, y_2, z, BOPCBlocks.logs3, 6);
	            buildBlock(world, x_0, y_4, z, BOPCBlocks.logs3, 2);
	            buildBlock(world, x_0, y_5, z, BOPCBlocks.logs3, 2);
	            buildBlock(world, x_1, y_6, z, BOPCBlocks.logs3, 6);
	            
	            buildBlock(world, x, y_1, z_0, BOPCBlocks.logs3, 10);
	            buildBlock(world, x, y_1, z_1, BOPCBlocks.logs3, 10);
	            buildBlock(world, x, y_3, z_0, BOPCBlocks.logs3, 10);
	            buildBlock(world, x, y_4, z_1, BOPCBlocks.logs3, 10);
	            buildBlock(world, x, y_4, z + 3, BOPCBlocks.logs3, 10);
	            buildBlock(world, x, y_6, z_0, BOPCBlocks.logs3, 10);
	            
	            buildBlock(world, x, y_1, z_2, BOPCBlocks.logs3, 2);
	            buildBlock(world, x, y_2, z_3, BOPCBlocks.logs3, 10);
	            buildBlock(world, x, y_4, z_2, BOPCBlocks.logs3, 2);
	            buildBlock(world, x, y_5, z_3, BOPCBlocks.logs3, 10);
            }
            else if (var999 == 2)
            {
            	int y_0  = y + 2;int y_1  = y + 3;int y_2  = y + 4;int y_3  = y + 5;int y_4  = y + 6;int y_5  = y + 7;int y_6  = y + 8;
            	int x_0  = x + 1;int x_1  = x + 2;int x_2  = x - 1;int x_3  = x - 2;
            	int z_0  = z + 1;int z_1  = z + 2;int z_2  = z - 1;int z_3  = z - 2;
            	buildBlock(world, x, y + 1, z, BOPCBlocks.logs3, 2);
	            buildBlock(world, x, y_0, z, BOPCBlocks.logs3, 2);
	            buildBlock(world, x, y_1, z, BOPCBlocks.logs3, 2);
	            buildBlock(world, x, y_2, z, BOPCBlocks.logs3, 2);
	            buildBlock(world, x, y_3, z, BOPCBlocks.logs3, 2);
	            buildBlock(world, x, y_4, z, BOPCBlocks.logs3, 2);
	            buildBlock(world, x, y_5, z, BOPCBlocks.logs3, 2);
	            buildBlock(world, x, y_6, z, BOPCBlocks.logs3, 2);
	            buildBlock(world, x, y + 9, z, BOPCBlocks.logs3, 2);
	            
	            buildBlock(world, x_0, y_1, z, BOPCBlocks.logs3, 6);
	            buildBlock(world, x_1, y_1, z, BOPCBlocks.logs3, 6);
	            buildBlock(world, x_0, y_2, z, BOPCBlocks.logs3, 6);
	            buildBlock(world, x_1, y_3, z, BOPCBlocks.logs3, 6);
	            buildBlock(world, x + 3, y_3, z, BOPCBlocks.logs3, 6);
	            buildBlock(world, x_0, y_5, z, BOPCBlocks.logs3, 6);
	            buildBlock(world, x_1, y_5, z, BOPCBlocks.logs3, 6);
	            
	            buildBlock(world, x_2, y_0, z, BOPCBlocks.logs3, 6);
	            buildBlock(world, x_3, y_2, z, BOPCBlocks.logs3, 6);
	            buildBlock(world, x_2, y_2, z, BOPCBlocks.logs3, 6);
	            buildBlock(world, x_2, y_4, z, BOPCBlocks.logs3, 2);
	            buildBlock(world, x_2, y_5, z, BOPCBlocks.logs3, 2);
	            buildBlock(world, x_3, y_6, z, BOPCBlocks.logs3, 6);
	            
	            buildBlock(world, x, y_1, z_2, BOPCBlocks.logs3, 10);
	            buildBlock(world, x, y_1, z_3, BOPCBlocks.logs3, 10);
	            buildBlock(world, x, y_3, z_2, BOPCBlocks.logs3, 10);
	            buildBlock(world, x, y_4, z_3, BOPCBlocks.logs3, 10);
	            buildBlock(world, x, y_4, z - 3, BOPCBlocks.logs3, 10);
	            buildBlock(world, x, y_6, z_2, BOPCBlocks.logs3, 10);
	            
	            buildBlock(world, x, y_1, z_0, BOPCBlocks.logs3, 2);
	            buildBlock(world, x, y_2, z_1, BOPCBlocks.logs3, 10);
	            buildBlock(world, x, y_4, z_0, BOPCBlocks.logs3, 2);
	            buildBlock(world, x, y_5, z_1, BOPCBlocks.logs3, 10);
            }
            else if (var999 == 3)
            {
            	int y_0  = y + 2;int y_1  = y + 3;int y_2  = y + 4;int y_3  = y + 5;int y_4  = y + 6;int y_5  = y + 7;int y_6  = y + 8;
            	int x_0  = x + 1;int x_1  = x + 2;int x_2  = x - 1;int x_3  = x - 2;
            	int z_0  = z + 1;int z_1  = z + 2;int z_2  = z - 1;int z_3  = z - 2;
            	buildBlock(world, x, y + 1, z, BOPCBlocks.logs3, 2);
	            buildBlock(world, x, y_0, z, BOPCBlocks.logs3, 2);
	            buildBlock(world, x, y_1, z, BOPCBlocks.logs3, 2);
	            buildBlock(world, x, y_2, z, BOPCBlocks.logs3, 2);
	            buildBlock(world, x, y_3, z, BOPCBlocks.logs3, 2);
	            buildBlock(world, x, y_4, z, BOPCBlocks.logs3, 2);
	            buildBlock(world, x, y_5, z, BOPCBlocks.logs3, 2);
	            buildBlock(world, x, y_6, z, BOPCBlocks.logs3, 2);
	            buildBlock(world, x, y + 9, z, BOPCBlocks.logs3, 2);
	            
	            buildBlock(world, x, y_1, z_2, BOPCBlocks.logs3, 10);
	            buildBlock(world, x, y_1, z_3, BOPCBlocks.logs3, 10);
	            buildBlock(world, x, y_2, z_2, BOPCBlocks.logs3, 10);
	            buildBlock(world, x, y_3, z_3, BOPCBlocks.logs3, 10);
	            buildBlock(world, x, y_3, z - 3, BOPCBlocks.logs3, 10);
	            buildBlock(world, x, y_5, z_2, BOPCBlocks.logs3, 10);
	            buildBlock(world, x, y_5, z_3, BOPCBlocks.logs3, 10);
	            
	            buildBlock(world, x, y_0, z_0, BOPCBlocks.logs3, 10);
	            buildBlock(world, x, y_2, z_1, BOPCBlocks.logs3, 10);
	            buildBlock(world, x, y_2, z_0, BOPCBlocks.logs3, 10);
	            buildBlock(world, x, y_4, z_0, BOPCBlocks.logs3, 2);
	            buildBlock(world, x, y_5, z_0, BOPCBlocks.logs3, 2);
	            buildBlock(world, x, y_6, z_1, BOPCBlocks.logs3, 10);
	            
	            buildBlock(world, x_2, y_1, z, BOPCBlocks.logs3, 6);
	            buildBlock(world, x_3, y_1, z, BOPCBlocks.logs3, 6);
	            buildBlock(world, x_2, y_3, z, BOPCBlocks.logs3, 6);
	            buildBlock(world, x_3, y_4, z, BOPCBlocks.logs3, 6);
	            buildBlock(world, x - 3, y_4, z, BOPCBlocks.logs3, 6);
	            buildBlock(world, x_2, y_6, z, BOPCBlocks.logs3, 6);
	            
	            buildBlock(world, x_0, y_1, z, BOPCBlocks.logs3, 2);
	            buildBlock(world, x_1, y_2, z, BOPCBlocks.logs3, 6);
	            buildBlock(world, x_0, y_4, z, BOPCBlocks.logs3, 2);
	            buildBlock(world, x_1, y_5, z, BOPCBlocks.logs3, 6);
            }
            else if (var999 == 4)
            {
            	int y_0  = y + 2;int y_1  = y + 3;int y_2  = y + 4;int y_3  = y + 5;int y_4  = y + 6;int y_5  = y + 7;int y_6  = y + 8;
            	int x_0  = x + 1;int x_1  = x + 2;int x_2  = x - 1;int x_3  = x - 2;
            	int z_0  = z + 1;int z_1  = z + 2;int z_2  = z - 1;int z_3  = z - 2;
            	buildBlock(world, x, y + 1, z, BOPCBlocks.logs3, 2);
	            buildBlock(world, x, y_0, z, BOPCBlocks.logs3, 2);
	            buildBlock(world, x, y_1, z, BOPCBlocks.logs3, 2);
	            buildBlock(world, x, y_2, z, BOPCBlocks.logs3, 2);
	            buildBlock(world, x, y_3, z, BOPCBlocks.logs3, 2);
	            buildBlock(world, x, y_4, z, BOPCBlocks.logs3, 2);
	            buildBlock(world, x, y_5, z, BOPCBlocks.logs3, 2);
	            buildBlock(world, x, y_6, z, BOPCBlocks.logs3, 2);
	            buildBlock(world, x, y + 9, z, BOPCBlocks.logs3, 2);
	            
	            buildBlock(world, x, y_1, z_0, BOPCBlocks.logs3, 10);
	            buildBlock(world, x, y_1, z_1, BOPCBlocks.logs3, 10);
	            buildBlock(world, x, y_2, z_0, BOPCBlocks.logs3, 10);
	            buildBlock(world, x, y_3, z_1, BOPCBlocks.logs3, 10);
	            buildBlock(world, x, y_3, z + 3, BOPCBlocks.logs3, 10);
	            buildBlock(world, x, y_5, z_0, BOPCBlocks.logs3, 10);
	            buildBlock(world, x, y_5, z_1, BOPCBlocks.logs3, 10);
	            
	            buildBlock(world, x, y_0, z_2, BOPCBlocks.logs3, 10);
	            buildBlock(world, x, y_2, z_3, BOPCBlocks.logs3, 10);
	            buildBlock(world, x, y_2, z_2, BOPCBlocks.logs3, 10);
	            buildBlock(world, x, y_4, z_2, BOPCBlocks.logs3, 2);
	            buildBlock(world, x, y_5, z_2, BOPCBlocks.logs3, 2);
	            buildBlock(world, x, y_6, z_3, BOPCBlocks.logs3, 10);
	            
	            buildBlock(world, x_0, y_1, z, BOPCBlocks.logs3, 6);
	            buildBlock(world, x_1, y_1, z, BOPCBlocks.logs3, 6);
	            buildBlock(world, x_0, y_3, z, BOPCBlocks.logs3, 6);
	            buildBlock(world, x_1, y_4, z, BOPCBlocks.logs3, 6);
	            buildBlock(world, x + 3, y_4, z, BOPCBlocks.logs3, 6);
	            buildBlock(world, x_0, y_6, z, BOPCBlocks.logs3, 6);
	            
	            buildBlock(world, x_2, y_1, z, BOPCBlocks.logs3, 2);
	            buildBlock(world, x_3, y_2, z, BOPCBlocks.logs3, 6);
	            buildBlock(world, x_2, y_4, z, BOPCBlocks.logs3, 2);
	            buildBlock(world, x_3, y_5, z, BOPCBlocks.logs3, 6);
            }
            else if (var999 == 5)
            {
            	int y_0  = y + 2;int y_1  = y + 3;int y_2  = y + 4;int y_3  = y + 5;int y_4  = y + 6;int y_5  = y + 7;int y_6  = y + 8;
            	int x_0  = x + 1;int x_1  = x + 2;int x_2  = x - 1;int x_3  = x - 2;
            	int z_0  = z + 1;int z_1  = z + 2;int z_2  = z - 1;int z_3  = z - 2;
            	buildBlock(world, x, y + 1, z, BOPCBlocks.logs3, 2);
	            buildBlock(world, x, y_0, z, BOPCBlocks.logs3, 2);
	            buildBlock(world, x, y_1, z, BOPCBlocks.logs3, 2);
	            buildBlock(world, x, y_2, z, BOPCBlocks.logs3, 2);
	            buildBlock(world, x, y_3, z, BOPCBlocks.logs3, 2);
	            buildBlock(world, x, y_4, z, BOPCBlocks.logs3, 2);
	            buildBlock(world, x, y_5, z, BOPCBlocks.logs3, 2);
	            buildBlock(world, x, y_6, z, BOPCBlocks.logs3, 2);
	            buildBlock(world, x, y + 9, z, BOPCBlocks.logs3, 2);
	            
	            buildBlock(world, x, y_1, z_0, BOPCBlocks.logs3, 10);
	            buildBlock(world, x, y_1, z_1, BOPCBlocks.logs3, 10);
	            buildBlock(world, x, y_2, z_0, BOPCBlocks.logs3, 10);
	            buildBlock(world, x, y_3, z_1, BOPCBlocks.logs3, 10);
	            buildBlock(world, x, y_3, z + 3, BOPCBlocks.logs3, 10);
	            buildBlock(world, x, y_5, z_0, BOPCBlocks.logs3, 10);
	            buildBlock(world, x, y_5, z_1, BOPCBlocks.logs3, 10);
	            
	            buildBlock(world, x, y_0, z_2, BOPCBlocks.logs3, 10);
	            buildBlock(world, x, y_2, z_3, BOPCBlocks.logs3, 10);
	            buildBlock(world, x, y_2, z_2, BOPCBlocks.logs3, 10);
	            buildBlock(world, x, y_4, z_2, BOPCBlocks.logs3, 2);
	            buildBlock(world, x, y_5, z_2, BOPCBlocks.logs3, 2);
	            buildBlock(world, x, y_6, z_3, BOPCBlocks.logs3, 10);
	            
	            buildBlock(world, x_2, y_1, z, BOPCBlocks.logs3, 6);
	            buildBlock(world, x_3, y_1, z, BOPCBlocks.logs3, 6);
	            buildBlock(world, x_2, y_3, z, BOPCBlocks.logs3, 6);
	            buildBlock(world, x_3, y_4, z, BOPCBlocks.logs3, 6);
	            buildBlock(world, x - 3, y_4, z, BOPCBlocks.logs3, 6);
	            buildBlock(world, x_2, y_6, z, BOPCBlocks.logs3, 6);
	            
	            buildBlock(world, x_0, y_1, z, BOPCBlocks.logs3, 2);
	            buildBlock(world, x_1, y_2, z, BOPCBlocks.logs3, 6);
	            buildBlock(world, x_0, y_4, z, BOPCBlocks.logs3, 2);
	            buildBlock(world, x_1, y_5, z, BOPCBlocks.logs3, 6);
            }
            else if (var999 == 6)
            {
            	int y_0  = y + 2;int y_1  = y + 3;int y_2  = y + 4;int y_3  = y + 5;int y_4  = y + 6;int y_5  = y + 7;int y_6  = y + 8;
            	int x_0  = x + 1;int x_1  = x + 2;int x_2  = x - 1;int x_3  = x - 2;
            	int z_0  = z + 1;int z_1  = z + 2;int z_2  = z - 1;int z_3  = z - 2;
            	buildBlock(world, x, y + 1, z, BOPCBlocks.logs3, 2);
	            buildBlock(world, x, y_0, z, BOPCBlocks.logs3, 2);
	            buildBlock(world, x, y_1, z, BOPCBlocks.logs3, 2);
	            buildBlock(world, x, y_2, z, BOPCBlocks.logs3, 2);
	            buildBlock(world, x, y_3, z, BOPCBlocks.logs3, 2);
	            buildBlock(world, x, y_4, z, BOPCBlocks.logs3, 2);
	            buildBlock(world, x, y_5, z, BOPCBlocks.logs3, 2);
	            buildBlock(world, x, y_6, z, BOPCBlocks.logs3, 2);
	            buildBlock(world, x, y + 9, z, BOPCBlocks.logs3, 2);
	            
	            buildBlock(world, x, y_1, z_2, BOPCBlocks.logs3, 10);
	            buildBlock(world, x, y_1, z_3, BOPCBlocks.logs3, 10);
	            buildBlock(world, x, y_2, z_2, BOPCBlocks.logs3, 10);
	            buildBlock(world, x, y_3, z_3, BOPCBlocks.logs3, 10);
	            buildBlock(world, x, y_3, z - 3, BOPCBlocks.logs3, 10);
	            buildBlock(world, x, y_5, z_2, BOPCBlocks.logs3, 10);
	            buildBlock(world, x, y_5, z_3, BOPCBlocks.logs3, 10);
	            
	            buildBlock(world, x, y_0, z_0, BOPCBlocks.logs3, 10);
	            buildBlock(world, x, y_2, z_1, BOPCBlocks.logs3, 10);
	            buildBlock(world, x, y_2, z_0, BOPCBlocks.logs3, 10);
	            buildBlock(world, x, y_4, z_0, BOPCBlocks.logs3, 2);
	            buildBlock(world, x, y_5, z_0, BOPCBlocks.logs3, 2);
	            buildBlock(world, x, y_6, z_1, BOPCBlocks.logs3, 10);
	            
	            buildBlock(world, x_0, y_1, z, BOPCBlocks.logs3, 6);
	            buildBlock(world, x_1, y_1, z, BOPCBlocks.logs3, 6);
	            buildBlock(world, x_0, y_3, z, BOPCBlocks.logs3, 6);
	            buildBlock(world, x_1, y_4, z, BOPCBlocks.logs3, 6);
	            buildBlock(world, x + 3, y_4, z, BOPCBlocks.logs3, 6);
	            buildBlock(world, x_0, y_6, z, BOPCBlocks.logs3, 6);
	            
	            buildBlock(world, x_2, y_1, z, BOPCBlocks.logs3, 2);
	            buildBlock(world, x_3, y_2, z, BOPCBlocks.logs3, 6);
	            buildBlock(world, x_2, y_4, z, BOPCBlocks.logs3, 2);
	            buildBlock(world, x_3, y_5, z, BOPCBlocks.logs3, 6);
            }
            else
            {
            	int y_0  = y + 2;int y_1  = y + 3;int y_2  = y + 4;int y_3  = y + 5;int y_4  = y + 6;int y_5  = y + 7;int y_6  = y + 8;
            	int x_0  = x + 1;int x_1  = x + 2;int x_2  = x - 1;int x_3  = x - 2;
            	int z_0  = z + 1;int z_1  = z + 2;int z_2  = z - 1;int z_3  = z - 2;
            	buildBlock(world, x, y + 1, z, BOPCBlocks.logs3, 2);
	            buildBlock(world, x, y_0, z, BOPCBlocks.logs3, 2);
	            buildBlock(world, x, y_1, z, BOPCBlocks.logs3, 2);
	            buildBlock(world, x, y_2, z, BOPCBlocks.logs3, 2);
	            buildBlock(world, x, y_3, z, BOPCBlocks.logs3, 2);
	            buildBlock(world, x, y_4, z, BOPCBlocks.logs3, 2);
	            buildBlock(world, x, y_5, z, BOPCBlocks.logs3, 2);
	            buildBlock(world, x, y_6, z, BOPCBlocks.logs3, 2);
	            buildBlock(world, x, y + 9, z, BOPCBlocks.logs3, 2);
	            
	            buildBlock(world, x_2, y_1, z, BOPCBlocks.logs3, 6);
	            buildBlock(world, x_3, y_1, z, BOPCBlocks.logs3, 6);
	            buildBlock(world, x_2, y_2, z, BOPCBlocks.logs3, 6);
	            buildBlock(world, x_3, y_3, z, BOPCBlocks.logs3, 6);
	            buildBlock(world, x - 3, y_3, z, BOPCBlocks.logs3, 6);
	            buildBlock(world, x_2, y_5, z, BOPCBlocks.logs3, 6);
	            buildBlock(world, x_3, y_5, z, BOPCBlocks.logs3, 6);
	            
	            buildBlock(world, x_0, y_0, z, BOPCBlocks.logs3, 6);
	            buildBlock(world, x_1, y_2, z, BOPCBlocks.logs3, 6);
	            buildBlock(world, x_0, y_2, z, BOPCBlocks.logs3, 6);
	            buildBlock(world, x_0, y_4, z, BOPCBlocks.logs3, 2);
	            buildBlock(world, x_0, y_5, z, BOPCBlocks.logs3, 2);
	            buildBlock(world, x_1, y_6, z, BOPCBlocks.logs3, 6);
	            
	            buildBlock(world, x, y_1, z_2, BOPCBlocks.logs3, 10);
	            buildBlock(world, x, y_1, z_3, BOPCBlocks.logs3, 10);
	            buildBlock(world, x, y_3, z_2, BOPCBlocks.logs3, 10);
	            buildBlock(world, x, y_4, z_3, BOPCBlocks.logs3, 10);
	            buildBlock(world, x, y_4, z - 3, BOPCBlocks.logs3, 10);
	            buildBlock(world, x, y_6, z_2, BOPCBlocks.logs3, 10);
	            
	            buildBlock(world, x, y_1, z_0, BOPCBlocks.logs3, 2);
	            buildBlock(world, x, y_2, z_1, BOPCBlocks.logs3, 10);
	            buildBlock(world, x, y_4, z_0, BOPCBlocks.logs3, 2);
	            buildBlock(world, x, y_5, z_1, BOPCBlocks.logs3, 10);
            }
            
            return true;
        }
    }

    public void buildBlock(World world, int x, int y, int z, Block block, int meta)
    {
    	if (world.isAirBlock(x, y, z) || world.getBlock(x, y, z).isLeaves(world, x, y, z))
		{
    		world.setBlock(x, y, z, block, meta, 2);
		}
    }
}
