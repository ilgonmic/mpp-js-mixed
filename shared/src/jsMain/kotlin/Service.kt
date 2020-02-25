actual class Service {
    actual fun greet(): String {
        return "JavaScript"
    }
}

val a = CommonReferred()

@JsModule("jquery")
external class JQquery