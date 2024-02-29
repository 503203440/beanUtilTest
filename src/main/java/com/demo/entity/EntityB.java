package com.demo.entity;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author YX
 * @datetime 2024-02-29 17:51
 */
@Data
//@Accessors(chain = true)
public class EntityB {

    private String name;
    private Integer age;

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    /**
     * setter返回自身,方便链式调用
     *
     * @param name
     * @return
     */
    public EntityB setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * setter返回自身,方便链式调用
     *
     * @param age
     * @return
     */
    public EntityB setAge(Integer age) {
        this.age = age;
        return this;
    }
}
