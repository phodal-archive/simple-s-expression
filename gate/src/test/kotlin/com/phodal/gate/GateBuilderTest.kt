package com.phodal.gate

import org.junit.jupiter.api.Test
import javax.script.ScriptEngineManager

// docs: https://kotlinlang.org/docs/type-safe-builders.html
internal class GateBuilderTest {
    @Test
    internal fun should_have_a_simple_query() {
        query {
            unit("class")
        }.build()

        unit("sql") {

        }

        val engine = ScriptEngineManager().getEngineByExtension("kts")
        engine.eval("""print("hello")""")
    }
}