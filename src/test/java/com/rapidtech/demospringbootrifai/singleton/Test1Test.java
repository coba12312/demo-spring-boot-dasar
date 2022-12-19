package com.rapidtech.demospringbootrifai.singleton;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Test1Test {
    @Test
    void singleTest1() {
        Test1 test1 = Test1.getInstance();
        Test1 test2 = Test1.getInstance();

        Assertions.assertSame(test1, test2);
    }
}