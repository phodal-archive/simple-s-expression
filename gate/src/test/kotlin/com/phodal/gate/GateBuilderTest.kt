package com.phodal.gate

import org.junit.jupiter.api.Test

internal class GateBuilderTest {
    @Test
    internal fun should_have_a_simple_query() {
        query {

        }.build()
    }
}