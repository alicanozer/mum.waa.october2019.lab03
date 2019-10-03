package mum.waa.october2019.lab03.model;

import java.util.List;

public class Operation {
    private Integer sum1, sum2, mult1, mult2;
    private List<String> errors;

    public Operation() {
    }


    public Operation(Integer num1, Integer num2, Integer num3, Integer num4) {
        this.sum1 = num1;
        this.sum2 = num2;
        this.mult1 = num3;
        this.mult2 = num4;
    }

    public Integer getSum1() {
        return sum1;
    }

    public void setSum1(Integer sum1) {
        this.sum1 = sum1;
    }

    public Integer getSum2() {
        return sum2;
    }

    public void setSum2(Integer sum2) {
        this.sum2 = sum2;
    }

    public Integer getMult1() {
        return mult1;
    }

    public void setMult1(Integer mul1) {
        this.mult1 = mul1;
    }

    public Integer getMult2() {
        return mult2;
    }

    public void setMult2(Integer mul2) {
        this.mult2 = mul2;
    }

    public Integer getResult1() {
        return this.sum1 + this.sum2;
    }

    public Integer getResult2() {
        return this.mult1 * this.mult2;
    }

    @Override
    public String toString() {
        return "Operation{" +
                "sum1=" + sum1 +
                ", sum2=" + sum2 +
                ", mult1=" + mult1 +
                ", mult2=" + mult2 +
                '}';
    }

    public List<String> getErrors() {
        return errors;
    }

    public void setErrors(List<String> errors) {
        this.errors = errors;
    }
}
