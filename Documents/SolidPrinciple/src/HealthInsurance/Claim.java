package HealthInsurance;

import java.math.BigDecimal;

public class Claim {
    private int ClaimId;
    BigDecimal claimAmount;
    private String customerName;

    public Claim(int i, BigDecimal bigDecimal, Customer customer) {

    }

    public int getClainId() {
        return ClaimId;
    }

    public void setClainId(int claimId) {
        ClaimId = claimId;
    }

    public BigDecimal getClaimAmount() {
        return claimAmount;
    }

    public void setClaimAmount(BigDecimal claimAmount) {
        this.claimAmount = claimAmount;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
}
