package com.github.nik9000.expiremental.highlighter.hit;

import com.github.nik9000.expiremental.highlighter.HitEnum;

/**
 * Simple base class that can be extended to delegate all behavior to another
 * HitEnum.
 */
public abstract class AbstractHitEnumWrapper implements HitEnum {
    private final HitEnum wrapped;

    public AbstractHitEnumWrapper(HitEnum wrapped) {
        this.wrapped = wrapped;
    }

    protected HitEnum wrapped() {
        return wrapped;
    }

    @Override
    public boolean next() {
        return wrapped.next();
    }

    @Override
    public int position() {
        return wrapped.position();
    }

    @Override
    public int startOffset() {
        return wrapped.startOffset();
    }

    @Override
    public int endOffset() {
        return wrapped.endOffset();
    }

    @Override
    public float weight() {
        return wrapped.weight();
    }
}