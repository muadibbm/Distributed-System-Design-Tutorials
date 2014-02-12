package IDLmap;

/**
 * Interface definition: sampleInterface.
 * 
 * @author OpenORB Compiler
 */
public abstract class sampleInterfacePOA extends org.omg.PortableServer.Servant
        implements sampleInterfaceOperations, org.omg.CORBA.portable.InvokeHandler
{
    public sampleInterface _this()
    {
        return sampleInterfaceHelper.narrow(_this_object());
    }

    public sampleInterface _this(org.omg.CORBA.ORB orb)
    {
        return sampleInterfaceHelper.narrow(_this_object(orb));
    }

    private static String [] _ids_list =
    {
        "IDL:IDLmap/sampleInterface:1.0"
    };

    public String[] _all_interfaces(org.omg.PortableServer.POA poa, byte [] objectId)
    {
        return _ids_list;
    }

    public final org.omg.CORBA.portable.OutputStream _invoke(final String opName,
            final org.omg.CORBA.portable.InputStream _is,
            final org.omg.CORBA.portable.ResponseHandler handler)
    {

        if (opName.equals("method")) {
                return _invoke_method(_is, handler);
        } else if (opName.equals("sendString")) {
                return _invoke_sendString(_is, handler);
        } else if (opName.equals("shutdown")) {
                return _invoke_shutdown(_is, handler);
        } else {
            throw new org.omg.CORBA.BAD_OPERATION(opName);
        }
    }

    // helper methods
    private org.omg.CORBA.portable.OutputStream _invoke_method(
            final org.omg.CORBA.portable.InputStream _is,
            final org.omg.CORBA.portable.ResponseHandler handler) {
        org.omg.CORBA.portable.OutputStream _output;

        method();

        _output = handler.createReply();

        return _output;
    }

    private org.omg.CORBA.portable.OutputStream _invoke_sendString(
            final org.omg.CORBA.portable.InputStream _is,
            final org.omg.CORBA.portable.ResponseHandler handler) {
        org.omg.CORBA.portable.OutputStream _output;

        String _arg_result = sendString();

        _output = handler.createReply();
        _output.write_string(_arg_result);

        return _output;
    }

    private org.omg.CORBA.portable.OutputStream _invoke_shutdown(
            final org.omg.CORBA.portable.InputStream _is,
            final org.omg.CORBA.portable.ResponseHandler handler) {
        org.omg.CORBA.portable.OutputStream _output;

        shutdown();

        _output = handler.createReply();

        return _output;
    }

}
