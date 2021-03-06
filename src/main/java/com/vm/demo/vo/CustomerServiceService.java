package com.vm.demo.vo;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.1.4
 * 2018-03-18T22:32:12.843-04:00
 * Generated source version: 3.1.4
 * 
 */
@WebServiceClient(name = "CustomerServiceService", 
                  wsdlLocation = "file:/E:/myprojects/workspace/deals/vm-springboot-camel-soap/src/main/resources/CustomerService.wsdl",
                  targetNamespace = "http://vo.demo.vm.com/") 
public class CustomerServiceService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://vo.demo.vm.com/", "CustomerServiceService");
    public final static QName CustomerServicePort = new QName("http://vo.demo.vm.com/", "CustomerServicePort");
    static {
        URL url = null;
        try {
            url = new URL("file:/E:/myprojects/workspace/deals/vm-springboot-camel-soap/src/main/resources/CustomerService.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(CustomerServiceService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/E:/myprojects/workspace/deals/vm-springboot-camel-soap/src/main/resources/CustomerService.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public CustomerServiceService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public CustomerServiceService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CustomerServiceService() {
        super(WSDL_LOCATION, SERVICE);
    }
    




    /**
     *
     * @return
     *     returns CustomerService
     */
    @WebEndpoint(name = "CustomerServicePort")
    public CustomerService getCustomerServicePort() {
        return super.getPort(CustomerServicePort, CustomerService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CustomerService
     */
    @WebEndpoint(name = "CustomerServicePort")
    public CustomerService getCustomerServicePort(WebServiceFeature... features) {
        return super.getPort(CustomerServicePort, CustomerService.class, features);
    }

}
