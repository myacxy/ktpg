package net.myacxy.ktpg.interop

fun main(args: Array<String>) {

    val customer = CustomerJava(1, "Lorem Ipsum", "lorem@ipsum.li")

    // use property access syntax
    println(customer.getEmail())
    println(customer.email)

    customer.prettyPrint()

    val runnable = Runnable { println("Invoking runnable") }

    val kcr = KotlinCustomerRepository()
    val customerJava = kcr.getById(10)
    // requires safe call
    val id = customerJava?.id

    // notice type "String"
    customerJava?.neverNull()
    // notice platform type "String!"
    customerJava?.sometimesNull()
}

class PersonKotlin : PersonJava() {

}

class KotlinCustomerRepository : CustomerRepository {
    override fun getById(id: Int): CustomerJava? {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getAll(): MutableList<CustomerJava>? {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}

// unnecessary
class RunnableKotlin : Runnable {
    override fun run() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}
