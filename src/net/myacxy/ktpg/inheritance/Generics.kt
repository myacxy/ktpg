data class Customer(val id: Int)
data class Employee(val id: Int)

interface CustomerRepository {

    fun getById(id: Int): Customer

    fun store(customer: Customer) {
        // default implementation
    }
}

interface EmployeeRepository {

    fun getById(id: Int): Customer

    fun store(customer: Customer) {
        // default implementation
    }
}

interface Repository<T> {
    fun getById(id: Int): T
    fun getAll(): List<T>
}

open class GenericRepositoryImpl<T> : Repository<T> {
    override fun getById(id: Int): T {
        throw NotImplementedError()
    }

    override fun getAll(): List<T> {
        return emptyList()
    }
}

interface Repo {
    fun <T> getById(id: Int): T
    fun <T> getAll(): List<T>
}

fun main(args: Array<String>) {
    val customerRepository = GenericRepositoryImpl<Customer>()

}
