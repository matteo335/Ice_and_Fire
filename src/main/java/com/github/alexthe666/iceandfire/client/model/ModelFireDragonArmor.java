package com.github.alexthe666.iceandfire.client.model;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityArmorStand;
import net.minecraft.client.model.ModelBase;

public class ModelFireDragonArmor extends ModelBiped {
    public ModelRenderer HornL;
    public ModelRenderer HornR;
    public ModelRenderer HornL3;
    public ModelRenderer HornR3;
    public ModelRenderer HeadFront;
    public ModelRenderer Jaw;
    public ModelRenderer HornL2;
    public ModelRenderer HornR2;
    public ModelRenderer Teeth1;
    public ModelRenderer Teeth2;
    public ModelRenderer RightShoulderSpike1;
    public ModelRenderer RightShoulderSpike2;
    public ModelRenderer LeftLegSpike;
    public ModelRenderer LeftLegSpike2;
    public ModelRenderer LeftLegSpike3;
    public ModelRenderer BackSpike1;
    public ModelRenderer BackSpike2;
    public ModelRenderer BackSpike3;
    public ModelRenderer LeftShoulderSpike1;
    public ModelRenderer LeftShoulderSpike2;
    public ModelRenderer RightLegSpike;
    public ModelRenderer RightLegSpike2;
    public ModelRenderer RightLegSpike3;

    public ModelFireDragonArmor(float modelSize, boolean legs) {
        super(modelSize, 0, 64, 64);
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.RightLegSpike3 = new ModelRenderer(this, 0, 34);
        this.RightLegSpike3.setRotationPoint(-0.8F, 0.0F, -0.8F);
        this.RightLegSpike3.addBox(-0.5F, 0.0F, 0.0F, 1, 3, 1, 0.0F);
        this.setRotateAngle(RightLegSpike3, -1.2217304763960306F, 1.2217304763960306F, -0.17453292519943295F);
        this.LeftShoulderSpike2 = new ModelRenderer(this, 0, 34);
        this.LeftShoulderSpike2.setRotationPoint(1.8F, -0.1F, 0.0F);
        this.LeftShoulderSpike2.addBox(-0.5F, 0.0F, -0.5F, 1, 3, 1, 0.0F);
        this.setRotateAngle(LeftShoulderSpike2, -3.141592653589793F, 0.0F, 0.2617993877991494F);
        this.HornL2 = new ModelRenderer(this, 46, 36);
        this.HornL2.mirror = true;
        this.HornL2.setRotationPoint(0.0F, 0.3F, 4.5F);
        this.HornL2.addBox(-0.5F, -0.8F, -0.0F, 1, 2, 5, 0.0F);
        this.setRotateAngle(HornL2, -0.07504915783575616F, 0.0F, 0.0F);
        this.RightLegSpike = new ModelRenderer(this, 0, 34);
        this.RightLegSpike.setRotationPoint(0.0F, 5.0F, 0.4F);
        this.RightLegSpike.addBox(-0.5F, 0.0F, 0.0F, 1, 3, 1, 0.0F);
        this.setRotateAngle(RightLegSpike, -1.4114477660878142F, 0.0F, 0.0F);
        this.HeadFront = new ModelRenderer(this, 6, 44);
        this.HeadFront.setRotationPoint(0.0F, -5.6F, 0.0F);
        this.HeadFront.addBox(-3.5F, -2.8F, -8.8F, 7, 2, 5, 0.0F);
        this.setRotateAngle(HeadFront, 0.045553093477052F, -0.0F, 0.0F);
        this.HornL3 = new ModelRenderer(this, 46, 36);
        this.HornL3.mirror = true;
        this.HornL3.setRotationPoint(4.0F, -4.0F, 0.7F);
        this.HornL3.addBox(-0.5F, -0.8F, -0.0F, 1, 2, 5, 0.0F);
        this.setRotateAngle(HornL3, -0.06981317007977318F, 0.4886921905584123F, 0.08726646259971647F);
        this.LeftLegSpike = new ModelRenderer(this, 0, 34);
        this.LeftLegSpike.setRotationPoint(0.0F, 5.0F, 0.4F);
        this.LeftLegSpike.addBox(-0.5F, 0.0F, 0.0F, 1, 3, 1, 0.0F);
        this.setRotateAngle(LeftLegSpike, -1.4114477660878142F, 0.0F, 0.0F);
        this.RightShoulderSpike1 = new ModelRenderer(this, 0, 34);
        this.RightShoulderSpike1.setRotationPoint(-0.5F, -1.2F, 0.0F);
        this.RightShoulderSpike1.addBox(-0.5F, 0.0F, -0.5F, 1, 3, 1, 0.0F);
        this.setRotateAngle(RightShoulderSpike1, -3.141592653589793F, 0.0F, -0.17453292519943295F);
        this.HornL = new ModelRenderer(this, 48, 44);
        this.HornL.mirror = true;
        this.HornL.setRotationPoint(3.6F, -8.0F, 1.0F);
        this.HornL.addBox(-1.0F, -0.5F, 0.0F, 2, 3, 5, 0.0F);
        this.setRotateAngle(HornL, 0.3141592653589793F, 0.33161255787892263F, 0.19198621771937624F);
        this.HornR = new ModelRenderer(this, 48, 44);
        this.HornR.setRotationPoint(-3.6F, -8.0F, 1.0F);
        this.HornR.addBox(-1.0F, -0.5F, 0.0F, 2, 3, 5, 0.0F);
        this.setRotateAngle(HornR, 0.3141592653589793F, -0.33161255787892263F, -0.19198621771937624F);
        this.RightShoulderSpike2 = new ModelRenderer(this, 0, 34);
        this.RightShoulderSpike2.setRotationPoint(-1.8F, -0.1F, 0.0F);
        this.RightShoulderSpike2.addBox(-0.5F, 0.0F, -0.5F, 1, 3, 1, 0.0F);
        this.setRotateAngle(RightShoulderSpike2, -3.141592653589793F, 0.0F, -0.2617993877991494F);
        this.Teeth2 = new ModelRenderer(this, 6, 34);
        this.Teeth2.mirror = true;
        this.Teeth2.setRotationPoint(0.0F, -1.0F, 0.0F);
        this.Teeth2.addBox(-0.4F, 0.1F, -8.9F, 4, 1, 5, 0.0F);
        this.HornR3 = new ModelRenderer(this, 46, 36);
        this.HornR3.mirror = true;
        this.HornR3.setRotationPoint(-4.0F, -4.0F, 0.7F);
        this.HornR3.addBox(-0.5F, -0.8F, -0.0F, 1, 2, 5, 0.0F);
        this.setRotateAngle(HornR3, -0.06981317007977318F, -0.4886921905584123F, -0.08726646259971647F);
        this.BackSpike2 = new ModelRenderer(this, 0, 34);
        this.BackSpike2.setRotationPoint(0.0F, 3.5F, 0.6F);
        this.BackSpike2.addBox(-0.5F, 0.0F, -0.5F, 1, 3, 1, 0.0F);
        this.setRotateAngle(BackSpike2, 1.1838568316277536F, 0.0F, 0.0F);
        this.LeftLegSpike2 = new ModelRenderer(this, 0, 34);
        this.LeftLegSpike2.setRotationPoint(0.7F, 3.6F, -0.4F);
        this.LeftLegSpike2.addBox(-0.5F, 0.0F, 0.0F, 1, 3, 1, 0.0F);
        this.setRotateAngle(LeftLegSpike2, -1.4114477660878142F, 0.0F, 0.0F);
        this.BackSpike1 = new ModelRenderer(this, 0, 34);
        this.BackSpike1.setRotationPoint(0.0F, 0.9F, 0.2F);
        this.BackSpike1.addBox(-0.5F, 0.0F, -0.5F, 1, 3, 1, 0.0F);
        this.setRotateAngle(BackSpike1, 1.1838568316277536F, 0.0F, 0.0F);
        this.RightLegSpike2 = new ModelRenderer(this, 0, 34);
        this.RightLegSpike2.setRotationPoint(-0.7F, 3.6F, -0.4F);
        this.RightLegSpike2.addBox(-0.5F, 0.0F, 0.0F, 1, 3, 1, 0.0F);
        this.setRotateAngle(RightLegSpike2, -1.4114477660878142F, 0.0F, 0.0F);
        this.BackSpike3 = new ModelRenderer(this, 0, 34);
        this.BackSpike3.setRotationPoint(0.0F, 6.4F, 0.0F);
        this.BackSpike3.addBox(-0.5F, 0.0F, -0.5F, 1, 3, 1, 0.0F);
        this.setRotateAngle(BackSpike3, 1.1838568316277536F, 0.0F, 0.0F);
        this.LeftShoulderSpike1 = new ModelRenderer(this, 0, 34);
        this.LeftShoulderSpike1.setRotationPoint(0.5F, -1.2F, 0.0F);
        this.LeftShoulderSpike1.addBox(-0.5F, 0.0F, -0.5F, 1, 3, 1, 0.0F);
        this.setRotateAngle(LeftShoulderSpike1, -3.141592653589793F, 0.0F, 0.17453292519943295F);
        this.Jaw = new ModelRenderer(this, 6, 51);
        this.Jaw.setRotationPoint(0.0F, -5.4F, 0.0F);
        this.Jaw.addBox(-3.5F, 4.0F, -7.4F, 7, 2, 5, 0.0F);
        this.setRotateAngle(Jaw, -0.091106186954104F, -0.0F, 0.0F);
        this.LeftLegSpike3 = new ModelRenderer(this, 0, 34);
        this.LeftLegSpike3.setRotationPoint(0.8F, -0.0F, -0.8F);
        this.LeftLegSpike3.addBox(-0.5F, 0.0F, 0.0F, 1, 3, 1, 0.0F);
        this.setRotateAngle(LeftLegSpike3, -1.2217304763960306F, -1.2217304763960306F, 0.17453292519943295F);
        this.HornR2 = new ModelRenderer(this, 46, 36);
        this.HornR2.mirror = true;
        this.HornR2.setRotationPoint(0.0F, 0.3F, 4.5F);
        this.HornR2.addBox(-0.5F, -0.8F, -0.0F, 1, 2, 5, 0.0F);
        this.setRotateAngle(HornR2, -0.07504915783575616F, 0.0F, 0.0F);
        this.Teeth1 = new ModelRenderer(this, 6, 34);
        this.Teeth1.setRotationPoint(0.0F, -1.0F, 0.0F);
        this.Teeth1.addBox(-3.6F, 0.1F, -8.9F, 4, 1, 5, 0.0F);
        if (legs) {
            this.bipedLeftLeg.addChild(this.LeftLegSpike3);
            this.bipedLeftLeg.addChild(this.LeftLegSpike2);
            this.bipedLeftLeg.addChild(this.LeftLegSpike);
            this.bipedRightLeg.addChild(this.RightLegSpike3);
            this.bipedRightLeg.addChild(this.RightLegSpike2);
            this.bipedRightLeg.addChild(this.RightLegSpike);
        } else {
            this.bipedLeftArm.addChild(this.LeftShoulderSpike2);
            this.HornL.addChild(this.HornL2);
            this.bipedHead.addChild(this.HeadFront);
            this.bipedHead.addChild(this.HornL3);
            this.bipedRightArm.addChild(this.RightShoulderSpike1);
            this.bipedHead.addChild(this.HornL);
            this.bipedHead.addChild(this.HornR);
            this.bipedRightArm.addChild(this.RightShoulderSpike2);
            this.HeadFront.addChild(this.Teeth2);
            this.bipedHead.addChild(this.HornR3);
            this.bipedBody.addChild(this.BackSpike2);
            this.bipedBody.addChild(this.BackSpike1);
            this.bipedBody.addChild(this.BackSpike3);
            this.bipedLeftArm.addChild(this.LeftShoulderSpike1);
            this.bipedHead.addChild(this.Jaw);
            this.HornR.addChild(this.HornR2);
            this.HeadFront.addChild(this.Teeth1);
        }
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

    public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor, Entity entityIn) {
        if (entityIn instanceof EntityArmorStand) {
            EntityArmorStand entityarmorstand = (EntityArmorStand) entityIn;
            this.bipedHead.rotateAngleX = 0.017453292F * entityarmorstand.getHeadRotation().getX();
            this.bipedHead.rotateAngleY = 0.017453292F * entityarmorstand.getHeadRotation().getY();
            this.bipedHead.rotateAngleZ = 0.017453292F * entityarmorstand.getHeadRotation().getZ();
            this.bipedHead.setRotationPoint(0.0F, 1.0F, 0.0F);
            this.bipedBody.rotateAngleX = 0.017453292F * entityarmorstand.getBodyRotation().getX();
            this.bipedBody.rotateAngleY = 0.017453292F * entityarmorstand.getBodyRotation().getY();
            this.bipedBody.rotateAngleZ = 0.017453292F * entityarmorstand.getBodyRotation().getZ();
            this.bipedLeftArm.rotateAngleX = 0.017453292F * entityarmorstand.getLeftArmRotation().getX();
            this.bipedLeftArm.rotateAngleY = 0.017453292F * entityarmorstand.getLeftArmRotation().getY();
            this.bipedLeftArm.rotateAngleZ = 0.017453292F * entityarmorstand.getLeftArmRotation().getZ();
            this.bipedRightArm.rotateAngleX = 0.017453292F * entityarmorstand.getRightArmRotation().getX();
            this.bipedRightArm.rotateAngleY = 0.017453292F * entityarmorstand.getRightArmRotation().getY();
            this.bipedRightArm.rotateAngleZ = 0.017453292F * entityarmorstand.getRightArmRotation().getZ();
            this.bipedLeftLeg.rotateAngleX = 0.017453292F * entityarmorstand.getLeftLegRotation().getX();
            this.bipedLeftLeg.rotateAngleY = 0.017453292F * entityarmorstand.getLeftLegRotation().getY();
            this.bipedLeftLeg.rotateAngleZ = 0.017453292F * entityarmorstand.getLeftLegRotation().getZ();
            this.bipedLeftLeg.setRotationPoint(1.9F, 11.0F, 0.0F);
            this.bipedRightLeg.rotateAngleX = 0.017453292F * entityarmorstand.getRightLegRotation().getX();
            this.bipedRightLeg.rotateAngleY = 0.017453292F * entityarmorstand.getRightLegRotation().getY();
            this.bipedRightLeg.rotateAngleZ = 0.017453292F * entityarmorstand.getRightLegRotation().getZ();
            this.bipedRightLeg.setRotationPoint(-1.9F, 11.0F, 0.0F);
            copyModelAngles(this.bipedHead, this.bipedHeadwear);
        } else {
            super.setRotationAngles(limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scaleFactor, entityIn);
        }
    }
}
