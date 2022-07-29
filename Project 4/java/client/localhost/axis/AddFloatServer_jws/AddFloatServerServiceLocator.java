/**
 * AddFloatServerServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2alpha Dec 01, 2003 (04:33:24 EST) WSDL2Java emitter.
 */

package localhost.axis.AddFloatServer_jws;

public class AddFloatServerServiceLocator extends org.apache.axis.client.Service implements localhost.axis.AddFloatServer_jws.AddFloatServerService {

    // Use to get a proxy class for AddFloatServer
    private java.lang.String AddFloatServer_address = "http://localhost:8080/axis/AddFloatServer.jws";

    public java.lang.String getAddFloatServerAddress() {
        return AddFloatServer_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String AddFloatServerWSDDServiceName = "AddFloatServer";

    public java.lang.String getAddFloatServerWSDDServiceName() {
        return AddFloatServerWSDDServiceName;
    }

    public void setAddFloatServerWSDDServiceName(java.lang.String name) {
        AddFloatServerWSDDServiceName = name;
    }

    public localhost.axis.AddFloatServer_jws.AddFloatServer getAddFloatServer() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(AddFloatServer_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getAddFloatServer(endpoint);
    }

    public localhost.axis.AddFloatServer_jws.AddFloatServer getAddFloatServer(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            localhost.axis.AddFloatServer_jws.AddFloatServerSoapBindingStub _stub = new localhost.axis.AddFloatServer_jws.AddFloatServerSoapBindingStub(portAddress, this);
            _stub.setPortName(getAddFloatServerWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setAddFloatServerEndpointAddress(java.lang.String address) {
        AddFloatServer_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (localhost.axis.AddFloatServer_jws.AddFloatServer.class.isAssignableFrom(serviceEndpointInterface)) {
                localhost.axis.AddFloatServer_jws.AddFloatServerSoapBindingStub _stub = new localhost.axis.AddFloatServer_jws.AddFloatServerSoapBindingStub(new java.net.URL(AddFloatServer_address), this);
                _stub.setPortName(getAddFloatServerWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        String inputPortName = portName.getLocalPart();
        if ("AddFloatServer".equals(inputPortName)) {
            return getAddFloatServer();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://localhost:8080/axis/AddFloatServer.jws", "AddFloatServerService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("AddFloatServer"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        if ("AddFloatServer".equals(portName)) {
            setAddFloatServerEndpointAddress(address);
        }
        else { // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
