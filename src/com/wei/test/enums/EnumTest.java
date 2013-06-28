package com.wei.test.enums;

public class EnumTest {
    
    public static void main (String[] w){
        
        OperateType ot = OperateType.B1P2O1;
        
        System.out.println("getOperateCode : " + ot.getOperateCode());
        System.out.println("getOperateName : " + ot.getOperateName());
        System.out.println("getPhaseCode : " + ot.getPhaseCode());
        System.out.println("getPhaseName : " + ot.getPhaseName());
        System.out.println("getBusinessCode : " + ot.getBusinessCode());
        System.out.println("getBusinessName : " + ot.getBusinessName());
    }
}
