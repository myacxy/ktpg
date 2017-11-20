package net.myacxy.ktpg.interop;

import java.util.List;

public interface CustomerRepository {

    CustomerJava getById(int id);

    List<CustomerJava> getAll();
}
