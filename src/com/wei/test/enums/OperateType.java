package com.wei.test.enums;

public enum OperateType implements Operate {
    
    B1P1O1("B1P1O1-code","B1P1O1-name",PhaseType.B1P1),
    B1P1O2("B1P1O2-code","B1P1O2-name",PhaseType.B1P1),
    B1P2O1("B1P2O1-code","B1P2O1-name",PhaseType.B1P2),
    B2P1O1("B2P1O1-code","B2P1O1-name",PhaseType.B2P1),
    B2P1O2("B2P1O2-code","B2P1O2-name",PhaseType.B2P1);
    
    private String code;
    private String name;
    private PhaseType phaseType;
    
    private OperateType(String code, String name, PhaseType phaseType) {
        this.code = code;
        this.name = name;
        this.phaseType = phaseType;
    }
    
    public String getOperateCode() {
        return this.code;
    }

    public String getOperateName() {
        return this.name;
    }

    public String getBusinessCode() {
        return phaseType.getBusinessCode();
    }

    public String getBusinessName() {
        return phaseType.getBusinessName();
    }

    public String getPhaseCode() {
        return phaseType.getPhaseCode();
    }

    public String getPhaseName() {
        return phaseType.getPhaseName();
    }

}

enum PhaseType implements Phase{

    B1P1("B1P1-code","B1P1-name",BusinessType.B1),
    B1P2("B1P2-code","B1P2-name",BusinessType.B1),
    B2P1("B2P1-code","B2P1-name",BusinessType.B2);
    
    private String code;
    private String name;
    private BusinessType businessType; 
    
    private PhaseType(String code, String name, BusinessType businessType) {
        this.code = code;
        this.name = name;
        this.businessType = businessType;
    }
    
    public String getPhaseCode() {
        return this.code;
    }
    
    public String getPhaseName() {
        return this.name;
    }

    public String getBusinessCode() {
        return businessType.getBusinessCode();
    }

    public String getBusinessName() {
        return businessType.getBusinessName();
    }
    
}

enum BusinessType implements Business{

    B1("B1-code","B1-name"),
    B2("B2-code","B2-name");
    
    private String code;
    private String name;
    
    private BusinessType(String code, String name) {
        this.code = code;
        this.name = name;
    }
    
    public String getBusinessCode() {
        return this.code;
    }
    
    
    public String getBusinessName() {
        return this.name;
    }
}

interface Operate extends Phase {

    String getOperateCode();
    
    String getOperateName();
    
}

interface Business{

    String getBusinessCode();
    
    String getBusinessName();
}

interface Phase extends Business{
    
    String getPhaseCode();
    
    String getPhaseName();
}
