package test

import org.junit.Test


class TestSerialization {

    @Test
    fun success() {
        SomeClass.serializerModule
        val someClass = SomeClass.SomeClass1(a = 1)
        val someClass2 = SomeClass.SomeClass2(a = 1, b = 2)
    }

    @Test
    fun error() {
        val someClass = SomeClass.SomeClass1(a = 1)
        val someClass2 = SomeClass.SomeClass2(a = 1, b = 2)
    }
}