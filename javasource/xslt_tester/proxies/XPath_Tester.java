// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package xslt_tester.proxies;

public class XPath_Tester
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject xPath_TesterMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "XSLT_Tester.XPath_Tester";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		InputXML("InputXML"),
		Namespaces("Namespaces"),
		XPath("XPath"),
		Result("Result");

		private java.lang.String metaName;

		MemberNames(java.lang.String s)
		{
			metaName = s;
		}

		@Override
		public java.lang.String toString()
		{
			return metaName;
		}
	}

	public XPath_Tester(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "XSLT_Tester.XPath_Tester"));
	}

	protected XPath_Tester(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject xPath_TesterMendixObject)
	{
		if (xPath_TesterMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("XSLT_Tester.XPath_Tester", xPath_TesterMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a XSLT_Tester.XPath_Tester");

		this.xPath_TesterMendixObject = xPath_TesterMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'XPath_Tester.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static xslt_tester.proxies.XPath_Tester initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return xslt_tester.proxies.XPath_Tester.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static xslt_tester.proxies.XPath_Tester initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new xslt_tester.proxies.XPath_Tester(context, mendixObject);
	}

	public static xslt_tester.proxies.XPath_Tester load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return xslt_tester.proxies.XPath_Tester.initialize(context, mendixObject);
	}

	/**
	 * Commit the changes made on this proxy object.
	 */
	public final void commit() throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Commit the changes made on this proxy object using the specified context.
	 */
	public final void commit(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Delete the object.
	 */
	public final void delete()
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}

	/**
	 * Delete the object using the specified context.
	 */
	public final void delete(com.mendix.systemwideinterfaces.core.IContext context)
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}
	/**
	 * @return value of InputXML
	 */
	public final java.lang.String getInputXML()
	{
		return getInputXML(getContext());
	}

	/**
	 * @param context
	 * @return value of InputXML
	 */
	public final java.lang.String getInputXML(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.InputXML.toString());
	}

	/**
	 * Set value of InputXML
	 * @param inputxml
	 */
	public final void setInputXML(java.lang.String inputxml)
	{
		setInputXML(getContext(), inputxml);
	}

	/**
	 * Set value of InputXML
	 * @param context
	 * @param inputxml
	 */
	public final void setInputXML(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String inputxml)
	{
		getMendixObject().setValue(context, MemberNames.InputXML.toString(), inputxml);
	}

	/**
	 * @return value of Namespaces
	 */
	public final java.lang.String getNamespaces()
	{
		return getNamespaces(getContext());
	}

	/**
	 * @param context
	 * @return value of Namespaces
	 */
	public final java.lang.String getNamespaces(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Namespaces.toString());
	}

	/**
	 * Set value of Namespaces
	 * @param namespaces
	 */
	public final void setNamespaces(java.lang.String namespaces)
	{
		setNamespaces(getContext(), namespaces);
	}

	/**
	 * Set value of Namespaces
	 * @param context
	 * @param namespaces
	 */
	public final void setNamespaces(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String namespaces)
	{
		getMendixObject().setValue(context, MemberNames.Namespaces.toString(), namespaces);
	}

	/**
	 * @return value of XPath
	 */
	public final java.lang.String getXPath()
	{
		return getXPath(getContext());
	}

	/**
	 * @param context
	 * @return value of XPath
	 */
	public final java.lang.String getXPath(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.XPath.toString());
	}

	/**
	 * Set value of XPath
	 * @param xpath
	 */
	public final void setXPath(java.lang.String xpath)
	{
		setXPath(getContext(), xpath);
	}

	/**
	 * Set value of XPath
	 * @param context
	 * @param xpath
	 */
	public final void setXPath(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpath)
	{
		getMendixObject().setValue(context, MemberNames.XPath.toString(), xpath);
	}

	/**
	 * @return value of Result
	 */
	public final java.lang.Boolean getResult()
	{
		return getResult(getContext());
	}

	/**
	 * @param context
	 * @return value of Result
	 */
	public final java.lang.Boolean getResult(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.Result.toString());
	}

	/**
	 * Set value of Result
	 * @param result
	 */
	public final void setResult(java.lang.Boolean result)
	{
		setResult(getContext(), result);
	}

	/**
	 * Set value of Result
	 * @param context
	 * @param result
	 */
	public final void setResult(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean result)
	{
		getMendixObject().setValue(context, MemberNames.Result.toString(), result);
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return xPath_TesterMendixObject;
	}

	/**
	 * @return the IContext instance of this proxy, or null if no IContext instance was specified at initialization.
	 */
	public final com.mendix.systemwideinterfaces.core.IContext getContext()
	{
		return context;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final xslt_tester.proxies.XPath_Tester that = (xslt_tester.proxies.XPath_Tester) obj;
			return getMendixObject().equals(that.getMendixObject());
		}
		return false;
	}

	@Override
	public int hashCode()
	{
		return getMendixObject().hashCode();
	}

	/**
	 * @return String name of this class
	 */
	public static java.lang.String getType()
	{
		return "XSLT_Tester.XPath_Tester";
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}
