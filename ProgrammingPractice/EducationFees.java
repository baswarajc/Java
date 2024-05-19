package ProgrammingPractice;

public class EducationFees {

    float full_cost;
    float current_investment;
    int years_remaining;
    float inflation;
    float returns;

    public float futureCostOfEducation(float full_cost, float inflation, int years_remaining){
        float value = full_cost;
        for (int i =0;  i< years_remaining; i++){
            value = value + value * (inflation/100);
        }
        return value;
    }

    public float valueOfCurrentInvestments(float current_investment, float returns,int years_remaining){
        float value = current_investment;
        for (int i =0;  i< years_remaining; i++){
            value = value + value * (returns/100);
        }
        return value;
    }

    public float amountToPlanFor(float futureCostOfEducation, float valueOfCurrentInvestments){
        float value = futureCostOfEducation - valueOfCurrentInvestments;
        return value;
    }


    public  double calculateMonthlyInvestment(double amountToPlanFor, float returns, int years_remaining) {
        int numberOfMonths = years_remaining * 12;
        float monthlyReturnRate = (returns/12)/100;

        double base = 1 + monthlyReturnRate;
        double result = 1.0;
        for (int i = 0; i < numberOfMonths; i++) {
            result *= base;
        }

        // Calculate monthly investment
        double monthlyInvestment = (amountToPlanFor * monthlyReturnRate) / (result - 1);

        return monthlyInvestment;
    }


    public static void main(String[] args) {
        EducationFees obj = new EducationFees();

        float futureCostOfEducation =  obj.futureCostOfEducation(30000F, 6F, 3);
        System.out.println(futureCostOfEducation);

        float valueOfCurrentInvestments = obj.valueOfCurrentInvestments(3000F, 12F, 3);
        System.out.println(valueOfCurrentInvestments);

        double amountToPlanFor = futureCostOfEducation - valueOfCurrentInvestments;
        System.out.println(amountToPlanFor);

        System.out.println(obj.calculateMonthlyInvestment(amountToPlanFor, 12, 3));

    }
}
