package com.mmnaseri.cs.algorithm.clrs.ch5.s3;

import com.mmnaseri.cs.algorithm.common.Permuter;
import com.mmnaseri.cs.algorithm.common.Sampler;

import java.lang.reflect.Array;

/**
 * @author Mohammad Milad Naseri (m.m.naseri@gmail.com)
 * @since 1.0 (5/27/15, 12:33 AM)
 */
public class PermuterSampler<E> implements Sampler<E> {

    private final Permuter<E> permuter;

    public PermuterSampler(Permuter<E> permuter) {
        this.permuter = permuter;
    }

    @SuppressWarnings("unchecked")
    @Override
    public E[] sample(E[] array, int size) {
        final E[] result = (E[]) Array.newInstance(array.getClass().getComponentType(), size);
        final E[] permutation = (E[]) Array.newInstance(array.getClass().getComponentType(), array.length);
        permuter.permute(permutation);
        System.arraycopy(permutation, 0, result, 0, size);
        return result;
    }

}
