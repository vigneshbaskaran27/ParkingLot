package models;

import models.enums.GateType;

public class Gate {
    private int id;
    private int gate_number;
    private GateType gateType;
    private Operator operator;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getGate_number() {
        return gate_number;
    }

    public void setGate_number(int gate_number) {
        this.gate_number = gate_number;
    }

    public GateType getGateType() {
        return gateType;
    }

    public void setGateType(GateType gateType) {
        this.gateType = gateType;
    }

    public Operator getOperator() {
        return operator;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }
}
