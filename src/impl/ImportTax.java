package impl;

import interfaces.TaxStrategy;
public class ImportTax implements TaxStrategy {
    @Override
    public double calculate(double value) {
        if (value > 240) {
            return (value * 0.60);
        }

        return 0;
    }
}