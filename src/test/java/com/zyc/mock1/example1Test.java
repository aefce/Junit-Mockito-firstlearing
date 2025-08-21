package com.zyc.mock1;

import org.junit.jupiter.api.*;

import org.mockito.Mock;
import org.mockito.Mockito;

import org.mockito.MockitoAnnotations;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;
import org.junit.jupiter.api.extension.ExtendWith;

import java.util.Random;


import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

/**
 * 这是一个使用Mockito进行模拟测试的范例。
 */
// 6. 在测试类别上，加上这个“启动器”注解，激活Mockito
@ExtendWith(MockitoExtension.class)
@DisplayName("Mockito 基础功能测试")
class example1Test {

    @Spy
    private example1 var1;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    @DisplayName("测试一个被Mock的Random物件")
    void add() {
//        when(var1.add(1,2)).thenReturn(3);
//        int result = var1.add(1, 2);
//        Assertions.assertEquals(3,result);
//        when(var1.add(1,1)).thenThrow(new RuntimeException());
//        var1.add(1,1);

        when(var1.add(1,1)).thenCallRealMethod();
        Assertions.assertEquals(2, var1.add(1, 1));
    }

    @AfterEach
    void tearDown() {
        System.out.println("每个测试方法执行后都会调用这个方法");
    }
}