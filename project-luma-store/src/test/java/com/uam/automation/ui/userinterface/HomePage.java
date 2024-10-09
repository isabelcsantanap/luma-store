package com.uam.automation.ui.userinterface;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

@DefaultUrl("https://magento.softwaretestingboard.com/")
public class HomePage extends PageObject {

        public static Target SIGN_IN_OPTION = Target.the("login option").locatedBy("(//a[contains(text(),'Sign In')])[1]");
        public static Target EMAIL_FIELD = Target.the("email field").located(By.id("email"));
        public static Target PASSWORD_FIELD = Target.the("password field").located(By.id("pass"));
        public static Target SIGN_IN_BUTTON = Target.the("Sign In button").located(By.id("send2"));

        public static Target PRODUCT_OPTION = Target.the("product option").locatedBy("//a[@title='Radiant Tee' and @class='product-item-link']");
        public static Target PRODUCT_SIZE = Target.the("product size").locatedBy("//div[@id='option-label-size-143-item-168']");
        public static Target PRODUCT_COLOR = Target.the("product color").locatedBy("//div[@id='option-label-color-93-item-57']");
        public static Target PRODUCT_QUANTITY = Target.the("product quantity").locatedBy("//input[@id='qty']");
        public static Target ADD_TO_CART_BUTTON = Target.the("Add to Cart").located(By.id("product-addtocart-button"));
        public static Target SHOPPING_CART = Target.the("shopping cart").locatedBy("//span[@class='counter qty']/span[@class='counter-number']");
        public static Target PROCEED_TO_CHECKOUT_BUTTON = Target.the("Proceed to Checkout").located(By.id("top-cart-btn-checkout"));

        /*public static Target CUSTOMER_EMAIL_FIELD = Target.the("email field").located(org.openqa.selenium.By.id("customer-email"));
        public static Target CUSTOMER_PASSWORD_FIELD = Target.the("password field").located(org.openqa.selenium.By.id("customer-password"));
        public static Target CUSTOMER_LOGIN_BUTTON = Target.the("login button").located(By.id("customer-email-fieldset"));*/

        public static Target FIRST_NAME = Target.the("first name").located(By.id("LGJJVMM"));
        public static Target LAST_NAME = Target.the("last name").located(By.id("R2O6NFC"));
        public static Target COMPANY = Target.the("company").located(By.id("T8YRU9B"));
        public static Target STREET_ADDRESS = Target.the("street address").located(By.id("SSL287S"));
        public static Target CITY = Target.the("city").located(By.id("IT5K9RY"));
}
