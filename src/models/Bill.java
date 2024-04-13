package models;

import Startegy.FeeCalculationStrategy;
import models.enums.BillStatus;

import java.time.LocalTime;
import java.util.List;

public class Bill {
    private int id;
    private LocalTime localTime;
    private double amount;
    private Gate gate;
    private Operator operator;
    private Ticket ticket;
    private BillStatus billStatus;
    private List<FeeCalculationStrategy> feeCalculationStrategies;
    private List<Payment> paymentList;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalTime getLocalTime() {
        return localTime;
    }

    public void setLocalTime(LocalTime localTime) {
        this.localTime = localTime;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Gate getGate() {
        return gate;
    }

    public void setGate(Gate gate) {
        this.gate = gate;
    }

    public Operator getOperator() {
        return operator;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public BillStatus getBillStatus() {
        return billStatus;
    }

    public void setBillStatus(BillStatus billStatus) {
        this.billStatus = billStatus;
    }

    public List<FeeCalculationStrategy> getFeeCalculationStrategies() {
        return feeCalculationStrategies;
    }

    public void setFeeCalculationStrategies(List<FeeCalculationStrategy> feeCalculationStrategies) {
        this.feeCalculationStrategies = feeCalculationStrategies;
    }

    public List<Payment> getPaymentList() {
        return paymentList;
    }

    public void setPaymentList(List<Payment> paymentList) {
        this.paymentList = paymentList;
    }
}
