package com.phodal.gate

enum class CodeUnit() {
    Package,
    Module,
    Class,
    Resource,
    // no match
    None
}

fun unitFromString(str: String): CodeUnit {
    return when(str) {
        "package" -> CodeUnit.Package
        "class" -> CodeUnit.Class
        "module" -> CodeUnit.Module
        "resource" -> CodeUnit.Resource
        else -> CodeUnit.None
    }
}

public class GateBuilder {
    fun build(): String {
        return "build"
    }

    fun unit(typ: String) {
        unitFromString(typ)
    }
}

public fun query(initializer: GateBuilder.() -> Unit): GateBuilder {
    return GateBuilder().apply(initializer)
}


public fun unit(unitType: String, initializer: GateBuilder.() -> Unit): GateBuilder {
    return GateBuilder().apply(initializer)
}

