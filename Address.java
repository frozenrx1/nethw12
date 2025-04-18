public class Address {
    protected String country;
    protected String city;

    public Address(String country, String city) {
        this.country = country;
        this.city = city;
    }

    @Override
    public int hashCode() {
        return country.hashCode() + city.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        Address o = (Address) obj;
        return country.equals(o.country) && city.equals(o.city);
    }
}
