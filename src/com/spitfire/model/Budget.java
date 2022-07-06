package com.spitfire.model;

public class Budget {
    int budgetID;
    double fixedIncome;
    double variableIncome;
    double fixedExpense;
    double variableExpense;
    int periodTime;

    public Budget(int budgetID, double fixedIncome, double variableIncome,
                  double fixedExpense, double variableExpense,
                  int periodTime) {
        this.budgetID = budgetID;
        this.fixedIncome = fixedIncome;
        this.variableIncome = variableIncome;
        this.fixedExpense = fixedExpense;
        this.variableExpense = variableExpense;
        this.periodTime = periodTime;
    }

    public int getBudgetID() {
        return budgetID;
    }

    public void setBudgetID(int budgetID) {
        this.budgetID = budgetID;
    }

    public double getFixedIncome() {
        return fixedIncome;
    }

    public void setFixedIncome(double fixedIncome) {
        this.fixedIncome = fixedIncome;
    }

    public double getVariableIncome() {
        return variableIncome;
    }

    public void setVariableIncome(double variableIncome) {
        this.variableIncome = variableIncome;
    }

    public double getFixedExpense() {
        return fixedExpense;
    }

    public void setFixedExpense(double fixedExpense) {
        this.fixedExpense = fixedExpense;
    }

    public double getVariableExpense() {
        return variableExpense;
    }

    public void setVariableExpense(double variableExpense) {
        this.variableExpense = variableExpense;
    }

    public int getPeriodTime() {
        return periodTime;
    }

    public void setPeriodTime(int periodTime) {
        this.periodTime = periodTime;
    }
}
