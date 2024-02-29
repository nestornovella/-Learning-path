package com.security.securityMain.util;

import java.util.Arrays;
import java.util.List;

public enum Role {
    CUSTOMER(Arrays.asList(Permission.READ_ALL_PRODUCTS)),
    ADMINISTRATOR(Arrays.asList(Permission.SAVE_ONE_PRODUCT, Permission.READ_ALL_PRODUCTS));


    private List<Permission> permission;

    Role(List<Permission> permission) {
        this.permission = permission;
    }
}
