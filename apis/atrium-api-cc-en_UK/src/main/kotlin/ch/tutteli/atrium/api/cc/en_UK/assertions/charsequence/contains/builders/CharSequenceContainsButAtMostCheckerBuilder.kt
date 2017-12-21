package ch.tutteli.atrium.api.cc.en_UK.assertions.charsequence.contains.builders

import ch.tutteli.atrium.api.cc.en_UK.*
import ch.tutteli.atrium.assertions.charsequence.contains.CharSequenceContains.SearchBehaviour
import ch.tutteli.atrium.assertions.charsequence.contains.builders.CharSequenceContainsBuilder
import ch.tutteli.atrium.assertions.charsequence.contains.builders.CharSequenceContainsButAtMostCheckerBuilderBase

/**
 * Represents the builder of the second step of a `contains at least but at most` check within the
 * fluent API of a sophisticated `contains` assertion for [CharSequence].
 *
 * @param T The input type of the search.
 * @param S The search behaviour which should be applied to the input of the search.
 *
 * @constructor Represents the builder of the second step of a `contains at least but at most` check within the
 *              fluent API of a sophisticated `contains` assertion for [CharSequence].
 * @param times The number which the check will compare against the actual number of times an expected object is
 *              found in the input of the search.
 * @param containsBuilder The previously used [CharSequenceContainsBuilder].
 */
open class CharSequenceContainsButAtMostCheckerBuilder<T : CharSequence, S : SearchBehaviour>(
    times: Int,
    atLeastBuilder: CharSequenceContainsAtLeastCheckerBuilder<T, S>,
    containsBuilder: CharSequenceContainsBuilder<T, S>
) : CharSequenceContainsButAtMostCheckerBuilderBase<T, S>(
    times,
    atLeastBuilder,
    containsBuilder,
    containsBuilder.plant::containsNot.name,
    { l, u -> "${containsBuilder::atLeast.name}($l).${atLeastBuilder::butAtMost.name}($u)" },
    { "${containsBuilder::atMost.name}($it)" },
    { "${containsBuilder::atLeast.name}($it)" },
    { "${atLeastBuilder::butAtMost.name}($it)" },
    { "${containsBuilder::exactly.name}($it)" }
)
