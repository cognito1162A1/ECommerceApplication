package business.concretes;

import business.abstracts.CustomerService;
import business.utils.ReturnPolicy;
import dataAccess.repository.concretes.CustomerRepo;
import entity.order.Product;
import entity.user.Seller;
import entity.user.User;

import static business.concretes.DependencyManager.getFileOperationInstance;

public class CustomerManager implements CustomerService {
    private final ReturnPolicy returnPolicy;
    private final CustomerRepo customerRepo = new CustomerRepo(getFileOperationInstance());

    public CustomerManager(ReturnPolicy returnPolicy) {
        this.returnPolicy = returnPolicy;
    }


    @Override
    public void returnProduct(Product product) {

    }

    @Override
    public void enterCardInformation() {

    }

    @Override
    public void balanceOperations() {

    }

    @Override
    public void sendInformationToSeller(Product product) {

    }

    @Override
    public void getSuccessMessage() {

    }

    @Override
    public void checkItemIsAvailable(Product product) {

    }

    @Override
    public void forgotPassword(User user) {

    }

    @Override
    public void writeToDatabase(User user) {

    }

    @Override
    public boolean checkUserInfoFormat(User user) {
        return false;
    }

    @Override
    public boolean checkIsUserEmailAndPasswordAreCorrect(String email, String userEmail) {
        return false;
    }

    @Override
    public boolean checkIsEmailAlreadyExists(String email) {
        return false;
    }

    @Override
    public void verificationMessage() {

    }

    public void returnProductV2(Product product){
        returnPolicy.returnProduct(product);

    }
}
