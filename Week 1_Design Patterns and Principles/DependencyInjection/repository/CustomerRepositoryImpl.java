package repository;

public class CustomerRepositoryImpl implements CustomerRepository {

    @Override
    public String findCustomerById(int id) {
        // For demonstration purposes, returning a simple string.
        return "Customer with ID " + id + " is John Doe.";
    }
}
