package com.phodal.gate

public class GateBuilder {
    fun build(): String {
        return "build"
    }
}

public fun query(initializer: GateBuilder.() -> Unit): GateBuilder {
    return GateBuilder().apply(initializer)
}

