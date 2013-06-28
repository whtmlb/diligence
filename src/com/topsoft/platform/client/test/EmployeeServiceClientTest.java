package com.topsoft.platform.client.test;

import java.util.List;

import com.topsoft.platform.client.dto.EmployeeDTO;
import com.topsoft.platform.client.rest.EmployeeServiceClient;

/**
 * 职员服务客户端测试
 * 
 * @author weichao
 *
 */
public class EmployeeServiceClientTest {
    
    private static EmployeeServiceClient service;
    
    private static final String SERVICE_URL = "http://localhost:8080/platform";
    
    public static void main(String[] e) {
        service = new EmployeeServiceClient();
        service.setServerUrl(SERVICE_URL);
        service.init();
        
        EmployeeDTO system = service.findEmployee(999999l);
        System.out.println(system == null);
        
        system = service.findEmployee(999939l);
        System.out.println(system == null);
        
        List<EmployeeDTO> list = service.findEmployeeByOrgan(3802l);
        System.out.println(list.get(0).getName() + " : " + list.get(0).getBirthDate());
        
        list = service.findEmployeeByOrgan(3802l);
        System.out.println(list.get(0).getName() + " : " + list.get(0).getBirthDate());
    }
}
