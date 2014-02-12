package IDLmap;

/**
 * Holder class for : sampleInterface
 * 
 * @author OpenORB Compiler
 */
final public class sampleInterfaceHolder
        implements org.omg.CORBA.portable.Streamable
{
    /**
     * Internal sampleInterface value
     */
    public IDLmap.sampleInterface value;

    /**
     * Default constructor
     */
    public sampleInterfaceHolder()
    { }

    /**
     * Constructor with value initialisation
     * @param initial the initial value
     */
    public sampleInterfaceHolder(IDLmap.sampleInterface initial)
    {
        value = initial;
    }

    /**
     * Read sampleInterface from a marshalled stream
     * @param istream the input stream
     */
    public void _read(org.omg.CORBA.portable.InputStream istream)
    {
        value = sampleInterfaceHelper.read(istream);
    }

    /**
     * Write sampleInterface into a marshalled stream
     * @param ostream the output stream
     */
    public void _write(org.omg.CORBA.portable.OutputStream ostream)
    {
        sampleInterfaceHelper.write(ostream,value);
    }

    /**
     * Return the sampleInterface TypeCode
     * @return a TypeCode
     */
    public org.omg.CORBA.TypeCode _type()
    {
        return sampleInterfaceHelper.type();
    }

}
