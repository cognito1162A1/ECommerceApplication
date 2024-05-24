package business.abstracts;

import business.abstracts.registration.UserService;
import entity.order.Product;
import entity.user.Seller;

public interface CustomerService extends UserService {

    default void buyProductById(Product product) {
        checkItemIsAvailable(product);
        enterCardInformation();
        balanceOperations();
        sendInformationToSeller(product);
        getSuccessMessage();
    }



    default void returnProduct(Product product) {
//        returnProductV2();TODO: implement method
        // write reason of returning
        // write seller of item
        // check is item returnable
        // seller send message
        // information
        // balance changing
    }


    void enterCardInformation();
    void balanceOperations();
    void sendInformationToSeller(Product product);
    void getSuccessMessage();
    void checkItemIsAvailable(Product product);
}
