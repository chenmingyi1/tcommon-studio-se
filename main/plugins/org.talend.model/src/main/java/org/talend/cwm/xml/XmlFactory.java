/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package org.talend.cwm.xml;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.talend.cwm.xml.XmlPackage
 * @generated
 */
public interface XmlFactory extends EFactory {

    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    XmlFactory eINSTANCE = org.talend.cwm.xml.impl.XmlFactoryImpl.init();

    /**
     * Returns a new object of class '<em>Td Xml Element Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Td Xml Element Type</em>'.
     * @generated
     */
    TdXmlElementType createTdXmlElementType();

    /**
     * Returns a new object of class '<em>Td Xml Content</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Td Xml Content</em>'.
     * @generated
     */
    TdXmlContent createTdXmlContent();

    /**
     * Returns a new object of class '<em>Td Xml Schema</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Td Xml Schema</em>'.
     * @generated
     */
    TdXmlSchema createTdXmlSchema();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    XmlPackage getXmlPackage();

} //XmlFactory
