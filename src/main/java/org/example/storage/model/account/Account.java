package org.example.storage.model.account;

public abstract class Account {

    String userName;
    String password;

    //status : AccountStatus

    //person : Person

    abstract boolean resetPassword();
}
