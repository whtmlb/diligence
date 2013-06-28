package com.topsoft.platform.client.test;

import java.util.List;

import com.topsoft.platform.client.dto.LoginContextDTO;
import com.topsoft.platform.client.dto.MenuFolderDTO;
import com.topsoft.platform.client.dto.OrganDTO;
import com.topsoft.platform.client.rest.AuthenticateServiceClient;

/**
 * @author weichao
 *
 */
public class AuthenticateServiceClientTest {
    
    private static AuthenticateServiceClient service;
    
    private static final String SERVICE_URL = "http://localhost:8080/platform";
    
    public static void main(String[] e) {
        service = new AuthenticateServiceClient();
        service.setServerUrl(SERVICE_URL);
        service.init();
        
        System.out.println("checklogin : " + service.checkLogin("system", "123", null));
        
        System.out.println("checklogin : " + service.checkLogin("system", "1234", null));
        String token = "BFC47F1F4A95A01CC63BC6C394CBAECB";
        LoginContextDTO dto = service.fetchLoginContext(token);
        System.out.println(" loginCOntext : "+dto.getEmployeeName());
        
//        HashSet<String> set = new HashSet<String>();
//        set.add("100300");
//        set.add("2200");
//        Set<String> resultSet = service.filterPrivileges(3802l, 999999l, set);
//        System.out.println(resultSet.size());
//        set.add("10000");
//        resultSet = service.filterPrivileges(3802l, 999999l, set);
//        System.out.println(resultSet.size());
        
        MenuFolderDTO folder = service.findMenus(token);
        System.out.println(folder.getName());
        
        List<OrganDTO> organs  = service.findJobPlaces(token);
        System.out.println(organs.get(0).getName() + " : " + organs.get(1).getName());
        System.out.println(token + " - "+ service.switchJobPlace(token,18052l));
        
    }
}
