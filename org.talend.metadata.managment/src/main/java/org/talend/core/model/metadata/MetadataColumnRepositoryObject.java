// ============================================================================
//
// Copyright (C) 2006-2010 Talend Inc. - www.talend.com
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talend SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package org.talend.core.model.metadata;

import java.util.Date;
import java.util.List;

import org.talend.core.model.metadata.builder.connection.AbstractMetadataObject;
import org.talend.core.model.properties.Property;
import org.talend.core.model.properties.User;
import org.talend.core.model.repository.ERepositoryObjectType;
import org.talend.core.model.repository.IRepositoryViewObject;
import org.talend.core.repository.model.ISubRepositoryObject;
import org.talend.cwm.helper.SubItemHelper;
import org.talend.repository.model.ERepositoryStatus;
import org.talend.repository.model.IRepositoryNode;

/**
 * DOC klliu class global comment. Detailled comment
 */
public class MetadataColumnRepositoryObject extends MetadataColumn implements ISubRepositoryObject {

    private final IRepositoryViewObject repObj;

    private org.talend.core.model.metadata.builder.connection.MetadataColumn tdColumn;

    /*
     * (non-Javadoc)
     * 
     * @see org.talend.core.model.metadata.ITDQMetadataColumn#getTdColumn()
     */
    public org.talend.core.model.metadata.builder.connection.MetadataColumn getTdColumn() {
        return this.tdColumn;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.talend.core.model.metadata.ITDQMetadataColumn#setTdColumn()
     */
    public void setTdColumn(org.talend.core.model.metadata.builder.connection.MetadataColumn tdColumn) {
        this.tdColumn = tdColumn;
    }

    /**
     * DOC klliu TDQMetadataColumnRepositoryObject constructor comment.
     */
    public MetadataColumnRepositoryObject(IRepositoryViewObject repositoryViewObject,
            org.talend.core.model.metadata.builder.connection.MetadataColumn column) {
        this.repObj = repositoryViewObject;
        setTdColumn(column);
    }

    public Property getProperty() {
        Property property = repObj.getProperty();
        // update column
        updataColumn(property);
        return property;
    }

    // @Override
    public String getVersion() {
        return repObj.getVersion();
    }

    public String getLabel() {
        return getTdColumn().getLabel();
    }

    public void setLabel(String label) {
        this.getTdColumn().setLabel(label);
    }

    public String getId() {
        return getTdColumn().getId();
    }

    public void setId(String id) {
        getTdColumn().setId(id);
    }

    public AbstractMetadataObject getAbstractMetadataObject() {
        return getTdColumn();
    }

    public void removeFromParent() {
    }

    private void updataColumn(Property property) {
    }

    public User getAuthor() {
        return repObj.getAuthor();
    }

    public List<IRepositoryViewObject> getChildren() {
        return repObj.getChildren();
    }

    public Date getCreationDate() {
        return repObj.getCreationDate();
    }

    public String getDescription() {
        return repObj.getDescription();
    }

    public ERepositoryStatus getInformationStatus() {
        return repObj.getInformationStatus();
    }

    public Date getModificationDate() {
        return repObj.getModificationDate();
    }

    public String getPath() {
        return repObj.getPath();
    }

    public String getProjectLabel() {
        return repObj.getProjectLabel();
    }

    public String getPurpose() {
        return repObj.getPurpose();
    }

    public IRepositoryNode getRepositoryNode() {
        return repObj.getRepositoryNode();
    }

    public ERepositoryStatus getRepositoryStatus() {
        return repObj.getRepositoryStatus();
    }

    public String getStatusCode() {
        return repObj.getStatusCode();
    }

    public ERepositoryObjectType getRepositoryObjectType() {
        return ERepositoryObjectType.METADATA_CON_COLUMN;
    }

    public boolean isDeleted() {
        return SubItemHelper.isDeleted(getTdColumn());
    }

    public void setRepositoryNode(IRepositoryNode node) {
        repObj.setRepositoryNode(node);
    }

}
