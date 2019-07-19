package HealthInsurance;

import java.math.BigDecimal;

public class Main {
    public static void main()
    {
    Customer customer = new Customer(101,"john");
    Claim claim = new Claim(101,new BigDecimal(40000),customer);
    HealthInsuranceSurveyer healthInsuranceSurveyer = new HealthInsuranceSurveyer();
    InsuranceManager healthInsuranceManager= new InsuranceManager(healthInsuranceSurveyer);
    boolean result =InsuranceManager.approve(claim);
        System.out.println("result   "+result);

//car

        Customer customer1 = new Customer(101,"john");
        Claim claim1 = new Claim(101,new BigDecimal(40000),customer);
        CarInsuranceSurveyer carInsuranceSurveyer=  new CarInsuranceSurveyer();
        InsuranceManager InsuranceManager= new InsuranceManager(healthInsuranceSurveyer);
        boolean result2 =InsuranceManager.approve(claim1);
        System.out.println("result   "+result2);

    }
}
