package ch.tutteli.atrium.api.fluent.en_GB

import ch.tutteli.atrium.creating.Expect
import ch.tutteli.atrium.domain.builders.ExpectImpl

/**
 * Expects that the subject of the assertion (an [Iterator]) has at least one element.
 *
 * @return an [Expect] for the current subject of the assertion.
 * @throws AssertionError Might throw an [AssertionError] if the assertion made is not correct.
 *
 * @since 0.13.0
 */
fun <E, T : Iterator<E>> Expect<T>.hasNext() = addAssertion(ExpectImpl.iterator.hasNext(this))

/**
 * Expects that the subject of the assertion (an [Iterator]) does not have a next element.
 *
 * @return an [Expect] for the current subject of the assertion.
 * @throws AssertionError Might throw an [AssertionError] if the assertion made is not correct.
 *
 * @since 0.13.0
 */
fun <E, T : Iterator<E>> Expect<T>.hasNotNext() = addAssertion(ExpectImpl.iterator.hasNotNext(this))
