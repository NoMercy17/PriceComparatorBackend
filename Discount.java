public class Discount {
    // in this order*
    private String product_id;
    private String product_name;
    private String brand;
    private float package_quantity;
    private String package_unit;
    private String product_category;
    private String from_date;
    private String to_date;

    public Discount(String product_id, String product_name, String brand,
                    float package_quantity, String package_unit, String product_category,
                    String from_date, String to_date) {
        this.product_id = product_id;
        this.product_name = product_name;
        this.brand = brand;
        this.package_quantity = package_quantity;
        this.package_unit = package_unit;
        this.product_category = product_category;
        this.from_date = from_date;
        this.to_date = to_date;
    }

    public String getProductId() {
        return product_id;
    }

    public String getProductName() {
        return product_name;
    }

    public String getBrand() {
        return brand;
    }

    public float getPackageQuantity() {
        return package_quantity;
    }

    public String getPackageUnit() {
        return package_unit;
    }

    public String getProductCategory() {
        return product_category;
    }

    public String getFromDate() {
        return from_date;
    }

    public String getToDate() {
        return to_date;
    }

    public String toString() {
        return "Discount{" +
                "product_id='" + product_id + '\'' +
                ", product_name='" + product_name + '\'' +
                ", brand='" + brand + '\'' +
                ", package_quantity=" + package_quantity +
                ", package_unit='" + package_unit + '\'' +
                ", product_category='" + product_category + '\'' +
                ", from_date='" + from_date + '\'' +
                ", to_date='" + to_date + '\'' +
                '}';
    }
}
