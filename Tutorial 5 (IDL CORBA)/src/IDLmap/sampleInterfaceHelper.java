package IDLmap;

/** 
 * Helper class for : sampleInterface
 *  
 * @author OpenORB Compiler
 */ 
public class sampleInterfaceHelper
{
    /**
     * Insert sampleInterface into an any
     * @param a an any
     * @param t sampleInterface value
     */
    public static void insert(org.omg.CORBA.Any a, IDLmap.sampleInterface t)
    {
        a.insert_Object(t , type());
    }

    /**
     * Extract sampleInterface from an any
     *
     * @param a an any
     * @return the extracted sampleInterface value
     */
    public static IDLmap.sampleInterface extract( org.omg.CORBA.Any a )
    {
        if ( !a.type().equivalent( type() ) )
        {
            throw new org.omg.CORBA.MARSHAL();
        }
        try
        {
            return IDLmap.sampleInterfaceHelper.narrow( a.extract_Object() );
        }
        catch ( final org.omg.CORBA.BAD_PARAM e )
        {
            throw new org.omg.CORBA.MARSHAL(e.getMessage());
        }
    }

    //
    // Internal TypeCode value
    //
    private static org.omg.CORBA.TypeCode _tc = null;

    /**
     * Return the sampleInterface TypeCode
     * @return a TypeCode
     */
    public static org.omg.CORBA.TypeCode type()
    {
        if (_tc == null) {
            org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init();
            _tc = orb.create_interface_tc( id(), "sampleInterface" );
        }
        return _tc;
    }

    /**
     * Return the sampleInterface IDL ID
     * @return an ID
     */
    public static String id()
    {
        return _id;
    }

    private final static String _id = "IDL:IDLmap/sampleInterface:1.0";

    /**
     * Read sampleInterface from a marshalled stream
     * @param istream the input stream
     * @return the readed sampleInterface value
     */
    public static IDLmap.sampleInterface read(org.omg.CORBA.portable.InputStream istream)
    {
        return(IDLmap.sampleInterface)istream.read_Object(IDLmap._sampleInterfaceStub.class);
    }

    /**
     * Write sampleInterface into a marshalled stream
     * @param ostream the output stream
     * @param value sampleInterface value
     */
    public static void write(org.omg.CORBA.portable.OutputStream ostream, IDLmap.sampleInterface value)
    {
        ostream.write_Object((org.omg.CORBA.portable.ObjectImpl)value);
    }

    /**
     * Narrow CORBA::Object to sampleInterface
     * @param obj the CORBA Object
     * @return sampleInterface Object
     */
    public static sampleInterface narrow(org.omg.CORBA.Object obj)
    {
        if (obj == null)
            return null;
        if (obj instanceof sampleInterface)
            return (sampleInterface)obj;

        if (obj._is_a(id()))
        {
            _sampleInterfaceStub stub = new _sampleInterfaceStub();
            stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
            return stub;
        }

        throw new org.omg.CORBA.BAD_PARAM();
    }

    /**
     * Unchecked Narrow CORBA::Object to sampleInterface
     * @param obj the CORBA Object
     * @return sampleInterface Object
     */
    public static sampleInterface unchecked_narrow(org.omg.CORBA.Object obj)
    {
        if (obj == null)
            return null;
        if (obj instanceof sampleInterface)
            return (sampleInterface)obj;

        _sampleInterfaceStub stub = new _sampleInterfaceStub();
        stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
        return stub;

    }

}
