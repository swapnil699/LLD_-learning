package com.shoppingcart.lld.Practice.factory;

import com.shoppingcart.lld.Practice.factory.componet.*;

public class IOSfactory implements UIFactory {
    @Override
    public Button CreateButton() {
        return new IOSButton();
    }

    @Override
    public Dropdown CreateDropdown() {
        return new IOSDropdown();
    }

    @Override
    public Menu CreateMenu() {
        return new IOSMenu();
    }
}
