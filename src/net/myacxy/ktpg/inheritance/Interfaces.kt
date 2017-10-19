package net.myacxy.ktpg.inheritance

// can have default implementations
interface CustomerRepository {

    // cannot have state but can have custom getter & setter
    // val isEmpty: Boolean = true
    val isEmpty: Boolean
        get() = true

    fun getById(id: Int): Customer

    fun store(customer: Customer) {
        // default implementation
    }
}

class CustomerRepositoryImpl : CustomerRepository {

    override val isEmpty: Boolean
        get() = false

    override fun getById(id: Int): Customer {
        return Customer(id.toString(), makeNameUpperCase = false)
    }

    override fun store(customer: Customer) {
        super.store(customer)
    }
}

interface InterfaceA {
    fun funA() {
        println("InterfaceA::funA")
    }
}

interface InterfaceB {
    fun funA() {
        println("InterfaceB::funA")
    }
}

class InterfaceABImpl : InterfaceA, InterfaceB {

    override fun funA() {
        // can call both
        super<InterfaceA>.funA()
        super<InterfaceB>.funA()
    }
}


fun main(args: Array<String>) {

    val customerRepository: CustomerRepository = CustomerRepositoryImpl()
}
