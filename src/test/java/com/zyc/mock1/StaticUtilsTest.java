package com.zyc.mock1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;
import org.mockito.Mockito;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class StaticUtilsTest {
    @Test
    void range() {
        try(MockedStatic<StaticUtils> demo = Mockito.mockStatic(StaticUtils.class)) {
            demo.when(() -> StaticUtils.range(2, 6)).thenReturn(Arrays.asList(10, 11, 12));
            Assertions.assertTrue(StaticUtils.range(2, 6).contains(10));
        }
    }
    @Test
    void name() {
        try(MockedStatic<StaticUtils> demo = Mockito.mockStatic(StaticUtils.class)){
        demo.when(StaticUtils::name).thenReturn("mockedName");
        Assertions.assertEquals("mockedName", StaticUtils.name());
        }
    }
}