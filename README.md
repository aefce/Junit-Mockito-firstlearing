### Mockito 學習
#### 目錄
#### 1.dependency & plugin
#### 2.涵式說明 & 範例
---
#### 1. dependency & plugin

    <dependencies>
    <!-- Mockito Core -->
        <dependency>
            <groupId>org.mockito</groupId>
            <artifactId>mockito-inline</artifactId>
             <version>4.3.1</version>
             <scope>test</scope>
        </dependency>
     <!-- Mockito integration with JUnit 5 -->
        <dependency>
             <groupId>org.mockito</groupId>
             <artifactId>mockito-junit-jupiter</artifactId>
             <version>5.12.0</version>
             <scope>test</scope>
        </dependency>
         <!-- JUnit 5 API & Engine -->
        <dependency>
            <groupId>org.junit.jupiter</groupId>
            <artifactId>junit-jupiter-api</artifactId>
            <version>5.10.2</version>
            <scope>test</scope>
        </dependency>
        <dependency>
            <groupId>org.junit.jupiter</groupId>
            <artifactId>junit-jupiter-engine</artifactId>
            <version>5.10.2</version>
            <scope>test</scope>
        </dependency> 
     </dependencies>
---
#### 2. 涵式說明 & 範例
##### 2.1. @Mock (打樁)
- 用於建立 mock 物件(假定類別)
- 透過 `MockitoAnnotations.openMocks(this)` 來初始化 mock 物件
##### 2.2 @Spy
- 用於建立 spy 物件(利用實際類別)
##### 2.3 when(...).thenReturn(...)
- 用於設定 mock 物件的行為
- 當呼叫 mock 物件的某個方法時，返回指定的值
- 例如：`when(mock.someMethod()).thenReturn(someValue);`
##### 2.4 when(...).thenThrow(...)
- 用於設定 mock 物件的行為
- 當呼叫 mock 物件的某個方法時，拋出指定的異常
- 例如：`when(mock.someMethod()).thenThrow(new SomeException());`
##### 2.5 when(...).thenCallRealMethod(...)
- 用於設定 mock 物件的行為
- 當呼叫 mock 物件的某個方法時，調用實際
- 例如：`when(mock.someMethod()).thenCallRealMethod();`
- 這通常用於 spy 物件
- 注意：這個方法只能在 spy 物件上使用，不能在 mock 物件上使用
##### 2.6 verify
- 用於驗證 mock 物件的方法是否被呼叫
- 例如：`verify(mock).someMethod();`
- 可以指定呼叫的次數，例如：`verify(mock, times(1)).someMethod();`
##### 3. Mockito static
- 用於 mock 靜態方法
- 需要使用 `mockito-inline` 依賴
- 例如：`mockStatic(SomeClass.class);`
- 注意：靜態方法的 mock 需要在測試類別中使用 `@ExtendWith(MockitoExtension.class)` 或 `MockitoAnnotations.openMocks(this)` 來初始化
- 靜態方法的 mock 需要在測試類別中使用 `try-with-resources` 語句來確保在測試結束後釋放資源
- 例如：
    try (MockedStatic<SomeClass> mockedStatic = mockStatic(SomeClass.class)) {
        mockedStatic.when(SomeClass::someStaticMethod).thenReturn(someValue);
    }
##### 4. Mockito spy
- 用於 spy 實例方法
- 需要使用 `mockito-inline` 依賴
- 例如：`spy(new SomeClass());`
- 注意：spy 物件會調用實際的方法，除非使用 `doReturn` 或 `doThrow` 來覆蓋行為
- 例如：
    SomeClass spy = spy(new SomeClass());
    doReturn(someValue).when(spy).someMethod();
---
