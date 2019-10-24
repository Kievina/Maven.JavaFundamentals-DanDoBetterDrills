package com.zipcodewilmington.danny_do_better_exercises;

/**
 * Created by dan on 6/14/17.
 */
public class MathUtilities {

    /**
     * @param baseValue  starting value
     * @param difference value to add to starting value
     * @return sum of `baseValue` and `difference`
     */
    public Integer add(int baseValue, int difference) {
        Integer sum = baseValue + difference;
        return sum;
    }

    /**
     * @param baseValue  starting value
     * @param difference value to add to starting value
     * @return sum of `baseValue` and `difference`
     */
    public Long add(long baseValue, long difference) {
        Long sum = baseValue + difference;
        return sum;
    }

    /**
     * @param baseValue  starting value
     * @param difference value to add to starting value
     * @return sum of `baseValue` and `difference`
     */
    public Short add(short baseValue, short difference) {
        Integer sum = baseValue + difference;

        return sum.shortValue();
    }

    /**
     * @param baseValue  starting value
     * @param difference value to add to starting value
     * @return sum of `baseValue` and `difference`
     */
    public Byte add(byte baseValue, byte difference) {
        Integer sum = baseValue + difference;
        return sum.byteValue();
    }

    /**
     * @param baseValue  starting value
     * @param difference value to add to starting value
     * @return sum of `baseValue` and `difference`
     */
    public Float add(float baseValue, float difference) {
        Float sum = baseValue + difference;
        return sum;
    }

    /**
     * @param baseValue  starting value
     * @param difference value to add to starting value
     * @return sum of `baseValue` and `difference`
     */
    public Double add(double baseValue, double difference) {
        Double sum = baseValue + difference;
        return sum;
    }

    /**
     * @param baseValue  starting value
     * @param difference value to subtract from starting value
     * @return difference between `baseValue` and `difference`
     */
    public Integer subtract(int baseValue, int difference) {
        Integer diff = baseValue - difference;
        return diff;
    }

    /**
     * @param baseValue  starting value
     * @param difference value to subtract from starting value
     * @return difference between `baseValue` and `difference`
     */
    public Long subtract(long baseValue, long difference) {
        Long diff = baseValue - difference;
        return diff;
    }

    /**
     * @param baseValue  starting value
     * @param difference value to subtract from starting value
     * @return difference between `baseValue` and `difference`
     */
    public Short subtract(short baseValue, short difference) {
        short diff = (short) (baseValue - difference);
        return diff;
    }

    /**
     * @param baseValue  starting value
     * @param difference value to subtract from starting value
     * @return difference between `baseValue` and `difference`
     */
    public Byte subtract(byte baseValue, byte difference) {
        Integer diff = baseValue - difference;
        return diff.byteValue();
    }

    /**
     * @param baseValue  starting value
     * @param difference value to subtract from starting value
     * @return difference between `baseValue` and `difference`
     */
    public Float subtract(float baseValue, float difference) {
        Float diff = baseValue - difference;
        return diff;
    }

    /**
     * @param baseValue  starting value
     * @param difference value to subtract from starting value
     * @return difference between `baseValue` and `difference`
     */
    public Double subtract(double baseValue, double difference) {
        Double diff = baseValue - difference;
        return diff;
    }


    /**
     * @param dividend value to be divided
     * @param divisor  value to divide by
     * @return division of `dividend` by `divisor
     */
    public Integer divide(int dividend, int divisor) {

        Integer division = dividend / divisor;
        return division;
    }

    /**
     * @param dividend value to be divided
     * @param divisor  value to divide by
     * @return division of `dividend` by `divisor
     */
    public Long divide(long dividend, long divisor) {
        Long division = dividend / divisor;
        return division;
    }

    /**
     * @param dividend value to be divided
     * @param divisor  value to divide by
     * @return division of `dividend` by `divisor
     */
    public Short divide(short dividend, short divisor) {
        Integer division = dividend / divisor;
        return division.shortValue();
    }

    /**
     * @param dividend value to be divided
     * @param divisor  value to divide by
     * @return division of `dividend` by `divisor
     */
    public Byte divide(byte dividend, byte divisor) {
        Integer division = dividend / divisor;
        return division.byteValue();
    }

    /**
     * @param dividend value to be divided
     * @param divisor  value to divide by
     * @return division of `dividend` by `divisor
     */
    public Float divide(float dividend, float divisor) {
        Float division = dividend / divisor;
        return division;
    }

    /**
     * @param dividend value to be divided
     * @param divisor  value to divide by
     * @return division of `dividend` by `divisor
     */
    public Double divide(double dividend, double divisor) {
        Double division = dividend / divisor;
        return division;
    }


    /**
     * @param multiplicand value to be multiplied
     * @param multiplier   value to multiply by
     * @return product of `multiplicand` by `multiplier`
     */
    public Integer multiply(int multiplicand, int multiplier) {
        Integer result = multiplicand * multiplier;
        return result;
    }

    /**
     * @param multiplicand value to be multiplied
     * @param multiplier   value to multiply by
     * @return product of `multiplicand` by `multiplier`
     */
    public Long multiply(long multiplicand, long multiplier) {
        Long result = multiplicand * multiplier;
        return result;
    }

    /**
     * @param multiplicand value to be multiplied
     * @param multiplier   value to multiply by
     * @return product of `multiplicand` by `multiplier`
     */
    public Short multiply(short multiplicand, short multiplier) {
        Integer result = multiplicand * multiplier;
        return result.shortValue();
    }

    /**
     * @param multiplicand value to be multiplied
     * @param multiplier   value to multiply by
     * @return product of `multiplicand` by `multiplier`
     */
    public Byte multiply(byte multiplicand, byte multiplier) {
        Integer result = multiplicand * multiplier;
        return result.byteValue();
    }

    /**
     * @param multiplicand value to be multiplied
     * @param multiplier   value to multiply by
     * @return product of `multiplicand` by `multiplier`
     */
    public Float multiply(float multiplicand, float multiplier) {
        Float result = multiplicand * multiplier;
        return result;
    }

    /**
     * @param multiplicand value to be multiplied
     * @param multiplier   value to multiply by
     * @return product of `multiplicand` by `multiplier`
     */
    public Double multiply(double multiplicand, double multiplier) {
        Double result = multiplicand * multiplier;
        return result;
    }
}
