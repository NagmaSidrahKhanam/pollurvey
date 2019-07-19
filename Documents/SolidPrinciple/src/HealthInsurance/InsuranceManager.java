package HealthInsurance;

public class InsuranceManager {
    private HealthInsuranceSurveyer healthinsurancesurveyer;
    InsuranceManager(HealthInsuranceSurveyer his)
{
    this.healthinsurancesurveyer =his;
}

    public static boolean approve(Claim claim) {

        return false;
    }
}
