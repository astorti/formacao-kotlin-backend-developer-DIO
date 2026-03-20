open class Saudacao {
    open fun sayHello() {
        println("Hello")
    }
}

class BomDia : Saudacao() {
    override fun sayHello() {
        println("Bom dia!")
    }
}

class BoaTarde : Saudacao() {
    override fun sayHello() {
        println("Boa tarde!")
    }
}

class BoaNoite : Saudacao() {
    override fun sayHello() {
        println("Boa noite!")
    }
}

fun main() {
    val hello = Saudacao()
    hello.sayHello()
    
    val bomDia: Saudacao = BomDia()
    val boaTarde: Saudacao = BoaTarde()
    val boaNoite: Saudacao = BoaNoite()
    
    bomDia.sayHello()
    boaTarde.sayHello()
    boaNoite.sayHello()
}