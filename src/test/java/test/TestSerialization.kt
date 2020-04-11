package test

import org.junit.Test


class TestSerialization {

    @Test
    fun case1() {
        SomeClass.Payload.serializerModule
        val someClass = SomeClass(
            id = "123",
            payload = SomeClass.Payload.Payload1(
                a = 1
            )
        )
        val someClass2 = SomeClass(
            id = "321",
            payload = SomeClass.Payload.Payload2(a = 1, b = 2)
        )
    }
}