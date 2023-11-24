import interfaces.TaxStrategy;

public class Context {
    private TaxStrategy taxStrategy;

    public Context () {}

    public void setStrategy(TaxStrategy strategy) {
        taxStrategy = strategy;
    }

    public double calculate(double number) {
        return taxStrategy.calculate(number);
    }
}
