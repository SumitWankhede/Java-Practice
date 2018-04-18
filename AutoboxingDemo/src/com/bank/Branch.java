package com.bank;

import java.util.ArrayList;

/**
 * Created by Sumit on 04-Jul-17.
 */
public class Branch {
    private ArrayList<Customers> customers = new ArrayList<Customers>();
    private String branchName;

    public Branch(String branchName) {
        this.branchName = branchName;
    }

    public String getBranchName() {
        return branchName;
    }

}
