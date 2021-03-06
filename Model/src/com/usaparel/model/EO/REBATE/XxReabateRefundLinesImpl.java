package com.usaparel.model.EO.REBATE;

import java.math.BigDecimal;

import java.sql.CallableStatement;
import java.sql.Timestamp;

import oracle.adf.share.ADFContext;

import oracle.jbo.Key;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.TransactionEvent;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Mon May 28 10:56:55 PKT 2018
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class XxReabateRefundLinesImpl extends EntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    protected enum AttributesEnum {
        LineId,
        RebateRefundId,
        RebateAmountReceived,
        LessExcess,
        ChequeNo,
        ChequeDate,
        ClaimRecFinancialYear,
        CreatedBy,
        CreationDate,
        UpdatedBy,
        UpdationDate,
        VersionNumber;
        private static AttributesEnum[] vals = null;
        private static final int firstIndex = 0;

        protected int index() {
            return XxReabateRefundLinesImpl.AttributesEnum.firstIndex() + ordinal();
        }

        protected static final int firstIndex() {
            return firstIndex;
        }

        protected static int count() {
            return XxReabateRefundLinesImpl.AttributesEnum.firstIndex() + XxReabateRefundLinesImpl.AttributesEnum
                                                                                                  .staticValues().length;
        }

        protected static final AttributesEnum[] staticValues() {
            if (vals == null) {
                vals = XxReabateRefundLinesImpl.AttributesEnum.values();
            }
            return vals;
        }
    }
    public static final int LINEID = AttributesEnum.LineId.index();
    public static final int REBATEREFUNDID = AttributesEnum.RebateRefundId.index();
    public static final int REBATEAMOUNTRECEIVED = AttributesEnum.RebateAmountReceived.index();
    public static final int LESSEXCESS = AttributesEnum.LessExcess.index();
    public static final int CHEQUENO = AttributesEnum.ChequeNo.index();
    public static final int CHEQUEDATE = AttributesEnum.ChequeDate.index();
    public static final int CLAIMRECFINANCIALYEAR = AttributesEnum.ClaimRecFinancialYear.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int CREATIONDATE = AttributesEnum.CreationDate.index();
    public static final int UPDATEDBY = AttributesEnum.UpdatedBy.index();
    public static final int UPDATIONDATE = AttributesEnum.UpdationDate.index();
    public static final int VERSIONNUMBER = AttributesEnum.VersionNumber.index();

    /**
     * This is the default constructor (do not remove).
     */
    public XxReabateRefundLinesImpl() {
    }

    /**
     * Gets the attribute value for LineId, using the alias name LineId.
     * @return the value of LineId
     */
    public BigDecimal getLineId() {
        return (BigDecimal) getAttributeInternal(LINEID);
    }

    /**
     * Sets <code>value</code> as the attribute value for LineId.
     * @param value value to set the LineId
     */
    public void setLineId(BigDecimal value) {
        setAttributeInternal(LINEID, value);
    }

    /**
     * Gets the attribute value for RebateRefundId, using the alias name RebateRefundId.
     * @return the value of RebateRefundId
     */
    public BigDecimal getRebateRefundId() {
        return (BigDecimal) getAttributeInternal(REBATEREFUNDID);
    }

    /**
     * Sets <code>value</code> as the attribute value for RebateRefundId.
     * @param value value to set the RebateRefundId
     */
    public void setRebateRefundId(BigDecimal value) {
        setAttributeInternal(REBATEREFUNDID, value);
    }

    /**
     * Gets the attribute value for RebateAmountReceived, using the alias name RebateAmountReceived.
     * @return the value of RebateAmountReceived
     */
    public BigDecimal getRebateAmountReceived() {
        return (BigDecimal) getAttributeInternal(REBATEAMOUNTRECEIVED);
    }

    /**
     * Sets <code>value</code> as the attribute value for RebateAmountReceived.
     * @param value value to set the RebateAmountReceived
     */
    public void setRebateAmountReceived(BigDecimal value) {
        setAttributeInternal(REBATEAMOUNTRECEIVED, value);
    }

    /**
     * Gets the attribute value for LessExcess, using the alias name LessExcess.
     * @return the value of LessExcess
     */
    public BigDecimal getLessExcess() {
        return (BigDecimal) getAttributeInternal(LESSEXCESS);
    }

    /**
     * Sets <code>value</code> as the attribute value for LessExcess.
     * @param value value to set the LessExcess
     */
    public void setLessExcess(BigDecimal value) {
        setAttributeInternal(LESSEXCESS, value);
    }

    /**
     * Gets the attribute value for ChequeNo, using the alias name ChequeNo.
     * @return the value of ChequeNo
     */
    public String getChequeNo() {
        return (String) getAttributeInternal(CHEQUENO);
    }

    /**
     * Sets <code>value</code> as the attribute value for ChequeNo.
     * @param value value to set the ChequeNo
     */
    public void setChequeNo(String value) {
        setAttributeInternal(CHEQUENO, value);
    }

    /**
     * Gets the attribute value for ChequeDate, using the alias name ChequeDate.
     * @return the value of ChequeDate
     */
    public Timestamp getChequeDate() {
        return (Timestamp) getAttributeInternal(CHEQUEDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for ChequeDate.
     * @param value value to set the ChequeDate
     */
    public void setChequeDate(Timestamp value) {
        setAttributeInternal(CHEQUEDATE, value);
    }

    /**
     * Gets the attribute value for ClaimRecFinancialYear, using the alias name ClaimRecFinancialYear.
     * @return the value of ClaimRecFinancialYear
     */
    public String getClaimRecFinancialYear() {
        return (String) getAttributeInternal(CLAIMRECFINANCIALYEAR);
    }

    /**
     * Sets <code>value</code> as the attribute value for ClaimRecFinancialYear.
     * @param value value to set the ClaimRecFinancialYear
     */
    public void setClaimRecFinancialYear(String value) {
        setAttributeInternal(CLAIMRECFINANCIALYEAR, value);
    }

    /**
     * Gets the attribute value for CreatedBy, using the alias name CreatedBy.
     * @return the value of CreatedBy
     */
    public BigDecimal getCreatedBy() {
        return (BigDecimal) getAttributeInternal(CREATEDBY);
    }

    /**
     * Sets <code>value</code> as the attribute value for CreatedBy.
     * @param value value to set the CreatedBy
     */
    public void setCreatedBy(BigDecimal value) {
        setAttributeInternal(CREATEDBY, value);
    }

    /**
     * Gets the attribute value for CreationDate, using the alias name CreationDate.
     * @return the value of CreationDate
     */
    public Timestamp getCreationDate() {
        return (Timestamp) getAttributeInternal(CREATIONDATE);
    }

    /**
     * Gets the attribute value for UpdatedBy, using the alias name UpdatedBy.
     * @return the value of UpdatedBy
     */
    public BigDecimal getUpdatedBy() {
        return (BigDecimal) getAttributeInternal(UPDATEDBY);
    }

    /**
     * Sets <code>value</code> as the attribute value for UpdatedBy.
     * @param value value to set the UpdatedBy
     */
    public void setUpdatedBy(BigDecimal value) {
        setAttributeInternal(UPDATEDBY, value);
    }

    /**
     * Gets the attribute value for UpdationDate, using the alias name UpdationDate.
     * @return the value of UpdationDate
     */
    public Timestamp getUpdationDate() {
        return (Timestamp) getAttributeInternal(UPDATIONDATE);
    }

    /**
     * Gets the attribute value for VersionNumber, using the alias name VersionNumber.
     * @return the value of VersionNumber
     */
    public BigDecimal getVersionNumber() {
        return (BigDecimal) getAttributeInternal(VERSIONNUMBER);
    }

    /**
     * @param lineId key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(BigDecimal lineId) {
        return new Key(new Object[] { lineId });
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("com.usaparel.model.EO.XxReabateRefundLines");
    }

    /**
     * Add locking logic here.
     */
    public void lock() {
        super.lock();
    }

    /**
     * Custom DML update/insert/delete logic here.
     * @param operation the operation type
     * @param e the transaction event
     */
    protected void doDML(int operation, TransactionEvent e) {
        String username = (ADFContext.getCurrent()
                                     .getSessionScope()
                                     .get("userid") == null ? "-1" : ADFContext.getCurrent()
                                                                               .getSessionScope()
                                                                               .get("userid")
                                                                               .toString());
        
        switch(operation){
        case DML_INSERT:
            System.out.println("DML_INSERT");
            setCreatedBy(new BigDecimal(username));
            break;
        case DML_UPDATE:
            System.out.println("DML_UPDATE");
            
            setUpdatedBy(new BigDecimal(username));
            break;
        }
        super.doDML(operation, e);
    }
}

