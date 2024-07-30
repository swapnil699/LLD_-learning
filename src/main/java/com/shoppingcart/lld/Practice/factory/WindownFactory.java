package com.shoppingcart.lld.Practice.factory;

import com.shoppingcart.lld.Practice.factory.componet.*;

public class WindownFactory implements UIFactory {
    @Override
    public Button CreateButton() {
        return new WindowsButton();
    }

    @Override
    public Dropdown CreateDropdown() {
        return new WindowsDropdown();
    }

    @Override
    public Menu CreateMenu() {
        return new WindowsMenu();
    }
}
