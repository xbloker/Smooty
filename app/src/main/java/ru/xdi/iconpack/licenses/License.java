package ru.xdi.iconpack.licenses;

import candybar.lib.items.InAppBilling;

public class License {

    /*
     * License Checker
     * private static final boolean ENABLE_LICENSE_CHECKER = true; --> enabled
     * Change to private static final boolean ENABLE_LICENSE_CHECKER = false; if you want to disable it
     *
     * NOTE: If you disable license checker you need to remove LICENSE_CHECK permission inside AndroidManifest.xml
     */
    private static final boolean ENABLE_LICENSE_CHECKER = false;

    /*
     * NOTE: If license checker is disabled (above), just ignore this
     *
     * Generate 20 random bytes
     * For easy way, go to https://www.random.org/strings/
     * Set generate 20 random strings
     * Each string should be 2 character long
     * Check numeric digit (0-9)
     * Choose each string should be unique
     * Get string
     */
    private static final byte[] SALT = new byte[]{
       25, 50, 84, 96, 66, 42, 44, 70, 01, 18, 26, 98, 79, 72, 13, 99, 62, 15, 83, 17
    };

    /*
     * Your license key
     * If your app hasn't published at play store, publish it first as beta, get license key
     */
    private static final String LICENSE_KEY = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAk2VXqstTaxT1gM/wnBZa7AkBMI0PFy1or+x9uN6sI2g0dtu4xbYp7cDIcJsliLiayUDmt0X4AsSrv3RkkJJgWf4/t8bCTfcDm/ALHenK1lRXwwcqdO55n6tZD/Dk6yr372pFsMY7WsE16Vtt4SC7OpKpX0f8XuUu69BfDbA8NMaPdNtKaWandtDi/fY6JBxVpdyGSl3PTLABuKzvnWtBSc66JDG2eY/2ei94b8ecBKGhjhKTSNv0dE44H9QM/O1W+4DRlN+mJFsdqMKNuISL+DuIe9P2l7n7dLEZGGETcyozFFJqIIDySk+DecN+reF7QXjQpsd5GP8ZYeaVJYU2OwIDAQAB";

    /*
     * NOTE: Make sure your app name in project same as app name at play store listing
     * NOTE: Your InApp Purchase will works only after the apk published
     */

    /*
     * NOTE: If premium request disabled, just ignored this
     *
     * InApp product id for premium request
     * Product name displayed the same as product name displayed at play store
     * So make sure to name it properly, like include number of icons
     * Format: new InAppBilling("premium request product id", number of icons)
     */
    private static final InAppBilling[] PREMIUM_REQUEST_PRODUCTS = new InAppBilling[]{
            new InAppBilling("ru.xdi.iconpack.oneicon", 1),
            new InAppBilling("ru.xdi.iconpack.fifeicon", 5),
            new InAppBilling("ru.xdi.iconpack.eithicon", 10),
            new InAppBilling("ru.xdi.iconpack.fiftyicon", 15)
    };

    /*
     * NOTE: If donation disabled, just ignored this
     *
     * InApp product id for donation
     * Product name displayed the same as product name displayed at play store
     * So make sure to name it properly
     * Format: new InAppBilling("donation product id")
     */
    private static final InAppBilling[] DONATION_PRODUCT = new InAppBilling[]{
            new InAppBilling("ru.xdi.iconpack.cookie"),
            new InAppBilling("ru.xdi.iconpack.coffe"),
            new InAppBilling("ru.xdi.iconpack.beer"),
            new InAppBilling("ru.xdi.iconpack.pizza")
    };

    public static boolean isLicenseCheckerEnabled() {
        return ENABLE_LICENSE_CHECKER;
    }

    public static String getLicenseKey() {
        return LICENSE_KEY;
    }

    public static byte[] getRandomString() {
        return SALT;
    }

    public static String[] getPremiumRequestProductsId() {
        String[] productId = new String[PREMIUM_REQUEST_PRODUCTS.length];
        for (int i = 0; i < PREMIUM_REQUEST_PRODUCTS.length; i++) {
            productId[i] = PREMIUM_REQUEST_PRODUCTS[i].getProductId();
        }
        return productId;
    }

    public static int[] getPremiumRequestProductsCount() {
        int[] productCount = new int[PREMIUM_REQUEST_PRODUCTS.length];
        for (int i = 0; i < PREMIUM_REQUEST_PRODUCTS.length; i++) {
            productCount[i] = PREMIUM_REQUEST_PRODUCTS[i].getProductCount();
        }
        return productCount;
    }

    public static String[] getDonationProductsId() {
        String[] productId = new String[DONATION_PRODUCT.length];
        for (int i = 0; i < DONATION_PRODUCT.length; i++) {
            productId[i] = DONATION_PRODUCT[i].getProductId();
        }
        return productId;
    }

}
