package com.soumen.solid.srp.solutions;

//A separate class for handling persistence
public class UserPersistenceService {

    private Store store = new Store();

    // saves the user
    public void saveUser(User user){
        store.store(user);
    }

}
