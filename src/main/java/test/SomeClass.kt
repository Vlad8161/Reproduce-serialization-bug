package test

import kotlinx.serialization.Polymorphic
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.modules.SerializersModule


@Polymorphic
@Serializable
sealed class SomeClass {

    @Serializable
    @SerialName("p1")
    data class SomeClass1(val a: Int) : SomeClass()

    @Serializable
    @SerialName("p2")
    data class SomeClass2(
        val a: Int,
        val b: Int
    ) : SomeClass()

    companion object {
        val serializerModule = SerializersModule {
            polymorphic(SomeClass::class) {
                SomeClass1::class with SomeClass1.serializer()
                SomeClass2::class with SomeClass2.serializer()
            }
        }
    }
}
