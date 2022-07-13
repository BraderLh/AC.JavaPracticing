package com.spitfire.model;

public class Budget {
    int budgetID;
    double fixedIncome;
    double variableIncome;
    double totalIncome;
    double fixedExpense;
    double variableExpense;
    double totalExpense;
    double myBudget;
    double totalSaving;
    int periodTime;

    /*public Budget(int budgetID, double fixedIncome, double variableIncome,
                  double totalIncome, double fixedExpense, double variableExpense,
                  double totalExpense, double totalSaving, int periodTime) {
        this.budgetID = budgetID;
        this.fixedIncome = fixedIncome;
        this.variableIncome = variableIncome;
        this.totalIncome = totalIncome;
        this.fixedExpense = fixedExpense;
        this.variableExpense = variableExpense;
        this.totalExpense = totalExpense;
        this.totalSaving = totalSaving;
        this.periodTime = periodTime;
    }*/

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

    public double getMyTotalIncome () { return totalIncome; }

    public void setMyTotalIncome(double totalIncome) { totalIncome = this.fixedIncome + this.variableIncome;
        this.totalIncome = totalIncome; }

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

    public double getTotalExpense() {
        return totalExpense;
    }

    public void setTotalExpense() {
        this.totalExpense = this.variableExpense + this.fixedExpense;
    }

    public double getMyBudget() { return myBudget; }

    public void setMyBudget() { this.myBudget = this.totalIncome - this.totalExpense; }

    public double getMySaving() { return totalSaving; }

    public void setMySaving(int percentage, double priceDesirable, int periodTime) {
        double p = (this.totalIncome*percentage)/100;
        if (this.myBudget >= p) {
            double savingPerMonth = priceDesirable/periodTime;
            this.totalSaving = priceDesirable;
            System.out.println("You must save S/." + savingPerMonth + " in " + periodTime + " months");
        }
        else {
            System.out.println("Save your money please");
        }
    }

    public int getPeriodTime() { return periodTime; }

    public void setPeriodTime(int periodTime) {
        this.periodTime = periodTime;
    }
}
class TestBudgetDrive {
    public static void main(String[] args) {
        Budget b1 = new Budget();
        double ti = 0;
        b1.setBudgetID(1);
        b1.setFixedIncome(125.5);
        b1.setVariableIncome(50.0);
        b1.setMyTotalIncome(ti);
        System.out.println(b1.getMyTotalIncome());
    }
}
