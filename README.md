### Mockito 學習
#### 目錄
#### 1.dependency & plugin
#### 2.涵式說明 & 範例
---
#### 1. dependency & plugin
#### <dependencies>
#### <!-- Mockito Core -->
#### <dependency>
#### <groupId>org.mockito</groupId>
#### <artifactId>mockito-inline</artifactId>
#### <version>4.3.1</version>
#### <scope>test</scope>
#### </dependency>
#### <!-- Mockito integration with JUnit 5 -->
#### <dependency>
#### <groupId>org.mockito</groupId>
#### <artifactId>mockito-junit-jupiter</artifactId>
#### <version>5.12.0</version>
#### <scope>test</scope>
#### </dependency>
#### > > <!-- JUnit 5 API & Engine -->
####        <dependency>
####            <groupId>org.junit.jupiter</groupId>
####            <artifactId>junit-jupiter-api</artifactId>
####            <version>5.10.2</version>
####            <scope>test</scope>
####        </dependency>
####        <dependency>
####            <groupId>org.junit.jupiter</groupId>
####            <artifactId>junit-jupiter-engine</artifactId>
####           <version>5.10.2</version>
####           <scope>test</scope>
####        </dependency> 
#### </dependencies>
---