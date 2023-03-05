package ewo.haoooo.iceage.entity;

import ewo.haoooo.iceage.IceAge;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;

public class EntityIceBall extends EntityThrowable {
    public static final String ID = "ice_ball";
    public static final String NAME = IceAge.MODID + ".IceBall";

    public EntityIceBall(World worldIn){
        super(worldIn);
    }
    //问题很大，打生物自己受伤
    public EntityIceBall(World worldIn, EntityLivingBase throwerIn) {
        super(worldIn, throwerIn);
    }
    @Override
    protected void onImpact(RayTraceResult result){
        if (!this.world.isRemote){
            if (result.entityHit != null){
                float amount = 4.0F;
                DamageSource source = DamageSource.causeThrownDamage(this, this.getThrower());
                result.entityHit.attackEntityFrom(source, amount);
            }
            this.setDead();
        }
    }

}
