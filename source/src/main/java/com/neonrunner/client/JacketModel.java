package com.neonrunner.client;

import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.world.entity.LivingEntity;

/**
 * Тонкая модель куртки: облегает тело, как внешний слой скина,
 * а не раздувается коробкой, как обычная броня.
 */
public final class JacketModel {
    private static HumanoidModel<LivingEntity> model;

    private JacketModel() {}

    public static HumanoidModel<LivingEntity> get() {
        if (model == null) {
            model = new HumanoidModel<>(LayerDefinition.create(
                    HumanoidModel.createMesh(new CubeDeformation(0.32F), 0.0F), 64, 32).bakeRoot());
        }
        return model;
    }
}
