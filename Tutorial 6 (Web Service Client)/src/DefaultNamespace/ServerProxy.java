package DefaultNamespace;

public class ServerProxy implements DefaultNamespace.Server {
  private String _endpoint = null;
  private DefaultNamespace.Server server = null;
  
  public ServerProxy() {
    _initServerProxy();
  }
  
  public ServerProxy(String endpoint) {
    _endpoint = endpoint;
    _initServerProxy();
  }
  
  private void _initServerProxy() {
    try {
      server = (new DefaultNamespace.ServerServiceLocator()).getServer();
      if (server != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)server)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)server)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (server != null)
      ((javax.xml.rpc.Stub)server)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public DefaultNamespace.Server getServer() {
    if (server == null)
      _initServerProxy();
    return server;
  }
  
  public java.lang.String method(int pValue) throws java.rmi.RemoteException{
    if (server == null)
      _initServerProxy();
    return server.method(pValue);
  }
  
  
}