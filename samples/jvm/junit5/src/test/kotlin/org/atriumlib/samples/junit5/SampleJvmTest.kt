package org.atriumlib.samples.junit5

import ch.tutteli.atrium.api.fluent.en_GB.*
import ch.tutteli.atrium.api.verbs.expect
import ch.tutteli.atrium.creating.Expect
import ch.tutteli.atrium.reporting.RawString
import ch.tutteli.atrium.translations.DescriptionBasic.IS
import org.junit.jupiter.api.Test

class SampleJvmTest {
    @Test
    fun toBe() {
        expect(1).toBe(1)
    }

    @Test
    fun expectAnExceptionOccurred() {
        expect {
            throw IllegalArgumentException()
        }.toThrow<IllegalArgumentException>()
    }


    @Test
    fun expectAnExceptionWithAMessageOccurred() {
        expect {
            throw IllegalArgumentException("oho... hello btw")
        }.toThrow<IllegalArgumentException> {
            messageContains("hello")
        }
    }

    @Test
    fun useOwnFunction() {
        expect(2).isEven()
    }
}

fun Expect<Int>.isEven() = createAndAddAssertion(IS, RawString.create("an even number")) { it % 2 == 0 }
