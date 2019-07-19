package HealthInsurance;

public class HealthInsuranceSurveyer {

    public boolean validate(Claim claim)
    {
        return (claim.getClaimAmount().doubleValue()<50000);
    }
}
