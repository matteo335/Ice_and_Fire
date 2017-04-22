package com.github.alexthe666.iceandfire.entity.ai;

import com.github.alexthe666.iceandfire.entity.*;
import net.minecraft.entity.*;
import net.minecraft.entity.ai.*;

public class DragonMoveHelper extends EntityMoveHelper {

	public DragonMoveHelper (EntityLiving entitylivingIn) {
		super (entitylivingIn);
	}

	@Override
	public boolean isUpdating () {
		return this.action == EntityMoveHelper.Action.MOVE_TO || (this.entity instanceof EntityDragonBase && ((EntityDragonBase) this.entity).canMove ());
	}
}
