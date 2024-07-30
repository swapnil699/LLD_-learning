package com.shoppingcart.lld.Practice.factory;

import com.shoppingcart.lld.Practice.factory.componet.*;

public class AndoridFactory implements UIFactory {
    @Override
    public Button CreateButton() {
        return new AndroidButton();
    }

    @Override
    public Dropdown CreateDropdown() {
        return new AndroidDropdown();
    }

    @Override
    public Menu CreateMenu() {
        return new AndroidMenu();
    }
}
