package HealthInsurance;

public class CarInsuranceSurveyer {

    public boolean validate(Claim claim)
    {
        return (claim.getClaimAmount().doubleValue()<20000);
    }

}
