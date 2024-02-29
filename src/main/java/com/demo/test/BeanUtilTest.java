package com.demo.test;

import com.demo.entity.EntityA;
import com.demo.entity.EntityB;
import com.demo.util.BeanUtil;
import org.springframework.cglib.core.DebuggingClassWriter;

/**
 * @author YX
 * @datetime 2024-02-29 17:50
 */
public class BeanUtilTest {

    public static void main(String[] args) {

        // 开启debug模式,指定cglib生成类文件位置
        System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, "C:/Users/50320/Desktop/myClass");

        EntityA a = new EntityA();
        a.setName("a");
        a.setAge(23);
        EntityB b = new EntityB();
        BeanUtil.copy(a, b);
        System.out.println(b);
    }

}
