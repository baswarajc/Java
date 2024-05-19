package ProgrammingPractice;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Test22 {

    public static void main(String[] args) {
        BigDecimal oneTimeContribution = new BigDecimal("100000");
        BigDecimal monthlyContribution = new BigDecimal("1000");
        int investmentPeriod = 5; // in years
        int withdrawalPeriod = 5; // in years
        BigDecimal annualGrowthRate = new BigDecimal("0.12");

        // Calculate retirement balance after investment period
        BigDecimal retirementBalance = calculateRetirementBalance(oneTimeContribution, monthlyContribution, investmentPeriod, annualGrowthRate);

        // Calculate monthly withdrawal amount for the next 5 years
        BigDecimal monthlyWithdrawal = calculateMonthlyWithdrawal(retirementBalance, withdrawalPeriod * 12);

        System.out.println(monthlyWithdrawal);
    }

    public static BigDecimal calculateRetirementBalance(BigDecimal oneTimeContribution, BigDecimal monthlyContribution,
                                                        int investmentPeriod, BigDecimal annualGrowthRate) {
        BigDecimal balance = BigDecimal.ZERO;
        for (int i = 0; i < investmentPeriod; i++) {
            balance = balance.add(monthlyContribution);
            balance = balance.multiply(BigDecimal.ONE.add(annualGrowthRate.divide(BigDecimal.valueOf(12), 6, RoundingMode.HALF_UP)));
        }
        balance = balance.add(oneTimeContribution);
        return balance;
    }

    public static BigDecimal calculateMonthlyWithdrawal(BigDecimal retirementBalance, int months) {
        BigDecimal monthlyWithdrawal = retirementBalance.divide(BigDecimal.valueOf(months), 2, RoundingMode.HALF_EVEN);
        return monthlyWithdrawal;
    }
}

