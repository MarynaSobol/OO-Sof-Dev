
public class SavingsAccount 
{
    //Variables
    private int accNo; //one per object instance
    private static int nextAccNo=0;//shared by all object instances
    private static float annuallnterestRate=0.0f;
    private double savings Balance;
    //Constructors

    public SavingsAccount(double savingsBalance) 
    {
        ++nextAccNo;
        setAccNo(nextAccNo);
        setSavingsBalance(savings Balance);
    }

    //Getters & Setters
    public int getAccNo() 
    {
        return accNo;
    }
    public void setAccNo(int accNo) 
    {
        this.accNo accNo;
    }
    public static float getAnnuallnterestRate() 
    {
        return annuallnterestRate;
    }
    public static void modifyInterest Rate(float annualinterestRate) 
    {
        SavingsAccount.annualinterestRate = annualinterestRate;
    }
    public double getSavings Balance() 
    {
        return savingsBalance;
    }
    public void setSavings Balance(double savings Balance) 
    {
        this.savingsBalance savingsBalance;
    }
    //Misc Methods
    public void calculate Monthlyinterest()
    {
        savingsBalance+=((getSavings Balance() getAnnualinterestRate()) /12);
    }
    //toString
    public String toString() 
    {
        return "SavingsAccount [accNo=" + accNo +", savings Balance=" + savingsBalance + "]";
    }
}