package Customer;

import Collections.ArrayList;

public class CustomerUtil {

    ArrayList<Customer> list;

    public CustomerUtil() {
        list = new ArrayList(Customer.class);
    }

    public ArrayList<Customer> getCustomerList() {
        return list;
    }

    public ArrayList<Customer> addCustomer(int id, int currenBillAmount, int accumulatedBill, int phone, String name, String nationality) {

        list.add(new Customer(id, name));
        return list;
    }

    public ArrayList<Customer> deleteCustomer(Customer c) {
        list.delete(c);
        return list;
    }

    public void printCustomer() {
        list.printArrayList();
    }

    public void sortId() {
        list.heapSortId();
    }

    public void sortPhone() {
        list.heapSortPhone();
    }

    public void sortName() {
        list.heapSortName();
    }

    public ArrayList<Customer> serchId(int id) {
        list.heapSortId();
        return list.searchId(id);
    }

    public ArrayList<Customer> serchPhone(int phone) {
        list.heapSortPhone();
        return list.searchPhone(phone);
    }
}
