// package seminar2.clean_code;

public class WorldClass {

    public enum ProductType {
        NEW(0f),
        STANDARD(0.1f),
        PREMIUM(0.25f),
        VIP(0.35f);

        private final float discount;

        ProductType(float discount) {
            this.discount = discount;
        }

        public float getDiscount() {
            return discount;
        }
    }

    public float calculateFinalPrice(ProductType productType, float initialPrice, int loyaltyYears) {
        float loyaltyDiscount = (loyaltyYears > Constants.MAX_LOYALTY_PERIOD) ? Constants.MAX_LOYALTY_DISCOUNT : loyaltyYears / 100f;
        float productDiscount = productType.getDiscount();

        float discountedPrice = initialPrice * (1 - productDiscount);
        return discountedPrice * (1 - loyaltyDiscount);
    }
}
