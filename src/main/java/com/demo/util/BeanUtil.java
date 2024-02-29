package com.demo.util;

import org.springframework.cglib.beans.BeanCopier;

public class BeanUtil {

    /**
     * 使用BeanCopier进行拷贝
     */
    public static void copy(Object source, Object target) {
        BeanCopier copier = BeanCopier.create(source.getClass(), target.getClass(), false);
        copier.copy(source, target, null);
    }

}
