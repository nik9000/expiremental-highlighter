package com.github.nik9000.expiremental.highlighter.hit.weight;

import java.util.Map;

import com.github.nik9000.expiremental.highlighter.hit.TermWeigher;

/**
 * Simple TermHitWeigher that weighs terms that are equal to provided examples.
 */
public class ExactMatchTermWeigher<T> implements TermWeigher<T> {
    private final Map<T, Float> exactMatches;
    private final float defaultWeight;

    public ExactMatchTermWeigher(Map<T, Float> exactMatches, float defaultWeight) {
        this.exactMatches = exactMatches;
        this.defaultWeight = defaultWeight;
    }

    @Override
    public float weigh(T term) {
        Float weight = exactMatches.get(term);
        if (weight == null) {
            return defaultWeight;
        }
        return weight;
    }
}
