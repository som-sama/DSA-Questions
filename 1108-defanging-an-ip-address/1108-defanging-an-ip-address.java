class Solution {
    public String defangIPaddr(String address) {
        address = address.replace(".", "[.]");
        return address;
    }
}