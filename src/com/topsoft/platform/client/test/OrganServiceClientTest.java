package com.topsoft.platform.client.test;
import java.util.List;


import com.topsoft.platform.client.dto.OrganDTO;
import com.topsoft.platform.client.rest.OrganServiceClient;


/**
 * @author weichao
 *
 */
public class OrganServiceClientTest {

    private static OrganServiceClient service;
    
    private static final String SERVICE_URL = "http://localhost:8080/platform";
    
    public static void main(String[] e) {
        service = new OrganServiceClient();
        service.setServerUrl(SERVICE_URL);
        service.init();
        
        OrganDTO organ = service.findPrimaryOrgan(3802l, true);
        System.out.println(organ.getOrganLevel() + " : " + organ.getOrganType());
        
        List<OrganDTO> children = service.findChildren(3802l,1, new String[]{"D"});
        System.out.println(children.get(0).getName());
        
    }
}
