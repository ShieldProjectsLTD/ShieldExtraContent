package net.shieldprojects.shieldextracontent.utils;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class Vec2Codec {
    private final float x;
    private final float y;

    public Vec2Codec(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    // Реализация методов equals и hashCode
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Vec2Codec that = (Vec2Codec) obj;
        return Float.compare(that.x, x) == 0 && Float.compare(that.y, y) == 0;
    }

    @Override
    public int hashCode() {
        return Float.hashCode(x) * 31 + Float.hashCode(y);
    }

    // Создание Codec для сериализации
    public static final Codec<Vec2Codec> CODEC = RecordCodecBuilder.create(instance ->
            instance.group(
                    Codec.FLOAT.fieldOf("x").forGetter(Vec2Codec::getX),
                    Codec.FLOAT.fieldOf("y").forGetter(Vec2Codec::getY)
            ).apply(instance, Vec2Codec::new)
    );
}