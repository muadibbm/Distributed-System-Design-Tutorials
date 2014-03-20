/**
 * ServerServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package DefaultNamespace;

public class ServerServiceLocator extends org.apache.axis.client.Service implements DefaultNamespace.ServerService {

    public ServerServiceLocator() {
    }


    public ServerServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ServerServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for Server
    private java.lang.String Server_address = "http://localhost:8080/Tutorial_6_%28Web_Service%29/services/Server";

    public java.lang.String getServerAddress() {
        return Server_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ServerWSDDServiceName = "Server";

    public java.lang.String getServerWSDDServiceName() {
        return ServerWSDDServiceName;
    }

    public void setServerWSDDServiceName(java.lang.String name) {
        ServerWSDDServiceName = name;
    }

    public DefaultNamespace.Server getServer() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(Server_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getServer(endpoint);
    }

    public DefaultNamespace.Server getServer(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            DefaultNamespace.ServerSoapBindingStub _stub = new DefaultNamespace.ServerSoapBindingStub(portAddress, this);
            _stub.setPortName(getServerWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setServerEndpointAddress(java.lang.String address) {
        Server_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (DefaultNamespace.Server.class.isAssignableFrom(serviceEndpointInterface)) {
                DefaultNamespace.ServerSoapBindingStub _stub = new DefaultNamespace.ServerSoapBindingStub(new java.net.URL(Server_address), this);
                _stub.setPortName(getServerWSDDServiceName());
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
        java.lang.String inputPortName = portName.getLocalPart();
        if ("Server".equals(inputPortName)) {
            return getServer();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://DefaultNamespace", "ServerService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://DefaultNamespace", "Server"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("Server".equals(portName)) {
            setServerEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
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
