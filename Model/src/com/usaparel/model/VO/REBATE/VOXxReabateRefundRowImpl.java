package com.usaparel.model.VO.REBATE;

import com.usaparel.model.EO.REBATE.XxReabateRefundImpl;

import java.math.BigDecimal;

import java.sql.Timestamp;

import oracle.jbo.RowIterator;
import oracle.jbo.RowSet;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Mon Sep 10 16:27:12 PKT 2018
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class VOXxReabateRefundRowImpl extends ViewRowImpl {


    public static final int ENTITY_XXREABATEREFUND = 0;

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    protected enum AttributesEnum {
        RebateRefundId,
        InvoiceNumber,
        ShippingPort,
        ShippingBillNo,
        ShippingBillDate,
        RebateAmount,
        CaseFiledDate,
        ClaimFiledFinancialYear,
        RebateAmountReceived,
        LessExcess,
        ChequeNo,
        ChequeDate,
        ClaimRecFinancialYear,
        Status,
        PendingAmount,
        CreatedBy,
        CreationDate,
        UpdatedBy,
        UpdationDate,
        VersionNumber,
        RebateEsitmate,
        RealizationDate,
        InvoiceValue,
        OrgId,
        ConsultantDispatchDate,
        Unit,
        ClaimAgainst,
        CommercialInvoiceNumber,
        DataFormat,
        ReceiptNumber,
        CommercialInvNo,
        SumRebateAmt,
        VOXxRebateRefundAttachment,
        VOXxReabateRefundLines,
        AppModule_LOVInvoiceNumber1_1,
        AppModule_LOVShippingPort1_1,
        AppModule_LOVRebateStatus1_1,
        AppModule_LOVOperatingUnit1_1,
        AppModule_LOVFormatTypes1_1,
        VOXxReabateRefund1;
        private static AttributesEnum[] vals = null;
        ;
        private static final int firstIndex = 0;

        protected int index() {
            return AttributesEnum.firstIndex() + ordinal();
        }

        protected static final int firstIndex() {
            return firstIndex;
        }

        protected static int count() {
            return AttributesEnum.firstIndex() + AttributesEnum.staticValues().length;
        }

        protected static final AttributesEnum[] staticValues() {
            if (vals == null) {
                vals = AttributesEnum.values();
            }
            return vals;
        }
    }


    public static final int REBATEREFUNDID = AttributesEnum.RebateRefundId.index();
    public static final int INVOICENUMBER = AttributesEnum.InvoiceNumber.index();
    public static final int SHIPPINGPORT = AttributesEnum.ShippingPort.index();
    public static final int SHIPPINGBILLNO = AttributesEnum.ShippingBillNo.index();
    public static final int SHIPPINGBILLDATE = AttributesEnum.ShippingBillDate.index();
    public static final int REBATEAMOUNT = AttributesEnum.RebateAmount.index();
    public static final int CASEFILEDDATE = AttributesEnum.CaseFiledDate.index();
    public static final int CLAIMFILEDFINANCIALYEAR = AttributesEnum.ClaimFiledFinancialYear.index();
    public static final int REBATEAMOUNTRECEIVED = AttributesEnum.RebateAmountReceived.index();
    public static final int LESSEXCESS = AttributesEnum.LessExcess.index();
    public static final int CHEQUENO = AttributesEnum.ChequeNo.index();
    public static final int CHEQUEDATE = AttributesEnum.ChequeDate.index();
    public static final int CLAIMRECFINANCIALYEAR = AttributesEnum.ClaimRecFinancialYear.index();
    public static final int STATUS = AttributesEnum.Status.index();
    public static final int PENDINGAMOUNT = AttributesEnum.PendingAmount.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int CREATIONDATE = AttributesEnum.CreationDate.index();
    public static final int UPDATEDBY = AttributesEnum.UpdatedBy.index();
    public static final int UPDATIONDATE = AttributesEnum.UpdationDate.index();
    public static final int VERSIONNUMBER = AttributesEnum.VersionNumber.index();
    public static final int REBATEESITMATE = AttributesEnum.RebateEsitmate.index();
    public static final int REALIZATIONDATE = AttributesEnum.RealizationDate.index();
    public static final int INVOICEVALUE = AttributesEnum.InvoiceValue.index();
    public static final int ORGID = AttributesEnum.OrgId.index();
    public static final int CONSULTANTDISPATCHDATE = AttributesEnum.ConsultantDispatchDate.index();
    public static final int UNIT = AttributesEnum.Unit.index();
    public static final int CLAIMAGAINST = AttributesEnum.ClaimAgainst.index();
    public static final int COMMERCIALINVOICENUMBER = AttributesEnum.CommercialInvoiceNumber.index();
    public static final int DATAFORMAT = AttributesEnum.DataFormat.index();
    public static final int RECEIPTNUMBER = AttributesEnum.ReceiptNumber.index();
    public static final int COMMERCIALINVNO = AttributesEnum.CommercialInvNo.index();
    public static final int SUMREBATEAMT = AttributesEnum.SumRebateAmt.index();
    public static final int VOXXREBATEREFUNDATTACHMENT = AttributesEnum.VOXxRebateRefundAttachment.index();
    public static final int VOXXREABATEREFUNDLINES = AttributesEnum.VOXxReabateRefundLines.index();
    public static final int APPMODULE_LOVINVOICENUMBER1_1 = AttributesEnum.AppModule_LOVInvoiceNumber1_1.index();
    public static final int APPMODULE_LOVSHIPPINGPORT1_1 = AttributesEnum.AppModule_LOVShippingPort1_1.index();
    public static final int APPMODULE_LOVREBATESTATUS1_1 = AttributesEnum.AppModule_LOVRebateStatus1_1.index();
    public static final int APPMODULE_LOVOPERATINGUNIT1_1 = AttributesEnum.AppModule_LOVOperatingUnit1_1.index();
    public static final int APPMODULE_LOVFORMATTYPES1_1 = AttributesEnum.AppModule_LOVFormatTypes1_1.index();
    public static final int VOXXREABATEREFUND1 = AttributesEnum.VOXxReabateRefund1.index();

    /**
     * This is the default constructor (do not remove).
     */
    public VOXxReabateRefundRowImpl() {
    }

    /**
     * Gets XxReabateRefund entity object.
     * @return the XxReabateRefund
     */
    public XxReabateRefundImpl getXxReabateRefund() {
        return (XxReabateRefundImpl) getEntity(ENTITY_XXREABATEREFUND);
    }

    /**
     * Gets the attribute value for REBATE_REFUND_ID using the alias name RebateRefundId.
     * @return the REBATE_REFUND_ID
     */
    public BigDecimal getRebateRefundId() {
        return (BigDecimal) getAttributeInternal(REBATEREFUNDID);
    }

    /**
     * Sets <code>value</code> as attribute value for REBATE_REFUND_ID using the alias name RebateRefundId.
     * @param value value to set the REBATE_REFUND_ID
     */
    public void setRebateRefundId(BigDecimal value) {
        setAttributeInternal(REBATEREFUNDID, value);
    }

    /**
     * Gets the attribute value for INVOICE_NUMBER using the alias name InvoiceNumber.
     * @return the INVOICE_NUMBER
     */
    public String getInvoiceNumber() {
        return (String) getAttributeInternal(INVOICENUMBER);
    }

    /**
     * Sets <code>value</code> as attribute value for INVOICE_NUMBER using the alias name InvoiceNumber.
     * @param value value to set the INVOICE_NUMBER
     */
    public void setInvoiceNumber(String value) {
        setAttributeInternal(INVOICENUMBER, value);
    }

    /**
     * Gets the attribute value for SHIPPING_PORT using the alias name ShippingPort.
     * @return the SHIPPING_PORT
     */
    public String getShippingPort() {
        return (String) getAttributeInternal(SHIPPINGPORT);
    }

    /**
     * Sets <code>value</code> as attribute value for SHIPPING_PORT using the alias name ShippingPort.
     * @param value value to set the SHIPPING_PORT
     */
    public void setShippingPort(String value) {
        setAttributeInternal(SHIPPINGPORT, value);
    }

    /**
     * Gets the attribute value for SHIPPING_BILL_NO using the alias name ShippingBillNo.
     * @return the SHIPPING_BILL_NO
     */
    public String getShippingBillNo() {
        return (String) getAttributeInternal(SHIPPINGBILLNO);
    }

    /**
     * Sets <code>value</code> as attribute value for SHIPPING_BILL_NO using the alias name ShippingBillNo.
     * @param value value to set the SHIPPING_BILL_NO
     */
    public void setShippingBillNo(String value) {
        setAttributeInternal(SHIPPINGBILLNO, value);
    }

    /**
     * Gets the attribute value for SHIPPING_BILL_DATE using the alias name ShippingBillDate.
     * @return the SHIPPING_BILL_DATE
     */
    public Timestamp getShippingBillDate() {
        return (Timestamp) getAttributeInternal(SHIPPINGBILLDATE);
    }

    /**
     * Sets <code>value</code> as attribute value for SHIPPING_BILL_DATE using the alias name ShippingBillDate.
     * @param value value to set the SHIPPING_BILL_DATE
     */
    public void setShippingBillDate(Timestamp value) {
        setAttributeInternal(SHIPPINGBILLDATE, value);
    }

    /**
     * Gets the attribute value for REBATE_AMOUNT using the alias name RebateAmount.
     * @return the REBATE_AMOUNT
     */
    public BigDecimal getRebateAmount() {
        return (BigDecimal) getAttributeInternal(REBATEAMOUNT);
    }

    /**
     * Sets <code>value</code> as attribute value for REBATE_AMOUNT using the alias name RebateAmount.
     * @param value value to set the REBATE_AMOUNT
     */
    public void setRebateAmount(BigDecimal value) {
        setAttributeInternal(REBATEAMOUNT, value);
    }

    /**
     * Gets the attribute value for CASE_FILED_DATE using the alias name CaseFiledDate.
     * @return the CASE_FILED_DATE
     */
    public Timestamp getCaseFiledDate() {
        return (Timestamp) getAttributeInternal(CASEFILEDDATE);
    }

    /**
     * Sets <code>value</code> as attribute value for CASE_FILED_DATE using the alias name CaseFiledDate.
     * @param value value to set the CASE_FILED_DATE
     */
    public void setCaseFiledDate(Timestamp value) {
        setAttributeInternal(CASEFILEDDATE, value);
    }


    /**
     * Gets the attribute value for CLAIM_FILED_FINANCIAL_YEAR using the alias name ClaimFiledFinancialYear.
     * @return the CLAIM_FILED_FINANCIAL_YEAR
     */
    public String getClaimFiledFinancialYear() {
        return (String) getAttributeInternal(CLAIMFILEDFINANCIALYEAR);
    }

    /**
     * Sets <code>value</code> as attribute value for CLAIM_FILED_FINANCIAL_YEAR using the alias name ClaimFiledFinancialYear.
     * @param value value to set the CLAIM_FILED_FINANCIAL_YEAR
     */
    public void setClaimFiledFinancialYear(String value) {
        setAttributeInternal(CLAIMFILEDFINANCIALYEAR, value);
    }

    /**
     * Gets the attribute value for REBATE_AMOUNT_RECEIVED using the alias name RebateAmountReceived.
     * @return the REBATE_AMOUNT_RECEIVED
     */
    public BigDecimal getRebateAmountReceived() {
        return (BigDecimal) getAttributeInternal(REBATEAMOUNTRECEIVED);
    }

    /**
     * Sets <code>value</code> as attribute value for REBATE_AMOUNT_RECEIVED using the alias name RebateAmountReceived.
     * @param value value to set the REBATE_AMOUNT_RECEIVED
     */
    public void setRebateAmountReceived(BigDecimal value) {
        setAttributeInternal(REBATEAMOUNTRECEIVED, value);
    }

    /**
     * Gets the attribute value for LESS_EXCESS using the alias name LessExcess.
     * @return the LESS_EXCESS
     */
    public BigDecimal getLessExcess() {
        return (BigDecimal) getAttributeInternal(LESSEXCESS);
    }

    /**
     * Sets <code>value</code> as attribute value for LESS_EXCESS using the alias name LessExcess.
     * @param value value to set the LESS_EXCESS
     */
    public void setLessExcess(BigDecimal value) {
        setAttributeInternal(LESSEXCESS, value);
    }

    /**
     * Gets the attribute value for CHEQUE_NO using the alias name ChequeNo.
     * @return the CHEQUE_NO
     */
    public String getChequeNo() {
        return (String) getAttributeInternal(CHEQUENO);
    }

    /**
     * Sets <code>value</code> as attribute value for CHEQUE_NO using the alias name ChequeNo.
     * @param value value to set the CHEQUE_NO
     */
    public void setChequeNo(String value) {
        setAttributeInternal(CHEQUENO, value);
    }

    /**
     * Gets the attribute value for CHEQUE_DATE using the alias name ChequeDate.
     * @return the CHEQUE_DATE
     */
    public Timestamp getChequeDate() {
        return (Timestamp) getAttributeInternal(CHEQUEDATE);
    }

    /**
     * Sets <code>value</code> as attribute value for CHEQUE_DATE using the alias name ChequeDate.
     * @param value value to set the CHEQUE_DATE
     */
    public void setChequeDate(Timestamp value) {
        setAttributeInternal(CHEQUEDATE, value);
    }

    /**
     * Gets the attribute value for CLAIM_REC_FINANCIAL_YEAR using the alias name ClaimRecFinancialYear.
     * @return the CLAIM_REC_FINANCIAL_YEAR
     */
    public String getClaimRecFinancialYear() {
        return (String) getAttributeInternal(CLAIMRECFINANCIALYEAR);
    }

    /**
     * Sets <code>value</code> as attribute value for CLAIM_REC_FINANCIAL_YEAR using the alias name ClaimRecFinancialYear.
     * @param value value to set the CLAIM_REC_FINANCIAL_YEAR
     */
    public void setClaimRecFinancialYear(String value) {
        setAttributeInternal(CLAIMRECFINANCIALYEAR, value);
    }

    /**
     * Gets the attribute value for STATUS using the alias name Status.
     * @return the STATUS
     */
    public String getStatus() {
        return (String) getAttributeInternal(STATUS);
    }

    /**
     * Sets <code>value</code> as attribute value for STATUS using the alias name Status.
     * @param value value to set the STATUS
     */
    public void setStatus(String value) {
        setAttributeInternal(STATUS, value);
    }

    /**
     * Gets the attribute value for PENDING_AMOUNT using the alias name PendingAmount.
     * @return the PENDING_AMOUNT
     */
    public BigDecimal getPendingAmount() {
        return (BigDecimal) getAttributeInternal(PENDINGAMOUNT);
    }

    /**
     * Sets <code>value</code> as attribute value for PENDING_AMOUNT using the alias name PendingAmount.
     * @param value value to set the PENDING_AMOUNT
     */
    public void setPendingAmount(BigDecimal value) {
        setAttributeInternal(PENDINGAMOUNT, value);
    }

    /**
     * Gets the attribute value for CREATED_BY using the alias name CreatedBy.
     * @return the CREATED_BY
     */
    public BigDecimal getCreatedBy() {
        return (BigDecimal) getAttributeInternal(CREATEDBY);
    }

    /**
     * Sets <code>value</code> as attribute value for CREATED_BY using the alias name CreatedBy.
     * @param value value to set the CREATED_BY
     */
    public void setCreatedBy(BigDecimal value) {
        setAttributeInternal(CREATEDBY, value);
    }

    /**
     * Gets the attribute value for CREATION_DATE using the alias name CreationDate.
     * @return the CREATION_DATE
     */
    public Timestamp getCreationDate() {
        return (Timestamp) getAttributeInternal(CREATIONDATE);
    }

    /**
     * Gets the attribute value for UPDATED_BY using the alias name UpdatedBy.
     * @return the UPDATED_BY
     */
    public BigDecimal getUpdatedBy() {
        return (BigDecimal) getAttributeInternal(UPDATEDBY);
    }

    /**
     * Sets <code>value</code> as attribute value for UPDATED_BY using the alias name UpdatedBy.
     * @param value value to set the UPDATED_BY
     */
    public void setUpdatedBy(BigDecimal value) {
        setAttributeInternal(UPDATEDBY, value);
    }

    /**
     * Gets the attribute value for UPDATION_DATE using the alias name UpdationDate.
     * @return the UPDATION_DATE
     */
    public Timestamp getUpdationDate() {
        return (Timestamp) getAttributeInternal(UPDATIONDATE);
    }

    /**
     * Gets the attribute value for VERSION_NUMBER using the alias name VersionNumber.
     * @return the VERSION_NUMBER
     */
    public BigDecimal getVersionNumber() {
        return (BigDecimal) getAttributeInternal(VERSIONNUMBER);
    }

    /**
     * Sets <code>value</code> as attribute value for VERSION_NUMBER using the alias name VersionNumber.
     * @param value value to set the VERSION_NUMBER
     */
    public void setVersionNumber(BigDecimal value) {
        setAttributeInternal(VERSIONNUMBER, value);
    }

    /**
     * Gets the attribute value for REBATE_ESITMATE using the alias name RebateEsitmate.
     * @return the REBATE_ESITMATE
     */
    public BigDecimal getRebateEsitmate() {
        return (BigDecimal) getAttributeInternal(REBATEESITMATE);
    }

    /**
     * Sets <code>value</code> as attribute value for REBATE_ESITMATE using the alias name RebateEsitmate.
     * @param value value to set the REBATE_ESITMATE
     */
    public void setRebateEsitmate(BigDecimal value) {
        setAttributeInternal(REBATEESITMATE, value);
    }

    /**
     * Gets the attribute value for REALIZATION_DATE using the alias name RealizationDate.
     * @return the REALIZATION_DATE
     */
    public Timestamp getRealizationDate() {
        return (Timestamp) getAttributeInternal(REALIZATIONDATE);
    }

    /**
     * Sets <code>value</code> as attribute value for REALIZATION_DATE using the alias name RealizationDate.
     * @param value value to set the REALIZATION_DATE
     */
    public void setRealizationDate(Timestamp value) {
        setAttributeInternal(REALIZATIONDATE, value);
    }

    /**
     * Gets the attribute value for INVOICE_VALUE using the alias name InvoiceValue.
     * @return the INVOICE_VALUE
     */
    public BigDecimal getInvoiceValue() {
        return (BigDecimal) getAttributeInternal(INVOICEVALUE);
    }

    /**
     * Sets <code>value</code> as attribute value for INVOICE_VALUE using the alias name InvoiceValue.
     * @param value value to set the INVOICE_VALUE
     */
    public void setInvoiceValue(BigDecimal value) {
        setAttributeInternal(INVOICEVALUE, value);
    }

    /**
     * Gets the attribute value for ORG_ID using the alias name OrgId.
     * @return the ORG_ID
     */
    public BigDecimal getOrgId() {
        return (BigDecimal) getAttributeInternal(ORGID);
    }

    /**
     * Sets <code>value</code> as attribute value for ORG_ID using the alias name OrgId.
     * @param value value to set the ORG_ID
     */
    public void setOrgId(BigDecimal value) {
        setAttributeInternal(ORGID, value);
    }

    /**
     * Gets the attribute value for CONSULTANT_DISPATCH_DATE using the alias name ConsultantDispatchDate.
     * @return the CONSULTANT_DISPATCH_DATE
     */
    public Timestamp getConsultantDispatchDate() {
        return (Timestamp) getAttributeInternal(CONSULTANTDISPATCHDATE);
    }

    /**
     * Sets <code>value</code> as attribute value for CONSULTANT_DISPATCH_DATE using the alias name ConsultantDispatchDate.
     * @param value value to set the CONSULTANT_DISPATCH_DATE
     */
    public void setConsultantDispatchDate(Timestamp value) {
        setAttributeInternal(CONSULTANTDISPATCHDATE, value);
    }

    /**
     * Gets the attribute value for the calculated attribute Unit.
     * @return the Unit
     */
    public String getUnit() {
        return (String) getAttributeInternal(UNIT);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute Unit.
     * @param value value to set the  Unit
     */
    public void setUnit(String value) {
        setAttributeInternal(UNIT, value);
    }

    /**
     * Gets the attribute value for CLAIM_AGAINST using the alias name ClaimAgainst.
     * @return the CLAIM_AGAINST
     */
    public String getClaimAgainst() {
        return (String) getAttributeInternal(CLAIMAGAINST);
    }

    /**
     * Sets <code>value</code> as attribute value for CLAIM_AGAINST using the alias name ClaimAgainst.
     * @param value value to set the CLAIM_AGAINST
     */
    public void setClaimAgainst(String value) {
        setAttributeInternal(CLAIMAGAINST, value);
    }

    /**
     * Gets the attribute value for COMMERCIAL_INVOICE_NUMBER using the alias name CommercialInvoiceNumber.
     * @return the COMMERCIAL_INVOICE_NUMBER
     */
    public String getCommercialInvoiceNumber() {
        return (String) getAttributeInternal(COMMERCIALINVOICENUMBER);
    }

    /**
     * Sets <code>value</code> as attribute value for COMMERCIAL_INVOICE_NUMBER using the alias name CommercialInvoiceNumber.
     * @param value value to set the COMMERCIAL_INVOICE_NUMBER
     */
    public void setCommercialInvoiceNumber(String value) {
        setAttributeInternal(COMMERCIALINVOICENUMBER, value);
    }

    /**
     * Gets the attribute value for DATA_FORMAT using the alias name DataFormat.
     * @return the DATA_FORMAT
     */
    public String getDataFormat() {
        return (String) getAttributeInternal(DATAFORMAT);
    }

    /**
     * Sets <code>value</code> as attribute value for DATA_FORMAT using the alias name DataFormat.
     * @param value value to set the DATA_FORMAT
     */
    public void setDataFormat(String value) {
        setAttributeInternal(DATAFORMAT, value);
    }

    /**
     * Gets the attribute value for RECEIPT_NUMBER using the alias name ReceiptNumber.
     * @return the RECEIPT_NUMBER
     */
    public String getReceiptNumber() {
        return (String) getAttributeInternal(RECEIPTNUMBER);
    }

    /**
     * Sets <code>value</code> as attribute value for RECEIPT_NUMBER using the alias name ReceiptNumber.
     * @param value value to set the RECEIPT_NUMBER
     */
    public void setReceiptNumber(String value) {
        setAttributeInternal(RECEIPTNUMBER, value);
    }

    /**
     * Gets the attribute value for the calculated attribute CommercialInvNo.
     * @return the CommercialInvNo
     */
    public String getCommercialInvNo() {
        return (String) getAttributeInternal(COMMERCIALINVNO);
    }

    /**
     * Gets the attribute value for the calculated attribute SumRebateAmt.
     * @return the SumRebateAmt
     */
    public BigDecimal getSumRebateAmt() {
        return (BigDecimal) getAttributeInternal(SUMREBATEAMT);
    }

    /**
     * Gets the associated <code>RowIterator</code> using master-detail link VOXxRebateRefundAttachment.
     */
    public RowIterator getVOXxRebateRefundAttachment() {
        return (RowIterator) getAttributeInternal(VOXXREBATEREFUNDATTACHMENT);
    }

    /**
     * Gets the associated <code>RowIterator</code> using master-detail link VOXxReabateRefundLines.
     */
    public RowIterator getVOXxReabateRefundLines() {
        return (RowIterator) getAttributeInternal(VOXXREABATEREFUNDLINES);
    }

    /**
     * Gets the view accessor <code>RowSet</code> AppModule_LOVInvoiceNumber1_1.
     */
    public RowSet getAppModule_LOVInvoiceNumber1_1() {
        return (RowSet) getAttributeInternal(APPMODULE_LOVINVOICENUMBER1_1);
    }

    /**
     * Gets the view accessor <code>RowSet</code> AppModule_LOVShippingPort1_1.
     */
    public RowSet getAppModule_LOVShippingPort1_1() {
        return (RowSet) getAttributeInternal(APPMODULE_LOVSHIPPINGPORT1_1);
    }

    /**
     * Gets the view accessor <code>RowSet</code> AppModule_LOVRebateStatus1_1.
     */
    public RowSet getAppModule_LOVRebateStatus1_1() {
        return (RowSet) getAttributeInternal(APPMODULE_LOVREBATESTATUS1_1);
    }

    /**
     * Gets the view accessor <code>RowSet</code> AppModule_LOVOperatingUnit1_1.
     */
    public RowSet getAppModule_LOVOperatingUnit1_1() {
        return (RowSet) getAttributeInternal(APPMODULE_LOVOPERATINGUNIT1_1);
    }

    /**
     * Gets the view accessor <code>RowSet</code> AppModule_LOVFormatTypes1_1.
     */
    public RowSet getAppModule_LOVFormatTypes1_1() {
        return (RowSet) getAttributeInternal(APPMODULE_LOVFORMATTYPES1_1);
    }

    /**
     * Gets the view accessor <code>RowSet</code> VOXxReabateRefund1.
     */
    public RowSet getVOXxReabateRefund1() {
        return (RowSet) getAttributeInternal(VOXXREABATEREFUND1);
    }
}

