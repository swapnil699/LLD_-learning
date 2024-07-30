package com.shoppingcart.lld.Practice.factory;

import com.shoppingcart.lld.Practice.factory.componet.Button;
import com.shoppingcart.lld.Practice.factory.componet.Dropdown;
import com.shoppingcart.lld.Practice.factory.componet.Menu;

public interface UIFactory {
    Button CreateButton();
    Dropdown CreateDropdown();
    Menu CreateMenu();
}
