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

        public static Target FIRST_NAME = Target.the("firstname").located(By.name("firstname"));
        public static Target LAST_NAME = Target.the("lastname").located(By.name("lastname"));
        public static Target COMPANY = Target.the("company").located(By.name("company"));
        public static Target STREET_ADDRESS = Target.the("street address").located(By.name("street[0]"));
        public static Target CITY = Target.the("city").located(By.name("city"));
        public static Target STATE = Target.the("region_id").located(By.name("region_id"));
        public static Target POST_CODE = Target.the("postcode").located(By.name("postcode"));
        public static Target COUNTRY = Target.the("country").located(By.name("country_id"));
        public static Target TELEPHONE = Target.the("phone").located(By.name("telephone"));
        //CAMPOS HASTA TELEFONO DILIGENCIADOS CORRECTAMENTE
        public static Target METHOD = Target.the("method").located(By.name("ko_unique_1"));
        public static Target NEXT_BUTTON = Target.the("Next button").located(By.cssSelector("button[data-role='opc-continue']"));
        public static Target ORDER_BUTTON = Target.the("Order button").located(By.cssSelector("button[title='Place Order']"));

}
