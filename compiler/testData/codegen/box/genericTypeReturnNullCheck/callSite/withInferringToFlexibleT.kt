// !LANGUAGE: +GenerateNullChecksForGenericTypeReturningFunctions
// TARGET_BACKEND: JVM
// IGNORE_BACKEND: JVM_IR
// WITH_RUNTIME

// FILE: J.java
public class J<T> {
    public T bar() { return null; }
}

// FILE: K.kt
fun <T> foo(): T = null as T

fun <T> test() {
    var y = J<T>().bar()
    y = foo()
}

fun box(): String {
    test<String>()
    return "OK"
}
