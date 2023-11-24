package impl;

import interfaces.TaxStrategy;
public class IcmsTax implements TaxStrategy {
    @Override
    public double calculate(double value) {
        return value * 0.17;
    }
}
