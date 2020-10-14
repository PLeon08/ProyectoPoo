
package entities;

public class Address {
    
    private String province;
    private String disctrict;
    private String canton;
    private String exactAddress;

    public Address(String province, String disctrict, String canton, String exactAddress) {
        this.province = province;
        this.disctrict = disctrict;
        this.canton = canton;
        this.exactAddress = exactAddress;
    }

    public Address() {
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getDisctrict() {
        return disctrict;
    }

    public void setDisctrict(String disctrict) {
        this.disctrict = disctrict;
    }

    public String getCanton() {
        return canton;
    }

    public void setCanton(String canton) {
        this.canton = canton;
    }

    public String getExactAddress() {
        return exactAddress;
    }

    public void setExactAddress(String exactAddress) {
        this.exactAddress = exactAddress;
    }
    
    
    
}
