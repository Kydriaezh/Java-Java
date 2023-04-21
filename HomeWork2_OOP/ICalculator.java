package HomeWork2_OOP;


public interface ICalculator {
    public double getFirst();
    public double getSecond();
    public void setFirstOperand(String operandStr);
    public void setSecondOperand(String operandStr);
    public void setOperator(String operator);
    public String getResult();
}
